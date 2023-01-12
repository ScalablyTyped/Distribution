package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReusableDelegationSetResponse extends StObject {
  
  /**
    * A complex type that contains information about the reusable delegation set.
    */
  var DelegationSet: typings.awsSdk.clientsRoute53Mod.DelegationSet
}
object GetReusableDelegationSetResponse {
  
  inline def apply(DelegationSet: DelegationSet): GetReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReusableDelegationSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReusableDelegationSetResponse] (val x: Self) extends AnyVal {
    
    inline def setDelegationSet(value: DelegationSet): Self = StObject.set(x, "DelegationSet", value.asInstanceOf[js.Any])
  }
}
