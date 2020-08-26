package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fonts extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Fonts_typekey")
  var PowerPointDotFonts_typekey: Fonts = js.native
  def Item(Index: js.Any): Font = js.native
  def Replace(Original: String, Replacement: String): Unit = js.native
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
  @scala.inline
  implicit class FontsOps[Self <: Fonts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => Font): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotFonts_typekey(value: Fonts): Self = this.set("PowerPoint.Fonts_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplace(value: (String, String) => Unit): Self = this.set("Replace", js.Any.fromFunction2(value))
  }
  
}

