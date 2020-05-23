package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTag extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val DownloadURL: String
  val Name: String
  val Parent: js.Any
  val Properties: CustomProperties
  val Range: typings.activexWord.Word.Range
  val SmartTagActions: typings.activexWord.Word.SmartTagActions
  @JSName("Word.SmartTag_typekey")
  var WordDotSmartTag_typekey: SmartTag
  val XML: String
  val XMLNode: typings.activexWord.Word.XMLNode
  def Delete(): Unit
  def Select(): Unit
}

object SmartTag {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DownloadURL: String,
    Name: String,
    Parent: js.Any,
    Properties: CustomProperties,
    Range: Range,
    Select: () => Unit,
    SmartTagActions: SmartTagActions,
    WordDotSmartTag_typekey: SmartTag,
    XML: String,
    XMLNode: XMLNode
  ): SmartTag = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DownloadURL = DownloadURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), SmartTagActions = SmartTagActions.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any], XMLNode = XMLNode.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTag_typekey")(WordDotSmartTag_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTag]
  }
}

