package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<asn1js.asn1js.IRawData> */
trait RawDataParams extends StObject {
  
  var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}
object RawDataParams {
  
  inline def apply(): RawDataParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawDataParams]
  }
  
  extension [Self <: RawDataParams](x: Self) {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
