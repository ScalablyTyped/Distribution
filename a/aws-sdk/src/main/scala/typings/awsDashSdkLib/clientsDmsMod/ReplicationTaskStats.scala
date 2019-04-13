package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationTaskStats extends js.Object {
  /**
    * The elapsed time of the task, in milliseconds.
    */
  var ElapsedTimeMillis: js.UndefOr[Long] = js.undefined
  /**
    * The percent complete for the full load migration task.
    */
  var FullLoadProgressPercent: js.UndefOr[Integer] = js.undefined
  /**
    * The number of errors that have occurred during this task.
    */
  var TablesErrored: js.UndefOr[Integer] = js.undefined
  /**
    * The number of tables loaded for this task.
    */
  var TablesLoaded: js.UndefOr[Integer] = js.undefined
  /**
    * The number of tables currently loading for this task.
    */
  var TablesLoading: js.UndefOr[Integer] = js.undefined
  /**
    * The number of tables queued for this task.
    */
  var TablesQueued: js.UndefOr[Integer] = js.undefined
}

object ReplicationTaskStats {
  @scala.inline
  def apply(
    ElapsedTimeMillis: js.UndefOr[Long] = js.undefined,
    FullLoadProgressPercent: js.UndefOr[Integer] = js.undefined,
    TablesErrored: js.UndefOr[Integer] = js.undefined,
    TablesLoaded: js.UndefOr[Integer] = js.undefined,
    TablesLoading: js.UndefOr[Integer] = js.undefined,
    TablesQueued: js.UndefOr[Integer] = js.undefined
  ): ReplicationTaskStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ElapsedTimeMillis)) __obj.updateDynamic("ElapsedTimeMillis")(ElapsedTimeMillis)
    if (!js.isUndefined(FullLoadProgressPercent)) __obj.updateDynamic("FullLoadProgressPercent")(FullLoadProgressPercent)
    if (!js.isUndefined(TablesErrored)) __obj.updateDynamic("TablesErrored")(TablesErrored)
    if (!js.isUndefined(TablesLoaded)) __obj.updateDynamic("TablesLoaded")(TablesLoaded)
    if (!js.isUndefined(TablesLoading)) __obj.updateDynamic("TablesLoading")(TablesLoading)
    if (!js.isUndefined(TablesQueued)) __obj.updateDynamic("TablesQueued")(TablesQueued)
    __obj.asInstanceOf[ReplicationTaskStats]
  }
}

