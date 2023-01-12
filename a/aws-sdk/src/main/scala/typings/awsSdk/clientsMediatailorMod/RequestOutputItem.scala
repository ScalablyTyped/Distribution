package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOutputItem extends StObject {
  
  /**
    * DASH manifest configuration parameters.
    */
  var DashPlaylistSettings: js.UndefOr[typings.awsSdk.clientsMediatailorMod.DashPlaylistSettings] = js.undefined
  
  /**
    * HLS playlist configuration parameters.
    */
  var HlsPlaylistSettings: js.UndefOr[typings.awsSdk.clientsMediatailorMod.HlsPlaylistSettings] = js.undefined
  
  /**
    * The name of the manifest for the channel. The name appears in the PlaybackUrl.
    */
  var ManifestName: _String
  
  /**
    * A string used to match which HttpPackageConfiguration is used for each VodSource.
    */
  var SourceGroup: _String
}
object RequestOutputItem {
  
  inline def apply(ManifestName: _String, SourceGroup: _String): RequestOutputItem = {
    val __obj = js.Dynamic.literal(ManifestName = ManifestName.asInstanceOf[js.Any], SourceGroup = SourceGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOutputItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestOutputItem] (val x: Self) extends AnyVal {
    
    inline def setDashPlaylistSettings(value: DashPlaylistSettings): Self = StObject.set(x, "DashPlaylistSettings", value.asInstanceOf[js.Any])
    
    inline def setDashPlaylistSettingsUndefined: Self = StObject.set(x, "DashPlaylistSettings", js.undefined)
    
    inline def setHlsPlaylistSettings(value: HlsPlaylistSettings): Self = StObject.set(x, "HlsPlaylistSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsPlaylistSettingsUndefined: Self = StObject.set(x, "HlsPlaylistSettings", js.undefined)
    
    inline def setManifestName(value: _String): Self = StObject.set(x, "ManifestName", value.asInstanceOf[js.Any])
    
    inline def setSourceGroup(value: _String): Self = StObject.set(x, "SourceGroup", value.asInstanceOf[js.Any])
  }
}
