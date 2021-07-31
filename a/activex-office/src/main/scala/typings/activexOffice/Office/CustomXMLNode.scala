package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLNode extends StObject {
  
  /**
    * @param Name [Name='']
    * @param NamespaceURI [NamespaceURI='']
    * @param NodeType [NodeType=1]
    * @param NodeValue [NodeValue='']
    */
  def AppendChildNode(): Unit = js.native
  def AppendChildNode(Name: String): Unit = js.native
  def AppendChildNode(Name: String, NamespaceURI: String): Unit = js.native
  def AppendChildNode(Name: String, NamespaceURI: String, NodeType: Unit, NodeValue: String): Unit = js.native
  def AppendChildNode(Name: String, NamespaceURI: String, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def AppendChildNode(Name: String, NamespaceURI: String, NodeType: MsoCustomXMLNodeType, NodeValue: String): Unit = js.native
  def AppendChildNode(Name: String, NamespaceURI: Unit, NodeType: Unit, NodeValue: String): Unit = js.native
  def AppendChildNode(Name: String, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def AppendChildNode(Name: String, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType, NodeValue: String): Unit = js.native
  def AppendChildNode(Name: Unit, NamespaceURI: String): Unit = js.native
  def AppendChildNode(Name: Unit, NamespaceURI: String, NodeType: Unit, NodeValue: String): Unit = js.native
  def AppendChildNode(Name: Unit, NamespaceURI: String, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def AppendChildNode(Name: Unit, NamespaceURI: String, NodeType: MsoCustomXMLNodeType, NodeValue: String): Unit = js.native
  def AppendChildNode(Name: Unit, NamespaceURI: Unit, NodeType: Unit, NodeValue: String): Unit = js.native
  def AppendChildNode(Name: Unit, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def AppendChildNode(Name: Unit, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType, NodeValue: String): Unit = js.native
  
  def AppendChildSubtree(XML: String): Unit = js.native
  
  val Application: js.Any = js.native
  
  def Attributes(Index: Double): CustomXMLNode = js.native
  @JSName("Attributes")
  val Attributes_Original: CustomXMLNodes = js.native
  
  val BaseName: String = js.native
  
  def ChildNodes(Index: Double): CustomXMLNode = js.native
  @JSName("ChildNodes")
  val ChildNodes_Original: CustomXMLNodes = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val FirstChild: CustomXMLNode = js.native
  
  def HasChildNodes(): Boolean = js.native
  
  /**
    * @param Name [Name='']
    * @param NamespaceURI [NamespaceURI='']
    * @param NodeType [NodeType=1]
    * @param NodeValue [NodeValue='']
    * @param NextSibling [NextSibling=0]
    */
  def InsertNodeBefore(): Unit = js.native
  def InsertNodeBefore(Name: String): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: String): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: String, NodeType: Unit, NodeValue: String): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: String, NodeType: Unit, NodeValue: String, NextSibling: CustomXMLNode): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: String, NodeType: Unit, NodeValue: Unit, NextSibling: CustomXMLNode): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: String, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: String, NodeType: MsoCustomXMLNodeType, NodeValue: String): Unit = js.native
  def InsertNodeBefore(
    Name: String,
    NamespaceURI: String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: String,
    NextSibling: CustomXMLNode
  ): Unit = js.native
  def InsertNodeBefore(
    Name: String,
    NamespaceURI: String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: Unit,
    NextSibling: CustomXMLNode
  ): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: Unit, NodeType: Unit, NodeValue: String): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: Unit, NodeType: Unit, NodeValue: String, NextSibling: CustomXMLNode): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: Unit, NodeType: Unit, NodeValue: Unit, NextSibling: CustomXMLNode): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def InsertNodeBefore(Name: String, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType, NodeValue: String): Unit = js.native
  def InsertNodeBefore(
    Name: String,
    NamespaceURI: Unit,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: String,
    NextSibling: CustomXMLNode
  ): Unit = js.native
  def InsertNodeBefore(
    Name: String,
    NamespaceURI: Unit,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: Unit,
    NextSibling: CustomXMLNode
  ): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: String): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: String, NodeType: Unit, NodeValue: String): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: String, NodeType: Unit, NodeValue: String, NextSibling: CustomXMLNode): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: String, NodeType: Unit, NodeValue: Unit, NextSibling: CustomXMLNode): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: String, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: String, NodeType: MsoCustomXMLNodeType, NodeValue: String): Unit = js.native
  def InsertNodeBefore(
    Name: Unit,
    NamespaceURI: String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: String,
    NextSibling: CustomXMLNode
  ): Unit = js.native
  def InsertNodeBefore(
    Name: Unit,
    NamespaceURI: String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: Unit,
    NextSibling: CustomXMLNode
  ): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: Unit, NodeType: Unit, NodeValue: String): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: Unit, NodeType: Unit, NodeValue: String, NextSibling: CustomXMLNode): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: Unit, NodeType: Unit, NodeValue: Unit, NextSibling: CustomXMLNode): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def InsertNodeBefore(Name: Unit, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType, NodeValue: String): Unit = js.native
  def InsertNodeBefore(
    Name: Unit,
    NamespaceURI: Unit,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: String,
    NextSibling: CustomXMLNode
  ): Unit = js.native
  def InsertNodeBefore(
    Name: Unit,
    NamespaceURI: Unit,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: Unit,
    NextSibling: CustomXMLNode
  ): Unit = js.native
  
  /** @param NextSibling [NextSibling=0] */
  def InsertSubtreeBefore(XML: String): Unit = js.native
  def InsertSubtreeBefore(XML: String, NextSibling: CustomXMLNode): Unit = js.native
  
  val LastChild: CustomXMLNode = js.native
  
  val NamespaceURI: String = js.native
  
  val NextSibling: CustomXMLNode = js.native
  
  val NodeType: MsoCustomXMLNodeType = js.native
  
  var NodeValue: String = js.native
  
  @JSName("Office.CustomXMLNode_typekey")
  var OfficeDotCustomXMLNode_typekey: CustomXMLNode = js.native
  
  val OwnerDocument: js.Any = js.native
  
  val OwnerPart: CustomXMLPart = js.native
  
  val Parent: js.Any = js.native
  
  val ParentNode: CustomXMLNode = js.native
  
  val PreviousSibling: CustomXMLNode = js.native
  
  def RemoveChild(Child: CustomXMLNode): Unit = js.native
  
  /**
    * @param Name [Name='']
    * @param NamespaceURI [NamespaceURI='']
    * @param NodeType [NodeType=1]
    * @param NodeValue [NodeValue='']
    */
  def ReplaceChildNode(OldNode: CustomXMLNode): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: String): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: String, NamespaceURI: String): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: String, NamespaceURI: String, NodeType: Unit, NodeValue: String): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: String, NamespaceURI: String, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def ReplaceChildNode(
    OldNode: CustomXMLNode,
    Name: String,
    NamespaceURI: String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: String
  ): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: String, NamespaceURI: Unit, NodeType: Unit, NodeValue: String): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: String, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def ReplaceChildNode(
    OldNode: CustomXMLNode,
    Name: String,
    NamespaceURI: Unit,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: String
  ): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: Unit, NamespaceURI: String): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: Unit, NamespaceURI: String, NodeType: Unit, NodeValue: String): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: Unit, NamespaceURI: String, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def ReplaceChildNode(
    OldNode: CustomXMLNode,
    Name: Unit,
    NamespaceURI: String,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: String
  ): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: Unit, NamespaceURI: Unit, NodeType: Unit, NodeValue: String): Unit = js.native
  def ReplaceChildNode(OldNode: CustomXMLNode, Name: Unit, NamespaceURI: Unit, NodeType: MsoCustomXMLNodeType): Unit = js.native
  def ReplaceChildNode(
    OldNode: CustomXMLNode,
    Name: Unit,
    NamespaceURI: Unit,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: String
  ): Unit = js.native
  
  def ReplaceChildSubtree(XML: String, OldNode: CustomXMLNode): Unit = js.native
  
  def SelectNodes(XPath: String): CustomXMLNodes = js.native
  
  def SelectSingleNode(XPath: String): CustomXMLNode = js.native
  
  var Text: String = js.native
  
  val XML: String = js.native
  
  val XPath: String = js.native
}
