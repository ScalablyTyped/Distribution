package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepeatedParams extends StObject {
  
  var local: js.UndefOr[scala.Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var optional: js.UndefOr[scala.Boolean] = js.native
  
  var value: js.UndefOr[Any] = js.native
}
object RepeatedParams {
  
  @scala.inline
  def apply(): RepeatedParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatedParams]
  }
  
  @scala.inline
  implicit class RepeatedParamsMutableBuilder[Self <: RepeatedParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: scala.Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
