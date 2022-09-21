package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalBitStringValueBlockJson
  extends StObject
     with HexBlockJson
     with LocalConstructedValueBlockJson
     with ILocalBitStringValueBlock
object LocalBitStringValueBlockJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    isConstructed: scala.Boolean,
    isHexOnly: scala.Boolean,
    isIndefiniteForm: scala.Boolean,
    unusedBits: Double,
    value: js.Array[LocalBaseBlockJson],
    valueBeforeDecode: String,
    valueHex: String,
    warnings: js.Array[String]
  ): LocalBitStringValueBlockJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isConstructed = isConstructed.asInstanceOf[js.Any], isHexOnly = isHexOnly.asInstanceOf[js.Any], isIndefiniteForm = isIndefiniteForm.asInstanceOf[js.Any], unusedBits = unusedBits.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], valueHex = valueHex.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalBitStringValueBlockJson]
  }
}
