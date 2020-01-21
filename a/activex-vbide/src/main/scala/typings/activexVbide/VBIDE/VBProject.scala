package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.VBProject")
@js.native
class VBProject protected () extends js.Object {
  val Application: typings.activexVbide.VBIDE.Application = js.native
  var BuildFileName: String = js.native
  @JSName("Collection")
  val Collection_Original: VBProjects = js.native
  var Description: String = js.native
  val FileName: String = js.native
  var HelpContextID: Double = js.native
  var HelpFile: String = js.native
  val Mode: vbextVBAMode = js.native
  var Name: String = js.native
  val Parent: typings.activexVbide.VBIDE.Application = js.native
  val Protection: vbextProjectProtection = js.native
  @JSName("References")
  val References_Original: References = js.native
  val Saved: Boolean = js.native
  val Type: vbextProjectType = js.native
  @JSName("VBComponents")
  val VBComponents_Original: VBComponents = js.native
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  @JSName("VBIDE.VBProject_typekey")
  var VBIDEDotVBProject_typekey: VBProject = js.native
  def Collection(index: js.Any): VBProject = js.native
  def MakeCompiledFile(): Unit = js.native
  def References(index: js.Any): Reference = js.native
  def SaveAs(FileName: String): Unit = js.native
  def VBComponents(index: js.Any): VBComponent = js.native
}

