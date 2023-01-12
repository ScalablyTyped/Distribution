package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTypeOptions extends StObject {
  
  var S3Task: `0`
}
object EventTypeOptions {
  
  inline def apply(): EventTypeOptions = {
    val __obj = js.Dynamic.literal(S3Task = 0)
    __obj.asInstanceOf[EventTypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventTypeOptions] (val x: Self) extends AnyVal {
    
    inline def setS3Task(value: `0`): Self = StObject.set(x, "S3Task", value.asInstanceOf[js.Any])
  }
}
