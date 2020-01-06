package typings.awsDashSdk.clientsComprehendMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comprehend extends Service {
  @JSName("config")
  var config_Comprehend: ConfigBase with ClientConfiguration = js.native
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
    * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
    */
  def batchDetectEntities(): Request[BatchDetectEntitiesResponse, AWSError] = js.native
  def batchDetectEntities(callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectEntitiesResponse, Unit]): Request[BatchDetectEntitiesResponse, AWSError] = js.native
  /**
    * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
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
    * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
    */
  def batchDetectSyntax(): Request[BatchDetectSyntaxResponse, AWSError] = js.native
  def batchDetectSyntax(callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectSyntaxResponse, Unit]): Request[BatchDetectSyntaxResponse, AWSError] = js.native
  /**
    * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
    */
  def batchDetectSyntax(params: BatchDetectSyntaxRequest): Request[BatchDetectSyntaxResponse, AWSError] = js.native
  def batchDetectSyntax(
    params: BatchDetectSyntaxRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDetectSyntaxResponse, Unit]
  ): Request[BatchDetectSyntaxResponse, AWSError] = js.native
  /**
    * Creates a new document classification request to analyze a single document in real-time, using a previously created and trained custom model and an endpoint.
    */
  def classifyDocument(): Request[ClassifyDocumentResponse, AWSError] = js.native
  def classifyDocument(callback: js.Function2[/* err */ AWSError, /* data */ ClassifyDocumentResponse, Unit]): Request[ClassifyDocumentResponse, AWSError] = js.native
  /**
    * Creates a new document classification request to analyze a single document in real-time, using a previously created and trained custom model and an endpoint.
    */
  def classifyDocument(params: ClassifyDocumentRequest): Request[ClassifyDocumentResponse, AWSError] = js.native
  def classifyDocument(
    params: ClassifyDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ClassifyDocumentResponse, Unit]
  ): Request[ClassifyDocumentResponse, AWSError] = js.native
  /**
    * Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a set of training documents that labeled with the categories that you want to use. After the classifier is trained you can use it to categorize a set of labeled documents into the categories. For more information, see how-document-classification.
    */
  def createDocumentClassifier(): Request[CreateDocumentClassifierResponse, AWSError] = js.native
  def createDocumentClassifier(callback: js.Function2[/* err */ AWSError, /* data */ CreateDocumentClassifierResponse, Unit]): Request[CreateDocumentClassifierResponse, AWSError] = js.native
  /**
    * Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a set of training documents that labeled with the categories that you want to use. After the classifier is trained you can use it to categorize a set of labeled documents into the categories. For more information, see how-document-classification.
    */
  def createDocumentClassifier(params: CreateDocumentClassifierRequest): Request[CreateDocumentClassifierResponse, AWSError] = js.native
  def createDocumentClassifier(
    params: CreateDocumentClassifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDocumentClassifierResponse, Unit]
  ): Request[CreateDocumentClassifierResponse, AWSError] = js.native
  /**
    * Creates a model-specific endpoint for synchronous inference for a previously trained custom model 
    */
  def createEndpoint(): Request[CreateEndpointResponse, AWSError] = js.native
  def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]): Request[CreateEndpointResponse, AWSError] = js.native
  /**
    * Creates a model-specific endpoint for synchronous inference for a previously trained custom model 
    */
  def createEndpoint(params: CreateEndpointRequest): Request[CreateEndpointResponse, AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResponse, Unit]
  ): Request[CreateEndpointResponse, AWSError] = js.native
  /**
    * Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is submitted, you can check job status using the API. 
    */
  def createEntityRecognizer(): Request[CreateEntityRecognizerResponse, AWSError] = js.native
  def createEntityRecognizer(callback: js.Function2[/* err */ AWSError, /* data */ CreateEntityRecognizerResponse, Unit]): Request[CreateEntityRecognizerResponse, AWSError] = js.native
  /**
    * Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is submitted, you can check job status using the API. 
    */
  def createEntityRecognizer(params: CreateEntityRecognizerRequest): Request[CreateEntityRecognizerResponse, AWSError] = js.native
  def createEntityRecognizer(
    params: CreateEntityRecognizerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEntityRecognizerResponse, Unit]
  ): Request[CreateEntityRecognizerResponse, AWSError] = js.native
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
    * Deletes a model-specific endpoint for a previously-trained custom model. All endpoints must be deleted in order for the model to be deleted.
    */
  def deleteEndpoint(): Request[DeleteEndpointResponse, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEndpointResponse, Unit]): Request[DeleteEndpointResponse, AWSError] = js.native
  /**
    * Deletes a model-specific endpoint for a previously-trained custom model. All endpoints must be deleted in order for the model to be deleted.
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
    * Gets the properties associated with a specific endpoint. Use this operation to get the status of an endpoint.
    */
  def describeEndpoint(): Request[DescribeEndpointResponse, AWSError] = js.native
  def describeEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointResponse, Unit]): Request[DescribeEndpointResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a specific endpoint. Use this operation to get the status of an endpoint.
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
    * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
    */
  def detectEntities(): Request[DetectEntitiesResponse, AWSError] = js.native
  def detectEntities(callback: js.Function2[/* err */ AWSError, /* data */ DetectEntitiesResponse, Unit]): Request[DetectEntitiesResponse, AWSError] = js.native
  /**
    * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
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
    * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
    */
  def detectSyntax(): Request[DetectSyntaxResponse, AWSError] = js.native
  def detectSyntax(callback: js.Function2[/* err */ AWSError, /* data */ DetectSyntaxResponse, Unit]): Request[DetectSyntaxResponse, AWSError] = js.native
  /**
    * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
    */
  def detectSyntax(params: DetectSyntaxRequest): Request[DetectSyntaxResponse, AWSError] = js.native
  def detectSyntax(
    params: DetectSyntaxRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectSyntaxResponse, Unit]
  ): Request[DetectSyntaxResponse, AWSError] = js.native
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
    * Gets a list of all existing endpoints that you've created.
    */
  def listEndpoints(): Request[ListEndpointsResponse, AWSError] = js.native
  def listEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsResponse, Unit]): Request[ListEndpointsResponse, AWSError] = js.native
  /**
    * Gets a list of all existing endpoints that you've created.
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
    * Starts an asynchronous document classification job. Use the operation to track the progress of the job.
    */
  def startDocumentClassificationJob(): Request[StartDocumentClassificationJobResponse, AWSError] = js.native
  def startDocumentClassificationJob(
    callback: js.Function2[/* err */ AWSError, /* data */ StartDocumentClassificationJobResponse, Unit]
  ): Request[StartDocumentClassificationJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous document classification job. Use the operation to track the progress of the job.
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
    * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
    */
  def startSentimentDetectionJob(): Request[StartSentimentDetectionJobResponse, AWSError] = js.native
  def startSentimentDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartSentimentDetectionJobResponse, Unit]): Request[StartSentimentDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
    */
  def startSentimentDetectionJob(params: StartSentimentDetectionJobRequest): Request[StartSentimentDetectionJobResponse, AWSError] = js.native
  def startSentimentDetectionJob(
    params: StartSentimentDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSentimentDetectionJobResponse, Unit]
  ): Request[StartSentimentDetectionJobResponse, AWSError] = js.native
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
    * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopSentimentDetectionJob(): Request[StopSentimentDetectionJobResponse, AWSError] = js.native
  def stopSentimentDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StopSentimentDetectionJobResponse, Unit]): Request[StopSentimentDetectionJobResponse, AWSError] = js.native
  /**
    * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopSentimentDetectionJob(params: StopSentimentDetectionJobRequest): Request[StopSentimentDetectionJobResponse, AWSError] = js.native
  def stopSentimentDetectionJob(
    params: StopSentimentDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopSentimentDetectionJobResponse, Unit]
  ): Request[StopSentimentDetectionJobResponse, AWSError] = js.native
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
    * Updates information about the specified endpoint.
    */
  def updateEndpoint(): Request[UpdateEndpointResponse, AWSError] = js.native
  def updateEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointResponse, Unit]): Request[UpdateEndpointResponse, AWSError] = js.native
  /**
    * Updates information about the specified endpoint.
    */
  def updateEndpoint(params: UpdateEndpointRequest): Request[UpdateEndpointResponse, AWSError] = js.native
  def updateEndpoint(
    params: UpdateEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointResponse, Unit]
  ): Request[UpdateEndpointResponse, AWSError] = js.native
}

