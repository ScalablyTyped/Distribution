package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPolicyStats extends StObject {
  
  /**
    * The number of encryption policies in the current account.
    */
  var EncryptionPolicyCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of network policies in the current account.
    */
  var NetworkPolicyCount: js.UndefOr[Long] = js.undefined
}
object SecurityPolicyStats {
  
  inline def apply(): SecurityPolicyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityPolicyStats] (val x: Self) extends AnyVal {
    
    inline def setEncryptionPolicyCount(value: Long): Self = StObject.set(x, "EncryptionPolicyCount", value.asInstanceOf[js.Any])
    
    inline def setEncryptionPolicyCountUndefined: Self = StObject.set(x, "EncryptionPolicyCount", js.undefined)
    
    inline def setNetworkPolicyCount(value: Long): Self = StObject.set(x, "NetworkPolicyCount", value.asInstanceOf[js.Any])
    
    inline def setNetworkPolicyCountUndefined: Self = StObject.set(x, "NetworkPolicyCount", js.undefined)
  }
}
