package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagTypes extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.SmartTagTypes_typekey")
  var WordDotSmartTagTypes_typekey: SmartTagTypes
  def Item(Index: js.Any): SmartTagType
  def ReloadAll(): Unit
}

object SmartTagTypes {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => SmartTagType,
    Parent: js.Any,
    ReloadAll: () => Unit,
    WordDotSmartTagTypes_typekey: SmartTagTypes
  ): SmartTagTypes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadAll = js.Any.fromFunction0(ReloadAll))
    __obj.updateDynamic("Word.SmartTagTypes_typekey")(WordDotSmartTagTypes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagTypes]
  }
}

