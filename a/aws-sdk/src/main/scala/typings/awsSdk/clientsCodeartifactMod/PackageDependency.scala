package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageDependency extends StObject {
  
  /**
    *  The name of the package that this package depends on. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.undefined
  
  /**
    *  The type of a package dependency. The possible values depend on the package type. Example types are compile, runtime, and test for Maven packages, and dev, prod, and optional for npm packages. 
    */
  var dependencyType: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace of the package that this package depends on. The package component that specifies its namespace depends on its type. For example:    The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The required version, or version range, of the package that this package depends on. The version format is specific to the package type. For example, the following are possible valid required versions: 1.2.3, ^2.3.4, or 4.x. 
    */
  var versionRequirement: js.UndefOr[String] = js.undefined
}
object PackageDependency {
  
  inline def apply(): PackageDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageDependency]
  }
  
  extension [Self <: PackageDependency](x: Self) {
    
    inline def setDependencyType(value: String): Self = StObject.set(x, "dependencyType", value.asInstanceOf[js.Any])
    
    inline def setDependencyTypeUndefined: Self = StObject.set(x, "dependencyType", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setVersionRequirement(value: String): Self = StObject.set(x, "versionRequirement", value.asInstanceOf[js.Any])
    
    inline def setVersionRequirementUndefined: Self = StObject.set(x, "versionRequirement", js.undefined)
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
