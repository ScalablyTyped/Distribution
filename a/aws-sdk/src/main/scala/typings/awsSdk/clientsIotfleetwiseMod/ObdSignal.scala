package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObdSignal extends StObject {
  
  /**
    * The number of bits to mask in a message.
    */
  var bitMaskLength: js.UndefOr[ObdBitmaskLength] = js.undefined
  
  /**
    * The number of positions to shift bits in the message.
    */
  var bitRightShift: js.UndefOr[nonNegativeInteger] = js.undefined
  
  /**
    * The length of a message.
    */
  var byteLength: ObdByteLength
  
  /**
    * Indicates where data appears in the message.
    */
  var offset: double
  
  /**
    * The diagnostic code used to request data from a vehicle for this signal.
    */
  var pid: nonNegativeInteger
  
  /**
    * The length of the requested data.
    */
  var pidResponseLength: positiveInteger
  
  /**
    * A multiplier used to decode the message.
    */
  var scaling: double
  
  /**
    * The mode of operation (diagnostic service) in a message.
    */
  var serviceMode: nonNegativeInteger
  
  /**
    * Indicates the beginning of the message.
    */
  var startByte: nonNegativeInteger
}
object ObdSignal {
  
  inline def apply(
    byteLength: ObdByteLength,
    offset: double,
    pid: nonNegativeInteger,
    pidResponseLength: positiveInteger,
    scaling: double,
    serviceMode: nonNegativeInteger,
    startByte: nonNegativeInteger
  ): ObdSignal = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pidResponseLength = pidResponseLength.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], serviceMode = serviceMode.asInstanceOf[js.Any], startByte = startByte.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObdSignal]
  }
  
  extension [Self <: ObdSignal](x: Self) {
    
    inline def setBitMaskLength(value: ObdBitmaskLength): Self = StObject.set(x, "bitMaskLength", value.asInstanceOf[js.Any])
    
    inline def setBitMaskLengthUndefined: Self = StObject.set(x, "bitMaskLength", js.undefined)
    
    inline def setBitRightShift(value: nonNegativeInteger): Self = StObject.set(x, "bitRightShift", value.asInstanceOf[js.Any])
    
    inline def setBitRightShiftUndefined: Self = StObject.set(x, "bitRightShift", js.undefined)
    
    inline def setByteLength(value: ObdByteLength): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPid(value: nonNegativeInteger): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPidResponseLength(value: positiveInteger): Self = StObject.set(x, "pidResponseLength", value.asInstanceOf[js.Any])
    
    inline def setScaling(value: double): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setServiceMode(value: nonNegativeInteger): Self = StObject.set(x, "serviceMode", value.asInstanceOf[js.Any])
    
    inline def setStartByte(value: nonNegativeInteger): Self = StObject.set(x, "startByte", value.asInstanceOf[js.Any])
  }
}
