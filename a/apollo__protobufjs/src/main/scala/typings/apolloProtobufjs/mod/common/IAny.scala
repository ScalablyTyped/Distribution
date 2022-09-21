package typings.apolloProtobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Any message. */
trait IAny extends StObject {
  
  var bytes: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var typeUrl: js.UndefOr[String] = js.undefined
}
object IAny {
  
  inline def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  
  extension [Self <: IAny](x: Self) {
    
    inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
  }
}
