package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLNamespace extends StObject {
  
  /** @param boolean [AllUsers=false] */
  def Alias(): String = js.native
  def Alias(AllUsers: Boolean): String = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def AttachToDocument(Document: js.Any): Unit = js.native
  
  val Creator: Double = js.native
  
  /** @param boolean [AllUsers=false] */
  def DefaultTransform(): XSLTransform = js.native
  def DefaultTransform(AllUsers: Boolean): XSLTransform = js.native
  
  def Delete(): Unit = js.native
  
  /** @param boolean [AllUsers=false] */
  def Location(): String = js.native
  def Location(AllUsers: Boolean): String = js.native
  
  val Parent: js.Any = js.native
  
  val URI: String = js.native
  
  @JSName("Word.XMLNamespace_typekey")
  var WordDotXMLNamespace_typekey: XMLNamespace = js.native
  
  val XSLTransforms: typings.activexWord.Word.XSLTransforms = js.native
}
