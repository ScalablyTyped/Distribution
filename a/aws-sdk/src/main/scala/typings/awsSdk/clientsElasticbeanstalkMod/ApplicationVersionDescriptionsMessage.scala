package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationVersionDescriptionsMessage extends StObject {
  
  /**
    * List of ApplicationVersionDescription objects sorted in order of creation.
    */
  var ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.undefined
  
  /**
    * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ApplicationVersionDescriptionsMessage {
  
  inline def apply(): ApplicationVersionDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescriptionsMessage]
  }
  
  extension [Self <: ApplicationVersionDescriptionsMessage](x: Self) {
    
    inline def setApplicationVersions(value: ApplicationVersionDescriptionList): Self = StObject.set(x, "ApplicationVersions", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionsUndefined: Self = StObject.set(x, "ApplicationVersions", js.undefined)
    
    inline def setApplicationVersionsVarargs(value: ApplicationVersionDescription*): Self = StObject.set(x, "ApplicationVersions", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
