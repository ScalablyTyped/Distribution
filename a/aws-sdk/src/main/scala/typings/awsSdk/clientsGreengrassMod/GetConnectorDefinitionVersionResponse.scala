package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectorDefinitionVersionResponse extends StObject {
  
  /**
    * The ARN of the connector definition version.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the connector definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.undefined
  
  /**
    * Information about the connector definition version.
    */
  var Definition: js.UndefOr[ConnectorDefinitionVersion] = js.undefined
  
  /**
    * The ID of the connector definition version.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The version of the connector definition version.
    */
  var Version: js.UndefOr[string] = js.undefined
}
object GetConnectorDefinitionVersionResponse {
  
  inline def apply(): GetConnectorDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectorDefinitionVersionResponse]
  }
  
  extension [Self <: GetConnectorDefinitionVersionResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTimestamp(value: string): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDefinition(value: ConnectorDefinitionVersion): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
