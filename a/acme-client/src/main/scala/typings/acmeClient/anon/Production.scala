package typings.acmeClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Production extends js.Object {
  var production: String
  var staging: String
}

object Production {
  @scala.inline
  def apply(production: String, staging: String): Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], staging = staging.asInstanceOf[js.Any])
    __obj.asInstanceOf[Production]
  }
}

