package typings.accedoAccedoOne.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@accedo/accedo-one.@accedo/accedo-one.AccedoEntryParams, 'preview' | 'at' | 'locale'> */
@js.native
trait PickAccedoEntryParamsprev extends js.Object {
  var at: js.UndefOr[String | Date] = js.native
  var locale: js.UndefOr[String] = js.native
  var preview: js.UndefOr[Boolean] = js.native
}

object PickAccedoEntryParamsprev {
  @scala.inline
  def apply(): PickAccedoEntryParamsprev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAccedoEntryParamsprev]
  }
  @scala.inline
  implicit class PickAccedoEntryParamsprevOps[Self <: PickAccedoEntryParamsprev] (val x: Self) extends AnyVal {
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
    def setAt(value: String | Date): Self = this.set("at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
  }
  
}

