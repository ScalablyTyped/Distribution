package typings.activexWord.global.Word

import typings.activexWord.Word.WdMappedDataFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.MappedDataFields")
@js.native
class MappedDataFields protected ()
  extends StObject
     with typings.activexWord.Word.MappedDataFields {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: WdMappedDataFields): typings.activexWord.Word.MappedDataField = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("Word.MappedDataFields_typekey")
  var WordDotMappedDataFields_typekey: typings.activexWord.Word.MappedDataFields = js.native
}
