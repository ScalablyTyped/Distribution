package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplate extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Convert(): ListTemplate = js.native
  def Convert(Level: js.Any): ListTemplate = js.native
  
  val Creator: Double = js.native
  
  val ListLevels: typings.activexWord.Word.ListLevels = js.native
  
  var Name: String = js.native
  
  var OutlineNumbered: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.ListTemplate_typekey")
  var WordDotListTemplate_typekey: ListTemplate = js.native
}
