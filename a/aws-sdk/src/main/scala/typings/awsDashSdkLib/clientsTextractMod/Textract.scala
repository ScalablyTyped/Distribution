package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Textract
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Textract: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Analyzes an input document for relationships in the detected text and tables.  Two types of information are returned:    Words and lines that are related to nearby lines and words. The related information is returned in two Block objects: a KEY Block object and a VALUE Block object. For example, Name: Ana Silva Carolina contains a key and value. Name: is the key. Ana Silva Carolina is the value.   Table and table cell data. A TABLE Block contains information about a detected table. A CELL block is returned for each cell in a table.   You can choose which type of analysis to perform by specifying the FeatureTypes list.  The output is returned in a list of BLOCK objects (Blocks). For more information, see how-it-works-analyzing.  AnalyzeDocument is a synchronous operation. To analyze documents asynchronously, use StartDocumentAnalysis.
    */
  def analyzeDocument(): awsDashSdkLib.libRequestMod.Request[AnalyzeDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def analyzeDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AnalyzeDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AnalyzeDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Analyzes an input document for relationships in the detected text and tables.  Two types of information are returned:    Words and lines that are related to nearby lines and words. The related information is returned in two Block objects: a KEY Block object and a VALUE Block object. For example, Name: Ana Silva Carolina contains a key and value. Name: is the key. Ana Silva Carolina is the value.   Table and table cell data. A TABLE Block contains information about a detected table. A CELL block is returned for each cell in a table.   You can choose which type of analysis to perform by specifying the FeatureTypes list.  The output is returned in a list of BLOCK objects (Blocks). For more information, see how-it-works-analyzing.  AnalyzeDocument is a synchronous operation. To analyze documents asynchronously, use StartDocumentAnalysis.
    */
  def analyzeDocument(params: AnalyzeDocumentRequest): awsDashSdkLib.libRequestMod.Request[AnalyzeDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def analyzeDocument(
    params: AnalyzeDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AnalyzeDocumentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AnalyzeDocumentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detects text in the input document. Amazon Textract can detect lines of text and the words that make up a line of text. The input document must be an image in JPG or PNG format. DetectDocumentText returns the detected text in an array of Block objects. For more information, see how-it-works-detecting.  DetectDocumentText is a synchronous operation. To analyze documents asynchronously, use StartDocumentTextDetection.
    */
  def detectDocumentText(): awsDashSdkLib.libRequestMod.Request[DetectDocumentTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectDocumentText(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectDocumentTextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectDocumentTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detects text in the input document. Amazon Textract can detect lines of text and the words that make up a line of text. The input document must be an image in JPG or PNG format. DetectDocumentText returns the detected text in an array of Block objects. For more information, see how-it-works-detecting.  DetectDocumentText is a synchronous operation. To analyze documents asynchronously, use StartDocumentTextDetection.
    */
  def detectDocumentText(params: DetectDocumentTextRequest): awsDashSdkLib.libRequestMod.Request[DetectDocumentTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectDocumentText(
    params: DetectDocumentTextRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectDocumentTextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectDocumentTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the results for an Amazon Textract asynchronous operation that analyzes text in a document image. You start asynchronous text analysis by calling StartDocumentAnalysis, which returns a job identifier (JobId). When the text analysis operation finishes, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to StartDocumentAnalysis. To get the results of the text-detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetDocumentAnalysis, and pass the job identifier (JobId) from the initial call to StartDocumentAnalysis.  GetDocumentAnalysis returns an array of Block objects. For more information, see how-it-works-analyzing. Use the MaxResults parameter to limit the number of blocks returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetDocumentAnalysis, and populate the NextToken request parameter with the token value that's returned from the previous call to GetDocumentAnalysis.
    */
  def getDocumentAnalysis(): awsDashSdkLib.libRequestMod.Request[GetDocumentAnalysisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentAnalysis(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentAnalysisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentAnalysisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the results for an Amazon Textract asynchronous operation that analyzes text in a document image. You start asynchronous text analysis by calling StartDocumentAnalysis, which returns a job identifier (JobId). When the text analysis operation finishes, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to StartDocumentAnalysis. To get the results of the text-detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetDocumentAnalysis, and pass the job identifier (JobId) from the initial call to StartDocumentAnalysis.  GetDocumentAnalysis returns an array of Block objects. For more information, see how-it-works-analyzing. Use the MaxResults parameter to limit the number of blocks returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetDocumentAnalysis, and populate the NextToken request parameter with the token value that's returned from the previous call to GetDocumentAnalysis.
    */
  def getDocumentAnalysis(params: GetDocumentAnalysisRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentAnalysisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentAnalysis(
    params: GetDocumentAnalysisRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentAnalysisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentAnalysisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the results for an Amazon Textract asynchronous operation that detects text in a document image. Amazon Textract can detect lines of text and the words that make up a line of text. You start asynchronous text detection by calling StartDocumentTextDetection, which returns a job identifier (JobId). When the text detection operation finishes, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to StartDocumentTextDetection. To get the results of the text-detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetDocumentTextDetection, and pass the job identifier (JobId) from the initial call to StartDocumentTextDetection.  GetDocumentTextDetection returns an array of Block objects. For more information, see how-it-works-detecting. Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetDocumentTextDetection, and populate the NextToken request parameter with the token value that's returned from the previous call to GetDocumentTextDetection. For more information, see Document Text Detection in the Amazon Textract Developer Guide.
    */
  def getDocumentTextDetection(): awsDashSdkLib.libRequestMod.Request[GetDocumentTextDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentTextDetection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentTextDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentTextDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the results for an Amazon Textract asynchronous operation that detects text in a document image. Amazon Textract can detect lines of text and the words that make up a line of text. You start asynchronous text detection by calling StartDocumentTextDetection, which returns a job identifier (JobId). When the text detection operation finishes, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to StartDocumentTextDetection. To get the results of the text-detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetDocumentTextDetection, and pass the job identifier (JobId) from the initial call to StartDocumentTextDetection.  GetDocumentTextDetection returns an array of Block objects. For more information, see how-it-works-detecting. Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetDocumentTextDetection, and populate the NextToken request parameter with the token value that's returned from the previous call to GetDocumentTextDetection. For more information, see Document Text Detection in the Amazon Textract Developer Guide.
    */
  def getDocumentTextDetection(params: GetDocumentTextDetectionRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentTextDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocumentTextDetection(
    params: GetDocumentTextDetectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentTextDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentTextDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts asynchronous analysis of text for relationships in the text and tables that are detected in a document. Amazon Textract returns for two types of information:    Words and lines that are related to nearby lines and words. The related information is returned in two Block objects: A KEY Block object and a VALUE Block object. For example, Name: Ana Silva Carolina contains a key and value. Name: is the key. Ana Silva Carolina is the value.   Table and table cell data. A TABLE block contains information about a detected table. A CELL block is returned for each cell in a table.   Amazon Textract can analyze text in document images and PDF files that are stored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name and file name of the document image.   StartDocumentAnalysis returns a job identifier (JobId) that you use to get the results of the operation. When text analysis is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that you specify in NotificationChannel. To get the results of the text analysis operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetDocumentAnalysis, and pass the job identifier (JobId) from the initial call to StartDocumentAnalysis.
    */
  def startDocumentAnalysis(): awsDashSdkLib.libRequestMod.Request[StartDocumentAnalysisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDocumentAnalysis(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDocumentAnalysisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDocumentAnalysisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts asynchronous analysis of text for relationships in the text and tables that are detected in a document. Amazon Textract returns for two types of information:    Words and lines that are related to nearby lines and words. The related information is returned in two Block objects: A KEY Block object and a VALUE Block object. For example, Name: Ana Silva Carolina contains a key and value. Name: is the key. Ana Silva Carolina is the value.   Table and table cell data. A TABLE block contains information about a detected table. A CELL block is returned for each cell in a table.   Amazon Textract can analyze text in document images and PDF files that are stored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name and file name of the document image.   StartDocumentAnalysis returns a job identifier (JobId) that you use to get the results of the operation. When text analysis is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that you specify in NotificationChannel. To get the results of the text analysis operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetDocumentAnalysis, and pass the job identifier (JobId) from the initial call to StartDocumentAnalysis.
    */
  def startDocumentAnalysis(params: StartDocumentAnalysisRequest): awsDashSdkLib.libRequestMod.Request[StartDocumentAnalysisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDocumentAnalysis(
    params: StartDocumentAnalysisRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDocumentAnalysisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDocumentAnalysisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the asynchronous detection of text in a document. Amazon Textract can detect lines of text and the words that make up a line of text. Amazon Textract can detect text in document images and PDF files that are stored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name and the file name of the document image.   StartTextDetection returns a job identifier (JobId) that you use to get the results of the operation. When text detection is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that you specify in NotificationChannel. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetDocumentTextDetection, and pass the job identifier (JobId) from the initial call to StartDocumentTextDetection. For more information, see Document Text Detection in the Amazon Textract Developer Guide.
    */
  def startDocumentTextDetection(): awsDashSdkLib.libRequestMod.Request[StartDocumentTextDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDocumentTextDetection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDocumentTextDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDocumentTextDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the asynchronous detection of text in a document. Amazon Textract can detect lines of text and the words that make up a line of text. Amazon Textract can detect text in document images and PDF files that are stored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name and the file name of the document image.   StartTextDetection returns a job identifier (JobId) that you use to get the results of the operation. When text detection is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that you specify in NotificationChannel. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetDocumentTextDetection, and pass the job identifier (JobId) from the initial call to StartDocumentTextDetection. For more information, see Document Text Detection in the Amazon Textract Developer Guide.
    */
  def startDocumentTextDetection(params: StartDocumentTextDetectionRequest): awsDashSdkLib.libRequestMod.Request[StartDocumentTextDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDocumentTextDetection(
    params: StartDocumentTextDetectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDocumentTextDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDocumentTextDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

