package typings.awsSdk.anon

import typings.awsSdk.s3Mod.ContinuationEvent
import typings.awsSdk.s3Mod.EndEvent
import typings.awsSdk.s3Mod.ProgressEvent
import typings.awsSdk.s3Mod.RecordsEvent
import typings.awsSdk.s3Mod.StatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cont extends js.Object {
  var Cont: js.UndefOr[ContinuationEvent] = js.native
  var End: js.UndefOr[EndEvent] = js.native
  var Progress: js.UndefOr[ProgressEvent] = js.native
  var Records: js.UndefOr[RecordsEvent] = js.native
  var Stats: js.UndefOr[StatsEvent] = js.native
}

object Cont {
  @scala.inline
  def apply(): Cont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cont]
  }
  @scala.inline
  implicit class ContOps[Self <: Cont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCont(value: ContinuationEvent): Self = this.set("Cont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCont: Self = this.set("Cont", js.undefined)
    @scala.inline
    def setEnd(value: EndEvent): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    @scala.inline
    def setProgress(value: ProgressEvent): Self = this.set("Progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    @scala.inline
    def setRecords(value: RecordsEvent): Self = this.set("Records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("Records", js.undefined)
    @scala.inline
    def setStats(value: StatsEvent): Self = this.set("Stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("Stats", js.undefined)
  }
  
}

