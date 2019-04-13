package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticsearchBufferingHints extends js.Object {
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
    */
  var IntervalInSeconds: js.UndefOr[ElasticsearchBufferingIntervalInSeconds] = js.undefined
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5. We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec, the value should be 10 MB or higher.
    */
  var SizeInMBs: js.UndefOr[ElasticsearchBufferingSizeInMBs] = js.undefined
}

object ElasticsearchBufferingHints {
  @scala.inline
  def apply(
    IntervalInSeconds: js.UndefOr[ElasticsearchBufferingIntervalInSeconds] = js.undefined,
    SizeInMBs: js.UndefOr[ElasticsearchBufferingSizeInMBs] = js.undefined
  ): ElasticsearchBufferingHints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IntervalInSeconds)) __obj.updateDynamic("IntervalInSeconds")(IntervalInSeconds)
    if (!js.isUndefined(SizeInMBs)) __obj.updateDynamic("SizeInMBs")(SizeInMBs)
    __obj.asInstanceOf[ElasticsearchBufferingHints]
  }
}

