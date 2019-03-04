package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdSlug extends js.Object {
  var _id: java.lang.String
  var slug: java.lang.String
  var title: java.lang.String
  var `type`: java.lang.String
}

object Anon_IdSlug {
  @scala.inline
  def apply(_id: java.lang.String, slug: java.lang.String, title: java.lang.String, `type`: java.lang.String): Anon_IdSlug = {
    val __obj = js.Dynamic.literal(_id = _id, slug = slug, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdSlug]
  }
}

