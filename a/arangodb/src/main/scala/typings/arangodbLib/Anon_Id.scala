package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var _id: java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(
    _id: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Id]
  }
}

