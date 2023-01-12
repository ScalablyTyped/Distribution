package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationS3Response extends StObject {
  
  /**
    * If you are using DataSync on an Amazon Web Services Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on your Outpost. For more information about launching a DataSync agent on an Amazon Web Services Outpost, see Deploy your DataSync agent on Outposts.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.undefined
  
  /**
    * The time that the Amazon S3 bucket location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket or access point.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
  
  /**
    * The URL of the Amazon S3 location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationUri] = js.undefined
  
  var S3Config: js.UndefOr[typings.awsSdk.clientsDatasyncMod.S3Config] = js.undefined
  
  /**
    * The Amazon S3 storage class that you chose to store your files in when this location is used as a task destination. For more information about S3 storage classes, see Amazon S3 Storage Classes. Some storage classes have behaviors that can affect your S3 storage cost. For detailed information, see Considerations when working with S3 storage classes in DataSync.
    */
  var S3StorageClass: js.UndefOr[typings.awsSdk.clientsDatasyncMod.S3StorageClass] = js.undefined
}
object DescribeLocationS3Response {
  
  inline def apply(): DescribeLocationS3Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationS3Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocationS3Response] (val x: Self) extends AnyVal {
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    inline def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    inline def setS3Config(value: S3Config): Self = StObject.set(x, "S3Config", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigUndefined: Self = StObject.set(x, "S3Config", js.undefined)
    
    inline def setS3StorageClass(value: S3StorageClass): Self = StObject.set(x, "S3StorageClass", value.asInstanceOf[js.Any])
    
    inline def setS3StorageClassUndefined: Self = StObject.set(x, "S3StorageClass", js.undefined)
  }
}
