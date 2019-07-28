package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComparisonParams extends ErrorParameters {
  var comparison: String
  var exclusive: Boolean
  var limit: Double | String
}

object ComparisonParams {
  @scala.inline
  def apply(comparison: String, exclusive: Boolean, limit: Double | String): ComparisonParams = {
    val __obj = js.Dynamic.literal(comparison = comparison, exclusive = exclusive, limit = limit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComparisonParams]
  }
}

