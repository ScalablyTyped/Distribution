package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLNamespace")
@js.native
class XMLNamespace protected () extends js.Object {
  val Application: Application = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  val URI: java.lang.String = js.native
  var `Word.XMLNamespace_typekey`: XMLNamespace = js.native
  val XSLTransforms: XSLTransforms = js.native
  /** @param boolean [AllUsers=false] */
  def Alias(): java.lang.String = js.native
  def Alias(AllUsers: scala.Boolean): java.lang.String = js.native
  def AttachToDocument(Document: js.Any): scala.Unit = js.native
  /** @param boolean [AllUsers=false] */
  def DefaultTransform(): XSLTransform = js.native
  def DefaultTransform(AllUsers: scala.Boolean): XSLTransform = js.native
  def Delete(): scala.Unit = js.native
  /** @param boolean [AllUsers=false] */
  def Location(): java.lang.String = js.native
  def Location(AllUsers: scala.Boolean): java.lang.String = js.native
}

