package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`0`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`1`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`2`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`3`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusOptions extends StObject {
  
  var Canceled: `4`
  
  var Failure: `1`
  
  var InProgress: `2`
  
  var Success: `0`
  
  var Warning: `3`
}
object StatusOptions {
  
  inline def apply(): StatusOptions = {
    val __obj = js.Dynamic.literal(Canceled = 4, Failure = 1, InProgress = 2, Success = 0, Warning = 3)
    __obj.asInstanceOf[StatusOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusOptions] (val x: Self) extends AnyVal {
    
    inline def setCanceled(value: `4`): Self = StObject.set(x, "Canceled", value.asInstanceOf[js.Any])
    
    inline def setFailure(value: `1`): Self = StObject.set(x, "Failure", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: `2`): Self = StObject.set(x, "InProgress", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: `0`): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: `3`): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
  }
}
