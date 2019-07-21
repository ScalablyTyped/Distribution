package typings
package acmeDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Production extends js.Object {
  var production: java.lang.String
  var staging: java.lang.String
}

object Anon_Production {
  @scala.inline
  def apply(production: java.lang.String, staging: java.lang.String): Anon_Production = {
    val __obj = js.Dynamic.literal(production = production, staging = staging)
  
    __obj.asInstanceOf[Anon_Production]
  }
}

