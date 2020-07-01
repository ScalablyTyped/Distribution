package typings.actionsOnGoogle.htmlMod

import typings.actionsOnGoogle.commonMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlResponseOptions[TData /* <: JsonObject */] extends js.Object {
  /**
    * Communicate the following JSON object to the web app.
    *
    * Alias of `updatedState`
    * @public
    */
  var data: js.UndefOr[TData] = js.undefined
  /**
    * Configure if the mic is closed after this html response.
    *
    * Alias of `suppressMic`
    * @public
    */
  var suppress: js.UndefOr[Boolean] = js.undefined
  /**
    * The url of the web app.
    *
    * @public
    */
  var url: js.UndefOr[String] = js.undefined
}

object HtmlResponseOptions {
  @scala.inline
  def apply[/* <: typings.actionsOnGoogle.commonMod.JsonObject */ TData](data: TData = null, suppress: js.UndefOr[Boolean] = js.undefined, url: String = null): HtmlResponseOptions[TData] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(suppress)) __obj.updateDynamic("suppress")(suppress.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlResponseOptions[TData]]
  }
}

