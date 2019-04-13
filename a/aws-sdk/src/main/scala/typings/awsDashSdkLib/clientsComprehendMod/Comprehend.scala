package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comprehend
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Comprehend: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def batchDetectDominantLanguage(): awsDashSdkLib.libRequestMod.Request[BatchDetectDominantLanguageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectDominantLanguage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectDominantLanguageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def batchDetectDominantLanguage(params: BatchDetectDominantLanguageRequest): awsDashSdkLib.libRequestMod.Request[BatchDetectDominantLanguageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectDominantLanguage(
    params: BatchDetectDominantLanguageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectDominantLanguageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
    */
  def batchDetectEntities(): awsDashSdkLib.libRequestMod.Request[BatchDetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
    */
  def batchDetectEntities(params: BatchDetectEntitiesRequest): awsDashSdkLib.libRequestMod.Request[BatchDetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectEntities(
    params: BatchDetectEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detects the key noun phrases found in a batch of documents.
    */
  def batchDetectKeyPhrases(): awsDashSdkLib.libRequestMod.Request[BatchDetectKeyPhrasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectKeyPhrases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectKeyPhrasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detects the key noun phrases found in a batch of documents.
    */
  def batchDetectKeyPhrases(params: BatchDetectKeyPhrasesRequest): awsDashSdkLib.libRequestMod.Request[BatchDetectKeyPhrasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectKeyPhrases(
    params: BatchDetectKeyPhrasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectKeyPhrasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
    */
  def batchDetectSentiment(): awsDashSdkLib.libRequestMod.Request[BatchDetectSentimentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectSentiment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectSentimentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
    */
  def batchDetectSentiment(params: BatchDetectSentimentRequest): awsDashSdkLib.libRequestMod.Request[BatchDetectSentimentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectSentiment(
    params: BatchDetectSentimentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectSentimentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
    */
  def batchDetectSyntax(): awsDashSdkLib.libRequestMod.Request[BatchDetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectSyntax(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
    */
  def batchDetectSyntax(params: BatchDetectSyntaxRequest): awsDashSdkLib.libRequestMod.Request[BatchDetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDetectSyntax(
    params: BatchDetectSyntaxRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a set of training documents that labeled with the categories that you want to use. After the classifier is trained you can use it to categorize a set of labeled documents into the categories. For more information, see how-document-classification.
    */
  def createDocumentClassifier(): awsDashSdkLib.libRequestMod.Request[CreateDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDocumentClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a set of training documents that labeled with the categories that you want to use. After the classifier is trained you can use it to categorize a set of labeled documents into the categories. For more information, see how-document-classification.
    */
  def createDocumentClassifier(params: CreateDocumentClassifierRequest): awsDashSdkLib.libRequestMod.Request[CreateDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDocumentClassifier(
    params: CreateDocumentClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is submitted, you can check job status using the API. 
    */
  def createEntityRecognizer(): awsDashSdkLib.libRequestMod.Request[CreateEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEntityRecognizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is submitted, you can check job status using the API. 
    */
  def createEntityRecognizer(params: CreateEntityRecognizerRequest): awsDashSdkLib.libRequestMod.Request[CreateEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEntityRecognizer(
    params: CreateEntityRecognizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a previously created document classifier Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a background job. Once removed, the classifier disappears from your account and is no longer available for use. 
    */
  def deleteDocumentClassifier(): awsDashSdkLib.libRequestMod.Request[DeleteDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocumentClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a previously created document classifier Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a background job. Once removed, the classifier disappears from your account and is no longer available for use. 
    */
  def deleteDocumentClassifier(params: DeleteDocumentClassifierRequest): awsDashSdkLib.libRequestMod.Request[DeleteDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocumentClassifier(
    params: DeleteDocumentClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an entity recognizer. Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a background job. Once removed, the recognizer disappears from your account and is no longer available for use. 
    */
  def deleteEntityRecognizer(): awsDashSdkLib.libRequestMod.Request[DeleteEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEntityRecognizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an entity recognizer. Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a background job. Once removed, the recognizer disappears from your account and is no longer available for use. 
    */
  def deleteEntityRecognizer(params: DeleteEntityRecognizerRequest): awsDashSdkLib.libRequestMod.Request[DeleteEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEntityRecognizer(
    params: DeleteEntityRecognizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a document classification job. Use this operation to get the status of a classification job.
    */
  def describeDocumentClassificationJob(): awsDashSdkLib.libRequestMod.Request[DescribeDocumentClassificationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocumentClassificationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentClassificationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentClassificationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a document classification job. Use this operation to get the status of a classification job.
    */
  def describeDocumentClassificationJob(params: DescribeDocumentClassificationJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeDocumentClassificationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocumentClassificationJob(
    params: DescribeDocumentClassificationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentClassificationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentClassificationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a document classifier.
    */
  def describeDocumentClassifier(): awsDashSdkLib.libRequestMod.Request[DescribeDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocumentClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a document classifier.
    */
  def describeDocumentClassifier(params: DescribeDocumentClassifierRequest): awsDashSdkLib.libRequestMod.Request[DescribeDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocumentClassifier(
    params: DescribeDocumentClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
    */
  def describeDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[DescribeDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDominantLanguageDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
    */
  def describeDominantLanguageDetectionJob(params: DescribeDominantLanguageDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDominantLanguageDetectionJob(
    params: DescribeDominantLanguageDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
    */
  def describeEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[DescribeEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEntitiesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
    */
  def describeEntitiesDetectionJob(params: DescribeEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEntitiesDetectionJob(
    params: DescribeEntitiesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer metadata, metrics, and so on.
    */
  def describeEntityRecognizer(): awsDashSdkLib.libRequestMod.Request[DescribeEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEntityRecognizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer metadata, metrics, and so on.
    */
  def describeEntityRecognizer(params: DescribeEntityRecognizerRequest): awsDashSdkLib.libRequestMod.Request[DescribeEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEntityRecognizer(
    params: DescribeEntityRecognizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
    */
  def describeKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[DescribeKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeKeyPhrasesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
    */
  def describeKeyPhrasesDetectionJob(params: DescribeKeyPhrasesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeKeyPhrasesDetectionJob(
    params: DescribeKeyPhrasesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
    */
  def describeSentimentDetectionJob(): awsDashSdkLib.libRequestMod.Request[DescribeSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSentimentDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
    */
  def describeSentimentDetectionJob(params: DescribeSentimentDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSentimentDetectionJob(
    params: DescribeSentimentDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
    */
  def describeTopicsDetectionJob(): awsDashSdkLib.libRequestMod.Request[DescribeTopicsDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTopicsDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTopicsDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
    */
  def describeTopicsDetectionJob(params: DescribeTopicsDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeTopicsDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTopicsDetectionJob(
    params: DescribeTopicsDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTopicsDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def detectDominantLanguage(): awsDashSdkLib.libRequestMod.Request[DetectDominantLanguageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectDominantLanguage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectDominantLanguageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def detectDominantLanguage(params: DetectDominantLanguageRequest): awsDashSdkLib.libRequestMod.Request[DetectDominantLanguageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectDominantLanguage(
    params: DetectDominantLanguageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectDominantLanguageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
    */
  def detectEntities(): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
    */
  def detectEntities(params: DetectEntitiesRequest): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectEntities(
    params: DetectEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detects the key noun phrases found in the text. 
    */
  def detectKeyPhrases(): awsDashSdkLib.libRequestMod.Request[DetectKeyPhrasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectKeyPhrases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectKeyPhrasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detects the key noun phrases found in the text. 
    */
  def detectKeyPhrases(params: DetectKeyPhrasesRequest): awsDashSdkLib.libRequestMod.Request[DetectKeyPhrasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectKeyPhrases(
    params: DetectKeyPhrasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectKeyPhrasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
    */
  def detectSentiment(): awsDashSdkLib.libRequestMod.Request[DetectSentimentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectSentiment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectSentimentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
    */
  def detectSentiment(params: DetectSentimentRequest): awsDashSdkLib.libRequestMod.Request[DetectSentimentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectSentiment(
    params: DetectSentimentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectSentimentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
    */
  def detectSyntax(): awsDashSdkLib.libRequestMod.Request[DetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectSyntax(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
    */
  def detectSyntax(params: DetectSyntaxRequest): awsDashSdkLib.libRequestMod.Request[DetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectSyntax(
    params: DetectSyntaxRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the documentation classification jobs that you have submitted.
    */
  def listDocumentClassificationJobs(): awsDashSdkLib.libRequestMod.Request[ListDocumentClassificationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDocumentClassificationJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDocumentClassificationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDocumentClassificationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the documentation classification jobs that you have submitted.
    */
  def listDocumentClassificationJobs(params: ListDocumentClassificationJobsRequest): awsDashSdkLib.libRequestMod.Request[ListDocumentClassificationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDocumentClassificationJobs(
    params: ListDocumentClassificationJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDocumentClassificationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDocumentClassificationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the document classifiers that you have created.
    */
  def listDocumentClassifiers(): awsDashSdkLib.libRequestMod.Request[ListDocumentClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDocumentClassifiers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDocumentClassifiersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDocumentClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the document classifiers that you have created.
    */
  def listDocumentClassifiers(params: ListDocumentClassifiersRequest): awsDashSdkLib.libRequestMod.Request[ListDocumentClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDocumentClassifiers(
    params: ListDocumentClassifiersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDocumentClassifiersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDocumentClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the dominant language detection jobs that you have submitted.
    */
  def listDominantLanguageDetectionJobs(): awsDashSdkLib.libRequestMod.Request[ListDominantLanguageDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDominantLanguageDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDominantLanguageDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDominantLanguageDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the dominant language detection jobs that you have submitted.
    */
  def listDominantLanguageDetectionJobs(params: ListDominantLanguageDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[ListDominantLanguageDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDominantLanguageDetectionJobs(
    params: ListDominantLanguageDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDominantLanguageDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDominantLanguageDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the entity detection jobs that you have submitted.
    */
  def listEntitiesDetectionJobs(): awsDashSdkLib.libRequestMod.Request[ListEntitiesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEntitiesDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEntitiesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEntitiesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the entity detection jobs that you have submitted.
    */
  def listEntitiesDetectionJobs(params: ListEntitiesDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[ListEntitiesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEntitiesDetectionJobs(
    params: ListEntitiesDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEntitiesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEntitiesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the properties of all entity recognizers that you created, including recognizers currently in training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list. The results of this list are not in any particular order. Please get the list and sort locally if needed.
    */
  def listEntityRecognizers(): awsDashSdkLib.libRequestMod.Request[ListEntityRecognizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEntityRecognizers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEntityRecognizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEntityRecognizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the properties of all entity recognizers that you created, including recognizers currently in training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list. The results of this list are not in any particular order. Please get the list and sort locally if needed.
    */
  def listEntityRecognizers(params: ListEntityRecognizersRequest): awsDashSdkLib.libRequestMod.Request[ListEntityRecognizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEntityRecognizers(
    params: ListEntityRecognizersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEntityRecognizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEntityRecognizersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get a list of key phrase detection jobs that you have submitted.
    */
  def listKeyPhrasesDetectionJobs(): awsDashSdkLib.libRequestMod.Request[ListKeyPhrasesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listKeyPhrasesDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListKeyPhrasesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListKeyPhrasesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get a list of key phrase detection jobs that you have submitted.
    */
  def listKeyPhrasesDetectionJobs(params: ListKeyPhrasesDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[ListKeyPhrasesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listKeyPhrasesDetectionJobs(
    params: ListKeyPhrasesDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListKeyPhrasesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListKeyPhrasesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of sentiment detection jobs that you have submitted.
    */
  def listSentimentDetectionJobs(): awsDashSdkLib.libRequestMod.Request[ListSentimentDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSentimentDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSentimentDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSentimentDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of sentiment detection jobs that you have submitted.
    */
  def listSentimentDetectionJobs(params: ListSentimentDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[ListSentimentDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSentimentDetectionJobs(
    params: ListSentimentDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSentimentDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSentimentDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags associated with a given Amazon Comprehend resource. 
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags associated with a given Amazon Comprehend resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the topic detection jobs that you have submitted.
    */
  def listTopicsDetectionJobs(): awsDashSdkLib.libRequestMod.Request[ListTopicsDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTopicsDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTopicsDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTopicsDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the topic detection jobs that you have submitted.
    */
  def listTopicsDetectionJobs(params: ListTopicsDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[ListTopicsDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTopicsDetectionJobs(
    params: ListTopicsDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTopicsDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTopicsDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous document classification job. Use the operation to track the progress of the job.
    */
  def startDocumentClassificationJob(): awsDashSdkLib.libRequestMod.Request[StartDocumentClassificationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDocumentClassificationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDocumentClassificationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDocumentClassificationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous document classification job. Use the operation to track the progress of the job.
    */
  def startDocumentClassificationJob(params: StartDocumentClassificationJobRequest): awsDashSdkLib.libRequestMod.Request[StartDocumentClassificationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDocumentClassificationJob(
    params: StartDocumentClassificationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDocumentClassificationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDocumentClassificationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[StartDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDominantLanguageDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startDominantLanguageDetectionJob(params: StartDominantLanguageDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StartDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDominantLanguageDetectionJob(
    params: StartDominantLanguageDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job. This API can be used for either standard entity detection or custom entity recognition. In order to be used for custom entity recognition, the optional EntityRecognizerArn must be used in order to provide access to the recognizer being used to detect the custom entity.
    */
  def startEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[StartEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startEntitiesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job. This API can be used for either standard entity detection or custom entity recognition. In order to be used for custom entity recognition, the optional EntityRecognizerArn must be used in order to provide access to the recognizer being used to detect the custom entity.
    */
  def startEntitiesDetectionJob(params: StartEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StartEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startEntitiesDetectionJob(
    params: StartEntitiesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[StartKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startKeyPhrasesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startKeyPhrasesDetectionJob(params: StartKeyPhrasesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StartKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startKeyPhrasesDetectionJob(
    params: StartKeyPhrasesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
    */
  def startSentimentDetectionJob(): awsDashSdkLib.libRequestMod.Request[StartSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSentimentDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
    */
  def startSentimentDetectionJob(params: StartSentimentDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StartSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSentimentDetectionJob(
    params: StartSentimentDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
    */
  def startTopicsDetectionJob(): awsDashSdkLib.libRequestMod.Request[StartTopicsDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startTopicsDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartTopicsDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
    */
  def startTopicsDetectionJob(params: StartTopicsDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StartTopicsDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startTopicsDetectionJob(
    params: StartTopicsDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartTopicsDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[StopDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopDominantLanguageDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopDominantLanguageDetectionJob(params: StopDominantLanguageDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StopDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopDominantLanguageDetectionJob(
    params: StopDominantLanguageDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[StopEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopEntitiesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopEntitiesDetectionJob(params: StopEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StopEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopEntitiesDetectionJob(
    params: StopEntitiesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[StopKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopKeyPhrasesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopKeyPhrasesDetectionJob(params: StopKeyPhrasesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StopKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopKeyPhrasesDetectionJob(
    params: StopKeyPhrasesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopSentimentDetectionJob(): awsDashSdkLib.libRequestMod.Request[StopSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopSentimentDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopSentimentDetectionJob(params: StopSentimentDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StopSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopSentimentDetectionJob(
    params: StopSentimentDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a document classifier training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and put into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def stopTrainingDocumentClassifier(): awsDashSdkLib.libRequestMod.Request[StopTrainingDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTrainingDocumentClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopTrainingDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopTrainingDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a document classifier training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and put into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def stopTrainingDocumentClassifier(params: StopTrainingDocumentClassifierRequest): awsDashSdkLib.libRequestMod.Request[StopTrainingDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTrainingDocumentClassifier(
    params: StopTrainingDocumentClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopTrainingDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopTrainingDocumentClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops an entity recognizer training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and putted into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body.
    */
  def stopTrainingEntityRecognizer(): awsDashSdkLib.libRequestMod.Request[StopTrainingEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTrainingEntityRecognizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopTrainingEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopTrainingEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops an entity recognizer training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and putted into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body.
    */
  def stopTrainingEntityRecognizer(params: StopTrainingEntityRecognizerRequest): awsDashSdkLib.libRequestMod.Request[StopTrainingEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTrainingEntityRecognizer(
    params: StopTrainingEntityRecognizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopTrainingEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopTrainingEntityRecognizerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a specific tag associated with an Amazon Comprehend resource. 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a specific tag associated with an Amazon Comprehend resource. 
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

