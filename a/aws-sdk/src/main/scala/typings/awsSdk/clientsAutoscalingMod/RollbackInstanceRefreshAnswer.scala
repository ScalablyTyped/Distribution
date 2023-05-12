package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackInstanceRefreshAnswer extends StObject {
  
  /**
    * The instance refresh ID associated with the request. This is the unique ID assigned to the instance refresh when it was started.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object RollbackInstanceRefreshAnswer {
  
  inline def apply(): RollbackInstanceRefreshAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackInstanceRefreshAnswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollbackInstanceRefreshAnswer] (val x: Self) extends AnyVal {
    
    inline def setInstanceRefreshId(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceRefreshId", value.asInstanceOf[js.Any])
    
    inline def setInstanceRefreshIdUndefined: Self = StObject.set(x, "InstanceRefreshId", js.undefined)
  }
}
