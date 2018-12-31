package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLNode")
@js.native
class XMLNode protected () extends js.Object {
  val Application: Application = js.native
  val Attributes: XMLNodes = js.native
  val BaseName: java.lang.String = js.native
  val ChildNodeSuggestions: XMLChildNodeSuggestions = js.native
  val ChildNodes: XMLNodes = js.native
  val Creator: scala.Double = js.native
  val FirstChild: XMLNode = js.native
  val HasChildNodes: scala.Boolean = js.native
  val LastChild: XMLNode = js.native
  val Level: WdXMLNodeLevel = js.native
  val NamespaceURI: java.lang.String = js.native
  val NextSibling: XMLNode = js.native
  val NodeType: WdXMLNodeType = js.native
  var NodeValue: java.lang.String = js.native
  val OwnerDocument: Document = js.native
  val Parent: js.Any = js.native
  val ParentNode: XMLNode = js.native
  var PlaceholderText: java.lang.String = js.native
  val PreviousSibling: XMLNode = js.native
  val Range: Range = js.native
  val SmartTag: SmartTag = js.native
  var Text: java.lang.String = js.native
  val ValidationStatus: WdXMLValidationStatus = js.native
  var `Word.XMLNode_typekey`: XMLNode = js.native
  val WordOpenXML: java.lang.String = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def RemoveChild(ChildElement: XMLNode): scala.Unit = js.native
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectNodes(XPath: java.lang.String): XMLNodes = js.native
  def SelectNodes(XPath: java.lang.String, PrefixMapping: java.lang.String): XMLNodes = js.native
  def SelectNodes(
    XPath: java.lang.String,
    PrefixMapping: java.lang.String,
    FastSearchSkippingTextNodes: scala.Boolean
  ): XMLNodes = js.native
  /**
    * @param string [PrefixMapping='']
    * @param boolean [FastSearchSkippingTextNodes=true]
    */
  def SelectSingleNode(XPath: java.lang.String): XMLNode = js.native
  def SelectSingleNode(XPath: java.lang.String, PrefixMapping: java.lang.String): XMLNode = js.native
  def SelectSingleNode(
    XPath: java.lang.String,
    PrefixMapping: java.lang.String,
    FastSearchSkippingTextNodes: scala.Boolean
  ): XMLNode = js.native
  /** @param boolean [ClearedAutomatically=true] */
  def SetValidationError(Status: WdXMLValidationStatus, ErrorText: js.Any): scala.Unit = js.native
  def SetValidationError(Status: WdXMLValidationStatus, ErrorText: js.Any, ClearedAutomatically: scala.Boolean): scala.Unit = js.native
  def Validate(): scala.Unit = js.native
  /** @param boolean [Advanced=false] */
  def ValidationErrorText(): java.lang.String = js.native
  def ValidationErrorText(Advanced: scala.Boolean): java.lang.String = js.native
  /** @param boolean [DataOnly=false] */
  def XML(): java.lang.String = js.native
  def XML(DataOnly: scala.Boolean): java.lang.String = js.native
}

