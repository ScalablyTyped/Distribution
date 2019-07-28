package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ContentControl")
@js.native
class ContentControl protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var BuildingBlockCategory: String = js.native
  var BuildingBlockType: WdBuildingBlockTypes = js.native
  var Checked: Boolean = js.native
  val Creator: Double = js.native
  var DateCalendarType: WdCalendarType = js.native
  var DateDisplayFormat: String = js.native
  var DateDisplayLocale: WdLanguageID = js.native
  var DateStorageFormat: WdContentControlDateStorageFormat = js.native
  var DefaultTextStyle: js.Any = js.native
  val DropdownListEntries: ContentControlListEntries = js.native
  val ID: String = js.native
  var LockContentControl: Boolean = js.native
  var LockContents: Boolean = js.native
  var MultiLine: Boolean = js.native
  val Parent: js.Any = js.native
  val ParentContentControl: ContentControl = js.native
  val PlaceholderText: BuildingBlock = js.native
  val Range: typings.activexDashWord.WordNs.Range = js.native
  val ShowingPlaceholderText: Boolean = js.native
  var Tag: String = js.native
  var Temporary: Boolean = js.native
  var Title: String = js.native
  var Type: WdContentControlType = js.native
  var `Word.ContentControl_typekey`: ContentControl = js.native
  val XMLMapping: typings.activexDashWord.WordNs.XMLMapping = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  /** @param boolean [DeleteContents=false] */
  def Delete(): Unit = js.native
  def Delete(DeleteContents: Boolean): Unit = js.native
  /** @param string [Font=''] */
  def SetCheckedSymbol(CharacterNumber: Double): Unit = js.native
  def SetCheckedSymbol(CharacterNumber: Double, Font: String): Unit = js.native
  /**
    * @param Word.BuildingBlock [BuildingBlock=0]
    * @param Word.Range [Range=0]
    * @param string [Text='']
    */
  def SetPlaceholderText(): Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock): Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock, Range: typings.activexDashWord.WordNs.Range): Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock, Range: typings.activexDashWord.WordNs.Range, Text: String): Unit = js.native
  /** @param string [Font=''] */
  def SetUncheckedSymbol(CharacterNumber: Double): Unit = js.native
  def SetUncheckedSymbol(CharacterNumber: Double, Font: String): Unit = js.native
  def Ungroup(): Unit = js.native
}

