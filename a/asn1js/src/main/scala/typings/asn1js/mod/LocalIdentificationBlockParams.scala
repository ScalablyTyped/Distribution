package typings.asn1js.mod

import typings.asn1js.anon.LocalHexBlockParamsisCons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalIdentificationBlockParams extends StObject {
  
  var idBlock: js.UndefOr[LocalHexBlockParamsisCons] = js.undefined
}
object LocalIdentificationBlockParams {
  
  @scala.inline
  def apply(): LocalIdentificationBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalIdentificationBlockParams]
  }
  
  @scala.inline
  implicit class LocalIdentificationBlockParamsMutableBuilder[Self <: LocalIdentificationBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdBlock(value: LocalHexBlockParamsisCons): Self = StObject.set(x, "idBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdBlockUndefined: Self = StObject.set(x, "idBlock", js.undefined)
  }
}
