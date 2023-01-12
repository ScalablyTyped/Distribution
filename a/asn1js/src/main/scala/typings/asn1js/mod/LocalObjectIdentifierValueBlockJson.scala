package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalObjectIdentifierValueBlockJson
  extends StObject
     with LocalBaseBlockJson
     with ILocalObjectIdentifierValueBlock {
  
  var sidArray: js.Array[LocalSidValueBlockJson]
}
object LocalObjectIdentifierValueBlockJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    sidArray: js.Array[LocalSidValueBlockJson],
    value: String,
    valueBeforeDecode: String,
    warnings: js.Array[String]
  ): LocalObjectIdentifierValueBlockJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], sidArray = sidArray.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalObjectIdentifierValueBlockJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalObjectIdentifierValueBlockJson] (val x: Self) extends AnyVal {
    
    inline def setSidArray(value: js.Array[LocalSidValueBlockJson]): Self = StObject.set(x, "sidArray", value.asInstanceOf[js.Any])
    
    inline def setSidArrayVarargs(value: LocalSidValueBlockJson*): Self = StObject.set(x, "sidArray", js.Array(value*))
  }
}
