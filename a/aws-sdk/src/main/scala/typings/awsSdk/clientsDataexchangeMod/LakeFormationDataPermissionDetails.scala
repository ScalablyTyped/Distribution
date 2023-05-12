package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LakeFormationDataPermissionDetails extends StObject {
  
  /**
    * Details about the LF-tag policy.
    */
  var LFTagPolicy: js.UndefOr[LFTagPolicyDetails] = js.undefined
}
object LakeFormationDataPermissionDetails {
  
  inline def apply(): LakeFormationDataPermissionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LakeFormationDataPermissionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LakeFormationDataPermissionDetails] (val x: Self) extends AnyVal {
    
    inline def setLFTagPolicy(value: LFTagPolicyDetails): Self = StObject.set(x, "LFTagPolicy", value.asInstanceOf[js.Any])
    
    inline def setLFTagPolicyUndefined: Self = StObject.set(x, "LFTagPolicy", js.undefined)
  }
}
