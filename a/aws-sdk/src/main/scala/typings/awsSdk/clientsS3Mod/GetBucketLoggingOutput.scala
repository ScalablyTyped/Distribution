package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketLoggingOutput extends StObject {
  
  var LoggingEnabled: js.UndefOr[typings.awsSdk.clientsS3Mod.LoggingEnabled] = js.undefined
}
object GetBucketLoggingOutput {
  
  inline def apply(): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketLoggingOutput] (val x: Self) extends AnyVal {
    
    inline def setLoggingEnabled(value: LoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
  }
}
