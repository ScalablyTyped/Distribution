package typings.asn1js.mod

import typings.asn1js.anon.IsIndefiniteForm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalLengthBlockParams extends StObject {
  
  var lenBlock: js.UndefOr[IsIndefiniteForm] = js.undefined
}
object LocalLengthBlockParams {
  
  @scala.inline
  def apply(): LocalLengthBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalLengthBlockParams]
  }
  
  @scala.inline
  implicit class LocalLengthBlockParamsMutableBuilder[Self <: LocalLengthBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLenBlock(value: IsIndefiniteForm): Self = StObject.set(x, "lenBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenBlockUndefined: Self = StObject.set(x, "lenBlock", js.undefined)
  }
}
