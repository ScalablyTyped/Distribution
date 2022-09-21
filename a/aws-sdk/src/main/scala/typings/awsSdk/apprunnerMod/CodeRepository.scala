package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeRepository extends StObject {
  
  /**
    * Configuration for building and running the service from a source code repository.   CodeConfiguration is required only for CreateService request. 
    */
  var CodeConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.CodeConfiguration] = js.undefined
  
  /**
    * The location of the repository that contains the source code.
    */
  var RepositoryUrl: String
  
  /**
    * The version that should be used within the source code repository.
    */
  var SourceCodeVersion: typings.awsSdk.apprunnerMod.SourceCodeVersion
}
object CodeRepository {
  
  inline def apply(RepositoryUrl: String, SourceCodeVersion: SourceCodeVersion): CodeRepository = {
    val __obj = js.Dynamic.literal(RepositoryUrl = RepositoryUrl.asInstanceOf[js.Any], SourceCodeVersion = SourceCodeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeRepository]
  }
  
  extension [Self <: CodeRepository](x: Self) {
    
    inline def setCodeConfiguration(value: CodeConfiguration): Self = StObject.set(x, "CodeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCodeConfigurationUndefined: Self = StObject.set(x, "CodeConfiguration", js.undefined)
    
    inline def setRepositoryUrl(value: String): Self = StObject.set(x, "RepositoryUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeVersion(value: SourceCodeVersion): Self = StObject.set(x, "SourceCodeVersion", value.asInstanceOf[js.Any])
  }
}
