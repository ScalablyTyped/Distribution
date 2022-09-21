package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSidValueBlockJson
  extends StObject
     with HexBlockJson
     with LocalBaseBlockJson
     with ILocalSidValueBlock
object LocalSidValueBlockJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    isFirstSid: scala.Boolean,
    isHexOnly: scala.Boolean,
    valueBeforeDecode: String,
    valueDec: Double,
    valueHex: String,
    warnings: js.Array[String]
  ): LocalSidValueBlockJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isFirstSid = isFirstSid.asInstanceOf[js.Any], isHexOnly = isHexOnly.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], valueDec = valueDec.asInstanceOf[js.Any], valueHex = valueHex.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSidValueBlockJson]
  }
}
