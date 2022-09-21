package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalLengthBlockJson
  extends StObject
     with LocalBaseBlockJson
     with ILocalLengthBlock
object LocalLengthBlockJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    isIndefiniteForm: scala.Boolean,
    length: Double,
    longFormUsed: scala.Boolean,
    valueBeforeDecode: String,
    warnings: js.Array[String]
  ): LocalLengthBlockJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isIndefiniteForm = isIndefiniteForm.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], longFormUsed = longFormUsed.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalLengthBlockJson]
  }
}
