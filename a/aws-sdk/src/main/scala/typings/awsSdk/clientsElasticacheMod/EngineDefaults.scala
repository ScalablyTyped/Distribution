package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineDefaults extends StObject {
  
  /**
    * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
    */
  var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined
  
  /**
    * Specifies the name of the cache parameter group family to which the engine default parameters apply. Valid values are: memcached1.4 | memcached1.5 | memcached1.6 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | redis6.0 | redis6.x | redis7 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a list of engine default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}
object EngineDefaults {
  
  inline def apply(): EngineDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EngineDefaults] (val x: Self) extends AnyVal {
    
    inline def setCacheNodeTypeSpecificParameters(value: CacheNodeTypeSpecificParametersList): Self = StObject.set(x, "CacheNodeTypeSpecificParameters", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeSpecificParametersUndefined: Self = StObject.set(x, "CacheNodeTypeSpecificParameters", js.undefined)
    
    inline def setCacheNodeTypeSpecificParametersVarargs(value: CacheNodeTypeSpecificParameter*): Self = StObject.set(x, "CacheNodeTypeSpecificParameters", js.Array(value*))
    
    inline def setCacheParameterGroupFamily(value: String): Self = StObject.set(x, "CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupFamilyUndefined: Self = StObject.set(x, "CacheParameterGroupFamily", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
