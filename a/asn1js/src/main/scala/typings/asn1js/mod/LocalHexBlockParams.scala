package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalHexBlockParams extends LocalBaseBlockParams {
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.native
  
  var valueHex: js.UndefOr[ArrayBuffer] = js.native
}
object LocalHexBlockParams {
  
  @scala.inline
  def apply(): LocalHexBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalHexBlockParams]
  }
  
  @scala.inline
  implicit class LocalHexBlockParamsMutableBuilder[Self <: LocalHexBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    @scala.inline
    def setValueHex(value: ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
  }
}
