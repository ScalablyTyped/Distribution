package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDefinition extends StObject {
  
  /**
    * The date that the query definition was most recently modified.
    */
  var lastModified: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * If this query definition contains a list of log groups that it is limited to, that list appears here.
    */
  var logGroupNames: js.UndefOr[LogGroupNames] = js.undefined
  
  /**
    * The name of the query definition.
    */
  var name: js.UndefOr[QueryDefinitionName] = js.undefined
  
  /**
    * The unique ID of the query definition.
    */
  var queryDefinitionId: js.UndefOr[QueryId] = js.undefined
  
  /**
    * The query string to use for this definition. For more information, see CloudWatch Logs Insights Query Syntax.
    */
  var queryString: js.UndefOr[QueryDefinitionString] = js.undefined
}
object QueryDefinition {
  
  inline def apply(): QueryDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDefinition]
  }
  
  extension [Self <: QueryDefinition](x: Self) {
    
    inline def setLastModified(value: Timestamp): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setLogGroupNames(value: LogGroupNames): Self = StObject.set(x, "logGroupNames", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNamesUndefined: Self = StObject.set(x, "logGroupNames", js.undefined)
    
    inline def setLogGroupNamesVarargs(value: LogGroupName*): Self = StObject.set(x, "logGroupNames", js.Array(value*))
    
    inline def setName(value: QueryDefinitionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQueryDefinitionId(value: QueryId): Self = StObject.set(x, "queryDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setQueryDefinitionIdUndefined: Self = StObject.set(x, "queryDefinitionId", js.undefined)
    
    inline def setQueryString(value: QueryDefinitionString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
  }
}
