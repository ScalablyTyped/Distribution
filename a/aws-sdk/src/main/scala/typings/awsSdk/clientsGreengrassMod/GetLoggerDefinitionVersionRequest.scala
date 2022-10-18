package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggerDefinitionVersionRequest extends StObject {
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string
  
  /**
    * The ID of the logger definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListLoggerDefinitionVersions'' requests. If the version is the last one that was associated with a logger definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var LoggerDefinitionVersionId: string
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object GetLoggerDefinitionVersionRequest {
  
  inline def apply(LoggerDefinitionId: string, LoggerDefinitionVersionId: string): GetLoggerDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any], LoggerDefinitionVersionId = LoggerDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggerDefinitionVersionRequest]
  }
  
  extension [Self <: GetLoggerDefinitionVersionRequest](x: Self) {
    
    inline def setLoggerDefinitionId(value: string): Self = StObject.set(x, "LoggerDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setLoggerDefinitionVersionId(value: string): Self = StObject.set(x, "LoggerDefinitionVersionId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
