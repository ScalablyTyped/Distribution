package typings.actionsOnGoogle.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined actions-on-google.actions-on-google/dist/common.ProtoAny<string, actions-on-google.actions-on-google/dist/common.JsonObject> */
@js.native
trait ProtoAnystringJsonObject
  extends /* key */ StringDictionary[js.Any] {
  var `@type`: String = js.native
}

object ProtoAnystringJsonObject {
  @scala.inline
  def apply(`@type`: String): ProtoAnystringJsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtoAnystringJsonObject]
  }
  @scala.inline
  implicit class ProtoAnystringJsonObjectOps[Self <: ProtoAnystringJsonObject] (val x: Self) extends AnyVal {
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
    def `set@type`(value: String): Self = this.set("@type", value.asInstanceOf[js.Any])
  }
  
}

