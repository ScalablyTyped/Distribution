package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTaskStats extends js.Object {
  /**
    * The elapsed time of the task, in milliseconds.
    */
  var ElapsedTimeMillis: js.UndefOr[Long] = js.native
  /**
    * The date the replication task was started either with a fresh start or a target reload.
    */
  var FreshStartDate: js.UndefOr[TStamp] = js.native
  /**
    * The date the replication task full load was completed.
    */
  var FullLoadFinishDate: js.UndefOr[TStamp] = js.native
  /**
    * The percent complete for the full load migration task.
    */
  var FullLoadProgressPercent: js.UndefOr[Integer] = js.native
  /**
    * The date the the replication task full load was started.
    */
  var FullLoadStartDate: js.UndefOr[TStamp] = js.native
  /**
    * The date the replication task was started either with a fresh start or a resume. For more information, see StartReplicationTaskType.
    */
  var StartDate: js.UndefOr[TStamp] = js.native
  /**
    * The date the replication task was stopped.
    */
  var StopDate: js.UndefOr[TStamp] = js.native
  /**
    * The number of errors that have occurred during this task.
    */
  var TablesErrored: js.UndefOr[Integer] = js.native
  /**
    * The number of tables loaded for this task.
    */
  var TablesLoaded: js.UndefOr[Integer] = js.native
  /**
    * The number of tables currently loading for this task.
    */
  var TablesLoading: js.UndefOr[Integer] = js.native
  /**
    * The number of tables queued for this task.
    */
  var TablesQueued: js.UndefOr[Integer] = js.native
}

object ReplicationTaskStats {
  @scala.inline
  def apply(
    ElapsedTimeMillis: Int | Double = null,
    FreshStartDate: TStamp = null,
    FullLoadFinishDate: TStamp = null,
    FullLoadProgressPercent: Int | Double = null,
    FullLoadStartDate: TStamp = null,
    StartDate: TStamp = null,
    StopDate: TStamp = null,
    TablesErrored: Int | Double = null,
    TablesLoaded: Int | Double = null,
    TablesLoading: Int | Double = null,
    TablesQueued: Int | Double = null
  ): ReplicationTaskStats = {
    val __obj = js.Dynamic.literal()
    if (ElapsedTimeMillis != null) __obj.updateDynamic("ElapsedTimeMillis")(ElapsedTimeMillis.asInstanceOf[js.Any])
    if (FreshStartDate != null) __obj.updateDynamic("FreshStartDate")(FreshStartDate.asInstanceOf[js.Any])
    if (FullLoadFinishDate != null) __obj.updateDynamic("FullLoadFinishDate")(FullLoadFinishDate.asInstanceOf[js.Any])
    if (FullLoadProgressPercent != null) __obj.updateDynamic("FullLoadProgressPercent")(FullLoadProgressPercent.asInstanceOf[js.Any])
    if (FullLoadStartDate != null) __obj.updateDynamic("FullLoadStartDate")(FullLoadStartDate.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    if (StopDate != null) __obj.updateDynamic("StopDate")(StopDate.asInstanceOf[js.Any])
    if (TablesErrored != null) __obj.updateDynamic("TablesErrored")(TablesErrored.asInstanceOf[js.Any])
    if (TablesLoaded != null) __obj.updateDynamic("TablesLoaded")(TablesLoaded.asInstanceOf[js.Any])
    if (TablesLoading != null) __obj.updateDynamic("TablesLoading")(TablesLoading.asInstanceOf[js.Any])
    if (TablesQueued != null) __obj.updateDynamic("TablesQueued")(TablesQueued.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTaskStats]
  }
}

