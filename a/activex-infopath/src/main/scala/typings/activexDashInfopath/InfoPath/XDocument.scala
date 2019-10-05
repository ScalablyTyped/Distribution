package typings.activexDashInfopath.InfoPath

import typings.activexDashAdodb.ADODB.Error
import typings.activexDashAdodb.ADODB.Errors
import typings.activexDashMsxml2.MSXML2.IXMLDOMDocument
import typings.activexDashMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.XDocument")
@js.native
class XDocument protected () extends js.Object {
  val DOM: IXMLDOMDocument = js.native
  val DataAdapters: DataAdaptersCollection = js.native
  val DataObjects: DataObjectsCollection = js.native
  @JSName("Errors")
  val Errors_Original: Errors = js.native
  val Extension: js.Any = js.native
  var `InfoPath.XDocument_typekey`: XDocument = js.native
  val IsDOMReadOnly: Boolean = js.native
  val IsDirty: Boolean = js.native
  val IsNew: Boolean = js.native
  val IsReadOnly: Boolean = js.native
  val IsRecovered: Boolean = js.native
  val IsSigned: Boolean = js.native
  var Language: String = js.native
  val QueryAdapter: js.Any = js.native
  var Role: String = js.native
  val SignedDataBlocks: SignedDataBlocksCollection = js.native
  val Solution: SolutionObject = js.native
  val UI: typings.activexDashInfopath.InfoPath.UI = js.native
  val URI: String = js.native
  val Util: UtilObject = js.native
  val View: ViewObject = js.native
  val ViewInfos: ViewInfosCollection = js.native
  def CreateDOM(): IXMLDOMDocument = js.native
  def Errors(Index: js.Any): Error = js.native
  def GetDOM(bstrName: String): IXMLDOMDocument = js.native
  def GetDataVariable(lVariableNumber: Double): String = js.native
  def GetNamedNodeProperty(varMainDOMNode: js.Any, bstrPropertyName: String, bstrDefaultValue: String): String = js.native
  def ImportDOM(pxDoc: IXMLDOMDocument): Unit = js.native
  def ImportFile(bstrFileURI: String): Unit = js.native
  def PrintOut(): Unit = js.native
  def Query(): Unit = js.native
  def Save(): Unit = js.native
  def SaveAs(bstrFileUrl: String): Unit = js.native
  def SetDataVariable(lVariableNumber: Double, bstrVariableValue: String): Unit = js.native
  def SetDirty(vfIsDirty: Boolean): Unit = js.native
  def SetNamedNodeProperty(pxmlMainDOMNode: IXMLDOMNode, bstrPropertyName: String, bstrValue: String): Unit = js.native
  def Submit(): Unit = js.native
}

