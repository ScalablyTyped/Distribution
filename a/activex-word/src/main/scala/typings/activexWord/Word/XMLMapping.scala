package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLMapping extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val CustomXMLNode: typings.activexOffice.Office.CustomXMLNode = js.native
  
  val CustomXMLPart: typings.activexOffice.Office.CustomXMLPart = js.native
  
  def Delete(): Unit = js.native
  
  val IsMapped: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  val PrefixMappings: String = js.native
  
  /**
    * @param string [PrefixMapping='']
    * @param Office.CustomXMLPart [Source=0]
    */
  def SetMapping(XPath: String): Boolean = js.native
  def SetMapping(
    XPath: String,
    PrefixMapping: js.UndefOr[scala.Nothing],
    Source: typings.activexOffice.Office.CustomXMLPart
  ): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String, Source: typings.activexOffice.Office.CustomXMLPart): Boolean = js.native
  
  def SetMappingByNode(Node: typings.activexOffice.Office.CustomXMLNode): Boolean = js.native
  
  @JSName("Word.XMLMapping_typekey")
  var WordDotXMLMapping_typekey: XMLMapping = js.native
  
  val XPath: String = js.native
}
