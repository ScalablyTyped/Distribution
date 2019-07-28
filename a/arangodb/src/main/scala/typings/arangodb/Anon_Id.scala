package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id
  extends /* key */ StringDictionary[js.Any] {
  var _id: String
}

object Anon_Id {
  @scala.inline
  def apply(_id: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Id = {
    val __obj = js.Dynamic.literal(_id = _id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Id]
  }
}

