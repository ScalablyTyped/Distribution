package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectorEntitiesRequest extends StObject {
  
  /**
    * The version of the API that's used by the connector.
    */
  var apiVersion: js.UndefOr[ApiVersion_] = js.undefined
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the Amazon Web Services account, and is used to query the downstream connector. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.undefined
  
  /**
    *  This optional parameter is specific to connector implementation. Some connectors support multiple levels or categories of entities. You can find out the list of roots for such providers by sending a request without the entitiesPath parameter. If the connector supports entities at different roots, this initial request returns the list of roots. Otherwise, this request returns all entities supported by the provider. 
    */
  var entitiesPath: js.UndefOr[EntitiesPath] = js.undefined
  
  /**
    * The maximum number of items that the operation returns in the response.
    */
  var maxResults: js.UndefOr[ListEntitiesMaxResults] = js.undefined
  
  /**
    * A token that was provided by your prior ListConnectorEntities operation if the response was too big for the page size. You specify this token to get the next page of results in paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListConnectorEntitiesRequest {
  
  inline def apply(): ListConnectorEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectorEntitiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectorEntitiesRequest] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: ApiVersion_): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    inline def setEntitiesPath(value: EntitiesPath): Self = StObject.set(x, "entitiesPath", value.asInstanceOf[js.Any])
    
    inline def setEntitiesPathUndefined: Self = StObject.set(x, "entitiesPath", js.undefined)
    
    inline def setMaxResults(value: ListEntitiesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
