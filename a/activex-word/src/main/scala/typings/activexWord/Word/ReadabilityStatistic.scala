package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadabilityStatistic extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Name: String
  val Parent: js.Any
  val Value: Double
  @JSName("Word.ReadabilityStatistic_typekey")
  var WordDotReadabilityStatistic_typekey: ReadabilityStatistic
}

object ReadabilityStatistic {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    Value: Double,
    WordDotReadabilityStatistic_typekey: ReadabilityStatistic
  ): ReadabilityStatistic = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReadabilityStatistic_typekey")(WordDotReadabilityStatistic_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadabilityStatistic]
  }
}

