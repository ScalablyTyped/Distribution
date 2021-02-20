package typings.apolloProtobufjs.mod.common

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Any message. */
@js.native
trait IAny extends StObject {
  
  var bytes: js.UndefOr[Uint8Array] = js.native
  
  var typeUrl: js.UndefOr[String] = js.native
}
object IAny {
  
  @scala.inline
  def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  
  @scala.inline
  implicit class IAnyMutableBuilder[Self <: IAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    @scala.inline
    def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
  }
}
