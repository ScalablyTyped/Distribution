package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalObjectIdentifierValueBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined value */ trait ObjectIdentifierParams
  extends StObject
     with BaseBlockParams {
  
  var value: js.UndefOr[String] = js.undefined
}
object ObjectIdentifierParams {
  
  inline def apply(): ObjectIdentifierParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectIdentifierParams]
  }
  
  extension [Self <: ObjectIdentifierParams](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
