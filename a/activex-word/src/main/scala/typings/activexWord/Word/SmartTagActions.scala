package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagActions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.SmartTagActions_typekey")
  var WordDotSmartTagActions_typekey: SmartTagActions
  def Item(Index: js.Any): SmartTagAction
  def ReloadActions(): Unit
}

object SmartTagActions {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => SmartTagAction,
    Parent: js.Any,
    ReloadActions: () => Unit,
    WordDotSmartTagActions_typekey: SmartTagActions
  ): SmartTagActions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadActions = js.Any.fromFunction0(ReloadActions))
    __obj.updateDynamic("Word.SmartTagActions_typekey")(WordDotSmartTagActions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagActions]
  }
}

