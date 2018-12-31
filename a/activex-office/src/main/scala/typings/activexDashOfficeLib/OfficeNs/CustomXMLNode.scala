package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.CustomXMLNode")
@js.native
class CustomXMLNode protected () extends js.Object {
  val Application: js.Any = js.native
  @JSName("Attributes")
  val Attributes_Original: CustomXMLNodes = js.native
  val BaseName: java.lang.String = js.native
  @JSName("ChildNodes")
  val ChildNodes_Original: CustomXMLNodes = js.native
  val Creator: scala.Double = js.native
  val FirstChild: CustomXMLNode = js.native
  val LastChild: CustomXMLNode = js.native
  val NamespaceURI: java.lang.String = js.native
  val NextSibling: CustomXMLNode = js.native
  val NodeType: MsoCustomXMLNodeType = js.native
  var NodeValue: java.lang.String = js.native
  var `Office.CustomXMLNode_typekey`: CustomXMLNode = js.native
  val OwnerDocument: js.Any = js.native
  val OwnerPart: CustomXMLPart = js.native
  val Parent: js.Any = js.native
  val ParentNode: CustomXMLNode = js.native
  val PreviousSibling: CustomXMLNode = js.native
  var Text: java.lang.String = js.native
  val XML: java.lang.String = js.native
  val XPath: java.lang.String = js.native
  /**
    * @param Name [Name='']
    * @param NamespaceURI [NamespaceURI='']
    * @param NodeType [NodeType=1]
    * @param NodeValue [NodeValue='']
    */
  def AppendChildNode(): scala.Unit = js.native
  def AppendChildNode(Name: java.lang.String): scala.Unit = js.native
  def AppendChildNode(Name: java.lang.String, NamespaceURI: java.lang.String): scala.Unit = js.native
  def AppendChildNode(Name: java.lang.String, NamespaceURI: java.lang.String, NodeType: MsoCustomXMLNodeType): scala.Unit = js.native
  def AppendChildNode(
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: java.lang.String
  ): scala.Unit = js.native
  def AppendChildSubtree(XML: java.lang.String): scala.Unit = js.native
  def Attributes(Index: scala.Double): CustomXMLNode = js.native
  def ChildNodes(Index: scala.Double): CustomXMLNode = js.native
  def Delete(): scala.Unit = js.native
  def HasChildNodes(): scala.Boolean = js.native
  /**
    * @param Name [Name='']
    * @param NamespaceURI [NamespaceURI='']
    * @param NodeType [NodeType=1]
    * @param NodeValue [NodeValue='']
    * @param NextSibling [NextSibling=0]
    */
  def InsertNodeBefore(): scala.Unit = js.native
  def InsertNodeBefore(Name: java.lang.String): scala.Unit = js.native
  def InsertNodeBefore(Name: java.lang.String, NamespaceURI: java.lang.String): scala.Unit = js.native
  def InsertNodeBefore(Name: java.lang.String, NamespaceURI: java.lang.String, NodeType: MsoCustomXMLNodeType): scala.Unit = js.native
  def InsertNodeBefore(
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: java.lang.String
  ): scala.Unit = js.native
  def InsertNodeBefore(
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: java.lang.String,
    NextSibling: CustomXMLNode
  ): scala.Unit = js.native
  /** @param NextSibling [NextSibling=0] */
  def InsertSubtreeBefore(XML: java.lang.String): scala.Unit = js.native
  def InsertSubtreeBefore(XML: java.lang.String, NextSibling: CustomXMLNode): scala.Unit = js.native
  def RemoveChild(Child: CustomXMLNode): scala.Unit = js.native
  /**
    * @param Name [Name='']
    * @param NamespaceURI [NamespaceURI='']
    * @param NodeType [NodeType=1]
    * @param NodeValue [NodeValue='']
    */
  def ReplaceChildNode(OldNode: CustomXMLNode): scala.Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: java.lang.String): scala.Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: java.lang.String, NamespaceURI: java.lang.String): scala.Unit = js.native
  def ReplaceChildNode(
    OldNode: CustomXMLNode,
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NodeType: MsoCustomXMLNodeType
  ): scala.Unit = js.native
  def ReplaceChildNode(
    OldNode: CustomXMLNode,
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: java.lang.String
  ): scala.Unit = js.native
  def ReplaceChildSubtree(XML: java.lang.String, OldNode: CustomXMLNode): scala.Unit = js.native
  def SelectNodes(XPath: java.lang.String): CustomXMLNodes = js.native
  def SelectSingleNode(XPath: java.lang.String): CustomXMLNode = js.native
}

