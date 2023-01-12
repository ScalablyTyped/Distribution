package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseIpamPoolAllocationResult extends StObject {
  
  /**
    * Indicates if the release was successful.
    */
  var Success: js.UndefOr[Boolean] = js.undefined
}
object ReleaseIpamPoolAllocationResult {
  
  inline def apply(): ReleaseIpamPoolAllocationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseIpamPoolAllocationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseIpamPoolAllocationResult] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
  }
}
