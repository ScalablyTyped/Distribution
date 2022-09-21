package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalBaseBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined 
- typings.asn1js.mod.LocalPrimitiveValueBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined  */ trait PrimitiveParams
  extends StObject
     with BaseBlockParams
     with HexBlockParams
object PrimitiveParams {
  
  inline def apply(): PrimitiveParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimitiveParams]
  }
}
