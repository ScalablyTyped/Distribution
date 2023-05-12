package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsCloudtraildataMod {
  
  @JSImport("aws-sdk/clients/cloudtraildata", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends CloudTrailData {
    def this(options: ClientConfiguration) = this()
  }
  
  trait AuditEvent extends StObject {
    
    /**
      * The content of an audit event that comes from the event, such as userIdentity, userAgent, and eventSource.
      */
    var eventData: String
    
    /**
      * A checksum is a base64-SHA256 algorithm that helps you verify that CloudTrail receives the event that matches with the checksum. Calculate the checksum by running a command like the following:  printf %s $eventdata | openssl dgst -binary -sha256 | base64 
      */
    var eventDataChecksum: js.UndefOr[String] = js.undefined
    
    /**
      * The original event ID from the source event.
      */
    var id: Uuid
  }
  object AuditEvent {
    
    inline def apply(eventData: String, id: Uuid): AuditEvent = {
      val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuditEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuditEvent] (val x: Self) extends AnyVal {
      
      inline def setEventData(value: String): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      inline def setEventDataChecksum(value: String): Self = StObject.set(x, "eventDataChecksum", value.asInstanceOf[js.Any])
      
      inline def setEventDataChecksumUndefined: Self = StObject.set(x, "eventDataChecksum", js.undefined)
      
      inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type AuditEventResultEntries = js.Array[AuditEventResultEntry]
  
  trait AuditEventResultEntry extends StObject {
    
    /**
      * The event ID assigned by CloudTrail.
      */
    var eventID: Uuid
    
    /**
      * The original event ID from the source event.
      */
    var id: Uuid
  }
  object AuditEventResultEntry {
    
    inline def apply(eventID: Uuid, id: Uuid): AuditEventResultEntry = {
      val __obj = js.Dynamic.literal(eventID = eventID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuditEventResultEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuditEventResultEntry] (val x: Self) extends AnyVal {
      
      inline def setEventID(value: Uuid): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
      
      inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type AuditEvents = js.Array[AuditEvent]
  
  trait Blob extends StObject
  
  type ChannelArn = java.lang.String
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsCloudtraildataMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  @js.native
  trait CloudTrailData extends Service {
    
    @JSName("config")
    var config_CloudTrailData: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Ingests your application events into CloudTrail Lake. A required parameter, auditEvents, accepts the JSON records (also called payload) of events that you want CloudTrail to ingest. You can add up to 100 of these events (or up to 1 MB) per PutAuditEvents request.
      */
    def putAuditEvents(): Request[PutAuditEventsResponse, AWSError] = js.native
    def putAuditEvents(callback: js.Function2[/* err */ AWSError, /* data */ PutAuditEventsResponse, Unit]): Request[PutAuditEventsResponse, AWSError] = js.native
    /**
      * Ingests your application events into CloudTrail Lake. A required parameter, auditEvents, accepts the JSON records (also called payload) of events that you want CloudTrail to ingest. You can add up to 100 of these events (or up to 1 MB) per PutAuditEvents request.
      */
    def putAuditEvents(params: PutAuditEventsRequest): Request[PutAuditEventsResponse, AWSError] = js.native
    def putAuditEvents(
      params: PutAuditEventsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ PutAuditEventsResponse, Unit]
    ): Request[PutAuditEventsResponse, AWSError] = js.native
  }
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type ExternalId = java.lang.String
  
  trait PutAuditEventsRequest extends StObject {
    
    /**
      * The JSON payload of events that you want to ingest. You can also point to the JSON event payload in a file.
      */
    var auditEvents: AuditEvents
    
    /**
      * The ARN or ID (the ARN suffix) of a channel.
      */
    var channelArn: ChannelArn
    
    /**
      * A unique identifier that is conditionally required when the channel's resource policy includes an external ID. This value can be any string, such as a passphrase or account number.
      */
    var externalId: js.UndefOr[ExternalId] = js.undefined
  }
  object PutAuditEventsRequest {
    
    inline def apply(auditEvents: AuditEvents, channelArn: ChannelArn): PutAuditEventsRequest = {
      val __obj = js.Dynamic.literal(auditEvents = auditEvents.asInstanceOf[js.Any], channelArn = channelArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutAuditEventsRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutAuditEventsRequest] (val x: Self) extends AnyVal {
      
      inline def setAuditEvents(value: AuditEvents): Self = StObject.set(x, "auditEvents", value.asInstanceOf[js.Any])
      
      inline def setAuditEventsVarargs(value: AuditEvent*): Self = StObject.set(x, "auditEvents", js.Array(value*))
      
      inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
      
      inline def setExternalId(value: ExternalId): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
      
      inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    }
  }
  
  trait PutAuditEventsResponse extends StObject {
    
    /**
      * Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the error code and error message returned for events that could not be ingested.
      */
    var failed: ResultErrorEntries
    
    /**
      * Lists events in the provided event payload that were successfully ingested into CloudTrail.
      */
    var successful: AuditEventResultEntries
  }
  object PutAuditEventsResponse {
    
    inline def apply(failed: ResultErrorEntries, successful: AuditEventResultEntries): PutAuditEventsResponse = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutAuditEventsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutAuditEventsResponse] (val x: Self) extends AnyVal {
      
      inline def setFailed(value: ResultErrorEntries): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFailedVarargs(value: ResultErrorEntry*): Self = StObject.set(x, "failed", js.Array(value*))
      
      inline def setSuccessful(value: AuditEventResultEntries): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulVarargs(value: AuditEventResultEntry*): Self = StObject.set(x, "successful", js.Array(value*))
    }
  }
  
  type ResultErrorEntries = js.Array[ResultErrorEntry]
  
  trait ResultErrorEntry extends StObject {
    
    /**
      * The error code for events that could not be ingested by CloudTrail. Possible error codes include: FieldTooLong, FieldNotFound, InvalidChecksum, InvalidData, InvalidRecipient, InvalidEventSource, AccountNotSubscribed, Throttling, and InternalFailure.
      */
    var errorCode: ErrorCode
    
    /**
      * The message that describes the error for events that could not be ingested by CloudTrail.
      */
    var errorMessage: ErrorMessage
    
    /**
      * The original event ID from the source event that could not be ingested by CloudTrail.
      */
    var id: Uuid
  }
  object ResultErrorEntry {
    
    inline def apply(errorCode: ErrorCode, errorMessage: ErrorMessage, id: Uuid): ResultErrorEntry = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultErrorEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultErrorEntry] (val x: Self) extends AnyVal {
      
      inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type String = java.lang.String
  
  type Uuid = java.lang.String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2021-08-11`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
