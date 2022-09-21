package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshServiceDiscovery extends StObject {
  
  /**
    * The IP version to use to control traffic within the mesh.
    */
  var ipPreference: js.UndefOr[IpPreference] = js.undefined
}
object MeshServiceDiscovery {
  
  inline def apply(): MeshServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshServiceDiscovery]
  }
  
  extension [Self <: MeshServiceDiscovery](x: Self) {
    
    inline def setIpPreference(value: IpPreference): Self = StObject.set(x, "ipPreference", value.asInstanceOf[js.Any])
    
    inline def setIpPreferenceUndefined: Self = StObject.set(x, "ipPreference", js.undefined)
  }
}
