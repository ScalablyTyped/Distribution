package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ContentControl")
@js.native
class ContentControl protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  var BuildingBlockCategory: java.lang.String = js.native
  var BuildingBlockType: WdBuildingBlockTypes = js.native
  var Checked: scala.Boolean = js.native
  val Creator: scala.Double = js.native
  var DateCalendarType: WdCalendarType = js.native
  var DateDisplayFormat: java.lang.String = js.native
  var DateDisplayLocale: WdLanguageID = js.native
  var DateStorageFormat: WdContentControlDateStorageFormat = js.native
  var DefaultTextStyle: js.Any = js.native
  val DropdownListEntries: ContentControlListEntries = js.native
  val ID: java.lang.String = js.native
  var LockContentControl: scala.Boolean = js.native
  var LockContents: scala.Boolean = js.native
  var MultiLine: scala.Boolean = js.native
  val Parent: js.Any = js.native
  val ParentContentControl: ContentControl = js.native
  val PlaceholderText: BuildingBlock = js.native
  val Range: activexDashWordLib.WordNs.Range = js.native
  val ShowingPlaceholderText: scala.Boolean = js.native
  var Tag: java.lang.String = js.native
  var Temporary: scala.Boolean = js.native
  var Title: java.lang.String = js.native
  var Type: WdContentControlType = js.native
  var `Word.ContentControl_typekey`: ContentControl = js.native
  val XMLMapping: activexDashWordLib.WordNs.XMLMapping = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  /** @param boolean [DeleteContents=false] */
  def Delete(): scala.Unit = js.native
  def Delete(DeleteContents: scala.Boolean): scala.Unit = js.native
  /** @param string [Font=''] */
  def SetCheckedSymbol(CharacterNumber: scala.Double): scala.Unit = js.native
  def SetCheckedSymbol(CharacterNumber: scala.Double, Font: java.lang.String): scala.Unit = js.native
  /**
    * @param Word.BuildingBlock [BuildingBlock=0]
    * @param Word.Range [Range=0]
    * @param string [Text='']
    */
  def SetPlaceholderText(): scala.Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock): scala.Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock, Range: Range): scala.Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock, Range: Range, Text: java.lang.String): scala.Unit = js.native
  /** @param string [Font=''] */
  def SetUncheckedSymbol(CharacterNumber: scala.Double): scala.Unit = js.native
  def SetUncheckedSymbol(CharacterNumber: scala.Double, Font: java.lang.String): scala.Unit = js.native
  def Ungroup(): scala.Unit = js.native
}

