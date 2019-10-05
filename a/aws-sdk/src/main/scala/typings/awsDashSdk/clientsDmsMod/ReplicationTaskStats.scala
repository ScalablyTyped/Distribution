package typings.awsDashSdk.clientsDmsMod

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
    ElapsedTimeMillis: Int | Double = null,
    FullLoadProgressPercent: Int | Double = null,
    TablesErrored: Int | Double = null,
    TablesLoaded: Int | Double = null,
    TablesLoading: Int | Double = null,
    TablesQueued: Int | Double = null
  ): ReplicationTaskStats = {
    val __obj = js.Dynamic.literal()
    if (ElapsedTimeMillis != null) __obj.updateDynamic("ElapsedTimeMillis")(ElapsedTimeMillis.asInstanceOf[js.Any])
    if (FullLoadProgressPercent != null) __obj.updateDynamic("FullLoadProgressPercent")(FullLoadProgressPercent.asInstanceOf[js.Any])
    if (TablesErrored != null) __obj.updateDynamic("TablesErrored")(TablesErrored.asInstanceOf[js.Any])
    if (TablesLoaded != null) __obj.updateDynamic("TablesLoaded")(TablesLoaded.asInstanceOf[js.Any])
    if (TablesLoading != null) __obj.updateDynamic("TablesLoading")(TablesLoading.asInstanceOf[js.Any])
    if (TablesQueued != null) __obj.updateDynamic("TablesQueued")(TablesQueued.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTaskStats]
  }
}

