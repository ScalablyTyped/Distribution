package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromBerResult extends StObject {
  
  var offset: Double
  
  var result: AsnType
}
object FromBerResult {
  
  inline def apply(offset: Double, result: AsnType): FromBerResult = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromBerResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromBerResult] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setResult(value: AsnType): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
