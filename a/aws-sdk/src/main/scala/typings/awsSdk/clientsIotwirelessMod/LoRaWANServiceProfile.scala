package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANServiceProfile extends StObject {
  
  /**
    * The AddGWMetaData value.
    */
  var AddGwMetadata: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.AddGwMetadata] = js.undefined
  
  /**
    * The DrMax value.
    */
  var DrMax: js.UndefOr[DrMaxBox] = js.undefined
  
  /**
    * The DrMin value.
    */
  var DrMin: js.UndefOr[DrMinBox] = js.undefined
}
object LoRaWANServiceProfile {
  
  inline def apply(): LoRaWANServiceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANServiceProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoRaWANServiceProfile] (val x: Self) extends AnyVal {
    
    inline def setAddGwMetadata(value: AddGwMetadata): Self = StObject.set(x, "AddGwMetadata", value.asInstanceOf[js.Any])
    
    inline def setAddGwMetadataUndefined: Self = StObject.set(x, "AddGwMetadata", js.undefined)
    
    inline def setDrMax(value: DrMaxBox): Self = StObject.set(x, "DrMax", value.asInstanceOf[js.Any])
    
    inline def setDrMaxUndefined: Self = StObject.set(x, "DrMax", js.undefined)
    
    inline def setDrMin(value: DrMinBox): Self = StObject.set(x, "DrMin", value.asInstanceOf[js.Any])
    
    inline def setDrMinUndefined: Self = StObject.set(x, "DrMin", js.undefined)
  }
}
