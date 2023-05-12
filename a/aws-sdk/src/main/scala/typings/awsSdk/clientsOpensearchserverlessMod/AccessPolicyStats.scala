package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPolicyStats extends StObject {
  
  /**
    * The number of data access policies in the current account.
    */
  var DataPolicyCount: js.UndefOr[Long] = js.undefined
}
object AccessPolicyStats {
  
  inline def apply(): AccessPolicyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPolicyStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPolicyStats] (val x: Self) extends AnyVal {
    
    inline def setDataPolicyCount(value: Long): Self = StObject.set(x, "DataPolicyCount", value.asInstanceOf[js.Any])
    
    inline def setDataPolicyCountUndefined: Self = StObject.set(x, "DataPolicyCount", js.undefined)
  }
}
