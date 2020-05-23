package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResampleMediaTasks extends js.Object {
  val Count: Double
  val PercentComplete: Double
  @JSName("PowerPoint.ResampleMediaTasks_typekey")
  var PowerPointDotResampleMediaTasks_typekey: ResampleMediaTasks
  def Cancel(): Unit
  def Item(Index: Double): ResampleMediaTask
  def Pause(): Unit
  def Resume(): Unit
}

object ResampleMediaTasks {
  @scala.inline
  def apply(
    Cancel: () => Unit,
    Count: Double,
    Item: Double => ResampleMediaTask,
    Pause: () => Unit,
    PercentComplete: Double,
    PowerPointDotResampleMediaTasks_typekey: ResampleMediaTasks,
    Resume: () => Unit
  ): ResampleMediaTasks = {
    val __obj = js.Dynamic.literal(Cancel = js.Any.fromFunction0(Cancel), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Pause = js.Any.fromFunction0(Pause), PercentComplete = PercentComplete.asInstanceOf[js.Any], Resume = js.Any.fromFunction0(Resume))
    __obj.updateDynamic("PowerPoint.ResampleMediaTasks_typekey")(PowerPointDotResampleMediaTasks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResampleMediaTasks]
  }
}

