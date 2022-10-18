package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionConfiguration extends StObject {
  
  /**
    * The name of the tensor collection. The name must be unique relative to other rule configuration names.
    */
  var CollectionName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CollectionName] = js.undefined
  
  /**
    * Parameter values for the tensor collection. The allowed parameters are "name", "include_regex", "reduction_config", "save_config", "tensor_names", and "save_histogram".
    */
  var CollectionParameters: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CollectionParameters] = js.undefined
}
object CollectionConfiguration {
  
  inline def apply(): CollectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionConfiguration]
  }
  
  extension [Self <: CollectionConfiguration](x: Self) {
    
    inline def setCollectionName(value: CollectionName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setCollectionNameUndefined: Self = StObject.set(x, "CollectionName", js.undefined)
    
    inline def setCollectionParameters(value: CollectionParameters): Self = StObject.set(x, "CollectionParameters", value.asInstanceOf[js.Any])
    
    inline def setCollectionParametersUndefined: Self = StObject.set(x, "CollectionParameters", js.undefined)
  }
}
