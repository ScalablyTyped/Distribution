package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fonts extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.Fonts_typekey")
  var PowerPointDotFonts_typekey: Fonts
  def Item(Index: js.Any): Font
  def Replace(Original: String, Replacement: String): Unit
}

object Fonts {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: js.Any => Font,
    Parent: js.Any,
    PowerPointDotFonts_typekey: Fonts,
    Replace: (String, String) => Unit
  ): Fonts = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Replace = js.Any.fromFunction2(Replace))
    __obj.updateDynamic("PowerPoint.Fonts_typekey")(PowerPointDotFonts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fonts]
  }
}

