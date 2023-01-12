package typings.awsSdk.clientsResourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceDetails extends StObject {
  
  /**
    * Whether a resource is compliant with the effective tag policy.
    */
  var ComplianceStatus: js.UndefOr[typings.awsSdk.clientsResourcegroupstaggingapiMod.ComplianceStatus] = js.undefined
  
  /**
    * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or noncompliant values. 
    */
  var KeysWithNoncompliantValues: js.UndefOr[TagKeyList] = js.undefined
  
  /**
    * These tag keys on the resource are noncompliant with the effective tag policy.
    */
  var NoncompliantKeys: js.UndefOr[TagKeyList] = js.undefined
}
object ComplianceDetails {
  
  inline def apply(): ComplianceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplianceDetails] (val x: Self) extends AnyVal {
    
    inline def setComplianceStatus(value: ComplianceStatus): Self = StObject.set(x, "ComplianceStatus", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatusUndefined: Self = StObject.set(x, "ComplianceStatus", js.undefined)
    
    inline def setKeysWithNoncompliantValues(value: TagKeyList): Self = StObject.set(x, "KeysWithNoncompliantValues", value.asInstanceOf[js.Any])
    
    inline def setKeysWithNoncompliantValuesUndefined: Self = StObject.set(x, "KeysWithNoncompliantValues", js.undefined)
    
    inline def setKeysWithNoncompliantValuesVarargs(value: TagKey*): Self = StObject.set(x, "KeysWithNoncompliantValues", js.Array(value*))
    
    inline def setNoncompliantKeys(value: TagKeyList): Self = StObject.set(x, "NoncompliantKeys", value.asInstanceOf[js.Any])
    
    inline def setNoncompliantKeysUndefined: Self = StObject.set(x, "NoncompliantKeys", js.undefined)
    
    inline def setNoncompliantKeysVarargs(value: TagKey*): Self = StObject.set(x, "NoncompliantKeys", js.Array(value*))
  }
}
