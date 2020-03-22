package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined actions-on-google.actions-on-google/dist/common.ProtoAny<string, actions-on-google.actions-on-google/dist/common.JsonObject> */
trait ProtoAnystringJsonObject
  extends /* key */ StringDictionary[js.Any] {
  var `@type`: String
}

object ProtoAnystringJsonObject {
  @scala.inline
  def apply(`@type`: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): ProtoAnystringJsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ProtoAnystringJsonObject]
  }
}

