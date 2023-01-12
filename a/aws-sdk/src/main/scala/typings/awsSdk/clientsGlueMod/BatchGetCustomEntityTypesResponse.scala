package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCustomEntityTypesResponse extends StObject {
  
  /**
    * A list of CustomEntityType objects representing the custom patterns that have been created.
    */
  var CustomEntityTypes: js.UndefOr[typings.awsSdk.clientsGlueMod.CustomEntityTypes] = js.undefined
  
  /**
    * A list of the names of custom patterns that were not found.
    */
  var CustomEntityTypesNotFound: js.UndefOr[CustomEntityTypeNames] = js.undefined
}
object BatchGetCustomEntityTypesResponse {
  
  inline def apply(): BatchGetCustomEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCustomEntityTypesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetCustomEntityTypesResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomEntityTypes(value: CustomEntityTypes): Self = StObject.set(x, "CustomEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setCustomEntityTypesNotFound(value: CustomEntityTypeNames): Self = StObject.set(x, "CustomEntityTypesNotFound", value.asInstanceOf[js.Any])
    
    inline def setCustomEntityTypesNotFoundUndefined: Self = StObject.set(x, "CustomEntityTypesNotFound", js.undefined)
    
    inline def setCustomEntityTypesNotFoundVarargs(value: NameString*): Self = StObject.set(x, "CustomEntityTypesNotFound", js.Array(value*))
    
    inline def setCustomEntityTypesUndefined: Self = StObject.set(x, "CustomEntityTypes", js.undefined)
    
    inline def setCustomEntityTypesVarargs(value: CustomEntityType*): Self = StObject.set(x, "CustomEntityTypes", js.Array(value*))
  }
}
