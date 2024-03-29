package typings.awsSdk.clientsComprehendMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comprehend extends Service {
  
  /**
    * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def batchDetectDominantLanguage(): Request[BatchDetectDominantLanguageResponse, AWSError] = js.native
  def batchDetectDominantLanguage(callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectDominantLanguageResponse, Unit]): Request[BatchDetectDominantLanguageResponse, AWSError] = js.native
  /**
    * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def batchDetectDominantLanguage(params: BatchDetectDominantLanguageRequest): Request[BatchDetectDominantLanguageResponse, AWSError] = js.native
  def batchDetectDominantLanguage(
    params: BatchDetectDominantLanguageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectDominantLanguageResponse, Unit]
  ): Request[BatchDetectDominantLanguageResponse, AWSError] = js.native
  
  /**
    * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see Entities in the Comprehend Developer Guide. 
    */
  def batchDetectEntities(): Request[BatchDetectEntitiesResponse, AWSError] = js.native
  def batchDetectEntities(callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectEntitiesResponse, Unit]): Request[BatchDetectEntitiesResponse, AWSError] = js.native
  /**
    * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see Entities in the Comprehend Developer Guide. 
    */
  def batchDetectEntities(params: BatchDetectEntitiesRequest): Request[BatchDetectEntitiesResponse, AWSError] = js.native
  def batchDetectEntities(
    params: BatchDetectEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectEntitiesResponse, Unit]
  ): Request[BatchDetectEntitiesResponse, AWSError] = js.native
  
  /**
    * Detects the key noun phrases found in a batch of documents.
    */
  def batchDetectKeyPhrases(): Request[BatchDetectKeyPhrasesResponse, AWSError] = js.native
  def batchDetectKeyPhrases(callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectKeyPhrasesResponse, Unit]): Request[BatchDetectKeyPhrasesResponse, AWSError] = js.native
  /**
    * Detects the key noun phrases found in a batch of documents.
    */
  def batchDetectKeyPhrases(params: BatchDetectKeyPhrasesRequest): Request[BatchDetectKeyPhrasesResponse, AWSError] = js.native
  def batchDetectKeyPhrases(
    params: BatchDetectKeyPhrasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectKeyPhrasesResponse, Unit]
  ): Request[BatchDetectKeyPhrasesResponse, AWSError] = js.native
  
  /**
    * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
    */
  def batchDetectSentiment(): Request[BatchDetectSentimentResponse, AWSError] = js.native
  def batchDetectSentiment(callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectSentimentResponse, Unit]): Request[BatchDetectSentimentResponse, AWSError] = js.native
  /**
    * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
    */
  def batchDetectSentiment(params: BatchDetectSentimentRequest): Request[BatchDetectSentimentResponse, AWSError] = js.native
  def batchDetectSentiment(
    params: BatchDetectSentimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectSentimentResponse, Unit]
  ): Request[BatchDetectSentimentResponse, AWSError] = js.native
  
  /**
    * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see Syntax in the Comprehend Developer Guide. 
    */
  def batchDetectSyntax(): Request[BatchDetectSyntaxResponse, AWSError] = js.native
  def batchDetectSyntax(callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectSyntaxResponse, Unit]): Request[BatchDetectSyntaxResponse, AWSError] = js.native
  /**
    * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see Syntax in the Comprehend Developer Guide. 
    */
  def batchDetectSyntax(params: BatchDetectSyntaxRequest): Request[BatchDetectSyntaxResponse, AWSError] = js.native
  def batchDetectSyntax(
    params: BatchDetectSyntaxRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectSyntaxResponse, Unit]
  ): Request[BatchDetectSyntaxResponse, AWSError] = js.native
  
  /**
    * Inspects a batch of documents and returns a sentiment analysis for each entity identified in the documents. For more information about targeted sentiment, see Targeted sentiment.
    */
  def batchDetectTargetedSentiment(): Request[BatchDetectTargetedSentimentResponse, AWSError] = js.native
  def batchDetectTargetedSentiment(callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectTargetedSentimentResponse, Unit]): Request[BatchDetectTargetedSentimentResponse, AWSError] = js.native
  /**
    * Inspects a batch of documents and returns a sentiment analysis for each entity identified in the documents. For more information about targeted sentiment, see Targeted sentiment.
    */
  def batchDetectTargetedSentiment(params: BatchDetectTargetedSentimentRequest): Request[BatchDetectTargetedSentimentResponse, AWSError] = js.native
  def batchDetectTargetedSentiment(
    params: BatchDetectTargetedSentimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectTargetedSentimentResponse, Unit]
  ): Request[BatchDetectTargetedSentimentResponse, AWSError] = js.native
  
  /**
    * Creates a new document classification request to analyze a single document in real-time, using a previously created and trained custom model and an endpoint. You can input plain text or you can upload a single-page input document (text, PDF, Word, or image).  If the system detects errors while processing a page in the input document, the API response includes an entry in Errors that describes the errors. If the system detects a document-level error in your input document, the API returns an InvalidRequestException error response. For details about this exception, see  Errors in semi-structured documents in the Comprehend Developer Guide. 
    */
  def classifyDocument(): Request[ClassifyDocumentResponse, AWSError] = js.native
  def classifyDocument(callback: js.Function2[/* err */ AWSError, /* data */ ClassifyDocumentResponse, Unit]): Request[ClassifyDocumentResponse, AWSError] = js.native
  /**
    * Creates a new document classification request to analyze a single document in real-time, using a previously created and trained custom model and an endpoint. You can input plain text or you can upload a single-page input document (text, PDF, Word, or image).  If the system detects errors while processing a page in the input document, the API response includes an entry in Errors that describes the errors. If the system detects a document-level error in your input document, the API returns an InvalidRequestException error response. For details about this exception, see  Errors in semi-structured documents in the Comprehend Developer Guide. 
    */
  def classifyDocument(params: ClassifyDocumentRequest): Request[ClassifyDocumentResponse, AWSError] = js.native
  def classifyDocument(
    params: ClassifyDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ClassifyDocumentResponse, Unit]
  ): Request[ClassifyDocumentResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Comprehend: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Analyzes input text for the presence of personally identifiable information (PII) and returns the labels of identified PII entity types such as name, address, bank account number, or phone number.
    */
  def containsPiiEntities(): Request[ContainsPiiEntitiesResponse, AWSError] = js.native
  def containsPiiEntities(callback: js.Function2[/* err */ AWSError, /* data */ ContainsPiiEntitiesResponse, Unit]): Request[ContainsPiiEntitiesResponse, AWSError] = js.native
  /**
    * Analyzes input text for the presence of personally identifiable information (PII) and returns the labels of identified PII entity types such as name, address, bank account number, or phone number.
    */
  def containsPiiEntities(params: ContainsPiiEntitiesRequest): Request[ContainsPiiEntitiesResponse, AWSError] = js.native
  def containsPiiEntities(
    params: ContainsPiiEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ContainsPiiEntitiesResponse, Unit]
  ): Request[ContainsPiiEntitiesResponse, AWSError] = js.native
  
  /**
    * Creates a dataset to upload training or test data for a model associated with a flywheel. For more information about datasets, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates a dataset to upload training or test data for a model associated with a flywheel. For more information about datasets, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    * Creates a new document classifier that you can use to categorize documents. To create a classifier, you provide a set of training documents that are labeled with the categories that you want to use. For more information, see Training classifier models in the Comprehend Developer Guide. 
    */
  def createDocumentClassifier(): Request[CreateDocumentClassifierResponse, AWSError] = js.native
  def createDocumentClassifier(callback: js.Function2[/* err */ AWSError, /* data */ CreateDocumentClassifierResponse, Unit]): Request[CreateDocumentClassifierResponse, AWSError] = js.native
  /**
    * Creates a new document classifier that you can use to categorize documents. To create a classifier, you provide a set of training documents that are labeled with the categories that you want to use. For more information, see Training classifier models in the Comprehend Developer Guide. 
    */
  def createDocumentClassifier(params: CreateDocumentClassifierRequest): Request[CreateDocumentClassifierResponse, AWSError] = js.native
  def createDocumentClassifier(
    params: CreateDocumentClassifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDocumentClassifierResponse, Unit]
  ): Request[CreateDocumentClassifierResponse, AWSError] = js.native
  
  /**
    * Creates a model-specific endpoint for synchronous inference for a previously trained custom model For information about endpoints, see Managing endpoints.
    */
  def createEndpoint(): Request[CreateEndpointResponse, AWSError] = js.native
  def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]): Request[CreateEndpointResponse, AWSError] = js.native
  /**
    * Creates a model-specific endpoint for synchronous inference for a previously trained custom model For information about endpoints, see Managing endpoints.
    */
  def createEndpoint(params: CreateEndpointRequest): Request[CreateEndpointResponse, AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]
  ): Request[CreateEndpointResponse, AWSError] = js.native
  
  /**
    * Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is submitted, you can check job status using the DescribeEntityRecognizer API. 
    */
  def createEntityRecognizer(): Request[CreateEntityRecognizerResponse, AWSError] = js.native
  def createEntityRecognizer(callback: js.Function2[/* err */ AWSError, /* data */ CreateEntityRecognizerResponse, Unit]): Request[CreateEntityRecognizerResponse, AWSError] = js.native
  /**
    * Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is submitted, you can check job status using the DescribeEntityRecognizer API. 
    */
  def createEntityRecognizer(params: CreateEntityRecognizerRequest): Request[CreateEntityRecognizerResponse, AWSError] = js.native
  def createEntityRecognizer(
    params: CreateEntityRecognizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEntityRecognizerResponse, Unit]
  ): Request[CreateEntityRecognizerResponse, AWSError] = js.native
  
  /**
    * A flywheel is an Amazon Web Services resource that orchestrates the ongoing training of a model for custom classification or custom entity recognition. You can create a flywheel to start with an existing trained model, or Comprehend can create and train a new model. When you create the flywheel, Comprehend creates a data lake in your account. The data lake holds the training data and test data for all versions of the model. To use a flywheel with an existing trained model, you specify the active model version. Comprehend copies the model's training data and test data into the flywheel's data lake. To use the flywheel with a new model, you need to provide a dataset for training data (and optional test data) when you create the flywheel. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def createFlywheel(): Request[CreateFlywheelResponse, AWSError] = js.native
  def createFlywheel(callback: js.Function2[/* err */ AWSError, /* data */ CreateFlywheelResponse, Unit]): Request[CreateFlywheelResponse, AWSError] = js.native
  /**
    * A flywheel is an Amazon Web Services resource that orchestrates the ongoing training of a model for custom classification or custom entity recognition. You can create a flywheel to start with an existing trained model, or Comprehend can create and train a new model. When you create the flywheel, Comprehend creates a data lake in your account. The data lake holds the training data and test data for all versions of the model. To use a flywheel with an existing trained model, you specify the active model version. Comprehend copies the model's training data and test data into the flywheel's data lake. To use the flywheel with a new model, you need to provide a dataset for training data (and optional test data) when you create the flywheel. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def createFlywheel(params: CreateFlywheelRequest): Request[CreateFlywheelResponse, AWSError] = js.native
  def createFlywheel(
    params: CreateFlywheelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFlywheelResponse, Unit]
  ): Request[CreateFlywheelResponse, AWSError] = js.native
  
  /**
    * Deletes a previously created document classifier Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a background job. Once removed, the classifier disappears from your account and is no longer available for use. 
    */
  def deleteDocumentClassifier(): Request[DeleteDocumentClassifierResponse, AWSError] = js.native
  def deleteDocumentClassifier(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDocumentClassifierResponse, Unit]): Request[DeleteDocumentClassifierResponse, AWSError] = js.native
  /**
    * Deletes a previously created document classifier Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a background job. Once removed, the classifier disappears from your account and is no longer available for use. 
    */
  def deleteDocumentClassifier(params: DeleteDocumentClassifierRequest): Request[DeleteDocumentClassifierResponse, AWSError] = js.native
  def deleteDocumentClassifier(
    params: DeleteDocumentClassifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDocumentClassifierResponse, Unit]
  ): Request[DeleteDocumentClassifierResponse, AWSError] = js.native
  
  /**
    * Deletes a model-specific endpoint for a previously-trained custom model. All endpoints must be deleted in order for the model to be deleted. For information about endpoints, see Managing endpoints.
    */
  def deleteEndpoint(): Request[DeleteEndpointResponse, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointResponse, Unit]): Request[DeleteEndpointResponse, AWSError] = js.native
  /**
    * Deletes a model-specific endpoint for a previously-trained custom model. All endpoints must be deleted in order for the model to be deleted. For information about endpoints, see Managing endpoints.
    */
  def deleteEndpoint(params: DeleteEndpointRequest): Request[DeleteEndpointResponse, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointResponse, Unit]
  ): Request[DeleteEndpointResponse, AWSError] = js.native
  
  /**
    * Deletes an entity recognizer. Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a background job. Once removed, the recognizer disappears from your account and is no longer available for use. 
    */
  def deleteEntityRecognizer(): Request[DeleteEntityRecognizerResponse, AWSError] = js.native
  def deleteEntityRecognizer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEntityRecognizerResponse, Unit]): Request[DeleteEntityRecognizerResponse, AWSError] = js.native
  /**
    * Deletes an entity recognizer. Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a background job. Once removed, the recognizer disappears from your account and is no longer available for use. 
    */
  def deleteEntityRecognizer(params: DeleteEntityRecognizerRequest): Request[DeleteEntityRecognizerResponse, AWSError] = js.native
  def deleteEntityRecognizer(
    params: DeleteEntityRecognizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEntityRecognizerResponse, Unit]
  ): Request[DeleteEntityRecognizerResponse, AWSError] = js.native
  
  /**
    * Deletes a flywheel. When you delete the flywheel, Amazon Comprehend does not delete the data lake or the model associated with the flywheel. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def deleteFlywheel(): Request[DeleteFlywheelResponse, AWSError] = js.native
  def deleteFlywheel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlywheelResponse, Unit]): Request[DeleteFlywheelResponse, AWSError] = js.native
  /**
    * Deletes a flywheel. When you delete the flywheel, Amazon Comprehend does not delete the data lake or the model associated with the flywheel. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def deleteFlywheel(params: DeleteFlywheelRequest): Request[DeleteFlywheelResponse, AWSError] = js.native
  def deleteFlywheel(
    params: DeleteFlywheelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlywheelResponse, Unit]
  ): Request[DeleteFlywheelResponse, AWSError] = js.native
  
  /**
    * Deletes a resource-based policy that is attached to a custom model.
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  /**
    * Deletes a resource-based policy that is attached to a custom model.
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]
  ): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Returns information about the dataset that you specify. For more information about datasets, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Returns information about the dataset that you specify. For more information about datasets, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with a document classification job. Use this operation to get the status of a classification job.
    */
  def describeDocumentClassificationJob(): Request[DescribeDocumentClassificationJobResponse, AWSError] = js.native
  def describeDocumentClassificationJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentClassificationJobResponse, Unit]
  ): Request[DescribeDocumentClassificationJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a document classification job. Use this operation to get the status of a classification job.
    */
  def describeDocumentClassificationJob(params: DescribeDocumentClassificationJobRequest): Request[DescribeDocumentClassificationJobResponse, AWSError] = js.native
  def describeDocumentClassificationJob(
    params: DescribeDocumentClassificationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentClassificationJobResponse, Unit]
  ): Request[DescribeDocumentClassificationJobResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with a document classifier.
    */
  def describeDocumentClassifier(): Request[DescribeDocumentClassifierResponse, AWSError] = js.native
  def describeDocumentClassifier(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentClassifierResponse, Unit]): Request[DescribeDocumentClassifierResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a document classifier.
    */
  def describeDocumentClassifier(params: DescribeDocumentClassifierRequest): Request[DescribeDocumentClassifierResponse, AWSError] = js.native
  def describeDocumentClassifier(
    params: DescribeDocumentClassifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDocumentClassifierResponse, Unit]
  ): Request[DescribeDocumentClassifierResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
    */
  def describeDominantLanguageDetectionJob(): Request[DescribeDominantLanguageDetectionJobResponse, AWSError] = js.native
  def describeDominantLanguageDetectionJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDominantLanguageDetectionJobResponse, Unit]
  ): Request[DescribeDominantLanguageDetectionJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
    */
  def describeDominantLanguageDetectionJob(params: DescribeDominantLanguageDetectionJobRequest): Request[DescribeDominantLanguageDetectionJobResponse, AWSError] = js.native
  def describeDominantLanguageDetectionJob(
    params: DescribeDominantLanguageDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDominantLanguageDetectionJobResponse, Unit]
  ): Request[DescribeDominantLanguageDetectionJobResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with a specific endpoint. Use this operation to get the status of an endpoint. For information about endpoints, see Managing endpoints.
    */
  def describeEndpoint(): Request[DescribeEndpointResponse, AWSError] = js.native
  def describeEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointResponse, Unit]): Request[DescribeEndpointResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a specific endpoint. Use this operation to get the status of an endpoint. For information about endpoints, see Managing endpoints.
    */
  def describeEndpoint(params: DescribeEndpointRequest): Request[DescribeEndpointResponse, AWSError] = js.native
  def describeEndpoint(
    params: DescribeEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointResponse, Unit]
  ): Request[DescribeEndpointResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
    */
  def describeEntitiesDetectionJob(): Request[DescribeEntitiesDetectionJobResponse, AWSError] = js.native
  def describeEntitiesDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntitiesDetectionJobResponse, Unit]): Request[DescribeEntitiesDetectionJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
    */
  def describeEntitiesDetectionJob(params: DescribeEntitiesDetectionJobRequest): Request[DescribeEntitiesDetectionJobResponse, AWSError] = js.native
  def describeEntitiesDetectionJob(
    params: DescribeEntitiesDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntitiesDetectionJobResponse, Unit]
  ): Request[DescribeEntitiesDetectionJobResponse, AWSError] = js.native
  
  /**
    * Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer metadata, metrics, and so on.
    */
  def describeEntityRecognizer(): Request[DescribeEntityRecognizerResponse, AWSError] = js.native
  def describeEntityRecognizer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityRecognizerResponse, Unit]): Request[DescribeEntityRecognizerResponse, AWSError] = js.native
  /**
    * Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer metadata, metrics, and so on.
    */
  def describeEntityRecognizer(params: DescribeEntityRecognizerRequest): Request[DescribeEntityRecognizerResponse, AWSError] = js.native
  def describeEntityRecognizer(
    params: DescribeEntityRecognizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityRecognizerResponse, Unit]
  ): Request[DescribeEntityRecognizerResponse, AWSError] = js.native
  
  /**
    * Gets the status and details of an events detection job.
    */
  def describeEventsDetectionJob(): Request[DescribeEventsDetectionJobResponse, AWSError] = js.native
  def describeEventsDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsDetectionJobResponse, Unit]): Request[DescribeEventsDetectionJobResponse, AWSError] = js.native
  /**
    * Gets the status and details of an events detection job.
    */
  def describeEventsDetectionJob(params: DescribeEventsDetectionJobRequest): Request[DescribeEventsDetectionJobResponse, AWSError] = js.native
  def describeEventsDetectionJob(
    params: DescribeEventsDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsDetectionJobResponse, Unit]
  ): Request[DescribeEventsDetectionJobResponse, AWSError] = js.native
  
  /**
    * Provides configuration information about the flywheel. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def describeFlywheel(): Request[DescribeFlywheelResponse, AWSError] = js.native
  def describeFlywheel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlywheelResponse, Unit]): Request[DescribeFlywheelResponse, AWSError] = js.native
  /**
    * Provides configuration information about the flywheel. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def describeFlywheel(params: DescribeFlywheelRequest): Request[DescribeFlywheelResponse, AWSError] = js.native
  def describeFlywheel(
    params: DescribeFlywheelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlywheelResponse, Unit]
  ): Request[DescribeFlywheelResponse, AWSError] = js.native
  
  /**
    * Retrieve the configuration properties of a flywheel iteration. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def describeFlywheelIteration(): Request[DescribeFlywheelIterationResponse, AWSError] = js.native
  def describeFlywheelIteration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlywheelIterationResponse, Unit]): Request[DescribeFlywheelIterationResponse, AWSError] = js.native
  /**
    * Retrieve the configuration properties of a flywheel iteration. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def describeFlywheelIteration(params: DescribeFlywheelIterationRequest): Request[DescribeFlywheelIterationResponse, AWSError] = js.native
  def describeFlywheelIteration(
    params: DescribeFlywheelIterationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlywheelIterationResponse, Unit]
  ): Request[DescribeFlywheelIterationResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
    */
  def describeKeyPhrasesDetectionJob(): Request[DescribeKeyPhrasesDetectionJobResponse, AWSError] = js.native
  def describeKeyPhrasesDetectionJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeKeyPhrasesDetectionJobResponse, Unit]
  ): Request[DescribeKeyPhrasesDetectionJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
    */
  def describeKeyPhrasesDetectionJob(params: DescribeKeyPhrasesDetectionJobRequest): Request[DescribeKeyPhrasesDetectionJobResponse, AWSError] = js.native
  def describeKeyPhrasesDetectionJob(
    params: DescribeKeyPhrasesDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeKeyPhrasesDetectionJobResponse, Unit]
  ): Request[DescribeKeyPhrasesDetectionJobResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with a PII entities detection job. For example, you can use this operation to get the job status.
    */
  def describePiiEntitiesDetectionJob(): Request[DescribePiiEntitiesDetectionJobResponse, AWSError] = js.native
  def describePiiEntitiesDetectionJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePiiEntitiesDetectionJobResponse, Unit]
  ): Request[DescribePiiEntitiesDetectionJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a PII entities detection job. For example, you can use this operation to get the job status.
    */
  def describePiiEntitiesDetectionJob(params: DescribePiiEntitiesDetectionJobRequest): Request[DescribePiiEntitiesDetectionJobResponse, AWSError] = js.native
  def describePiiEntitiesDetectionJob(
    params: DescribePiiEntitiesDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePiiEntitiesDetectionJobResponse, Unit]
  ): Request[DescribePiiEntitiesDetectionJobResponse, AWSError] = js.native
  
  /**
    * Gets the details of a resource-based policy that is attached to a custom model, including the JSON body of the policy.
    */
  def describeResourcePolicy(): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  def describeResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePolicyResponse, Unit]): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  /**
    * Gets the details of a resource-based policy that is attached to a custom model, including the JSON body of the policy.
    */
  def describeResourcePolicy(params: DescribeResourcePolicyRequest): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  def describeResourcePolicy(
    params: DescribeResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePolicyResponse, Unit]
  ): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
    */
  def describeSentimentDetectionJob(): Request[DescribeSentimentDetectionJobResponse, AWSError] = js.native
  def describeSentimentDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSentimentDetectionJobResponse, Unit]): Request[DescribeSentimentDetectionJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
    */
  def describeSentimentDetectionJob(params: DescribeSentimentDetectionJobRequest): Request[DescribeSentimentDetectionJobResponse, AWSError] = js.native
  def describeSentimentDetectionJob(
    params: DescribeSentimentDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSentimentDetectionJobResponse, Unit]
  ): Request[DescribeSentimentDetectionJobResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with a targeted sentiment detection job. Use this operation to get the status of the job.
    */
  def describeTargetedSentimentDetectionJob(): Request[DescribeTargetedSentimentDetectionJobResponse, AWSError] = js.native
  def describeTargetedSentimentDetectionJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetedSentimentDetectionJobResponse, Unit]
  ): Request[DescribeTargetedSentimentDetectionJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a targeted sentiment detection job. Use this operation to get the status of the job.
    */
  def describeTargetedSentimentDetectionJob(params: DescribeTargetedSentimentDetectionJobRequest): Request[DescribeTargetedSentimentDetectionJobResponse, AWSError] = js.native
  def describeTargetedSentimentDetectionJob(
    params: DescribeTargetedSentimentDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTargetedSentimentDetectionJobResponse, Unit]
  ): Request[DescribeTargetedSentimentDetectionJobResponse, AWSError] = js.native
  
  /**
    * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
    */
  def describeTopicsDetectionJob(): Request[DescribeTopicsDetectionJobResponse, AWSError] = js.native
  def describeTopicsDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicsDetectionJobResponse, Unit]): Request[DescribeTopicsDetectionJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
    */
  def describeTopicsDetectionJob(params: DescribeTopicsDetectionJobRequest): Request[DescribeTopicsDetectionJobResponse, AWSError] = js.native
  def describeTopicsDetectionJob(
    params: DescribeTopicsDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicsDetectionJobResponse, Unit]
  ): Request[DescribeTopicsDetectionJobResponse, AWSError] = js.native
  
  /**
    * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def detectDominantLanguage(): Request[DetectDominantLanguageResponse, AWSError] = js.native
  def detectDominantLanguage(callback: js.Function2[/* err */ AWSError, /* data */ DetectDominantLanguageResponse, Unit]): Request[DetectDominantLanguageResponse, AWSError] = js.native
  /**
    * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def detectDominantLanguage(params: DetectDominantLanguageRequest): Request[DetectDominantLanguageResponse, AWSError] = js.native
  def detectDominantLanguage(
    params: DetectDominantLanguageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectDominantLanguageResponse, Unit]
  ): Request[DetectDominantLanguageResponse, AWSError] = js.native
  
  /**
    * Detects named entities in input text when you use the pre-trained model. Detects custom entities if you have a custom entity recognition model.   When detecting named entities using the pre-trained model, use plain text as the input. For more information about named entities, see Entities in the Comprehend Developer Guide. When you use a custom entity recognition model, you can input plain text or you can upload a single-page input document (text, PDF, Word, or image).  If the system detects errors while processing a page in the input document, the API response includes an entry in Errors for each error.  If the system detects a document-level error in your input document, the API returns an InvalidRequestException error response. For details about this exception, see  Errors in semi-structured documents in the Comprehend Developer Guide. 
    */
  def detectEntities(): Request[DetectEntitiesResponse, AWSError] = js.native
  def detectEntities(callback: js.Function2[/* err */ AWSError, /* data */ DetectEntitiesResponse, Unit]): Request[DetectEntitiesResponse, AWSError] = js.native
  /**
    * Detects named entities in input text when you use the pre-trained model. Detects custom entities if you have a custom entity recognition model.   When detecting named entities using the pre-trained model, use plain text as the input. For more information about named entities, see Entities in the Comprehend Developer Guide. When you use a custom entity recognition model, you can input plain text or you can upload a single-page input document (text, PDF, Word, or image).  If the system detects errors while processing a page in the input document, the API response includes an entry in Errors for each error.  If the system detects a document-level error in your input document, the API returns an InvalidRequestException error response. For details about this exception, see  Errors in semi-structured documents in the Comprehend Developer Guide. 
    */
  def detectEntities(params: DetectEntitiesRequest): Request[DetectEntitiesResponse, AWSError] = js.native
  def detectEntities(
    params: DetectEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectEntitiesResponse, Unit]
  ): Request[DetectEntitiesResponse, AWSError] = js.native
  
  /**
    * Detects the key noun phrases found in the text. 
    */
  def detectKeyPhrases(): Request[DetectKeyPhrasesResponse, AWSError] = js.native
  def detectKeyPhrases(callback: js.Function2[/* err */ AWSError, /* data */ DetectKeyPhrasesResponse, Unit]): Request[DetectKeyPhrasesResponse, AWSError] = js.native
  /**
    * Detects the key noun phrases found in the text. 
    */
  def detectKeyPhrases(params: DetectKeyPhrasesRequest): Request[DetectKeyPhrasesResponse, AWSError] = js.native
  def detectKeyPhrases(
    params: DetectKeyPhrasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectKeyPhrasesResponse, Unit]
  ): Request[DetectKeyPhrasesResponse, AWSError] = js.native
  
  /**
    * Inspects the input text for entities that contain personally identifiable information (PII) and returns information about them.
    */
  def detectPiiEntities(): Request[DetectPiiEntitiesResponse, AWSError] = js.native
  def detectPiiEntities(callback: js.Function2[/* err */ AWSError, /* data */ DetectPiiEntitiesResponse, Unit]): Request[DetectPiiEntitiesResponse, AWSError] = js.native
  /**
    * Inspects the input text for entities that contain personally identifiable information (PII) and returns information about them.
    */
  def detectPiiEntities(params: DetectPiiEntitiesRequest): Request[DetectPiiEntitiesResponse, AWSError] = js.native
  def detectPiiEntities(
    params: DetectPiiEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectPiiEntitiesResponse, Unit]
  ): Request[DetectPiiEntitiesResponse, AWSError] = js.native
  
  /**
    * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
    */
  def detectSentiment(): Request[DetectSentimentResponse, AWSError] = js.native
  def detectSentiment(callback: js.Function2[/* err */ AWSError, /* data */ DetectSentimentResponse, Unit]): Request[DetectSentimentResponse, AWSError] = js.native
  /**
    * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
    */
  def detectSentiment(params: DetectSentimentRequest): Request[DetectSentimentResponse, AWSError] = js.native
  def detectSentiment(
    params: DetectSentimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectSentimentResponse, Unit]
  ): Request[DetectSentimentResponse, AWSError] = js.native
  
  /**
    * Inspects text for syntax and the part of speech of words in the document. For more information, see Syntax in the Comprehend Developer Guide. 
    */
  def detectSyntax(): Request[DetectSyntaxResponse, AWSError] = js.native
  def detectSyntax(callback: js.Function2[/* err */ AWSError, /* data */ DetectSyntaxResponse, Unit]): Request[DetectSyntaxResponse, AWSError] = js.native
  /**
    * Inspects text for syntax and the part of speech of words in the document. For more information, see Syntax in the Comprehend Developer Guide. 
    */
  def detectSyntax(params: DetectSyntaxRequest): Request[DetectSyntaxResponse, AWSError] = js.native
  def detectSyntax(
    params: DetectSyntaxRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectSyntaxResponse, Unit]
  ): Request[DetectSyntaxResponse, AWSError] = js.native
  
  /**
    * Inspects the input text and returns a sentiment analysis for each entity identified in the text. For more information about targeted sentiment, see Targeted sentiment.
    */
  def detectTargetedSentiment(): Request[DetectTargetedSentimentResponse, AWSError] = js.native
  def detectTargetedSentiment(callback: js.Function2[/* err */ AWSError, /* data */ DetectTargetedSentimentResponse, Unit]): Request[DetectTargetedSentimentResponse, AWSError] = js.native
  /**
    * Inspects the input text and returns a sentiment analysis for each entity identified in the text. For more information about targeted sentiment, see Targeted sentiment.
    */
  def detectTargetedSentiment(params: DetectTargetedSentimentRequest): Request[DetectTargetedSentimentResponse, AWSError] = js.native
  def detectTargetedSentiment(
    params: DetectTargetedSentimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectTargetedSentimentResponse, Unit]
  ): Request[DetectTargetedSentimentResponse, AWSError] = js.native
  
  /**
    * Creates a new custom model that replicates a source custom model that you import. The source model can be in your Amazon Web Services account or another one. If the source model is in another Amazon Web Services account, then it must have a resource-based policy that authorizes you to import it. The source model must be in the same Amazon Web Services Region that you're using when you import. You can't import a model that's in a different Region.
    */
  def importModel(): Request[ImportModelResponse, AWSError] = js.native
  def importModel(callback: js.Function2[/* err */ AWSError, /* data */ ImportModelResponse, Unit]): Request[ImportModelResponse, AWSError] = js.native
  /**
    * Creates a new custom model that replicates a source custom model that you import. The source model can be in your Amazon Web Services account or another one. If the source model is in another Amazon Web Services account, then it must have a resource-based policy that authorizes you to import it. The source model must be in the same Amazon Web Services Region that you're using when you import. You can't import a model that's in a different Region.
    */
  def importModel(params: ImportModelRequest): Request[ImportModelResponse, AWSError] = js.native
  def importModel(
    params: ImportModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportModelResponse, Unit]
  ): Request[ImportModelResponse, AWSError] = js.native
  
  /**
    * List the datasets that you have configured in this Region. For more information about datasets, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * List the datasets that you have configured in this Region. For more information about datasets, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the documentation classification jobs that you have submitted.
    */
  def listDocumentClassificationJobs(): Request[ListDocumentClassificationJobsResponse, AWSError] = js.native
  def listDocumentClassificationJobs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentClassificationJobsResponse, Unit]
  ): Request[ListDocumentClassificationJobsResponse, AWSError] = js.native
  /**
    * Gets a list of the documentation classification jobs that you have submitted.
    */
  def listDocumentClassificationJobs(params: ListDocumentClassificationJobsRequest): Request[ListDocumentClassificationJobsResponse, AWSError] = js.native
  def listDocumentClassificationJobs(
    params: ListDocumentClassificationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentClassificationJobsResponse, Unit]
  ): Request[ListDocumentClassificationJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of summaries of the document classifiers that you have created
    */
  def listDocumentClassifierSummaries(): Request[ListDocumentClassifierSummariesResponse, AWSError] = js.native
  def listDocumentClassifierSummaries(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentClassifierSummariesResponse, Unit]
  ): Request[ListDocumentClassifierSummariesResponse, AWSError] = js.native
  /**
    * Gets a list of summaries of the document classifiers that you have created
    */
  def listDocumentClassifierSummaries(params: ListDocumentClassifierSummariesRequest): Request[ListDocumentClassifierSummariesResponse, AWSError] = js.native
  def listDocumentClassifierSummaries(
    params: ListDocumentClassifierSummariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentClassifierSummariesResponse, Unit]
  ): Request[ListDocumentClassifierSummariesResponse, AWSError] = js.native
  
  /**
    * Gets a list of the document classifiers that you have created.
    */
  def listDocumentClassifiers(): Request[ListDocumentClassifiersResponse, AWSError] = js.native
  def listDocumentClassifiers(callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentClassifiersResponse, Unit]): Request[ListDocumentClassifiersResponse, AWSError] = js.native
  /**
    * Gets a list of the document classifiers that you have created.
    */
  def listDocumentClassifiers(params: ListDocumentClassifiersRequest): Request[ListDocumentClassifiersResponse, AWSError] = js.native
  def listDocumentClassifiers(
    params: ListDocumentClassifiersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDocumentClassifiersResponse, Unit]
  ): Request[ListDocumentClassifiersResponse, AWSError] = js.native
  
  /**
    * Gets a list of the dominant language detection jobs that you have submitted.
    */
  def listDominantLanguageDetectionJobs(): Request[ListDominantLanguageDetectionJobsResponse, AWSError] = js.native
  def listDominantLanguageDetectionJobs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDominantLanguageDetectionJobsResponse, Unit]
  ): Request[ListDominantLanguageDetectionJobsResponse, AWSError] = js.native
  /**
    * Gets a list of the dominant language detection jobs that you have submitted.
    */
  def listDominantLanguageDetectionJobs(params: ListDominantLanguageDetectionJobsRequest): Request[ListDominantLanguageDetectionJobsResponse, AWSError] = js.native
  def listDominantLanguageDetectionJobs(
    params: ListDominantLanguageDetectionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDominantLanguageDetectionJobsResponse, Unit]
  ): Request[ListDominantLanguageDetectionJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of all existing endpoints that you've created. For information about endpoints, see Managing endpoints.
    */
  def listEndpoints(): Request[ListEndpointsResponse, AWSError] = js.native
  def listEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsResponse, Unit]): Request[ListEndpointsResponse, AWSError] = js.native
  /**
    * Gets a list of all existing endpoints that you've created. For information about endpoints, see Managing endpoints.
    */
  def listEndpoints(params: ListEndpointsRequest): Request[ListEndpointsResponse, AWSError] = js.native
  def listEndpoints(
    params: ListEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsResponse, Unit]
  ): Request[ListEndpointsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the entity detection jobs that you have submitted.
    */
  def listEntitiesDetectionJobs(): Request[ListEntitiesDetectionJobsResponse, AWSError] = js.native
  def listEntitiesDetectionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesDetectionJobsResponse, Unit]): Request[ListEntitiesDetectionJobsResponse, AWSError] = js.native
  /**
    * Gets a list of the entity detection jobs that you have submitted.
    */
  def listEntitiesDetectionJobs(params: ListEntitiesDetectionJobsRequest): Request[ListEntitiesDetectionJobsResponse, AWSError] = js.native
  def listEntitiesDetectionJobs(
    params: ListEntitiesDetectionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesDetectionJobsResponse, Unit]
  ): Request[ListEntitiesDetectionJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of summaries for the entity recognizers that you have created.
    */
  def listEntityRecognizerSummaries(): Request[ListEntityRecognizerSummariesResponse, AWSError] = js.native
  def listEntityRecognizerSummaries(callback: js.Function2[/* err */ AWSError, /* data */ ListEntityRecognizerSummariesResponse, Unit]): Request[ListEntityRecognizerSummariesResponse, AWSError] = js.native
  /**
    * Gets a list of summaries for the entity recognizers that you have created.
    */
  def listEntityRecognizerSummaries(params: ListEntityRecognizerSummariesRequest): Request[ListEntityRecognizerSummariesResponse, AWSError] = js.native
  def listEntityRecognizerSummaries(
    params: ListEntityRecognizerSummariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntityRecognizerSummariesResponse, Unit]
  ): Request[ListEntityRecognizerSummariesResponse, AWSError] = js.native
  
  /**
    * Gets a list of the properties of all entity recognizers that you created, including recognizers currently in training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list. The results of this list are not in any particular order. Please get the list and sort locally if needed.
    */
  def listEntityRecognizers(): Request[ListEntityRecognizersResponse, AWSError] = js.native
  def listEntityRecognizers(callback: js.Function2[/* err */ AWSError, /* data */ ListEntityRecognizersResponse, Unit]): Request[ListEntityRecognizersResponse, AWSError] = js.native
  /**
    * Gets a list of the properties of all entity recognizers that you created, including recognizers currently in training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list. The results of this list are not in any particular order. Please get the list and sort locally if needed.
    */
  def listEntityRecognizers(params: ListEntityRecognizersRequest): Request[ListEntityRecognizersResponse, AWSError] = js.native
  def listEntityRecognizers(
    params: ListEntityRecognizersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntityRecognizersResponse, Unit]
  ): Request[ListEntityRecognizersResponse, AWSError] = js.native
  
  /**
    * Gets a list of the events detection jobs that you have submitted.
    */
  def listEventsDetectionJobs(): Request[ListEventsDetectionJobsResponse, AWSError] = js.native
  def listEventsDetectionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListEventsDetectionJobsResponse, Unit]): Request[ListEventsDetectionJobsResponse, AWSError] = js.native
  /**
    * Gets a list of the events detection jobs that you have submitted.
    */
  def listEventsDetectionJobs(params: ListEventsDetectionJobsRequest): Request[ListEventsDetectionJobsResponse, AWSError] = js.native
  def listEventsDetectionJobs(
    params: ListEventsDetectionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventsDetectionJobsResponse, Unit]
  ): Request[ListEventsDetectionJobsResponse, AWSError] = js.native
  
  /**
    * Information about the history of a flywheel iteration. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def listFlywheelIterationHistory(): Request[ListFlywheelIterationHistoryResponse, AWSError] = js.native
  def listFlywheelIterationHistory(callback: js.Function2[/* err */ AWSError, /* data */ ListFlywheelIterationHistoryResponse, Unit]): Request[ListFlywheelIterationHistoryResponse, AWSError] = js.native
  /**
    * Information about the history of a flywheel iteration. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def listFlywheelIterationHistory(params: ListFlywheelIterationHistoryRequest): Request[ListFlywheelIterationHistoryResponse, AWSError] = js.native
  def listFlywheelIterationHistory(
    params: ListFlywheelIterationHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFlywheelIterationHistoryResponse, Unit]
  ): Request[ListFlywheelIterationHistoryResponse, AWSError] = js.native
  
  /**
    * Gets a list of the flywheels that you have created.
    */
  def listFlywheels(): Request[ListFlywheelsResponse, AWSError] = js.native
  def listFlywheels(callback: js.Function2[/* err */ AWSError, /* data */ ListFlywheelsResponse, Unit]): Request[ListFlywheelsResponse, AWSError] = js.native
  /**
    * Gets a list of the flywheels that you have created.
    */
  def listFlywheels(params: ListFlywheelsRequest): Request[ListFlywheelsResponse, AWSError] = js.native
  def listFlywheels(
    params: ListFlywheelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFlywheelsResponse, Unit]
  ): Request[ListFlywheelsResponse, AWSError] = js.native
  
  /**
    * Get a list of key phrase detection jobs that you have submitted.
    */
  def listKeyPhrasesDetectionJobs(): Request[ListKeyPhrasesDetectionJobsResponse, AWSError] = js.native
  def listKeyPhrasesDetectionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListKeyPhrasesDetectionJobsResponse, Unit]): Request[ListKeyPhrasesDetectionJobsResponse, AWSError] = js.native
  /**
    * Get a list of key phrase detection jobs that you have submitted.
    */
  def listKeyPhrasesDetectionJobs(params: ListKeyPhrasesDetectionJobsRequest): Request[ListKeyPhrasesDetectionJobsResponse, AWSError] = js.native
  def listKeyPhrasesDetectionJobs(
    params: ListKeyPhrasesDetectionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListKeyPhrasesDetectionJobsResponse, Unit]
  ): Request[ListKeyPhrasesDetectionJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the PII entity detection jobs that you have submitted.
    */
  def listPiiEntitiesDetectionJobs(): Request[ListPiiEntitiesDetectionJobsResponse, AWSError] = js.native
  def listPiiEntitiesDetectionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListPiiEntitiesDetectionJobsResponse, Unit]): Request[ListPiiEntitiesDetectionJobsResponse, AWSError] = js.native
  /**
    * Gets a list of the PII entity detection jobs that you have submitted.
    */
  def listPiiEntitiesDetectionJobs(params: ListPiiEntitiesDetectionJobsRequest): Request[ListPiiEntitiesDetectionJobsResponse, AWSError] = js.native
  def listPiiEntitiesDetectionJobs(
    params: ListPiiEntitiesDetectionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPiiEntitiesDetectionJobsResponse, Unit]
  ): Request[ListPiiEntitiesDetectionJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of sentiment detection jobs that you have submitted.
    */
  def listSentimentDetectionJobs(): Request[ListSentimentDetectionJobsResponse, AWSError] = js.native
  def listSentimentDetectionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListSentimentDetectionJobsResponse, Unit]): Request[ListSentimentDetectionJobsResponse, AWSError] = js.native
  /**
    * Gets a list of sentiment detection jobs that you have submitted.
    */
  def listSentimentDetectionJobs(params: ListSentimentDetectionJobsRequest): Request[ListSentimentDetectionJobsResponse, AWSError] = js.native
  def listSentimentDetectionJobs(
    params: ListSentimentDetectionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSentimentDetectionJobsResponse, Unit]
  ): Request[ListSentimentDetectionJobsResponse, AWSError] = js.native
  
  /**
    * Lists all tags associated with a given Amazon Comprehend resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags associated with a given Amazon Comprehend resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Gets a list of targeted sentiment detection jobs that you have submitted.
    */
  def listTargetedSentimentDetectionJobs(): Request[ListTargetedSentimentDetectionJobsResponse, AWSError] = js.native
  def listTargetedSentimentDetectionJobs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListTargetedSentimentDetectionJobsResponse, Unit]
  ): Request[ListTargetedSentimentDetectionJobsResponse, AWSError] = js.native
  /**
    * Gets a list of targeted sentiment detection jobs that you have submitted.
    */
  def listTargetedSentimentDetectionJobs(params: ListTargetedSentimentDetectionJobsRequest): Request[ListTargetedSentimentDetectionJobsResponse, AWSError] = js.native
  def listTargetedSentimentDetectionJobs(
    params: ListTargetedSentimentDetectionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTargetedSentimentDetectionJobsResponse, Unit]
  ): Request[ListTargetedSentimentDetectionJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the topic detection jobs that you have submitted.
    */
  def listTopicsDetectionJobs(): Request[ListTopicsDetectionJobsResponse, AWSError] = js.native
  def listTopicsDetectionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTopicsDetectionJobsResponse, Unit]): Request[ListTopicsDetectionJobsResponse, AWSError] = js.native
  /**
    * Gets a list of the topic detection jobs that you have submitted.
    */
  def listTopicsDetectionJobs(params: ListTopicsDetectionJobsRequest): Request[ListTopicsDetectionJobsResponse, AWSError] = js.native
  def listTopicsDetectionJobs(
    params: ListTopicsDetectionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTopicsDetectionJobsResponse, Unit]
  ): Request[ListTopicsDetectionJobsResponse, AWSError] = js.native
  
  /**
    * Attaches a resource-based policy to a custom model. You can use this policy to authorize an entity in another Amazon Web Services account to import the custom model, which replicates it in Amazon Comprehend in their account.
    */
  def putResourcePolicy(): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]): Request[PutResourcePolicyResponse, AWSError] = js.native
  /**
    * Attaches a resource-based policy to a custom model. You can use this policy to authorize an entity in another Amazon Web Services account to import the custom model, which replicates it in Amazon Comprehend in their account.
    */
  def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]
  ): Request[PutResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous document classification job. Use the DescribeDocumentClassificationJob operation to track the progress of the job.
    */
  def startDocumentClassificationJob(): Request[StartDocumentClassificationJobResponse, AWSError] = js.native
  def startDocumentClassificationJob(
    callback: js.Function2[/* err */ AWSError, /* data */ StartDocumentClassificationJobResponse, Unit]
  ): Request[StartDocumentClassificationJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous document classification job. Use the DescribeDocumentClassificationJob operation to track the progress of the job.
    */
  def startDocumentClassificationJob(params: StartDocumentClassificationJobRequest): Request[StartDocumentClassificationJobResponse, AWSError] = js.native
  def startDocumentClassificationJob(
    params: StartDocumentClassificationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDocumentClassificationJobResponse, Unit]
  ): Request[StartDocumentClassificationJobResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startDominantLanguageDetectionJob(): Request[StartDominantLanguageDetectionJobResponse, AWSError] = js.native
  def startDominantLanguageDetectionJob(
    callback: js.Function2[/* err */ AWSError, /* data */ StartDominantLanguageDetectionJobResponse, Unit]
  ): Request[StartDominantLanguageDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startDominantLanguageDetectionJob(params: StartDominantLanguageDetectionJobRequest): Request[StartDominantLanguageDetectionJobResponse, AWSError] = js.native
  def startDominantLanguageDetectionJob(
    params: StartDominantLanguageDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDominantLanguageDetectionJobResponse, Unit]
  ): Request[StartDominantLanguageDetectionJobResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job. This API can be used for either standard entity detection or custom entity recognition. In order to be used for custom entity recognition, the optional EntityRecognizerArn must be used in order to provide access to the recognizer being used to detect the custom entity.
    */
  def startEntitiesDetectionJob(): Request[StartEntitiesDetectionJobResponse, AWSError] = js.native
  def startEntitiesDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartEntitiesDetectionJobResponse, Unit]): Request[StartEntitiesDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job. This API can be used for either standard entity detection or custom entity recognition. In order to be used for custom entity recognition, the optional EntityRecognizerArn must be used in order to provide access to the recognizer being used to detect the custom entity.
    */
  def startEntitiesDetectionJob(params: StartEntitiesDetectionJobRequest): Request[StartEntitiesDetectionJobResponse, AWSError] = js.native
  def startEntitiesDetectionJob(
    params: StartEntitiesDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartEntitiesDetectionJobResponse, Unit]
  ): Request[StartEntitiesDetectionJobResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous event detection job for a collection of documents.
    */
  def startEventsDetectionJob(): Request[StartEventsDetectionJobResponse, AWSError] = js.native
  def startEventsDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartEventsDetectionJobResponse, Unit]): Request[StartEventsDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous event detection job for a collection of documents.
    */
  def startEventsDetectionJob(params: StartEventsDetectionJobRequest): Request[StartEventsDetectionJobResponse, AWSError] = js.native
  def startEventsDetectionJob(
    params: StartEventsDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartEventsDetectionJobResponse, Unit]
  ): Request[StartEventsDetectionJobResponse, AWSError] = js.native
  
  /**
    * Start the flywheel iteration.This operation uses any new datasets to train a new model version. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def startFlywheelIteration(): Request[StartFlywheelIterationResponse, AWSError] = js.native
  def startFlywheelIteration(callback: js.Function2[/* err */ AWSError, /* data */ StartFlywheelIterationResponse, Unit]): Request[StartFlywheelIterationResponse, AWSError] = js.native
  /**
    * Start the flywheel iteration.This operation uses any new datasets to train a new model version. For more information about flywheels, see  Flywheel overview in the Amazon Comprehend Developer Guide.
    */
  def startFlywheelIteration(params: StartFlywheelIterationRequest): Request[StartFlywheelIterationResponse, AWSError] = js.native
  def startFlywheelIteration(
    params: StartFlywheelIterationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFlywheelIterationResponse, Unit]
  ): Request[StartFlywheelIterationResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startKeyPhrasesDetectionJob(): Request[StartKeyPhrasesDetectionJobResponse, AWSError] = js.native
  def startKeyPhrasesDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartKeyPhrasesDetectionJobResponse, Unit]): Request[StartKeyPhrasesDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startKeyPhrasesDetectionJob(params: StartKeyPhrasesDetectionJobRequest): Request[StartKeyPhrasesDetectionJobResponse, AWSError] = js.native
  def startKeyPhrasesDetectionJob(
    params: StartKeyPhrasesDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartKeyPhrasesDetectionJobResponse, Unit]
  ): Request[StartKeyPhrasesDetectionJobResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous PII entity detection job for a collection of documents.
    */
  def startPiiEntitiesDetectionJob(): Request[StartPiiEntitiesDetectionJobResponse, AWSError] = js.native
  def startPiiEntitiesDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartPiiEntitiesDetectionJobResponse, Unit]): Request[StartPiiEntitiesDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous PII entity detection job for a collection of documents.
    */
  def startPiiEntitiesDetectionJob(params: StartPiiEntitiesDetectionJobRequest): Request[StartPiiEntitiesDetectionJobResponse, AWSError] = js.native
  def startPiiEntitiesDetectionJob(
    params: StartPiiEntitiesDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartPiiEntitiesDetectionJobResponse, Unit]
  ): Request[StartPiiEntitiesDetectionJobResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous sentiment detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startSentimentDetectionJob(): Request[StartSentimentDetectionJobResponse, AWSError] = js.native
  def startSentimentDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartSentimentDetectionJobResponse, Unit]): Request[StartSentimentDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous sentiment detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startSentimentDetectionJob(params: StartSentimentDetectionJobRequest): Request[StartSentimentDetectionJobResponse, AWSError] = js.native
  def startSentimentDetectionJob(
    params: StartSentimentDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSentimentDetectionJobResponse, Unit]
  ): Request[StartSentimentDetectionJobResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous targeted sentiment detection job for a collection of documents. Use the DescribeTargetedSentimentDetectionJob operation to track the status of a job.
    */
  def startTargetedSentimentDetectionJob(): Request[StartTargetedSentimentDetectionJobResponse, AWSError] = js.native
  def startTargetedSentimentDetectionJob(
    callback: js.Function2[/* err */ AWSError, /* data */ StartTargetedSentimentDetectionJobResponse, Unit]
  ): Request[StartTargetedSentimentDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous targeted sentiment detection job for a collection of documents. Use the DescribeTargetedSentimentDetectionJob operation to track the status of a job.
    */
  def startTargetedSentimentDetectionJob(params: StartTargetedSentimentDetectionJobRequest): Request[StartTargetedSentimentDetectionJobResponse, AWSError] = js.native
  def startTargetedSentimentDetectionJob(
    params: StartTargetedSentimentDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTargetedSentimentDetectionJobResponse, Unit]
  ): Request[StartTargetedSentimentDetectionJobResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
    */
  def startTopicsDetectionJob(): Request[StartTopicsDetectionJobResponse, AWSError] = js.native
  def startTopicsDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartTopicsDetectionJobResponse, Unit]): Request[StartTopicsDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
    */
  def startTopicsDetectionJob(params: StartTopicsDetectionJobRequest): Request[StartTopicsDetectionJobResponse, AWSError] = js.native
  def startTopicsDetectionJob(
    params: StartTopicsDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTopicsDetectionJobResponse, Unit]
  ): Request[StartTopicsDetectionJobResponse, AWSError] = js.native
  
  /**
    * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopDominantLanguageDetectionJob(): Request[StopDominantLanguageDetectionJobResponse, AWSError] = js.native
  def stopDominantLanguageDetectionJob(
    callback: js.Function2[/* err */ AWSError, /* data */ StopDominantLanguageDetectionJobResponse, Unit]
  ): Request[StopDominantLanguageDetectionJobResponse, AWSError] = js.native
  /**
    * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopDominantLanguageDetectionJob(params: StopDominantLanguageDetectionJobRequest): Request[StopDominantLanguageDetectionJobResponse, AWSError] = js.native
  def stopDominantLanguageDetectionJob(
    params: StopDominantLanguageDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDominantLanguageDetectionJobResponse, Unit]
  ): Request[StopDominantLanguageDetectionJobResponse, AWSError] = js.native
  
  /**
    * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopEntitiesDetectionJob(): Request[StopEntitiesDetectionJobResponse, AWSError] = js.native
  def stopEntitiesDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StopEntitiesDetectionJobResponse, Unit]): Request[StopEntitiesDetectionJobResponse, AWSError] = js.native
  /**
    * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopEntitiesDetectionJob(params: StopEntitiesDetectionJobRequest): Request[StopEntitiesDetectionJobResponse, AWSError] = js.native
  def stopEntitiesDetectionJob(
    params: StopEntitiesDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopEntitiesDetectionJobResponse, Unit]
  ): Request[StopEntitiesDetectionJobResponse, AWSError] = js.native
  
  /**
    * Stops an events detection job in progress.
    */
  def stopEventsDetectionJob(): Request[StopEventsDetectionJobResponse, AWSError] = js.native
  def stopEventsDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StopEventsDetectionJobResponse, Unit]): Request[StopEventsDetectionJobResponse, AWSError] = js.native
  /**
    * Stops an events detection job in progress.
    */
  def stopEventsDetectionJob(params: StopEventsDetectionJobRequest): Request[StopEventsDetectionJobResponse, AWSError] = js.native
  def stopEventsDetectionJob(
    params: StopEventsDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopEventsDetectionJobResponse, Unit]
  ): Request[StopEventsDetectionJobResponse, AWSError] = js.native
  
  /**
    * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopKeyPhrasesDetectionJob(): Request[StopKeyPhrasesDetectionJobResponse, AWSError] = js.native
  def stopKeyPhrasesDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StopKeyPhrasesDetectionJobResponse, Unit]): Request[StopKeyPhrasesDetectionJobResponse, AWSError] = js.native
  /**
    * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopKeyPhrasesDetectionJob(params: StopKeyPhrasesDetectionJobRequest): Request[StopKeyPhrasesDetectionJobResponse, AWSError] = js.native
  def stopKeyPhrasesDetectionJob(
    params: StopKeyPhrasesDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopKeyPhrasesDetectionJobResponse, Unit]
  ): Request[StopKeyPhrasesDetectionJobResponse, AWSError] = js.native
  
  /**
    * Stops a PII entities detection job in progress.
    */
  def stopPiiEntitiesDetectionJob(): Request[StopPiiEntitiesDetectionJobResponse, AWSError] = js.native
  def stopPiiEntitiesDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StopPiiEntitiesDetectionJobResponse, Unit]): Request[StopPiiEntitiesDetectionJobResponse, AWSError] = js.native
  /**
    * Stops a PII entities detection job in progress.
    */
  def stopPiiEntitiesDetectionJob(params: StopPiiEntitiesDetectionJobRequest): Request[StopPiiEntitiesDetectionJobResponse, AWSError] = js.native
  def stopPiiEntitiesDetectionJob(
    params: StopPiiEntitiesDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopPiiEntitiesDetectionJobResponse, Unit]
  ): Request[StopPiiEntitiesDetectionJobResponse, AWSError] = js.native
  
  /**
    * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS, the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopSentimentDetectionJob(): Request[StopSentimentDetectionJobResponse, AWSError] = js.native
  def stopSentimentDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StopSentimentDetectionJobResponse, Unit]): Request[StopSentimentDetectionJobResponse, AWSError] = js.native
  /**
    * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS, the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopSentimentDetectionJob(params: StopSentimentDetectionJobRequest): Request[StopSentimentDetectionJobResponse, AWSError] = js.native
  def stopSentimentDetectionJob(
    params: StopSentimentDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopSentimentDetectionJobResponse, Unit]
  ): Request[StopSentimentDetectionJobResponse, AWSError] = js.native
  
  /**
    * Stops a targeted sentiment detection job in progress. If the job state is IN_PROGRESS, the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopTargetedSentimentDetectionJob(): Request[StopTargetedSentimentDetectionJobResponse, AWSError] = js.native
  def stopTargetedSentimentDetectionJob(
    callback: js.Function2[/* err */ AWSError, /* data */ StopTargetedSentimentDetectionJobResponse, Unit]
  ): Request[StopTargetedSentimentDetectionJobResponse, AWSError] = js.native
  /**
    * Stops a targeted sentiment detection job in progress. If the job state is IN_PROGRESS, the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopTargetedSentimentDetectionJob(params: StopTargetedSentimentDetectionJobRequest): Request[StopTargetedSentimentDetectionJobResponse, AWSError] = js.native
  def stopTargetedSentimentDetectionJob(
    params: StopTargetedSentimentDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopTargetedSentimentDetectionJobResponse, Unit]
  ): Request[StopTargetedSentimentDetectionJobResponse, AWSError] = js.native
  
  /**
    * Stops a document classifier training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and put into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def stopTrainingDocumentClassifier(): Request[StopTrainingDocumentClassifierResponse, AWSError] = js.native
  def stopTrainingDocumentClassifier(
    callback: js.Function2[/* err */ AWSError, /* data */ StopTrainingDocumentClassifierResponse, Unit]
  ): Request[StopTrainingDocumentClassifierResponse, AWSError] = js.native
  /**
    * Stops a document classifier training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and put into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def stopTrainingDocumentClassifier(params: StopTrainingDocumentClassifierRequest): Request[StopTrainingDocumentClassifierResponse, AWSError] = js.native
  def stopTrainingDocumentClassifier(
    params: StopTrainingDocumentClassifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopTrainingDocumentClassifierResponse, Unit]
  ): Request[StopTrainingDocumentClassifierResponse, AWSError] = js.native
  
  /**
    * Stops an entity recognizer training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and putted into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body.
    */
  def stopTrainingEntityRecognizer(): Request[StopTrainingEntityRecognizerResponse, AWSError] = js.native
  def stopTrainingEntityRecognizer(callback: js.Function2[/* err */ AWSError, /* data */ StopTrainingEntityRecognizerResponse, Unit]): Request[StopTrainingEntityRecognizerResponse, AWSError] = js.native
  /**
    * Stops an entity recognizer training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and putted into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body.
    */
  def stopTrainingEntityRecognizer(params: StopTrainingEntityRecognizerRequest): Request[StopTrainingEntityRecognizerResponse, AWSError] = js.native
  def stopTrainingEntityRecognizer(
    params: StopTrainingEntityRecognizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopTrainingEntityRecognizerResponse, Unit]
  ): Request[StopTrainingEntityRecognizerResponse, AWSError] = js.native
  
  /**
    * Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a specific tag associated with an Amazon Comprehend resource. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a specific tag associated with an Amazon Comprehend resource. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates information about the specified endpoint. For information about endpoints, see Managing endpoints.
    */
  def updateEndpoint(): Request[UpdateEndpointResponse, AWSError] = js.native
  def updateEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointResponse, Unit]): Request[UpdateEndpointResponse, AWSError] = js.native
  /**
    * Updates information about the specified endpoint. For information about endpoints, see Managing endpoints.
    */
  def updateEndpoint(params: UpdateEndpointRequest): Request[UpdateEndpointResponse, AWSError] = js.native
  def updateEndpoint(
    params: UpdateEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointResponse, Unit]
  ): Request[UpdateEndpointResponse, AWSError] = js.native
  
  /**
    * Update the configuration information for an existing flywheel.
    */
  def updateFlywheel(): Request[UpdateFlywheelResponse, AWSError] = js.native
  def updateFlywheel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlywheelResponse, Unit]): Request[UpdateFlywheelResponse, AWSError] = js.native
  /**
    * Update the configuration information for an existing flywheel.
    */
  def updateFlywheel(params: UpdateFlywheelRequest): Request[UpdateFlywheelResponse, AWSError] = js.native
  def updateFlywheel(
    params: UpdateFlywheelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlywheelResponse, Unit]
  ): Request[UpdateFlywheelResponse, AWSError] = js.native
}
