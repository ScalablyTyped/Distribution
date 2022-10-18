package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstanceRefreshAnswer extends StObject {
  
  /**
    * A unique ID for tracking the progress of the request.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object StartInstanceRefreshAnswer {
  
  inline def apply(): StartInstanceRefreshAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInstanceRefreshAnswer]
  }
  
  extension [Self <: StartInstanceRefreshAnswer](x: Self) {
    
    inline def setInstanceRefreshId(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceRefreshId", value.asInstanceOf[js.Any])
    
    inline def setInstanceRefreshIdUndefined: Self = StObject.set(x, "InstanceRefreshId", js.undefined)
  }
}
