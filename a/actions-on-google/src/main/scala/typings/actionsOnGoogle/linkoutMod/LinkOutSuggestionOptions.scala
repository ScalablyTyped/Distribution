package typings.actionsOnGoogle.linkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkOutSuggestionOptions extends js.Object {
  /**
    * Text shown on the suggestion chip.
    * @public
    */
  var name: String = js.native
  /**
    * String URL to open.
    * @public
    */
  var url: String = js.native
}

object LinkOutSuggestionOptions {
  @scala.inline
  def apply(name: String, url: String): LinkOutSuggestionOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkOutSuggestionOptions]
  }
  @scala.inline
  implicit class LinkOutSuggestionOptionsOps[Self <: LinkOutSuggestionOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

