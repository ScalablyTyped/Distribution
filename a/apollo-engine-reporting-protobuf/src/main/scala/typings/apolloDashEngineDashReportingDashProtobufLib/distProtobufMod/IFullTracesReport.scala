package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFullTracesReport extends js.Object {
  /** FullTracesReport header */
  var header: js.UndefOr[IReportHeader | scala.Null] = js.undefined
  /** FullTracesReport tracesPerQuery */
  var tracesPerQuery: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ITraces] | scala.Null] = js.undefined
}

object IFullTracesReport {
  @scala.inline
  def apply(
    header: IReportHeader = null,
    tracesPerQuery: org.scalablytyped.runtime.StringDictionary[ITraces] = null
  ): IFullTracesReport = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header)
    if (tracesPerQuery != null) __obj.updateDynamic("tracesPerQuery")(tracesPerQuery)
    __obj.asInstanceOf[IFullTracesReport]
  }
}

