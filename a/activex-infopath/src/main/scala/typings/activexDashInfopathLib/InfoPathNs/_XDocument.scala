package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath._XDocument")
@js.native
class _XDocument protected () extends js.Object {
  val DOM: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMDocument = js.native
  val DataObjects: DataObjectsCollection = js.native
  @JSName("Errors")
  val Errors_Original: activexDashAdodbLib.ADODBNs.Errors = js.native
  val Extension: js.Any = js.native
  var `InfoPath._XDocument_typekey`: _XDocument = js.native
  val IsDOMReadOnly: scala.Boolean = js.native
  val IsDirty: scala.Boolean = js.native
  val IsNew: scala.Boolean = js.native
  val IsReadOnly: scala.Boolean = js.native
  val IsSigned: scala.Boolean = js.native
  var Language: java.lang.String = js.native
  val QueryAdapter: js.Any = js.native
  val Solution: SolutionObject = js.native
  val UI: UI = js.native
  val URI: java.lang.String = js.native
  val View: ViewObject = js.native
  val ViewInfos: ViewInfosCollection = js.native
  def Errors(Index: js.Any): activexDashAdodbLib.ADODBNs.Error = js.native
  def GetDOM(bstrName: java.lang.String): activexDashMsxml2Lib.MSXML2Ns.IXMLDOMDocument = js.native
  def GetDataVariable(lVariableNumber: scala.Double): java.lang.String = js.native
  def ImportFile(bstrFileURI: java.lang.String): scala.Unit = js.native
  def PrintOut(): scala.Unit = js.native
  def Query(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(bstrFileUrl: java.lang.String): scala.Unit = js.native
  def SetDataVariable(lVariableNumber: scala.Double, bstrVariableValue: java.lang.String): scala.Unit = js.native
  def Submit(): scala.Unit = js.native
}

