package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAdvisorSchemasResponse extends StObject {
  
  /**
    * A collection of SchemaResponse objects.
    */
  var FleetAdvisorSchemas: js.UndefOr[FleetAdvisorSchemaList] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetAdvisorSchemasResponse {
  
  inline def apply(): DescribeFleetAdvisorSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAdvisorSchemasResponse]
  }
  
  extension [Self <: DescribeFleetAdvisorSchemasResponse](x: Self) {
    
    inline def setFleetAdvisorSchemas(value: FleetAdvisorSchemaList): Self = StObject.set(x, "FleetAdvisorSchemas", value.asInstanceOf[js.Any])
    
    inline def setFleetAdvisorSchemasUndefined: Self = StObject.set(x, "FleetAdvisorSchemas", js.undefined)
    
    inline def setFleetAdvisorSchemasVarargs(value: SchemaResponse*): Self = StObject.set(x, "FleetAdvisorSchemas", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
