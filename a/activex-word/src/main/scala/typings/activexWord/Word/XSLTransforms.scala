package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XSLTransforms extends js.Object {
  
  /** @param boolean [InstallForAllUsers=false] */
  def Add(Location: String, Alias: js.Any): XSLTransform = js.native
  def Add(Location: String, Alias: js.Any, InstallForAllUsers: Boolean): XSLTransform = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): XSLTransform = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.XSLTransforms_typekey")
  var WordDotXSLTransforms_typekey: XSLTransforms = js.native
}
