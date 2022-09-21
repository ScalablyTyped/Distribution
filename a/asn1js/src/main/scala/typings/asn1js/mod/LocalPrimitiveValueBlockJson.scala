package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalPrimitiveValueBlockJson
  extends StObject
     with HexBlockJson
     with LocalBaseBlockJson
object LocalPrimitiveValueBlockJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    isHexOnly: scala.Boolean,
    valueBeforeDecode: String,
    valueHex: String,
    warnings: js.Array[String]
  ): LocalPrimitiveValueBlockJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isHexOnly = isHexOnly.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], valueHex = valueHex.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalPrimitiveValueBlockJson]
  }
}
