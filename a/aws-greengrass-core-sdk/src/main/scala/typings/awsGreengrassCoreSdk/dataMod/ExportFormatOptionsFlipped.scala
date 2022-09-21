package typings.awsGreengrassCoreSdk.dataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.JSON_BATCHED
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.RAW_NOT_BATCHED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportFormatOptionsFlipped extends StObject {
  
  var `0`: RAW_NOT_BATCHED
  
  var `1`: JSON_BATCHED
}
object ExportFormatOptionsFlipped {
  
  inline def apply(): ExportFormatOptionsFlipped = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")("RAW_NOT_BATCHED")
    __obj.updateDynamic("1")("JSON_BATCHED")
    __obj.asInstanceOf[ExportFormatOptionsFlipped]
  }
  
  extension [Self <: ExportFormatOptionsFlipped](x: Self) {
    
    inline def set0(value: RAW_NOT_BATCHED): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: JSON_BATCHED): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
