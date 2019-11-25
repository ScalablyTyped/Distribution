package typings.acmeDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Production extends js.Object {
  var production: String
  var staging: String
}

object Anon_Production {
  @scala.inline
  def apply(production: String, staging: String): Anon_Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], staging = staging.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Production]
  }
}

