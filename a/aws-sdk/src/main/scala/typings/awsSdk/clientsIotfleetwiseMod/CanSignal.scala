package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanSignal extends StObject {
  
  /**
    * A multiplier used to decode the CAN message.
    */
  var factor: double
  
  /**
    * Whether the byte ordering of a CAN message is big-endian.
    */
  var isBigEndian: Boolean
  
  /**
    * Whether the message data is specified as a signed value.
    */
  var isSigned: Boolean
  
  /**
    * How many bytes of data are in the message.
    */
  var length: nonNegativeInteger
  
  /**
    * The ID of the message.
    */
  var messageId: nonNegativeInteger
  
  /**
    * The name of the signal.
    */
  var name: js.UndefOr[CanSignalName] = js.undefined
  
  /**
    * Indicates where data appears in the CAN message.
    */
  var offset: double
  
  /**
    * Indicates the beginning of the CAN message.
    */
  var startBit: nonNegativeInteger
}
object CanSignal {
  
  inline def apply(
    factor: double,
    isBigEndian: Boolean,
    isSigned: Boolean,
    length: nonNegativeInteger,
    messageId: nonNegativeInteger,
    offset: double,
    startBit: nonNegativeInteger
  ): CanSignal = {
    val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any], isBigEndian = isBigEndian.asInstanceOf[js.Any], isSigned = isSigned.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], startBit = startBit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanSignal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanSignal] (val x: Self) extends AnyVal {
    
    inline def setFactor(value: double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setIsBigEndian(value: Boolean): Self = StObject.set(x, "isBigEndian", value.asInstanceOf[js.Any])
    
    inline def setIsSigned(value: Boolean): Self = StObject.set(x, "isSigned", value.asInstanceOf[js.Any])
    
    inline def setLength(value: nonNegativeInteger): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: nonNegativeInteger): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setName(value: CanSignalName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffset(value: double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setStartBit(value: nonNegativeInteger): Self = StObject.set(x, "startBit", value.asInstanceOf[js.Any])
  }
}
