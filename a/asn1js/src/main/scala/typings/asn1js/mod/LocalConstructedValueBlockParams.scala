package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalConstructedValueBlockParams extends LocalBaseBlockParams {
  
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.native
  
  var value: js.UndefOr[LocalValueBlock] = js.native
}
object LocalConstructedValueBlockParams {
  
  @scala.inline
  def apply(): LocalConstructedValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalConstructedValueBlockParams]
  }
  
  @scala.inline
  implicit class LocalConstructedValueBlockParamsMutableBuilder[Self <: LocalConstructedValueBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsIndefiniteForm(value: scala.Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIndefiniteFormUndefined: Self = StObject.set(x, "isIndefiniteForm", js.undefined)
    
    @scala.inline
    def setValue(value: LocalValueBlock): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
