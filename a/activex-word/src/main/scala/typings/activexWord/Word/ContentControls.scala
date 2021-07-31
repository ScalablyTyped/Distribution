package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentControls extends StObject {
  
  /** @param Word.WdContentControlType [Type=0] */
  def Add(): ContentControl = js.native
  def Add(Type: Unit, Range: js.Any): ContentControl = js.native
  def Add(Type: WdContentControlType): ContentControl = js.native
  def Add(Type: WdContentControlType, Range: js.Any): ContentControl = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): ContentControl = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.ContentControls_typekey")
  var WordDotContentControls_typekey: ContentControls = js.native
}
