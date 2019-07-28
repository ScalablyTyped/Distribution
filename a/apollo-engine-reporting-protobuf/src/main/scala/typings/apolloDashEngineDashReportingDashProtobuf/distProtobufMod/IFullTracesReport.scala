package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFullTracesReport extends js.Object {
  /** FullTracesReport header */
  var header: js.UndefOr[IReportHeader | Null] = js.undefined
  /** FullTracesReport tracesPerQuery */
  var tracesPerQuery: js.UndefOr[StringDictionary[ITraces] | Null] = js.undefined
}

object IFullTracesReport {
  @scala.inline
  def apply(header: IReportHeader = null, tracesPerQuery: StringDictionary[ITraces] = null): IFullTracesReport = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header)
    if (tracesPerQuery != null) __obj.updateDynamic("tracesPerQuery")(tracesPerQuery)
    __obj.asInstanceOf[IFullTracesReport]
  }
}

