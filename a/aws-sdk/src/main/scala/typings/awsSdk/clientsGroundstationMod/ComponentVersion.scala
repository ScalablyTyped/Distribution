package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentVersion extends StObject {
  
  /**
    * Component type.
    */
  var componentType: ComponentTypeString
  
  /**
    * List of versions.
    */
  var versions: VersionStringList
}
object ComponentVersion {
  
  inline def apply(componentType: ComponentTypeString, versions: VersionStringList): ComponentVersion = {
    val __obj = js.Dynamic.literal(componentType = componentType.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentVersion] (val x: Self) extends AnyVal {
    
    inline def setComponentType(value: ComponentTypeString): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: VersionStringList): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsVarargs(value: VersionString*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
