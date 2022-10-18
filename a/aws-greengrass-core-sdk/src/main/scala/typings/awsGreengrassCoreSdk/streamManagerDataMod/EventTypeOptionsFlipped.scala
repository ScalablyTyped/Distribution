package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.S3Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTypeOptionsFlipped extends StObject {
  
  var `0`: S3Task
}
object EventTypeOptionsFlipped {
  
  inline def apply(): EventTypeOptionsFlipped = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")("S3Task")
    __obj.asInstanceOf[EventTypeOptionsFlipped]
  }
  
  extension [Self <: EventTypeOptionsFlipped](x: Self) {
    
    inline def set0(value: S3Task): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
  }
}
