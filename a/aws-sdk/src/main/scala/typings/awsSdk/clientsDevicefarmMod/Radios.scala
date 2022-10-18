package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radios extends StObject {
  
  /**
    * True if Bluetooth is enabled at the beginning of the test. Otherwise, false.
    */
  var bluetooth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if GPS is enabled at the beginning of the test. Otherwise, false.
    */
  var gps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if NFC is enabled at the beginning of the test. Otherwise, false.
    */
  var nfc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if Wi-Fi is enabled at the beginning of the test. Otherwise, false.
    */
  var wifi: js.UndefOr[Boolean] = js.undefined
}
object Radios {
  
  inline def apply(): Radios = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radios]
  }
  
  extension [Self <: Radios](x: Self) {
    
    inline def setBluetooth(value: Boolean): Self = StObject.set(x, "bluetooth", value.asInstanceOf[js.Any])
    
    inline def setBluetoothUndefined: Self = StObject.set(x, "bluetooth", js.undefined)
    
    inline def setGps(value: Boolean): Self = StObject.set(x, "gps", value.asInstanceOf[js.Any])
    
    inline def setGpsUndefined: Self = StObject.set(x, "gps", js.undefined)
    
    inline def setNfc(value: Boolean): Self = StObject.set(x, "nfc", value.asInstanceOf[js.Any])
    
    inline def setNfcUndefined: Self = StObject.set(x, "nfc", js.undefined)
    
    inline def setWifi(value: Boolean): Self = StObject.set(x, "wifi", value.asInstanceOf[js.Any])
    
    inline def setWifiUndefined: Self = StObject.set(x, "wifi", js.undefined)
  }
}
