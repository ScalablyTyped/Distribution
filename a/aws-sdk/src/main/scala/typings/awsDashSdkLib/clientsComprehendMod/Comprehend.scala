package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comprehend
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Comprehend: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsComprehendMod.ComprehendNs.ClientConfiguration = js.native
  /**
    * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def batchDetectDominantLanguage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectDominantLanguage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def batchDetectDominantLanguage(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectDominantLanguage(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
    */
  def batchDetectEntities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
    */
  def batchDetectEntities(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectEntities(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects the key noun phrases found in a batch of documents.
    */
  def batchDetectKeyPhrases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectKeyPhrases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects the key noun phrases found in a batch of documents.
    */
  def batchDetectKeyPhrases(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectKeyPhrases(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
    */
  def batchDetectSentiment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectSentiment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
    */
  def batchDetectSentiment(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectSentiment(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
    */
  def batchDetectSyntax(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectSyntax(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
    */
  def batchDetectSyntax(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDetectSyntax(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a set of training documents that labeled with the categories that you want to use. After the classifier is trained you can use it to categorize a set of labeled documents into the categories. For more information, see how-document-classification.
    */
  def createDocumentClassifier(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDocumentClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a set of training documents that labeled with the categories that you want to use. After the classifier is trained you can use it to categorize a set of labeled documents into the categories. For more information, see how-document-classification.
    */
  def createDocumentClassifier(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateDocumentClassifierRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDocumentClassifier(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateDocumentClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is submitted, you can check job status using the API. 
    */
  def createEntityRecognizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEntityRecognizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an entity recognizer using submitted files. After your CreateEntityRecognizer request is submitted, you can check job status using the API. 
    */
  def createEntityRecognizer(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateEntityRecognizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEntityRecognizer(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateEntityRecognizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.CreateEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously created document classifier Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a background job. Once removed, the classifier disappears from your account and is no longer available for use. 
    */
  def deleteDocumentClassifier(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDocumentClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously created document classifier Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a background job. Once removed, the classifier disappears from your account and is no longer available for use. 
    */
  def deleteDocumentClassifier(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteDocumentClassifierRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDocumentClassifier(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteDocumentClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an entity recognizer. Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a background job. Once removed, the recognizer disappears from your account and is no longer available for use. 
    */
  def deleteEntityRecognizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEntityRecognizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an entity recognizer. Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference job is using the model, a ResourceInUseException will be returned. This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a background job. Once removed, the recognizer disappears from your account and is no longer available for use. 
    */
  def deleteEntityRecognizer(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteEntityRecognizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEntityRecognizer(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteEntityRecognizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DeleteEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a document classification job. Use this operation to get the status of a classification job.
    */
  def describeDocumentClassificationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassificationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDocumentClassificationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassificationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassificationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a document classification job. Use this operation to get the status of a classification job.
    */
  def describeDocumentClassificationJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassificationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassificationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDocumentClassificationJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassificationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassificationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassificationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a document classifier.
    */
  def describeDocumentClassifier(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDocumentClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a document classifier.
    */
  def describeDocumentClassifier(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassifierRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDocumentClassifier(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
    */
  def describeDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDominantLanguageDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
    */
  def describeDominantLanguageDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDominantLanguageDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
    */
  def describeEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEntitiesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
    */
  def describeEntitiesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEntitiesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer metadata, metrics, and so on.
    */
  def describeEntityRecognizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEntityRecognizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer metadata, metrics, and so on.
    */
  def describeEntityRecognizer(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntityRecognizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEntityRecognizer(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntityRecognizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
    */
  def describeKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeKeyPhrasesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
    */
  def describeKeyPhrasesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeKeyPhrasesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
    */
  def describeSentimentDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSentimentDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
    */
  def describeSentimentDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSentimentDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
    */
  def describeTopicsDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTopicsDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
    */
  def describeTopicsDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTopicsDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def detectDominantLanguage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectDominantLanguage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
    */
  def detectDominantLanguage(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectDominantLanguage(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
    */
  def detectEntities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
    */
  def detectEntities(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectEntities(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects the key noun phrases found in the text. 
    */
  def detectKeyPhrases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectKeyPhrases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects the key noun phrases found in the text. 
    */
  def detectKeyPhrases(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectKeyPhrases(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
    */
  def detectSentiment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectSentiment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
    */
  def detectSentiment(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectSentiment(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
    */
  def detectSyntax(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectSyntax(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
    */
  def detectSyntax(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectSyntax(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the documentation classification jobs that you have submitted.
    */
  def listDocumentClassificationJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassificationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDocumentClassificationJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassificationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassificationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the documentation classification jobs that you have submitted.
    */
  def listDocumentClassificationJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassificationJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassificationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDocumentClassificationJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassificationJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassificationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassificationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the document classifiers that you have created.
    */
  def listDocumentClassifiers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassifiersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDocumentClassifiers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassifiersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassifiersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the document classifiers that you have created.
    */
  def listDocumentClassifiers(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassifiersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassifiersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDocumentClassifiers(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassifiersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassifiersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDocumentClassifiersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the dominant language detection jobs that you have submitted.
    */
  def listDominantLanguageDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDominantLanguageDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the dominant language detection jobs that you have submitted.
    */
  def listDominantLanguageDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDominantLanguageDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the entity detection jobs that you have submitted.
    */
  def listEntitiesDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEntitiesDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the entity detection jobs that you have submitted.
    */
  def listEntitiesDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEntitiesDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the properties of all entity recognizers that you created, including recognizers currently in training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list. The results of this list are not in any particular order. Please get the list and sort locally if needed.
    */
  def listEntityRecognizers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntityRecognizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEntityRecognizers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntityRecognizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntityRecognizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the properties of all entity recognizers that you created, including recognizers currently in training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list. The results of this list are not in any particular order. Please get the list and sort locally if needed.
    */
  def listEntityRecognizers(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntityRecognizersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntityRecognizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEntityRecognizers(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntityRecognizersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntityRecognizersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntityRecognizersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get a list of key phrase detection jobs that you have submitted.
    */
  def listKeyPhrasesDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listKeyPhrasesDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Get a list of key phrase detection jobs that you have submitted.
    */
  def listKeyPhrasesDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listKeyPhrasesDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of sentiment detection jobs that you have submitted.
    */
  def listSentimentDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSentimentDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of sentiment detection jobs that you have submitted.
    */
  def listSentimentDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSentimentDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags associated with a given Amazon Comprehend resource. 
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags associated with a given Amazon Comprehend resource. 
    */
  def listTagsForResource(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the topic detection jobs that you have submitted.
    */
  def listTopicsDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTopicsDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of the topic detection jobs that you have submitted.
    */
  def listTopicsDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTopicsDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous document classification job. Use the operation to track the progress of the job.
    */
  def startDocumentClassificationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDocumentClassificationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDocumentClassificationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDocumentClassificationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDocumentClassificationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous document classification job. Use the operation to track the progress of the job.
    */
  def startDocumentClassificationJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDocumentClassificationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDocumentClassificationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDocumentClassificationJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDocumentClassificationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDocumentClassificationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDocumentClassificationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDominantLanguageDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startDominantLanguageDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDominantLanguageDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job. This API can be used for either standard entity detection or custom entity recognition. In order to be used for custom entity recognition, the optional EntityRecognizerArn must be used in order to provide access to the recognizer being used to detect the custom entity.
    */
  def startEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startEntitiesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job. This API can be used for either standard entity detection or custom entity recognition. In order to be used for custom entity recognition, the optional EntityRecognizerArn must be used in order to provide access to the recognizer being used to detect the custom entity.
    */
  def startEntitiesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startEntitiesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startKeyPhrasesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
    */
  def startKeyPhrasesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startKeyPhrasesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
    */
  def startSentimentDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startSentimentDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
    */
  def startSentimentDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startSentimentDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
    */
  def startTopicsDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startTopicsDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
    */
  def startTopicsDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startTopicsDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopDominantLanguageDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopDominantLanguageDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopDominantLanguageDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopEntitiesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopEntitiesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopEntitiesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopKeyPhrasesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopKeyPhrasesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopKeyPhrasesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopSentimentDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopSentimentDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
    */
  def stopSentimentDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopSentimentDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a document classifier training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and put into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def stopTrainingDocumentClassifier(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopTrainingDocumentClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a document classifier training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and put into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body. 
    */
  def stopTrainingDocumentClassifier(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingDocumentClassifierRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopTrainingDocumentClassifier(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingDocumentClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingDocumentClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingDocumentClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops an entity recognizer training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and putted into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body.
    */
  def stopTrainingEntityRecognizer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopTrainingEntityRecognizer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops an entity recognizer training job while in progress. If the training job state is TRAINING, the job is marked for termination and put into the STOP_REQUESTED state. If the training job completes before it can be stopped, it is put into the TRAINED; otherwise the training job is stopped and putted into the STOPPED state and the service sends back an HTTP 200 response with an empty HTTP body.
    */
  def stopTrainingEntityRecognizer(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingEntityRecognizerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopTrainingEntityRecognizer(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingEntityRecognizerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingEntityRecognizerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopTrainingEntityRecognizerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  def tagResource(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a specific tag associated with an Amazon Comprehend resource. 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a specific tag associated with an Amazon Comprehend resource. 
    */
  def untagResource(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

