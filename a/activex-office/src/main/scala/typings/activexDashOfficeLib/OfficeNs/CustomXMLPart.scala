package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.CustomXMLPart")
@js.native
class CustomXMLPart protected () extends js.Object {
  val Application: js.Any = js.native
  val BuiltIn: scala.Boolean = js.native
  val Creator: scala.Double = js.native
  val DocumentElement: CustomXMLNode = js.native
  @JSName("Errors")
  val Errors_Original: CustomXMLValidationErrors = js.native
  val Id: java.lang.String = js.native
  @JSName("NamespaceManager")
  val NamespaceManager_Original: CustomXMLPrefixMappings = js.native
  val NamespaceURI: java.lang.String = js.native
  var `Office.CustomXMLPart_typekey`: CustomXMLPart = js.native
  val Parent: js.Any = js.native
  @JSName("SchemaCollection")
  var SchemaCollection_Original: CustomXMLSchemaCollection = js.native
  val XML: java.lang.String = js.native
  /**
    * @param Name [Name='']
    * @param NamespaceURI [NamespaceURI='']
    * @param NextSibling [NextSibling=0]
    * @param NodeType [NodeType=1]
    * @param NodeValue [NodeValue='']
    */
  def AddNode(Parent: CustomXMLNode): scala.Unit = js.native
  def AddNode(Parent: CustomXMLNode, Name: java.lang.String): scala.Unit = js.native
  def AddNode(Parent: CustomXMLNode, Name: java.lang.String, NamespaceURI: java.lang.String): scala.Unit = js.native
  def AddNode(
    Parent: CustomXMLNode,
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NextSibling: CustomXMLNode
  ): scala.Unit = js.native
  def AddNode(
    Parent: CustomXMLNode,
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NextSibling: CustomXMLNode,
    NodeType: MsoCustomXMLNodeType
  ): scala.Unit = js.native
  def AddNode(
    Parent: CustomXMLNode,
    Name: java.lang.String,
    NamespaceURI: java.lang.String,
    NextSibling: CustomXMLNode,
    NodeType: MsoCustomXMLNodeType,
    NodeValue: java.lang.String
  ): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Errors(Index: scala.Double): CustomXMLValidationError = js.native
  def Load(FilePath: java.lang.String): scala.Boolean = js.native
  def LoadXML(XML: java.lang.String): scala.Boolean = js.native
  def NamespaceManager(Index: java.lang.String): CustomXMLPrefixMapping = js.native
  def NamespaceManager(Index: scala.Double): CustomXMLPrefixMapping = js.native
  def SchemaCollection(Index: java.lang.String): CustomXMLSchema = js.native
  def SchemaCollection(Index: scala.Double): CustomXMLSchema = js.native
  def SelectNodes(XPath: java.lang.String): CustomXMLNodes = js.native
  def SelectSingleNode(XPath: java.lang.String): CustomXMLNode = js.native
}

