package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheParameterGroupDetails extends StObject {
  
  /**
    * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
    */
  var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Parameter instances.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}
object CacheParameterGroupDetails {
  
  inline def apply(): CacheParameterGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheParameterGroupDetails] (val x: Self) extends AnyVal {
    
    inline def setCacheNodeTypeSpecificParameters(value: CacheNodeTypeSpecificParametersList): Self = StObject.set(x, "CacheNodeTypeSpecificParameters", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeSpecificParametersUndefined: Self = StObject.set(x, "CacheNodeTypeSpecificParameters", js.undefined)
    
    inline def setCacheNodeTypeSpecificParametersVarargs(value: CacheNodeTypeSpecificParameter*): Self = StObject.set(x, "CacheNodeTypeSpecificParameters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
