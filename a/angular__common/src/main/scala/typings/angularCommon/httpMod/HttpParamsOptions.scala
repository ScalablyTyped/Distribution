package typings.angularCommon.httpMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpParamsOptions extends StObject {
  
  /** Encoding codec used to parse and serialize the parameters. */
  var encoder: js.UndefOr[HttpParameterCodec] = js.undefined
  
  /** Object map of the HTTP parameters. Mutually exclusive with `fromString`. */
  var fromObject: js.UndefOr[
    StringDictionary[String | Double | Boolean | (js.Array[String | Double | Boolean])]
  ] = js.undefined
  
  /**
    * String representation of the HTTP parameters in URL-query-string format.
    * Mutually exclusive with `fromObject`.
    */
  var fromString: js.UndefOr[String] = js.undefined
}
object HttpParamsOptions {
  
  inline def apply(): HttpParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpParamsOptions]
  }
  
  extension [Self <: HttpParamsOptions](x: Self) {
    
    inline def setEncoder(value: HttpParameterCodec): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
    
    inline def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
    
    inline def setFromObject(value: StringDictionary[String | Double | Boolean | (js.Array[String | Double | Boolean])]): Self = StObject.set(x, "fromObject", value.asInstanceOf[js.Any])
    
    inline def setFromObjectUndefined: Self = StObject.set(x, "fromObject", js.undefined)
    
    inline def setFromString(value: String): Self = StObject.set(x, "fromString", value.asInstanceOf[js.Any])
    
    inline def setFromStringUndefined: Self = StObject.set(x, "fromString", js.undefined)
  }
}
