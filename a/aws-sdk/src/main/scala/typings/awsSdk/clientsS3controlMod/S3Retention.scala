package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Retention extends StObject {
  
  /**
    * The Object Lock retention mode to be applied to all objects in the Batch Operations job.
    */
  var Mode: js.UndefOr[S3ObjectLockRetentionMode] = js.undefined
  
  /**
    * The date when the applied Object Lock retention will expire on all objects set by the Batch Operations job.
    */
  var RetainUntilDate: js.UndefOr[js.Date] = js.undefined
}
object S3Retention {
  
  inline def apply(): S3Retention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Retention]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Retention] (val x: Self) extends AnyVal {
    
    inline def setMode(value: S3ObjectLockRetentionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setRetainUntilDate(value: js.Date): Self = StObject.set(x, "RetainUntilDate", value.asInstanceOf[js.Any])
    
    inline def setRetainUntilDateUndefined: Self = StObject.set(x, "RetainUntilDate", js.undefined)
  }
}
