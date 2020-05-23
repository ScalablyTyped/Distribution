package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagAction extends js.Object {
  val ActiveXControl: js.Any
  val Application: typings.activexWord.Word.Application
  var CheckboxState: Boolean
  val Creator: Double
  var ExpandDocumentFragment: Boolean
  var ExpandHelp: Boolean
  var ListSelection: Double
  val Name: String
  val Parent: js.Any
  val PresentInPane: Boolean
  var RadioGroupSelection: Double
  var TextboxText: String
  val Type: WdSmartTagControlType
  @JSName("Word.SmartTagAction_typekey")
  var WordDotSmartTagAction_typekey: SmartTagAction
  def Execute(): Unit
}

object SmartTagAction {
  @scala.inline
  def apply(
    ActiveXControl: js.Any,
    Application: Application,
    CheckboxState: Boolean,
    Creator: Double,
    Execute: () => Unit,
    ExpandDocumentFragment: Boolean,
    ExpandHelp: Boolean,
    ListSelection: Double,
    Name: String,
    Parent: js.Any,
    PresentInPane: Boolean,
    RadioGroupSelection: Double,
    TextboxText: String,
    Type: WdSmartTagControlType,
    WordDotSmartTagAction_typekey: SmartTagAction
  ): SmartTagAction = {
    val __obj = js.Dynamic.literal(ActiveXControl = ActiveXControl.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CheckboxState = CheckboxState.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), ExpandDocumentFragment = ExpandDocumentFragment.asInstanceOf[js.Any], ExpandHelp = ExpandHelp.asInstanceOf[js.Any], ListSelection = ListSelection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresentInPane = PresentInPane.asInstanceOf[js.Any], RadioGroupSelection = RadioGroupSelection.asInstanceOf[js.Any], TextboxText = TextboxText.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagAction_typekey")(WordDotSmartTagAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagAction]
  }
}

