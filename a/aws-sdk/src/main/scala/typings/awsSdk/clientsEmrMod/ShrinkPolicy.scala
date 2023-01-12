package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShrinkPolicy extends StObject {
  
  /**
    * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
    */
  var DecommissionTimeout: js.UndefOr[Integer] = js.undefined
  
  /**
    * Custom policy for requesting termination protection or termination of specific instances when shrinking an instance group.
    */
  var InstanceResizePolicy: js.UndefOr[typings.awsSdk.clientsEmrMod.InstanceResizePolicy] = js.undefined
}
object ShrinkPolicy {
  
  inline def apply(): ShrinkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShrinkPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShrinkPolicy] (val x: Self) extends AnyVal {
    
    inline def setDecommissionTimeout(value: Integer): Self = StObject.set(x, "DecommissionTimeout", value.asInstanceOf[js.Any])
    
    inline def setDecommissionTimeoutUndefined: Self = StObject.set(x, "DecommissionTimeout", js.undefined)
    
    inline def setInstanceResizePolicy(value: InstanceResizePolicy): Self = StObject.set(x, "InstanceResizePolicy", value.asInstanceOf[js.Any])
    
    inline def setInstanceResizePolicyUndefined: Self = StObject.set(x, "InstanceResizePolicy", js.undefined)
  }
}
