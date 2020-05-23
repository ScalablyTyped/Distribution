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
  def apply(column: js.UndefOr[Null | Double] = js.undefined, line: js.UndefOr[Null | Double] = js.undefined): ILocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
}

