package typings.apolloEngineReportingProtobuf.protobufMod.Trace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Location. */
trait ILocation extends js.Object {
  /** Location column */
  var column: js.UndefOr[Double | Null] = js.undefined
  /** Location line */
  var line: js.UndefOr[Double | Null] = js.undefined
}

object ILocation {
  @scala.inline
  def apply(column: Int | Double = null, line: Int | Double = null): ILocation = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
}

