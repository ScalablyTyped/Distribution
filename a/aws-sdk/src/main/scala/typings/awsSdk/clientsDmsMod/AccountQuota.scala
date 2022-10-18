package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountQuota extends StObject {
  
  /**
    * The name of the DMS quota for this Amazon Web Services account.
    */
  var AccountQuotaName: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum allowed value for the quota.
    */
  var Max: js.UndefOr[Long] = js.undefined
  
  /**
    * The amount currently used toward the quota maximum.
    */
  var Used: js.UndefOr[Long] = js.undefined
}
object AccountQuota {
  
  inline def apply(): AccountQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountQuota]
  }
  
  extension [Self <: AccountQuota](x: Self) {
    
    inline def setAccountQuotaName(value: String): Self = StObject.set(x, "AccountQuotaName", value.asInstanceOf[js.Any])
    
    inline def setAccountQuotaNameUndefined: Self = StObject.set(x, "AccountQuotaName", js.undefined)
    
    inline def setMax(value: Long): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setUsed(value: Long): Self = StObject.set(x, "Used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "Used", js.undefined)
  }
}
