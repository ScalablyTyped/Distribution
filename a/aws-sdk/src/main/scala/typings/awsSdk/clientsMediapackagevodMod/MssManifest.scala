package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MssManifest extends StObject {
  
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[string] = js.undefined
  
  var StreamSelection: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.StreamSelection] = js.undefined
}
object MssManifest {
  
  inline def apply(): MssManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MssManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MssManifest] (val x: Self) extends AnyVal {
    
    inline def setManifestName(value: string): Self = StObject.set(x, "ManifestName", value.asInstanceOf[js.Any])
    
    inline def setManifestNameUndefined: Self = StObject.set(x, "ManifestName", js.undefined)
    
    inline def setStreamSelection(value: StreamSelection): Self = StObject.set(x, "StreamSelection", value.asInstanceOf[js.Any])
    
    inline def setStreamSelectionUndefined: Self = StObject.set(x, "StreamSelection", js.undefined)
  }
}
