package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVerifiedAccessGroupResult extends StObject {
  
  /**
    * Details of Verified Access group.
    */
  var VerifiedAccessGroup: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessGroup] = js.undefined
}
object ModifyVerifiedAccessGroupResult {
  
  inline def apply(): ModifyVerifiedAccessGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVerifiedAccessGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVerifiedAccessGroupResult] (val x: Self) extends AnyVal {
    
    inline def setVerifiedAccessGroup(value: VerifiedAccessGroup): Self = StObject.set(x, "VerifiedAccessGroup", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupUndefined: Self = StObject.set(x, "VerifiedAccessGroup", js.undefined)
  }
}
