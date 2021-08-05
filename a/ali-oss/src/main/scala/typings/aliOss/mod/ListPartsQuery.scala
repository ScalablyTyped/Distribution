package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartsQuery extends StObject {
  
  // Starting position of a specific list. A part is listed only when the part number is greater than the value of this parameter.
  var `encoding-type`: String
  
  var `max-parts`: Double
  
  // The maximum part number in the response of the OSS. default value: 1000.
  var `part-number-marker`: Double
}
object ListPartsQuery {
  
  inline def apply(`encoding-type`: String, `max-parts`: Double, `part-number-marker`: Double): ListPartsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding-type")(`encoding-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("max-parts")(`max-parts`.asInstanceOf[js.Any])
    __obj.updateDynamic("part-number-marker")(`part-number-marker`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsQuery]
  }
  
  extension [Self <: ListPartsQuery](x: Self) {
    
    inline def `setEncoding-type`(value: String): Self = StObject.set(x, "encoding-type", value.asInstanceOf[js.Any])
    
    inline def `setMax-parts`(value: Double): Self = StObject.set(x, "max-parts", value.asInstanceOf[js.Any])
    
    inline def `setPart-number-marker`(value: Double): Self = StObject.set(x, "part-number-marker", value.asInstanceOf[js.Any])
  }
}
