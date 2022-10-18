package typings.appBuilderLib.anon

import typings.appBuilderLib.appBuilderLibStrings.products
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdType extends StObject {
  
  var id: String
  
  var `type`: products
}
object IdType {
  
  inline def apply(id: String): IdType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("products")
    __obj.asInstanceOf[IdType]
  }
  
  extension [Self <: IdType](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: products): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
