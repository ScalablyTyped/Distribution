package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.Reference")
@js.native
class Reference protected () extends js.Object {
  val BuiltIn: Boolean = js.native
  @JSName("Collection")
  val Collection_Original: References = js.native
  val Description: String = js.native
  val FullPath: String = js.native
  val Guid: String = js.native
  val IsBroken: Boolean = js.native
  val Major: Double = js.native
  val Minor: Double = js.native
  val Name: String = js.native
  val Type: vbextRefKind = js.native
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  @JSName("VBIDE.Reference_typekey")
  var VBIDEDotReference_typekey: Reference = js.native
  def Collection(index: js.Any): Reference = js.native
}

