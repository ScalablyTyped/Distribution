package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageSummary extends StObject {
  
  /**
    *  The name of the package. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.undefined
  
  /**
    *  The format of the package. 
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    * The namespace of the package. The package component that specifies its namespace depends on its type. For example:    The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    * A PackageOriginConfiguration object that contains a PackageOriginRestrictions object that contains information about the upstream and publish package origin restrictions.
    */
  var originConfiguration: js.UndefOr[PackageOriginConfiguration] = js.undefined
}
object PackageSummary {
  
  inline def apply(): PackageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageSummary]
  }
  
  extension [Self <: PackageSummary](x: Self) {
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOriginConfiguration(value: PackageOriginConfiguration): Self = StObject.set(x, "originConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOriginConfigurationUndefined: Self = StObject.set(x, "originConfiguration", js.undefined)
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
