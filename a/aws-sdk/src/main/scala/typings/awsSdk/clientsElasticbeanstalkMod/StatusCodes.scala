package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusCodes extends StObject {
  
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
    */
  var Status2xx: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
    */
  var Status3xx: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
    */
  var Status4xx: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
    */
  var Status5xx: js.UndefOr[NullableInteger] = js.undefined
}
object StatusCodes {
  
  inline def apply(): StatusCodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCodes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusCodes] (val x: Self) extends AnyVal {
    
    inline def setStatus2xx(value: NullableInteger): Self = StObject.set(x, "Status2xx", value.asInstanceOf[js.Any])
    
    inline def setStatus2xxUndefined: Self = StObject.set(x, "Status2xx", js.undefined)
    
    inline def setStatus3xx(value: NullableInteger): Self = StObject.set(x, "Status3xx", value.asInstanceOf[js.Any])
    
    inline def setStatus3xxUndefined: Self = StObject.set(x, "Status3xx", js.undefined)
    
    inline def setStatus4xx(value: NullableInteger): Self = StObject.set(x, "Status4xx", value.asInstanceOf[js.Any])
    
    inline def setStatus4xxUndefined: Self = StObject.set(x, "Status4xx", js.undefined)
    
    inline def setStatus5xx(value: NullableInteger): Self = StObject.set(x, "Status5xx", value.asInstanceOf[js.Any])
    
    inline def setStatus5xxUndefined: Self = StObject.set(x, "Status5xx", js.undefined)
  }
}
