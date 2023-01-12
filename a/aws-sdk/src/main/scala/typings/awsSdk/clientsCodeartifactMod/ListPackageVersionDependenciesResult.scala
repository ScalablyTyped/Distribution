package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackageVersionDependenciesResult extends StObject {
  
  /**
    *  The name of the package that contains the returned package versions dependencies. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.undefined
  
  /**
    *  The returned list of PackageDependency objects. 
    */
  var dependencies: js.UndefOr[PackageDependencyList] = js.undefined
  
  /**
    *  A format that specifies the type of the package that contains the returned dependencies. 
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    * The namespace of the package version that contains the returned dependencies. The package version component that specifies its namespace depends on its type. For example:    The namespace of a Maven package version is its groupId.     The namespace of an npm package version is its scope.     Python and NuGet package versions do not contain a corresponding component, package versions of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The version of the package that is specified in the request. 
    */
  var version: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    *  The current revision associated with the package version. 
    */
  var versionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
}
object ListPackageVersionDependenciesResult {
  
  inline def apply(): ListPackageVersionDependenciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackageVersionDependenciesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPackageVersionDependenciesResult] (val x: Self) extends AnyVal {
    
    inline def setDependencies(value: PackageDependencyList): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: PackageDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionRevision(value: PackageVersionRevision): Self = StObject.set(x, "versionRevision", value.asInstanceOf[js.Any])
    
    inline def setVersionRevisionUndefined: Self = StObject.set(x, "versionRevision", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
