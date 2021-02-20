package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XFramesSupplier} instead of that
  * @deprecated Deprecated
  */
@js.native
trait XTasksSupplier extends XInterface {
  
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  val ActiveTask: XTask = js.native
  
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  val Tasks: XEnumerationAccess = js.native
  
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  def getActiveTask(): XTask = js.native
  
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  def getTasks(): XEnumerationAccess = js.native
}
object XTasksSupplier {
  
  @scala.inline
  def apply(
    ActiveTask: XTask,
    Tasks: XEnumerationAccess,
    acquire: () => Unit,
    getActiveTask: () => XTask,
    getTasks: () => XEnumerationAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTasksSupplier = {
    val __obj = js.Dynamic.literal(ActiveTask = ActiveTask.asInstanceOf[js.Any], Tasks = Tasks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getActiveTask = js.Any.fromFunction0(getActiveTask), getTasks = js.Any.fromFunction0(getTasks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTasksSupplier]
  }
  
  @scala.inline
  implicit class XTasksSupplierMutableBuilder[Self <: XTasksSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTask(value: XTask): Self = StObject.set(x, "ActiveTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetActiveTask(value: () => XTask): Self = StObject.set(x, "getActiveTask", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTasks(value: () => XEnumerationAccess): Self = StObject.set(x, "getTasks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTasks(value: XEnumerationAccess): Self = StObject.set(x, "Tasks", value.asInstanceOf[js.Any])
  }
}
