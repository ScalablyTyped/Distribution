package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.VBProject")
@js.native
class VBProject protected () extends js.Object {
  val Application: activexDashVbideLib.VBIDENs.Application = js.native
  var BuildFileName: java.lang.String = js.native
  @JSName("Collection")
  val Collection_Original: VBProjects = js.native
  var Description: java.lang.String = js.native
  val FileName: java.lang.String = js.native
  var HelpContextID: scala.Double = js.native
  var HelpFile: java.lang.String = js.native
  val Mode: vbext_VBAMode = js.native
  var Name: java.lang.String = js.native
  val Parent: Application = js.native
  val Protection: vbext_ProjectProtection = js.native
  @JSName("References")
  val References_Original: References = js.native
  val Saved: scala.Boolean = js.native
  val Type: vbext_ProjectType = js.native
  @JSName("VBComponents")
  val VBComponents_Original: VBComponents = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  var `VBIDE.VBProject_typekey`: VBProject = js.native
  def Collection(index: js.Any): VBProject = js.native
  def MakeCompiledFile(): scala.Unit = js.native
  def References(index: js.Any): Reference = js.native
  def SaveAs(FileName: java.lang.String): scala.Unit = js.native
  def VBComponents(index: js.Any): VBComponent = js.native
}

