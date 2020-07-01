package typings.atlassianConnectJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accept extends js.Object {
  var Accept: String
  var `If-Match`: String
  var `If-None-Match`: String
}

object Accept {
  @scala.inline
  def apply(Accept: String, `If-Match`: String, `If-None-Match`: String): Accept = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Match")(`If-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-None-Match")(`If-None-Match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
}

