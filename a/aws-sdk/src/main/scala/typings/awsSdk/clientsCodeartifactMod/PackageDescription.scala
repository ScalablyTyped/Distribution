package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageDescription extends StObject {
  
  /**
    * A format that specifies the type of the package.
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    * The name of the package.
    */
  var name: js.UndefOr[PackageName] = js.undefined
  
  /**
    * The namespace of the package. The package component that specifies its namespace depends on its type. For example:    The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a namespace.     The namespace of a generic package is its namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    * The package origin configuration for the package.
    */
  var originConfiguration: js.UndefOr[PackageOriginConfiguration] = js.undefined
}
object PackageDescription {
  
  inline def apply(): PackageDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageDescription] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: PackageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOriginConfiguration(value: PackageOriginConfiguration): Self = StObject.set(x, "originConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOriginConfigurationUndefined: Self = StObject.set(x, "originConfiguration", js.undefined)
  }
}
