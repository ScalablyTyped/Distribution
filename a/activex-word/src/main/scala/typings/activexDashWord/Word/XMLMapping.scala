package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLMapping")
@js.native
class XMLMapping protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Creator: Double = js.native
  val CustomXMLNode: typings.activexDashOffice.Office.CustomXMLNode = js.native
  val CustomXMLPart: typings.activexDashOffice.Office.CustomXMLPart = js.native
  val IsMapped: Boolean = js.native
  val Parent: js.Any = js.native
  val PrefixMappings: String = js.native
  var `Word.XMLMapping_typekey`: XMLMapping = js.native
  val XPath: String = js.native
  def Delete(): Unit = js.native
  /**
    * @param string [PrefixMapping='']
    * @param Office.CustomXMLPart [Source=0]
    */
  def SetMapping(XPath: String): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String, Source: typings.activexDashOffice.Office.CustomXMLPart): Boolean = js.native
  def SetMappingByNode(Node: typings.activexDashOffice.Office.CustomXMLNode): Boolean = js.native
}

