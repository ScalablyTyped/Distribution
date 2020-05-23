package typings.accedoAccedoOne.mod.AccedoLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logobject extends Details {
  /**
    * the log type
    */
  var logType: Level
  /** Extra metadata (will go through JSON.stringify) */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
    * The timestamp for the log, as a UTC ISO 8601 string
    * (ie. '2016-07-04T06:17:21Z'), or a POSIX millisecond
    * number
    */
  var timestamp: String | Double
}

object Logobject {
  @scala.inline
  def apply(
    logType: Level,
    message: String,
    timestamp: String | Double,
    dim1: String = null,
    dim2: String = null,
    dim3: String = null,
    dim4: String = null,
    errorCode: js.UndefOr[Double] = js.undefined,
    metadata: js.Any = null
  ): Logobject = {
    val __obj = js.Dynamic.literal(logType = logType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (dim1 != null) __obj.updateDynamic("dim1")(dim1.asInstanceOf[js.Any])
    if (dim2 != null) __obj.updateDynamic("dim2")(dim2.asInstanceOf[js.Any])
    if (dim3 != null) __obj.updateDynamic("dim3")(dim3.asInstanceOf[js.Any])
    if (dim4 != null) __obj.updateDynamic("dim4")(dim4.asInstanceOf[js.Any])
    if (!js.isUndefined(errorCode)) __obj.updateDynamic("errorCode")(errorCode.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logobject]
  }
}

