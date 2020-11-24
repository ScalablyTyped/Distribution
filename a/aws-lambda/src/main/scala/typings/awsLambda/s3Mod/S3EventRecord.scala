package typings.awsLambda.s3Mod

import typings.awsLambda.anon.Bucket
import typings.awsLambda.anon.PrincipalId
import typings.awsLambda.anon.SourceIPAddress
import typings.awsLambda.anon.Xamzid2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3EventRecord extends js.Object {
  
  var awsRegion: String = js.native
  
  var eventName: String = js.native
  
  var eventSource: String = js.native
  
  var eventTime: String = js.native
  
  var eventVersion: String = js.native
  
  var glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.native
  
  var requestParameters: SourceIPAddress = js.native
  
  var responseElements: Xamzid2 = js.native
  
  var s3: Bucket = js.native
  
  var userIdentity: PrincipalId = js.native
}
object S3EventRecord {
  
  @scala.inline
  def apply(
    awsRegion: String,
    eventName: String,
    eventSource: String,
    eventTime: String,
    eventVersion: String,
    requestParameters: SourceIPAddress,
    responseElements: Xamzid2,
    s3: Bucket,
    userIdentity: PrincipalId
  ): S3EventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], responseElements = responseElements.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EventRecord]
  }
  
  @scala.inline
  implicit class S3EventRecordOps[Self <: S3EventRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsRegion(value: String): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTime(value: String): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventVersion(value: String): Self = this.set("eventVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestParameters(value: SourceIPAddress): Self = this.set("requestParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseElements(value: Xamzid2): Self = this.set("responseElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3(value: Bucket): Self = this.set("s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdentity(value: PrincipalId): Self = this.set("userIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlacierEventData(value: S3EventRecordGlacierEventData): Self = this.set("glacierEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlacierEventData: Self = this.set("glacierEventData", js.undefined)
  }
}
