package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultClusterParameters extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster parameter group family to which the engine default parameters apply.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The list of cluster default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}
object DefaultClusterParameters {
  
  inline def apply(): DefaultClusterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultClusterParameters]
  }
  
  extension [Self <: DefaultClusterParameters](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setParameterGroupFamily(value: String): Self = StObject.set(x, "ParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupFamilyUndefined: Self = StObject.set(x, "ParameterGroupFamily", js.undefined)
    
    inline def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
