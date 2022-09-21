package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalOctetStringValueBlockJson
  extends StObject
     with HexBlockJson
     with LocalConstructedValueBlockJson
     with ILocalOctetStringValueBlock
object LocalOctetStringValueBlockJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    isConstructed: scala.Boolean,
    isHexOnly: scala.Boolean,
    isIndefiniteForm: scala.Boolean,
    value: js.Array[LocalBaseBlockJson],
    valueBeforeDecode: String,
    valueHex: String,
    warnings: js.Array[String]
  ): LocalOctetStringValueBlockJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isConstructed = isConstructed.asInstanceOf[js.Any], isHexOnly = isHexOnly.asInstanceOf[js.Any], isIndefiniteForm = isIndefiniteForm.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], valueHex = valueHex.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalOctetStringValueBlockJson]
  }
}
