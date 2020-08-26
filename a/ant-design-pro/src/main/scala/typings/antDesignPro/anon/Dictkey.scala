package typings.antDesignPro.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey extends /* key */ StringDictionary[String] {
  var clear: String = js.native
  var emptyText: String = js.native
  var viewMore: String = js.native
}

object Dictkey {
  @scala.inline
  def apply(clear: String, emptyText: String, viewMore: String): Dictkey = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], emptyText = emptyText.asInstanceOf[js.Any], viewMore = viewMore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
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
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmptyText(value: String): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMore(value: String): Self = this.set("viewMore", value.asInstanceOf[js.Any])
  }
  
}

