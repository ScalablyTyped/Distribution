package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pages extends js.Object {
  val Pages: PropertyPages = js.native
}

object Pages {
  @scala.inline
  def apply(Pages: PropertyPages): Pages = {
    val __obj = js.Dynamic.literal(Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
  @scala.inline
  implicit class PagesOps[Self <: Pages] (val x: Self) extends AnyVal {
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
    def setPages(value: PropertyPages): Self = this.set("Pages", value.asInstanceOf[js.Any])
  }
  
}

