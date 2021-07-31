package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XSLTransform extends StObject {
  
  /** @param boolean [AllUsers=false] */
  def Alias(): String = js.native
  def Alias(AllUsers: Boolean): String = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val ID: String = js.native
  
  /** @param boolean [AllUsers=false] */
  def Location(): String = js.native
  def Location(AllUsers: Boolean): String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.XSLTransform_typekey")
  var WordDotXSLTransform_typekey: XSLTransform = js.native
}
