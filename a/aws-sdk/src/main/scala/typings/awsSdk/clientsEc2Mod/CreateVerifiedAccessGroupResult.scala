package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVerifiedAccessGroupResult extends StObject {
  
  /**
    * The ID of the Verified Access group.
    */
  var VerifiedAccessGroup: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessGroup] = js.undefined
}
object CreateVerifiedAccessGroupResult {
  
  inline def apply(): CreateVerifiedAccessGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVerifiedAccessGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVerifiedAccessGroupResult] (val x: Self) extends AnyVal {
    
    inline def setVerifiedAccessGroup(value: VerifiedAccessGroup): Self = StObject.set(x, "VerifiedAccessGroup", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupUndefined: Self = StObject.set(x, "VerifiedAccessGroup", js.undefined)
  }
}
