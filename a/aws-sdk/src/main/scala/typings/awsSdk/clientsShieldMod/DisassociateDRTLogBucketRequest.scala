package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateDRTLogBucketRequest extends StObject {
  
  /**
    * The Amazon S3 bucket that contains the logs that you want to share.
    */
  var LogBucket: typings.awsSdk.clientsShieldMod.LogBucket
}
object DisassociateDRTLogBucketRequest {
  
  inline def apply(LogBucket: LogBucket): DisassociateDRTLogBucketRequest = {
    val __obj = js.Dynamic.literal(LogBucket = LogBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDRTLogBucketRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateDRTLogBucketRequest] (val x: Self) extends AnyVal {
    
    inline def setLogBucket(value: LogBucket): Self = StObject.set(x, "LogBucket", value.asInstanceOf[js.Any])
  }
}
