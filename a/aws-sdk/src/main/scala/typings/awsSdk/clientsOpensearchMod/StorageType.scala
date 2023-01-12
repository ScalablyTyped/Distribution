package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageType extends StObject {
  
  /**
    * The storage sub-type, such as gp3 or io1.
    */
  var StorageSubTypeName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.StorageSubTypeName] = js.undefined
  
  /**
    * Limits that are applicable for the given storage type.
    */
  var StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.undefined
  
  /**
    * The name of the storage type.
    */
  var StorageTypeName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.StorageTypeName] = js.undefined
}
object StorageType {
  
  inline def apply(): StorageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageType] (val x: Self) extends AnyVal {
    
    inline def setStorageSubTypeName(value: StorageSubTypeName): Self = StObject.set(x, "StorageSubTypeName", value.asInstanceOf[js.Any])
    
    inline def setStorageSubTypeNameUndefined: Self = StObject.set(x, "StorageSubTypeName", js.undefined)
    
    inline def setStorageTypeLimits(value: StorageTypeLimitList): Self = StObject.set(x, "StorageTypeLimits", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeLimitsUndefined: Self = StObject.set(x, "StorageTypeLimits", js.undefined)
    
    inline def setStorageTypeLimitsVarargs(value: StorageTypeLimit*): Self = StObject.set(x, "StorageTypeLimits", js.Array(value*))
    
    inline def setStorageTypeName(value: StorageTypeName): Self = StObject.set(x, "StorageTypeName", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeNameUndefined: Self = StObject.set(x, "StorageTypeName", js.undefined)
  }
}
