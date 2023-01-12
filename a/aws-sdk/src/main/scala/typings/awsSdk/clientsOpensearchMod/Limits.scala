package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limits extends StObject {
  
  /**
    * List of additional limits that are specific to a given instance type for each of its instance roles.
    */
  var AdditionalLimits: js.UndefOr[AdditionalLimitList] = js.undefined
  
  /**
    * The limits for a given instance type.
    */
  var InstanceLimits: js.UndefOr[typings.awsSdk.clientsOpensearchMod.InstanceLimits] = js.undefined
  
  /**
    * Storage-related attributes that are available for a given instance type.
    */
  var StorageTypes: js.UndefOr[StorageTypeList] = js.undefined
}
object Limits {
  
  inline def apply(): Limits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Limits] (val x: Self) extends AnyVal {
    
    inline def setAdditionalLimits(value: AdditionalLimitList): Self = StObject.set(x, "AdditionalLimits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalLimitsUndefined: Self = StObject.set(x, "AdditionalLimits", js.undefined)
    
    inline def setAdditionalLimitsVarargs(value: AdditionalLimit*): Self = StObject.set(x, "AdditionalLimits", js.Array(value*))
    
    inline def setInstanceLimits(value: InstanceLimits): Self = StObject.set(x, "InstanceLimits", value.asInstanceOf[js.Any])
    
    inline def setInstanceLimitsUndefined: Self = StObject.set(x, "InstanceLimits", js.undefined)
    
    inline def setStorageTypes(value: StorageTypeList): Self = StObject.set(x, "StorageTypes", value.asInstanceOf[js.Any])
    
    inline def setStorageTypesUndefined: Self = StObject.set(x, "StorageTypes", js.undefined)
    
    inline def setStorageTypesVarargs(value: StorageType*): Self = StObject.set(x, "StorageTypes", js.Array(value*))
  }
}
