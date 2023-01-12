package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDRTAccessResponse extends StObject {
  
  /**
    * The list of Amazon S3 buckets accessed by the SRT.
    */
  var LogBucketList: js.UndefOr[typings.awsSdk.clientsShieldMod.LogBucketList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role the SRT used to access your Amazon Web Services account.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsShieldMod.RoleArn] = js.undefined
}
object DescribeDRTAccessResponse {
  
  inline def apply(): DescribeDRTAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDRTAccessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDRTAccessResponse] (val x: Self) extends AnyVal {
    
    inline def setLogBucketList(value: LogBucketList): Self = StObject.set(x, "LogBucketList", value.asInstanceOf[js.Any])
    
    inline def setLogBucketListUndefined: Self = StObject.set(x, "LogBucketList", js.undefined)
    
    inline def setLogBucketListVarargs(value: LogBucket*): Self = StObject.set(x, "LogBucketList", js.Array(value*))
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
