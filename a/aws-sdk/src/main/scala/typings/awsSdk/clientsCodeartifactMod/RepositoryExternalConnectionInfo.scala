package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryExternalConnectionInfo extends StObject {
  
  /**
    *  The name of the external connection associated with a repository. 
    */
  var externalConnectionName: js.UndefOr[ExternalConnectionName] = js.undefined
  
  /**
    *  The package format associated with a repository's external connection. The valid package formats are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.     nuget: A NuGet package.   
    */
  var packageFormat: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    *  The status of the external connection of a repository. There is one valid value, Available. 
    */
  var status: js.UndefOr[ExternalConnectionStatus] = js.undefined
}
object RepositoryExternalConnectionInfo {
  
  inline def apply(): RepositoryExternalConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryExternalConnectionInfo]
  }
  
  extension [Self <: RepositoryExternalConnectionInfo](x: Self) {
    
    inline def setExternalConnectionName(value: ExternalConnectionName): Self = StObject.set(x, "externalConnectionName", value.asInstanceOf[js.Any])
    
    inline def setExternalConnectionNameUndefined: Self = StObject.set(x, "externalConnectionName", js.undefined)
    
    inline def setPackageFormat(value: PackageFormat): Self = StObject.set(x, "packageFormat", value.asInstanceOf[js.Any])
    
    inline def setPackageFormatUndefined: Self = StObject.set(x, "packageFormat", js.undefined)
    
    inline def setStatus(value: ExternalConnectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
