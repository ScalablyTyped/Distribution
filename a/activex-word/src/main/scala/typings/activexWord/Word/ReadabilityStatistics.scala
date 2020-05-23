package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadabilityStatistics extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.ReadabilityStatistics_typekey")
  var WordDotReadabilityStatistics_typekey: ReadabilityStatistics
  def Item(Index: js.Any): ReadabilityStatistic
}

object ReadabilityStatistics {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => ReadabilityStatistic,
    Parent: js.Any,
    WordDotReadabilityStatistics_typekey: ReadabilityStatistics
  ): ReadabilityStatistics = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReadabilityStatistics_typekey")(WordDotReadabilityStatistics_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadabilityStatistics]
  }
}

