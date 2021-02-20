package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalBooleanValueBlockParams extends LocalBaseBlockParams {
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.native
  
  var value: js.UndefOr[scala.Boolean] = js.native
  
  var valueHex: js.UndefOr[ArrayBuffer] = js.native
}
object LocalBooleanValueBlockParams {
  
  @scala.inline
  def apply(): LocalBooleanValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBooleanValueBlockParams]
  }
  
  @scala.inline
  implicit class LocalBooleanValueBlockParamsMutableBuilder[Self <: LocalBooleanValueBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    @scala.inline
    def setValue(value: scala.Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueHex(value: ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
