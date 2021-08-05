package typings.awsLambda

import typings.awsLambda.anon.Bucket
import typings.awsLambda.anon.PrincipalId
import typings.awsLambda.anon.SourceIPAddress
import typings.awsLambda.anon.Xamzid2
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3Mod {
  
  type S3CreateEvent = S3Event
  
  trait S3Event extends StObject {
    
    var Records: js.Array[S3EventRecord]
  }
  object S3Event {
    
    inline def apply(Records: js.Array[S3EventRecord]): S3Event = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3Event]
    }
    
    extension [Self <: S3Event](x: Self) {
      
      inline def setRecords(value: js.Array[S3EventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: S3EventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  trait S3EventRecord extends StObject {
    
    var awsRegion: String
    
    var eventName: String
    
    var eventSource: String
    
    var eventTime: String
    
    var eventVersion: String
    
    var glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.undefined
    
    var requestParameters: SourceIPAddress
    
    var responseElements: Xamzid2
    
    var s3: Bucket
    
    var userIdentity: PrincipalId
  }
  object S3EventRecord {
    
    inline def apply(
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
    
    extension [Self <: S3EventRecord](x: Self) {
      
      inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      inline def setGlacierEventData(value: S3EventRecordGlacierEventData): Self = StObject.set(x, "glacierEventData", value.asInstanceOf[js.Any])
      
      inline def setGlacierEventDataUndefined: Self = StObject.set(x, "glacierEventData", js.undefined)
      
      inline def setRequestParameters(value: SourceIPAddress): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      inline def setResponseElements(value: Xamzid2): Self = StObject.set(x, "responseElements", value.asInstanceOf[js.Any])
      
      inline def setS3(value: Bucket): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
      
      inline def setUserIdentity(value: PrincipalId): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3EventRecordGlacierEventData extends StObject {
    
    var restoreEventData: S3EventRecordGlacierRestoreEventData
  }
  object S3EventRecordGlacierEventData {
    
    inline def apply(restoreEventData: S3EventRecordGlacierRestoreEventData): S3EventRecordGlacierEventData = {
      val __obj = js.Dynamic.literal(restoreEventData = restoreEventData.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3EventRecordGlacierEventData]
    }
    
    extension [Self <: S3EventRecordGlacierEventData](x: Self) {
      
      inline def setRestoreEventData(value: S3EventRecordGlacierRestoreEventData): Self = StObject.set(x, "restoreEventData", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3EventRecordGlacierRestoreEventData extends StObject {
    
    var lifecycleRestorationExpiryTime: String
    
    var lifecycleRestoreStorageClass: String
  }
  object S3EventRecordGlacierRestoreEventData {
    
    inline def apply(lifecycleRestorationExpiryTime: String, lifecycleRestoreStorageClass: String): S3EventRecordGlacierRestoreEventData = {
      val __obj = js.Dynamic.literal(lifecycleRestorationExpiryTime = lifecycleRestorationExpiryTime.asInstanceOf[js.Any], lifecycleRestoreStorageClass = lifecycleRestoreStorageClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3EventRecordGlacierRestoreEventData]
    }
    
    extension [Self <: S3EventRecordGlacierRestoreEventData](x: Self) {
      
      inline def setLifecycleRestorationExpiryTime(value: String): Self = StObject.set(x, "lifecycleRestorationExpiryTime", value.asInstanceOf[js.Any])
      
      inline def setLifecycleRestoreStorageClass(value: String): Self = StObject.set(x, "lifecycleRestoreStorageClass", value.asInstanceOf[js.Any])
    }
  }
  
  type S3Handler = Handler[S3Event, Unit]
}
