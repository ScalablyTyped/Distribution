package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsSagemakerfeaturestoreruntimeMod {
  
  @JSImport("aws-sdk/clients/sagemakerfeaturestoreruntime", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends SageMakerFeatureStoreRuntime {
    def this(options: ClientConfiguration) = this()
  }
  
  trait BatchGetRecordError extends StObject {
    
    /**
      * The error code of an error that has occured when attempting to retrieve a batch of Records. For more information on errors, see  Errors.
      */
    var ErrorCode: ValueAsString
    
    /**
      * The error message of an error that has occured when attempting to retrieve a record in the batch.
      */
    var ErrorMessage: Message
    
    /**
      * The name of the feature group that the record belongs to.
      */
    var FeatureGroupName: ValueAsString
    
    /**
      * The value for the RecordIdentifier in string format of a Record from a FeatureGroup that is causing an error when attempting to be retrieved.
      */
    var RecordIdentifierValueAsString: ValueAsString
  }
  object BatchGetRecordError {
    
    inline def apply(
      ErrorCode: ValueAsString,
      ErrorMessage: Message,
      FeatureGroupName: ValueAsString,
      RecordIdentifierValueAsString: ValueAsString
    ): BatchGetRecordError = {
      val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], RecordIdentifierValueAsString = RecordIdentifierValueAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetRecordError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchGetRecordError] (val x: Self) extends AnyVal {
      
      inline def setErrorCode(value: ValueAsString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: Message): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setFeatureGroupName(value: ValueAsString): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
      
      inline def setRecordIdentifierValueAsString(value: ValueAsString): Self = StObject.set(x, "RecordIdentifierValueAsString", value.asInstanceOf[js.Any])
    }
  }
  
  type BatchGetRecordErrors = js.Array[BatchGetRecordError]
  
  trait BatchGetRecordIdentifier extends StObject {
    
    /**
      * A FeatureGroupName containing Records you are retrieving in a batch.
      */
    var FeatureGroupName: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.FeatureGroupName
    
    /**
      * List of names of Features to be retrieved. If not specified, the latest value for all the Features are returned.
      */
    var FeatureNames: js.UndefOr[typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.FeatureNames] = js.undefined
    
    /**
      * The value for a list of record identifiers in string format.
      */
    var RecordIdentifiersValueAsString: RecordIdentifiers
  }
  object BatchGetRecordIdentifier {
    
    inline def apply(FeatureGroupName: FeatureGroupName, RecordIdentifiersValueAsString: RecordIdentifiers): BatchGetRecordIdentifier = {
      val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], RecordIdentifiersValueAsString = RecordIdentifiersValueAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetRecordIdentifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchGetRecordIdentifier] (val x: Self) extends AnyVal {
      
      inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
      
      inline def setFeatureNames(value: FeatureNames): Self = StObject.set(x, "FeatureNames", value.asInstanceOf[js.Any])
      
      inline def setFeatureNamesUndefined: Self = StObject.set(x, "FeatureNames", js.undefined)
      
      inline def setFeatureNamesVarargs(value: FeatureName*): Self = StObject.set(x, "FeatureNames", js.Array(value*))
      
      inline def setRecordIdentifiersValueAsString(value: RecordIdentifiers): Self = StObject.set(x, "RecordIdentifiersValueAsString", value.asInstanceOf[js.Any])
      
      inline def setRecordIdentifiersValueAsStringVarargs(value: ValueAsString*): Self = StObject.set(x, "RecordIdentifiersValueAsString", js.Array(value*))
    }
  }
  
  type BatchGetRecordIdentifiers = js.Array[BatchGetRecordIdentifier]
  
  trait BatchGetRecordRequest extends StObject {
    
    /**
      * A list of FeatureGroup names, with their corresponding RecordIdentifier value, and Feature name that have been requested to be retrieved in batch.
      */
    var Identifiers: BatchGetRecordIdentifiers
  }
  object BatchGetRecordRequest {
    
    inline def apply(Identifiers: BatchGetRecordIdentifiers): BatchGetRecordRequest = {
      val __obj = js.Dynamic.literal(Identifiers = Identifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetRecordRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchGetRecordRequest] (val x: Self) extends AnyVal {
      
      inline def setIdentifiers(value: BatchGetRecordIdentifiers): Self = StObject.set(x, "Identifiers", value.asInstanceOf[js.Any])
      
      inline def setIdentifiersVarargs(value: BatchGetRecordIdentifier*): Self = StObject.set(x, "Identifiers", js.Array(value*))
    }
  }
  
  trait BatchGetRecordResponse extends StObject {
    
    /**
      * A list of errors that have occured when retrieving a batch of Records.
      */
    var Errors: BatchGetRecordErrors
    
    /**
      * A list of Records you requested to be retrieved in batch.
      */
    var Records: BatchGetRecordResultDetails
    
    /**
      * A unprocessed list of FeatureGroup names, with their corresponding RecordIdentifier value, and Feature name.
      */
    var UnprocessedIdentifiers: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.UnprocessedIdentifiers
  }
  object BatchGetRecordResponse {
    
    inline def apply(
      Errors: BatchGetRecordErrors,
      Records: BatchGetRecordResultDetails,
      UnprocessedIdentifiers: UnprocessedIdentifiers
    ): BatchGetRecordResponse = {
      val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any], UnprocessedIdentifiers = UnprocessedIdentifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetRecordResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchGetRecordResponse] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: BatchGetRecordErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: BatchGetRecordError*): Self = StObject.set(x, "Errors", js.Array(value*))
      
      inline def setRecords(value: BatchGetRecordResultDetails): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: BatchGetRecordResultDetail*): Self = StObject.set(x, "Records", js.Array(value*))
      
      inline def setUnprocessedIdentifiers(value: UnprocessedIdentifiers): Self = StObject.set(x, "UnprocessedIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedIdentifiersVarargs(value: BatchGetRecordIdentifier*): Self = StObject.set(x, "UnprocessedIdentifiers", js.Array(value*))
    }
  }
  
  trait BatchGetRecordResultDetail extends StObject {
    
    /**
      * The FeatureGroupName containing Records you retrieved in a batch.
      */
    var FeatureGroupName: ValueAsString
    
    /**
      * The Record retrieved.
      */
    var Record: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.Record
    
    /**
      * The value of the record identifer in string format.
      */
    var RecordIdentifierValueAsString: ValueAsString
  }
  object BatchGetRecordResultDetail {
    
    inline def apply(FeatureGroupName: ValueAsString, Record: Record, RecordIdentifierValueAsString: ValueAsString): BatchGetRecordResultDetail = {
      val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any], RecordIdentifierValueAsString = RecordIdentifierValueAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetRecordResultDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchGetRecordResultDetail] (val x: Self) extends AnyVal {
      
      inline def setFeatureGroupName(value: ValueAsString): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
      
      inline def setRecord(value: Record): Self = StObject.set(x, "Record", value.asInstanceOf[js.Any])
      
      inline def setRecordIdentifierValueAsString(value: ValueAsString): Self = StObject.set(x, "RecordIdentifierValueAsString", value.asInstanceOf[js.Any])
      
      inline def setRecordVarargs(value: FeatureValue*): Self = StObject.set(x, "Record", js.Array(value*))
    }
  }
  
  type BatchGetRecordResultDetails = js.Array[BatchGetRecordResultDetail]
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.apiVersion] = js.undefined
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
  
  trait DeleteRecordRequest extends StObject {
    
    /**
      * Timestamp indicating when the deletion event occurred. EventTime can be used to query data at a certain point in time.
      */
    var EventTime: ValueAsString
    
    /**
      * The name of the feature group to delete the record from. 
      */
    var FeatureGroupName: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.FeatureGroupName
    
    /**
      * The value for the RecordIdentifier that uniquely identifies the record, in string format. 
      */
    var RecordIdentifierValueAsString: ValueAsString
  }
  object DeleteRecordRequest {
    
    inline def apply(
      EventTime: ValueAsString,
      FeatureGroupName: FeatureGroupName,
      RecordIdentifierValueAsString: ValueAsString
    ): DeleteRecordRequest = {
      val __obj = js.Dynamic.literal(EventTime = EventTime.asInstanceOf[js.Any], FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], RecordIdentifierValueAsString = RecordIdentifierValueAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteRecordRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteRecordRequest] (val x: Self) extends AnyVal {
      
      inline def setEventTime(value: ValueAsString): Self = StObject.set(x, "EventTime", value.asInstanceOf[js.Any])
      
      inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
      
      inline def setRecordIdentifierValueAsString(value: ValueAsString): Self = StObject.set(x, "RecordIdentifierValueAsString", value.asInstanceOf[js.Any])
    }
  }
  
  type FeatureGroupName = String
  
  type FeatureName = String
  
  type FeatureNames = js.Array[FeatureName]
  
  trait FeatureValue extends StObject {
    
    /**
      * The name of a feature that a feature value corresponds to.
      */
    var FeatureName: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.FeatureName
    
    /**
      * The value associated with a feature, in string format. Note that features types can be String, Integral, or Fractional. This value represents all three types as a string.
      */
    var ValueAsString: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.ValueAsString
  }
  object FeatureValue {
    
    inline def apply(FeatureName: FeatureName, ValueAsString: ValueAsString): FeatureValue = {
      val __obj = js.Dynamic.literal(FeatureName = FeatureName.asInstanceOf[js.Any], ValueAsString = ValueAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeatureValue] (val x: Self) extends AnyVal {
      
      inline def setFeatureName(value: FeatureName): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
      
      inline def setValueAsString(value: ValueAsString): Self = StObject.set(x, "ValueAsString", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRecordRequest extends StObject {
    
    /**
      * The name of the feature group in which you want to put the records.
      */
    var FeatureGroupName: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.FeatureGroupName
    
    /**
      * List of names of Features to be retrieved. If not specified, the latest value for all the Features are returned.
      */
    var FeatureNames: js.UndefOr[typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.FeatureNames] = js.undefined
    
    /**
      * The value that corresponds to RecordIdentifier type and uniquely identifies the record in the FeatureGroup. 
      */
    var RecordIdentifierValueAsString: ValueAsString
  }
  object GetRecordRequest {
    
    inline def apply(FeatureGroupName: FeatureGroupName, RecordIdentifierValueAsString: ValueAsString): GetRecordRequest = {
      val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], RecordIdentifierValueAsString = RecordIdentifierValueAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRecordRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRecordRequest] (val x: Self) extends AnyVal {
      
      inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
      
      inline def setFeatureNames(value: FeatureNames): Self = StObject.set(x, "FeatureNames", value.asInstanceOf[js.Any])
      
      inline def setFeatureNamesUndefined: Self = StObject.set(x, "FeatureNames", js.undefined)
      
      inline def setFeatureNamesVarargs(value: FeatureName*): Self = StObject.set(x, "FeatureNames", js.Array(value*))
      
      inline def setRecordIdentifierValueAsString(value: ValueAsString): Self = StObject.set(x, "RecordIdentifierValueAsString", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRecordResponse extends StObject {
    
    /**
      * The record you requested. A list of FeatureValues.
      */
    var Record: js.UndefOr[typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.Record] = js.undefined
  }
  object GetRecordResponse {
    
    inline def apply(): GetRecordResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRecordResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRecordResponse] (val x: Self) extends AnyVal {
      
      inline def setRecord(value: Record): Self = StObject.set(x, "Record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "Record", js.undefined)
      
      inline def setRecordVarargs(value: FeatureValue*): Self = StObject.set(x, "Record", js.Array(value*))
    }
  }
  
  type Message = String
  
  trait PutRecordRequest extends StObject {
    
    /**
      * The name of the feature group that you want to insert the record into.
      */
    var FeatureGroupName: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.FeatureGroupName
    
    /**
      * List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of the feature values, do the following:   Use GetRecord to retrieve the latest record.   Update the record returned from GetRecord.    Use PutRecord to update feature values.  
      */
    var Record: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.Record
  }
  object PutRecordRequest {
    
    inline def apply(FeatureGroupName: FeatureGroupName, Record: Record): PutRecordRequest = {
      val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRecordRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutRecordRequest] (val x: Self) extends AnyVal {
      
      inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
      
      inline def setRecord(value: Record): Self = StObject.set(x, "Record", value.asInstanceOf[js.Any])
      
      inline def setRecordVarargs(value: FeatureValue*): Self = StObject.set(x, "Record", js.Array(value*))
    }
  }
  
  type Record = js.Array[FeatureValue]
  
  type RecordIdentifiers = js.Array[ValueAsString]
  
  @js.native
  trait SageMakerFeatureStoreRuntime extends Service {
    
    /**
      * Retrieves a batch of Records from a FeatureGroup.
      */
    def batchGetRecord(): Request[BatchGetRecordResponse, AWSError] = js.native
    def batchGetRecord(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetRecordResponse, Unit]): Request[BatchGetRecordResponse, AWSError] = js.native
    /**
      * Retrieves a batch of Records from a FeatureGroup.
      */
    def batchGetRecord(params: BatchGetRecordRequest): Request[BatchGetRecordResponse, AWSError] = js.native
    def batchGetRecord(
      params: BatchGetRecordRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ BatchGetRecordResponse, Unit]
    ): Request[BatchGetRecordResponse, AWSError] = js.native
    
    @JSName("config")
    var config_SageMakerFeatureStoreRuntime: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Deletes a Record from a FeatureGroup. A new record will show up in the OfflineStore when the DeleteRecord API is called. This record will have a value of True in the is_deleted column.
      */
    def deleteRecord(): Request[js.Object, AWSError] = js.native
    def deleteRecord(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Deletes a Record from a FeatureGroup. A new record will show up in the OfflineStore when the DeleteRecord API is called. This record will have a value of True in the is_deleted column.
      */
    def deleteRecord(params: DeleteRecordRequest): Request[js.Object, AWSError] = js.native
    def deleteRecord(
      params: DeleteRecordRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
    ): Request[js.Object, AWSError] = js.native
    
    /**
      * Use for OnlineStore serving from a FeatureStore. Only the latest records stored in the OnlineStore can be retrieved. If no Record with RecordIdentifierValue is found, then an empty result is returned. 
      */
    def getRecord(): Request[GetRecordResponse, AWSError] = js.native
    def getRecord(callback: js.Function2[/* err */ AWSError, /* data */ GetRecordResponse, Unit]): Request[GetRecordResponse, AWSError] = js.native
    /**
      * Use for OnlineStore serving from a FeatureStore. Only the latest records stored in the OnlineStore can be retrieved. If no Record with RecordIdentifierValue is found, then an empty result is returned. 
      */
    def getRecord(params: GetRecordRequest): Request[GetRecordResponse, AWSError] = js.native
    def getRecord(
      params: GetRecordRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetRecordResponse, Unit]
    ): Request[GetRecordResponse, AWSError] = js.native
    
    /**
      * Used for data ingestion into the FeatureStore. The PutRecord API writes to both the OnlineStore and OfflineStore. If the record is the latest record for the recordIdentifier, the record is written to both the OnlineStore and OfflineStore. If the record is a historic record, it is written only to the OfflineStore.
      */
    def putRecord(): Request[js.Object, AWSError] = js.native
    def putRecord(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Used for data ingestion into the FeatureStore. The PutRecord API writes to both the OnlineStore and OfflineStore. If the record is the latest record for the recordIdentifier, the record is written to both the OnlineStore and OfflineStore. If the record is a historic record, it is written only to the OfflineStore.
      */
    def putRecord(params: PutRecordRequest): Request[js.Object, AWSError] = js.native
    def putRecord(params: PutRecordRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  }
  
  type UnprocessedIdentifiers = js.Array[BatchGetRecordIdentifier]
  
  type ValueAsString = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2020-07-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
