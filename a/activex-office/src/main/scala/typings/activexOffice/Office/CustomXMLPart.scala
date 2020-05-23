package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLPart extends js.Object {
  val Application: js.Any = js.native
  val BuiltIn: Boolean = js.native
  val Creator: Double = js.native
  val DocumentElement: CustomXMLNode = js.native
  @JSName("Errors")
  val Errors_Original: CustomXMLValidationErrors = js.native
  val Id: String = js.native
  @JSName("NamespaceManager")
  val NamespaceManager_Original: CustomXMLPrefixMappings = js.native
  val NamespaceURI: String = js.native
  @JSName("Office.CustomXMLPart_typekey")
  var OfficeDotCustomXMLPart_typekey: CustomXMLPart = js.native
  val Parent: js.Any = js.native
  @JSName("SchemaCollection")
  var SchemaCollection_Original: CustomXMLSchemaCollection = js.native
  val XML: String = js.native
  /**
    * @param Name [Name='']
    * @param NamespaceURI [NamespaceURI='']
    * @param NextSibling [NextSibling=0]
    * @param NodeType [NodeType=1]
    * @param NodeValue [NodeValue='']
    */
  def AddNode(Parent: CustomXMLNode): Unit = js.native
  def AddNode(Parent: CustomXMLNode, Name: String): Unit = js.native
  def AddNode(Parent: CustomXMLNode, Name: String, NamespaceURI: String): Unit = js.native
  def AddNode(Parent: CustomXMLNode, Name: String, NamespaceURI: String, NextSibling: CustomXMLNode): Unit = js.native
  def AddNode(
    Parent: CustomXMLNode,
    Name: String,
    NamespaceURI: String,
    NextSibling: CustomXMLNode,
    NodeType: MsoCustomXMLNodeType
  ): Unit = js.native
  def AddNode(
    Parent: CustomXMLNode,
    Name: String,
    NamespaceURI: String,
    NextSibling: CustomXMLNode,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: String
  ): Unit = js.native
  def Delete(): Unit = js.native
  def Errors(Index: Double): CustomXMLValidationError = js.native
  def Load(FilePath: String): Boolean = js.native
  def LoadXML(XML: String): Boolean = js.native
  def NamespaceManager(Index: String): CustomXMLPrefixMapping = js.native
  def NamespaceManager(Index: Double): CustomXMLPrefixMapping = js.native
  def SchemaCollection(Index: String): CustomXMLSchema = js.native
  def SchemaCollection(Index: Double): CustomXMLSchema = js.native
  def SelectNodes(XPath: String): CustomXMLNodes = js.native
  def SelectSingleNode(XPath: String): CustomXMLNode = js.native
}

