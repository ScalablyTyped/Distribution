package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLoggingStatus extends StObject {
  
  var LoggingEnabled: js.UndefOr[typings.awsSdk.clientsS3Mod.LoggingEnabled] = js.undefined
}
object BucketLoggingStatus {
  
  inline def apply(): BucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLoggingStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketLoggingStatus] (val x: Self) extends AnyVal {
    
    inline def setLoggingEnabled(value: LoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
  }
}
