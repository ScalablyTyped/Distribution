package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.DEBUG
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.ERROR
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.INFO
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.TRACE
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.WARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusLevelOptionsFlipped extends StObject {
  
  var `0`: ERROR
  
  var `1`: WARN
  
  var `2`: INFO
  
  var `3`: DEBUG
  
  var `4`: TRACE
}
object StatusLevelOptionsFlipped {
  
  inline def apply(): StatusLevelOptionsFlipped = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")("ERROR")
    __obj.updateDynamic("1")("WARN")
    __obj.updateDynamic("2")("INFO")
    __obj.updateDynamic("3")("DEBUG")
    __obj.updateDynamic("4")("TRACE")
    __obj.asInstanceOf[StatusLevelOptionsFlipped]
  }
  
  extension [Self <: StatusLevelOptionsFlipped](x: Self) {
    
    inline def set0(value: ERROR): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: WARN): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: INFO): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set3(value: DEBUG): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    inline def set4(value: TRACE): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
  }
}
