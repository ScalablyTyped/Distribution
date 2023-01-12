package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedExecution extends StObject {
  
  /**
    * When true, StackSets performs non-conflicting operations concurrently and queues conflicting operations. After conflicting operations finish, StackSets starts queued operations in request order.  If there are already running or queued operations, StackSets queues all incoming operations even if they are non-conflicting. You can't modify your stack set's execution configuration while there are running or queued operations for that stack set.  When false (default), StackSets performs one operation at a time in request order.
    */
  var Active: js.UndefOr[ManagedExecutionNullable] = js.undefined
}
object ManagedExecution {
  
  inline def apply(): ManagedExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedExecution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedExecution] (val x: Self) extends AnyVal {
    
    inline def setActive(value: ManagedExecutionNullable): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
  }
}
