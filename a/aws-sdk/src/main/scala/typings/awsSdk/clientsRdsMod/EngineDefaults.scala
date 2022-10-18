package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineDefaults extends StObject {
  
  /**
    * Specifies the name of the DB parameter group family that the engine default parameters apply to.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * An optional pagination token provided by a previous EngineDefaults request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
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
  
  extension [Self <: EngineDefaults](x: Self) {
    
    inline def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupFamilyUndefined: Self = StObject.set(x, "DBParameterGroupFamily", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
