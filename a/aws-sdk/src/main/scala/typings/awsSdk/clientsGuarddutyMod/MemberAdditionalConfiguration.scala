package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberAdditionalConfiguration extends StObject {
  
  /**
    * Name of the additional configuration.
    */
  var Name: js.UndefOr[OrgFeatureAdditionalConfiguration] = js.undefined
  
  /**
    * Status of the additional configuration.
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
}
object MemberAdditionalConfiguration {
  
  inline def apply(): MemberAdditionalConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberAdditionalConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberAdditionalConfiguration] (val x: Self) extends AnyVal {
    
    inline def setName(value: OrgFeatureAdditionalConfiguration): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
