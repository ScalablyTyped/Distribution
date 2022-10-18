package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateClientDeviceFromCoreDeviceErrorEntry extends StObject {
  
  /**
    * The error code for the request.
    */
  var code: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A message that provides additional information about the error.
    */
  var message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the IoT thing whose disassociate request failed.
    */
  var thingName: js.UndefOr[IoTThingName] = js.undefined
}
object DisassociateClientDeviceFromCoreDeviceErrorEntry {
  
  inline def apply(): DisassociateClientDeviceFromCoreDeviceErrorEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateClientDeviceFromCoreDeviceErrorEntry]
  }
  
  extension [Self <: DisassociateClientDeviceFromCoreDeviceErrorEntry](x: Self) {
    
    inline def setCode(value: NonEmptyString): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setThingName(value: IoTThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
