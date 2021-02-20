package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChoiceParams extends StObject {
  
  var optional: js.UndefOr[scala.Boolean] = js.native
  
  var value: js.UndefOr[js.Array[LocalValueBlock]] = js.native
}
object ChoiceParams {
  
  @scala.inline
  def apply(): ChoiceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceParams]
  }
  
  @scala.inline
  implicit class ChoiceParamsMutableBuilder[Self <: ChoiceParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[LocalValueBlock]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: LocalValueBlock*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
