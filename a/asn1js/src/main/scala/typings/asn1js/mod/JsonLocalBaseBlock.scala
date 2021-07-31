package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonLocalBaseBlock extends StObject {
  
  var blockLength: Double
  
  var blockName: String
  
  var error: String
  
  var valueBeforeDecode: ArrayBuffer
  
  var warnings: js.Array[String]
}
object JsonLocalBaseBlock {
  
  @scala.inline
  def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    valueBeforeDecode: ArrayBuffer,
    warnings: js.Array[String]
  ): JsonLocalBaseBlock = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLocalBaseBlock]
  }
  
  @scala.inline
  implicit class JsonLocalBaseBlockMutableBuilder[Self <: JsonLocalBaseBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBeforeDecode(value: ArrayBuffer): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
