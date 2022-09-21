package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalRelativeObjectIdentifierValueBlockJson
  extends StObject
     with LocalBaseBlockJson
     with ILocalRelativeObjectIdentifierValueBlock {
  
  var sidArray: js.Array[LocalRelativeSidValueBlockJson]
}
object LocalRelativeObjectIdentifierValueBlockJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    sidArray: js.Array[LocalRelativeSidValueBlockJson],
    value: String,
    valueBeforeDecode: String,
    warnings: js.Array[String]
  ): LocalRelativeObjectIdentifierValueBlockJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], sidArray = sidArray.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalRelativeObjectIdentifierValueBlockJson]
  }
  
  extension [Self <: LocalRelativeObjectIdentifierValueBlockJson](x: Self) {
    
    inline def setSidArray(value: js.Array[LocalRelativeSidValueBlockJson]): Self = StObject.set(x, "sidArray", value.asInstanceOf[js.Any])
    
    inline def setSidArrayVarargs(value: LocalRelativeSidValueBlockJson*): Self = StObject.set(x, "sidArray", js.Array(value*))
  }
}
