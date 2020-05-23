package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagRecognizers extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.SmartTagRecognizers_typekey")
  var WordDotSmartTagRecognizers_typekey: SmartTagRecognizers
  def Item(Index: js.Any): SmartTagRecognizer
  def ReloadRecognizers(): Unit
}

object SmartTagRecognizers {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => SmartTagRecognizer,
    Parent: js.Any,
    ReloadRecognizers: () => Unit,
    WordDotSmartTagRecognizers_typekey: SmartTagRecognizers
  ): SmartTagRecognizers = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadRecognizers = js.Any.fromFunction0(ReloadRecognizers))
    __obj.updateDynamic("Word.SmartTagRecognizers_typekey")(WordDotSmartTagRecognizers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizers]
  }
}

