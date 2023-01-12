package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalBaseBlockJson
  extends StObject
     with ILocalBaseBlock {
  
  var blockName: String
  
  var valueBeforeDecode: String
}
object LocalBaseBlockJson {
  
  inline def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    valueBeforeDecode: String,
    warnings: js.Array[String]
  ): LocalBaseBlockJson = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalBaseBlockJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalBaseBlockJson] (val x: Self) extends AnyVal {
    
    inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecode(value: String): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
  }
}
