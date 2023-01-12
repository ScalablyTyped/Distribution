package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveGroupSettings extends StObject {
  
  /**
    * Parameters that control interactions with the CDN.
    */
  var ArchiveCdnSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.ArchiveCdnSettings] = js.undefined
  
  /**
    * A directory and base filename where archive files should be written.
    */
  var Destination: OutputLocationRef
  
  /**
    * Number of seconds to write to archive file before closing and starting a new one.
    */
  var RolloverInterval: js.UndefOr[integerMin1] = js.undefined
}
object ArchiveGroupSettings {
  
  inline def apply(Destination: OutputLocationRef): ArchiveGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveGroupSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArchiveGroupSettings] (val x: Self) extends AnyVal {
    
    inline def setArchiveCdnSettings(value: ArchiveCdnSettings): Self = StObject.set(x, "ArchiveCdnSettings", value.asInstanceOf[js.Any])
    
    inline def setArchiveCdnSettingsUndefined: Self = StObject.set(x, "ArchiveCdnSettings", js.undefined)
    
    inline def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setRolloverInterval(value: integerMin1): Self = StObject.set(x, "RolloverInterval", value.asInstanceOf[js.Any])
    
    inline def setRolloverIntervalUndefined: Self = StObject.set(x, "RolloverInterval", js.undefined)
  }
}
