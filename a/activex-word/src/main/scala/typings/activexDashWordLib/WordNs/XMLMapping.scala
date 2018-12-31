package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLMapping")
@js.native
class XMLMapping protected () extends js.Object {
  val Application: Application = js.native
  val Creator: scala.Double = js.native
  val CustomXMLNode: activexDashOfficeLib.OfficeNs.CustomXMLNode = js.native
  val CustomXMLPart: activexDashOfficeLib.OfficeNs.CustomXMLPart = js.native
  val IsMapped: scala.Boolean = js.native
  val Parent: js.Any = js.native
  val PrefixMappings: java.lang.String = js.native
  var `Word.XMLMapping_typekey`: XMLMapping = js.native
  val XPath: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  /**
    * @param string [PrefixMapping='']
    * @param Office.CustomXMLPart [Source=0]
    */
  def SetMapping(XPath: java.lang.String): scala.Boolean = js.native
  def SetMapping(XPath: java.lang.String, PrefixMapping: java.lang.String): scala.Boolean = js.native
  def SetMapping(
    XPath: java.lang.String,
    PrefixMapping: java.lang.String,
    Source: activexDashOfficeLib.OfficeNs.CustomXMLPart
  ): scala.Boolean = js.native
  def SetMappingByNode(Node: activexDashOfficeLib.OfficeNs.CustomXMLNode): scala.Boolean = js.native
}

