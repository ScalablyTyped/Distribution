package typings.apolloProtobufjs.mod.common

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.BytesValue message. */
trait IBytesValue extends StObject {
  
  var value: js.UndefOr[Uint8Array] = js.undefined
}
object IBytesValue {
  
  inline def apply(): IBytesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBytesValue]
  }
  
  extension [Self <: IBytesValue](x: Self) {
    
    inline def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
