package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpParameters extends StObject {
  
  /**
    * The headers that need to be sent as part of request invoking the API Gateway REST API or EventBridge ApiDestination.
    */
  var HeaderParameters: js.UndefOr[HeaderParametersMap] = js.undefined
  
  /**
    * The path parameter values to be used to populate API Gateway REST API or EventBridge ApiDestination path wildcards ("*").
    */
  var PathParameterValues: js.UndefOr[PathParameterList] = js.undefined
  
  /**
    * The query string keys/values that need to be sent as part of request invoking the API Gateway REST API or EventBridge ApiDestination.
    */
  var QueryStringParameters: js.UndefOr[QueryStringParametersMap] = js.undefined
}
object HttpParameters {
  
  inline def apply(): HttpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpParameters] (val x: Self) extends AnyVal {
    
    inline def setHeaderParameters(value: HeaderParametersMap): Self = StObject.set(x, "HeaderParameters", value.asInstanceOf[js.Any])
    
    inline def setHeaderParametersUndefined: Self = StObject.set(x, "HeaderParameters", js.undefined)
    
    inline def setPathParameterValues(value: PathParameterList): Self = StObject.set(x, "PathParameterValues", value.asInstanceOf[js.Any])
    
    inline def setPathParameterValuesUndefined: Self = StObject.set(x, "PathParameterValues", js.undefined)
    
    inline def setPathParameterValuesVarargs(value: PathParameter*): Self = StObject.set(x, "PathParameterValues", js.Array(value*))
    
    inline def setQueryStringParameters(value: QueryStringParametersMap): Self = StObject.set(x, "QueryStringParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryStringParametersUndefined: Self = StObject.set(x, "QueryStringParameters", js.undefined)
  }
}
