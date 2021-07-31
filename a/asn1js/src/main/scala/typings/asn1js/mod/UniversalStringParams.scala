package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniversalStringParams extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object UniversalStringParams {
  
  @scala.inline
  def apply(): UniversalStringParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniversalStringParams]
  }
  
  @scala.inline
  implicit class UniversalStringParamsMutableBuilder[Self <: UniversalStringParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
