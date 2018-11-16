package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.VBComponent")
@js.native
class VBComponent protected () extends js.Object {
  val CodeModule: CodeModule = js.native
  @JSName("Collection")
  val Collection_Original: VBComponents = js.native
  val Designer: js.Any = js.native
  val DesignerID: java.lang.String = js.native
  val HasOpenDesigner: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val Saved: scala.Boolean = js.native
  val Type: vbext_ComponentType = js.native
  val VBE: VBE = js.native
  var `VBIDE.VBComponent_typekey`: VBComponent = js.native
  def Activate(): scala.Unit = js.native
  def Collection(index: js.Any): VBComponent = js.native
  def DesignerWindow(): Window = js.native
  def Export(FileName: java.lang.String): scala.Unit = js.native
  def Properties(index: js.Any): Property = js.native
}

