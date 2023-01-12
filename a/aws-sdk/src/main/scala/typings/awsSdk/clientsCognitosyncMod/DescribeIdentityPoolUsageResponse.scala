package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityPoolUsageResponse extends StObject {
  
  /**
    * Information about the usage of the identity pool.
    */
  var IdentityPoolUsage: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.IdentityPoolUsage] = js.undefined
}
object DescribeIdentityPoolUsageResponse {
  
  inline def apply(): DescribeIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityPoolUsageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIdentityPoolUsageResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityPoolUsage(value: IdentityPoolUsage): Self = StObject.set(x, "IdentityPoolUsage", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolUsageUndefined: Self = StObject.set(x, "IdentityPoolUsage", js.undefined)
  }
}
