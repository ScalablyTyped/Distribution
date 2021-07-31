package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentControl extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var BuildingBlockCategory: String = js.native
  
  var BuildingBlockType: WdBuildingBlockTypes = js.native
  
  var Checked: Boolean = js.native
  
  def Copy(): Unit = js.native
  
  val Creator: Double = js.native
  
  def Cut(): Unit = js.native
  
  var DateCalendarType: WdCalendarType = js.native
  
  var DateDisplayFormat: String = js.native
  
  var DateDisplayLocale: WdLanguageID = js.native
  
  var DateStorageFormat: WdContentControlDateStorageFormat = js.native
  
  var DefaultTextStyle: js.Any = js.native
  
  /** @param boolean [DeleteContents=false] */
  def Delete(): Unit = js.native
  def Delete(DeleteContents: Boolean): Unit = js.native
  
  val DropdownListEntries: ContentControlListEntries = js.native
  
  val ID: String = js.native
  
  var LockContentControl: Boolean = js.native
  
  var LockContents: Boolean = js.native
  
  var MultiLine: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  val ParentContentControl: ContentControl = js.native
  
  val PlaceholderText: BuildingBlock = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  /** @param string [Font=''] */
  def SetCheckedSymbol(CharacterNumber: Double): Unit = js.native
  def SetCheckedSymbol(CharacterNumber: Double, Font: String): Unit = js.native
  
  /**
    * @param Word.BuildingBlock [BuildingBlock=0]
    * @param Word.Range [Range=0]
    * @param string [Text='']
    */
  def SetPlaceholderText(): Unit = js.native
  def SetPlaceholderText(BuildingBlock: Unit, Range: Unit, Text: String): Unit = js.native
  def SetPlaceholderText(BuildingBlock: Unit, Range: typings.activexWord.Word.Range): Unit = js.native
  def SetPlaceholderText(BuildingBlock: Unit, Range: typings.activexWord.Word.Range, Text: String): Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock): Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock, Range: Unit, Text: String): Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock, Range: typings.activexWord.Word.Range): Unit = js.native
  def SetPlaceholderText(BuildingBlock: BuildingBlock, Range: typings.activexWord.Word.Range, Text: String): Unit = js.native
  
  /** @param string [Font=''] */
  def SetUncheckedSymbol(CharacterNumber: Double): Unit = js.native
  def SetUncheckedSymbol(CharacterNumber: Double, Font: String): Unit = js.native
  
  val ShowingPlaceholderText: Boolean = js.native
  
  var Tag: String = js.native
  
  var Temporary: Boolean = js.native
  
  var Title: String = js.native
  
  var Type: WdContentControlType = js.native
  
  def Ungroup(): Unit = js.native
  
  @JSName("Word.ContentControl_typekey")
  var WordDotContentControl_typekey: ContentControl = js.native
  
  val XMLMapping: typings.activexWord.Word.XMLMapping = js.native
}
