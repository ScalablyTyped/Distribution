package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalRelativeObjectIdentifierValueBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined value */ trait RelativeObjectIdentifierParams
  extends StObject
     with BaseBlockParams {
  
  var value: js.UndefOr[String] = js.undefined
}
object RelativeObjectIdentifierParams {
  
  inline def apply(): RelativeObjectIdentifierParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeObjectIdentifierParams]
  }
  
  extension [Self <: RelativeObjectIdentifierParams](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
