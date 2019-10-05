package typings.activexDashAccess.Access

import typings.activexDashVbide.VBIDE.vbext_RefKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Reference")
@js.native
class Reference protected () extends js.Object {
  var `Access.Reference_typekey`: Reference = js.native
  val BuiltIn: Boolean = js.native
  @JSName("Collection")
  val Collection_Original: References = js.native
  val FullPath: String = js.native
  val Guid: String = js.native
  val IsBroken: Boolean = js.native
  val Kind: vbext_RefKind = js.native
  val Major: Double = js.native
  val Minor: Double = js.native
  val Name: String = js.native
  def Collection(var_0: String): Reference = js.native
  def Collection(var_0: Double): Reference = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

