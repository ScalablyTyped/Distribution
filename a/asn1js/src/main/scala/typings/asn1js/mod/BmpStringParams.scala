package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BmpStringParams extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object BmpStringParams {
  
  @scala.inline
  def apply(): BmpStringParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BmpStringParams]
  }
  
  @scala.inline
  implicit class BmpStringParamsMutableBuilder[Self <: BmpStringParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
