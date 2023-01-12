package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResampleMediaTasks extends StObject {
  
  def Cancel(): Unit
  
  val Count: Double
  
  def Item(Index: Double): ResampleMediaTask
  
  def Pause(): Unit
  
  val PercentComplete: Double
  
  /* private */ @JSName("PowerPoint.ResampleMediaTasks_typekey")
  var PowerPointDotResampleMediaTasks_typekey: ResampleMediaTasks
  
  def Resume(): Unit
}
object ResampleMediaTasks {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ResampleMediaTasks] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "Cancel", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ResampleMediaTask): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "Pause", js.Any.fromFunction0(value))
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "PercentComplete", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotResampleMediaTasks_typekey(value: ResampleMediaTasks): Self = StObject.set(x, "PowerPoint.ResampleMediaTasks_typekey", value.asInstanceOf[js.Any])
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "Resume", js.Any.fromFunction0(value))
  }
}
