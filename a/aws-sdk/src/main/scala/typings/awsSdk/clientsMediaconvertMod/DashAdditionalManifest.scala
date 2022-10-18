package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashAdditionalManifest extends StObject {
  
  /**
    * Specify a name modifier that the service adds to the name of this manifest to make it different from the file names of the other main manifests in the output group. For example, say that the default main manifest for your DASH group is film-name.mpd. If you enter "-no-premium" for this setting, then the file name the service generates for this top-level manifest is film-name-no-premium.mpd.
    */
  var ManifestNameModifier: js.UndefOr[stringMin1] = js.undefined
  
  /**
    * Specify the outputs that you want this additional top-level manifest to reference.
    */
  var SelectedOutputs: js.UndefOr[listOfStringMin1] = js.undefined
}
object DashAdditionalManifest {
  
  inline def apply(): DashAdditionalManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashAdditionalManifest]
  }
  
  extension [Self <: DashAdditionalManifest](x: Self) {
    
    inline def setManifestNameModifier(value: stringMin1): Self = StObject.set(x, "ManifestNameModifier", value.asInstanceOf[js.Any])
    
    inline def setManifestNameModifierUndefined: Self = StObject.set(x, "ManifestNameModifier", js.undefined)
    
    inline def setSelectedOutputs(value: listOfStringMin1): Self = StObject.set(x, "SelectedOutputs", value.asInstanceOf[js.Any])
    
    inline def setSelectedOutputsUndefined: Self = StObject.set(x, "SelectedOutputs", js.undefined)
    
    inline def setSelectedOutputsVarargs(value: stringMin1*): Self = StObject.set(x, "SelectedOutputs", js.Array(value*))
  }
}
