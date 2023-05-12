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
  
  /**
    * The PRAllowed value that describes whether passive roaming is allowed.
    */
  var PrAllowed: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.PrAllowed] = js.undefined
  
  /**
    * The RAAllowed value that describes whether roaming activation is allowed.
    */
  var RaAllowed: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.RaAllowed] = js.undefined
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
    
    inline def setPrAllowed(value: PrAllowed): Self = StObject.set(x, "PrAllowed", value.asInstanceOf[js.Any])
    
    inline def setPrAllowedUndefined: Self = StObject.set(x, "PrAllowed", js.undefined)
    
    inline def setRaAllowed(value: RaAllowed): Self = StObject.set(x, "RaAllowed", value.asInstanceOf[js.Any])
    
    inline def setRaAllowedUndefined: Self = StObject.set(x, "RaAllowed", js.undefined)
  }
}
