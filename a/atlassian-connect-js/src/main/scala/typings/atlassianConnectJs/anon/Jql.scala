package typings.atlassianConnectJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jql extends js.Object {
  var jql: String
}

object Jql {
  @scala.inline
  def apply(jql: String): Jql = {
    val __obj = js.Dynamic.literal(jql = jql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jql]
  }
}

