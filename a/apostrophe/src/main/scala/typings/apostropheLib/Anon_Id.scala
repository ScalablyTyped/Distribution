package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var _id: java.lang.String
  var _url: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(_id: java.lang.String, `type`: java.lang.String, _url: java.lang.String = null): Anon_Id = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_id")(_id)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    __obj.asInstanceOf[Anon_Id]
  }
}

