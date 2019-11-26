package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeUrl extends js.Object {
  var `type`: String
  var url: String
}

object Anon_TypeUrl {
  @scala.inline
  def apply(`type`: String, url: String): Anon_TypeUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeUrl]
  }
}

