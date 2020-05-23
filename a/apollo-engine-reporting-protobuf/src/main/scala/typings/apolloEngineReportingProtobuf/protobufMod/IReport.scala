package typings.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReport extends js.Object {
  /** Report endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  /** Report header */
  var header: js.UndefOr[IReportHeader | Null] = js.undefined
  /** Report tracesPerQuery */
  var tracesPerQuery: js.UndefOr[StringDictionary[ITracesAndStats] | Null] = js.undefined
}

object IReport {
  @scala.inline
  def apply(
    endTime: js.UndefOr[Null | ITimestamp] = js.undefined,
    header: js.UndefOr[Null | IReportHeader] = js.undefined,
    tracesPerQuery: js.UndefOr[Null | StringDictionary[ITracesAndStats]] = js.undefined
  ): IReport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endTime)) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(tracesPerQuery)) __obj.updateDynamic("tracesPerQuery")(tracesPerQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReport]
  }
}

