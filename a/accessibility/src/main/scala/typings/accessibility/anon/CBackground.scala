package typings.accessibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CBackground extends js.Object {
  /** @default '#000000' */
  var cBackground: js.UndefOr[String] = js.native
  /** @default '#20ff69' */
  var cBorder: js.UndefOr[String] = js.native
  /** @default '12px' */
  var height: js.UndefOr[String] = js.native
}

object CBackground {
  @scala.inline
  def apply(): CBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CBackground]
  }
  @scala.inline
  implicit class CBackgroundOps[Self <: CBackground] (val x: Self) extends AnyVal {
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
    def setCBackground(value: String): Self = this.set("cBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCBackground: Self = this.set("cBackground", js.undefined)
    @scala.inline
    def setCBorder(value: String): Self = this.set("cBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCBorder: Self = this.set("cBorder", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
  
}

