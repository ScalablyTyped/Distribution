package typings.asn1js.mod

import typings.asn1js.anon.PartialILocalIdentificati
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalIdentificationBlockParams extends StObject {
  
  var idBlock: js.UndefOr[PartialILocalIdentificati] = js.undefined
}
object LocalIdentificationBlockParams {
  
  inline def apply(): LocalIdentificationBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalIdentificationBlockParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalIdentificationBlockParams] (val x: Self) extends AnyVal {
    
    inline def setIdBlock(value: PartialILocalIdentificati): Self = StObject.set(x, "idBlock", value.asInstanceOf[js.Any])
    
    inline def setIdBlockUndefined: Self = StObject.set(x, "idBlock", js.undefined)
  }
}
