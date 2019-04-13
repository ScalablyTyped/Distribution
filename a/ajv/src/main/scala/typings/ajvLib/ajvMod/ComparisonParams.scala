package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComparisonParams extends ErrorParameters {
  var comparison: java.lang.String
  var exclusive: scala.Boolean
  var limit: scala.Double | java.lang.String
}

object ComparisonParams {
  @scala.inline
  def apply(comparison: java.lang.String, exclusive: scala.Boolean, limit: scala.Double | java.lang.String): ComparisonParams = {
    val __obj = js.Dynamic.literal(comparison = comparison, exclusive = exclusive, limit = limit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComparisonParams]
  }
}

