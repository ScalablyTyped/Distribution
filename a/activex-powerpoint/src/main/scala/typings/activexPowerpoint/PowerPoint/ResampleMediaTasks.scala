package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResampleMediaTasks extends StObject {
  
  def Cancel(): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): ResampleMediaTask = js.native
  
  def Pause(): Unit = js.native
  
  val PercentComplete: Double = js.native
  
  @JSName("PowerPoint.ResampleMediaTasks_typekey")
  var PowerPointDotResampleMediaTasks_typekey: ResampleMediaTasks = js.native
  
  def Resume(): Unit = js.native
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
  
  @scala.inline
  implicit class ResampleMediaTasksMutableBuilder[Self <: ResampleMediaTasks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "Cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => ResampleMediaTask): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "Pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPercentComplete(value: Double): Self = StObject.set(x, "PercentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotResampleMediaTasks_typekey(value: ResampleMediaTasks): Self = StObject.set(x, "PowerPoint.ResampleMediaTasks_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: () => Unit): Self = StObject.set(x, "Resume", js.Any.fromFunction0(value))
  }
}
