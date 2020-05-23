package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCharacters extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Caption: String
  val Count: Double
  val Creator: Double
  val Font: ChartFont
  val Parent: js.Any
  var PhoneticCharacters: String
  @JSName("PowerPoint.ChartCharacters_typekey")
  var PowerPointDotChartCharacters_typekey: ChartCharacters
  var Text: String
  def Delete(): js.Any
  def Insert(String: String): js.Any
}

object ChartCharacters {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Count: Double,
    Creator: Double,
    Delete: () => js.Any,
    Font: ChartFont,
    Insert: String => js.Any,
    Parent: js.Any,
    PhoneticCharacters: String,
    PowerPointDotChartCharacters_typekey: ChartCharacters,
    Text: String
  ): ChartCharacters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Insert = js.Any.fromFunction1(Insert), Parent = Parent.asInstanceOf[js.Any], PhoneticCharacters = PhoneticCharacters.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartCharacters_typekey")(PowerPointDotChartCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCharacters]
  }
}

