package typings.activexDashInfopath.InfoPathNs

import typings.activexDashAdodb.ADODBNs.Error
import typings.activexDashAdodb.ADODBNs.Errors
import typings.activexDashMsxml2.MSXML2Ns.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath._XDocument")
@js.native
class _XDocument protected () extends js.Object {
  val DOM: IXMLDOMDocument = js.native
  val DataObjects: DataObjectsCollection = js.native
  @JSName("Errors")
  val Errors_Original: Errors = js.native
  val Extension: js.Any = js.native
  var `InfoPath._XDocument_typekey`: _XDocument = js.native
  val IsDOMReadOnly: Boolean = js.native
  val IsDirty: Boolean = js.native
  val IsNew: Boolean = js.native
  val IsReadOnly: Boolean = js.native
  val IsSigned: Boolean = js.native
  var Language: String = js.native
  val QueryAdapter: js.Any = js.native
  val Solution: SolutionObject = js.native
  val UI: typings.activexDashInfopath.InfoPathNs.UI = js.native
  val URI: String = js.native
  val View: ViewObject = js.native
  val ViewInfos: ViewInfosCollection = js.native
  def Errors(Index: js.Any): Error = js.native
  def GetDOM(bstrName: String): IXMLDOMDocument = js.native
  def GetDataVariable(lVariableNumber: Double): String = js.native
  def ImportFile(bstrFileURI: String): Unit = js.native
  def PrintOut(): Unit = js.native
  def Query(): Unit = js.native
  def Save(): Unit = js.native
  def SaveAs(bstrFileUrl: String): Unit = js.native
  def SetDataVariable(lVariableNumber: Double, bstrVariableValue: String): Unit = js.native
  def Submit(): Unit = js.native
}

