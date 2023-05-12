package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddonVersionInfo extends StObject {
  
  /**
    * The version of the add-on.
    */
  var addonVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The architectures that the version supports.
    */
  var architecture: js.UndefOr[StringList] = js.undefined
  
  /**
    * An object representing the compatibilities of a version.
    */
  var compatibilities: js.UndefOr[Compatibilities] = js.undefined
  
  /**
    * Whether the add-on requires configuration.
    */
  var requiresConfiguration: js.UndefOr[Boolean] = js.undefined
}
object AddonVersionInfo {
  
  inline def apply(): AddonVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonVersionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddonVersionInfo] (val x: Self) extends AnyVal {
    
    inline def setAddonVersion(value: String): Self = StObject.set(x, "addonVersion", value.asInstanceOf[js.Any])
    
    inline def setAddonVersionUndefined: Self = StObject.set(x, "addonVersion", js.undefined)
    
    inline def setArchitecture(value: StringList): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setArchitectureVarargs(value: String*): Self = StObject.set(x, "architecture", js.Array(value*))
    
    inline def setCompatibilities(value: Compatibilities): Self = StObject.set(x, "compatibilities", value.asInstanceOf[js.Any])
    
    inline def setCompatibilitiesUndefined: Self = StObject.set(x, "compatibilities", js.undefined)
    
    inline def setCompatibilitiesVarargs(value: Compatibility*): Self = StObject.set(x, "compatibilities", js.Array(value*))
    
    inline def setRequiresConfiguration(value: Boolean): Self = StObject.set(x, "requiresConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRequiresConfigurationUndefined: Self = StObject.set(x, "requiresConfiguration", js.undefined)
  }
}
