package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineNumbering extends js.Object {
  var Active: Double
  val Application: typings.activexWord.Word.Application
  var CountBy: Double
  val Creator: Double
  var DistanceFromText: Double
  val Parent: js.Any
  var RestartMode: WdNumberingRule
  var StartingNumber: Double
  @JSName("Word.LineNumbering_typekey")
  var WordDotLineNumbering_typekey: LineNumbering
}

object LineNumbering {
  @scala.inline
  def apply(
    Active: Double,
    Application: Application,
    CountBy: Double,
    Creator: Double,
    DistanceFromText: Double,
    Parent: js.Any,
    RestartMode: WdNumberingRule,
    StartingNumber: Double,
    WordDotLineNumbering_typekey: LineNumbering
  ): LineNumbering = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CountBy = CountBy.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceFromText = DistanceFromText.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RestartMode = RestartMode.asInstanceOf[js.Any], StartingNumber = StartingNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.LineNumbering_typekey")(WordDotLineNumbering_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNumbering]
  }
}

