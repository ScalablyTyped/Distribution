package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.Canceled
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.Failure
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.InProgress
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.Success
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusOptionsFlipped extends StObject {
  
  var `0`: Success
  
  var `1`: Failure
  
  var `2`: InProgress
  
  var `3`: Warning
  
  var `4`: Canceled
}
object StatusOptionsFlipped {
  
  inline def apply(): StatusOptionsFlipped = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")("Success")
    __obj.updateDynamic("1")("Failure")
    __obj.updateDynamic("2")("InProgress")
    __obj.updateDynamic("3")("Warning")
    __obj.updateDynamic("4")("Canceled")
    __obj.asInstanceOf[StatusOptionsFlipped]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusOptionsFlipped] (val x: Self) extends AnyVal {
    
    inline def set0(value: Success): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: Failure): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: InProgress): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set3(value: Warning): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    inline def set4(value: Canceled): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
  }
}
