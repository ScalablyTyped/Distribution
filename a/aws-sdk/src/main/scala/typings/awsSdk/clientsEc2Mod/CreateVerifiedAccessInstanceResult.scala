package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVerifiedAccessInstanceResult extends StObject {
  
  /**
    * The ID of the Verified Access instance.
    */
  var VerifiedAccessInstance: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessInstance] = js.undefined
}
object CreateVerifiedAccessInstanceResult {
  
  inline def apply(): CreateVerifiedAccessInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVerifiedAccessInstanceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVerifiedAccessInstanceResult] (val x: Self) extends AnyVal {
    
    inline def setVerifiedAccessInstance(value: VerifiedAccessInstance): Self = StObject.set(x, "VerifiedAccessInstance", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstanceUndefined: Self = StObject.set(x, "VerifiedAccessInstance", js.undefined)
  }
}
