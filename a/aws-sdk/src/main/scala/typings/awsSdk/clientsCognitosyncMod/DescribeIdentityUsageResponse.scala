package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityUsageResponse extends StObject {
  
  /**
    * Usage information for the identity.
    */
  var IdentityUsage: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.IdentityUsage] = js.undefined
}
object DescribeIdentityUsageResponse {
  
  inline def apply(): DescribeIdentityUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityUsageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIdentityUsageResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityUsage(value: IdentityUsage): Self = StObject.set(x, "IdentityUsage", value.asInstanceOf[js.Any])
    
    inline def setIdentityUsageUndefined: Self = StObject.set(x, "IdentityUsage", js.undefined)
  }
}
