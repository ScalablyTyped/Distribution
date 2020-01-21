package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.AddIn")
@js.native
class AddIn protected () extends js.Object {
  @JSName("Collection")
  val Collection_Original: Addins = js.native
  var Connect: Boolean = js.native
  var Description: String = js.native
  val Guid: String = js.native
  var Object: js.Any = js.native
  val ProgId: String = js.native
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  @JSName("VBIDE.AddIn_typekey")
  var VBIDEDotAddIn_typekey: AddIn = js.native
  def Collection(index: js.Any): AddIn = js.native
}

