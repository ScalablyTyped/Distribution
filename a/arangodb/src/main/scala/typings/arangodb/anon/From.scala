package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From
  extends /* key */ StringDictionary[js.Any] {
  var _from: js.UndefOr[String] = js.native
  var _to: js.UndefOr[String] = js.native
}

object From {
  @scala.inline
  def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
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
    def set_from(value: String): Self = this.set("_from", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_from: Self = this.set("_from", js.undefined)
    @scala.inline
    def set_to(value: String): Self = this.set("_to", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_to: Self = this.set("_to", js.undefined)
  }
  
}

