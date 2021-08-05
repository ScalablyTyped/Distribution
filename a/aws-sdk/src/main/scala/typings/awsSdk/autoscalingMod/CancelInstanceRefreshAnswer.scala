package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelInstanceRefreshAnswer extends StObject {
  
  /**
    * The instance refresh ID.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object CancelInstanceRefreshAnswer {
  
  inline def apply(): CancelInstanceRefreshAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelInstanceRefreshAnswer]
  }
  
  extension [Self <: CancelInstanceRefreshAnswer](x: Self) {
    
    inline def setInstanceRefreshId(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceRefreshId", value.asInstanceOf[js.Any])
    
    inline def setInstanceRefreshIdUndefined: Self = StObject.set(x, "InstanceRefreshId", js.undefined)
  }
}
