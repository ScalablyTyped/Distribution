package typings.actionsOnGoogle.htmlMod

import typings.actionsOnGoogle.commonMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlResponseOptions[TData /* <: JsonObject */] extends js.Object {
  /**
    * Communicate the following JSON object to the web app.
    *
    * Alias of `updatedState`
    * @public
    */
  var data: js.UndefOr[TData] = js.native
  /**
    * Configure if the mic is closed after this html response.
    *
    * Alias of `suppressMic`
    * @public
    */
  var suppress: js.UndefOr[Boolean] = js.native
  /**
    * The url of the web app.
    *
    * @public
    */
  var url: js.UndefOr[String] = js.native
}

object HtmlResponseOptions {
  @scala.inline
  def apply[/* <: typings.actionsOnGoogle.commonMod.JsonObject */ TData](): HtmlResponseOptions[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlResponseOptions[TData]]
  }
  @scala.inline
  implicit class HtmlResponseOptionsOps[Self <: HtmlResponseOptions[_], /* <: typings.actionsOnGoogle.commonMod.JsonObject */ TData] (val x: Self with HtmlResponseOptions[TData]) extends AnyVal {
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
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setSuppress(value: Boolean): Self = this.set("suppress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppress: Self = this.set("suppress", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

