package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsRequestCount extends js.Object {
  var failed: Double
  var refused: Double
  var succeeded: Double
}

object StatsRequestCount {
  @scala.inline
  def apply(failed: Double, refused: Double, succeeded: Double): StatsRequestCount = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], refused = refused.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatsRequestCount]
  }
}

