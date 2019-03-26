package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/textract", "Textract")
@js.native
object TextractNs extends js.Object {
  trait AnalyzeDocumentRequest extends js.Object {
    /**
      * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPG or PNG format.
      */
    var Document: awsDashSdkLib.clientsTextractMod.TextractNs.Document
    /**
      * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables detected in the input document. Add FORMS to return detected fields and the associated text. To perform both types of analysis, add TABLES and FORMS to FeatureTypes.
      */
    var FeatureTypes: awsDashSdkLib.clientsTextractMod.TextractNs.FeatureTypes
  }
  
  trait AnalyzeDocumentResponse extends js.Object {
    /**
      * The text that's detected and analyzed by AnalyzeDocument.
      */
    var Blocks: js.UndefOr[BlockList] = js.undefined
    /**
      * Metadata about the analyzed document. An example is the number of pages.
      */
    var DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined
  }
  
  trait Block extends js.Object {
    /**
      * The type of text that's recognized in a block. In text-detection operations, the following types are returned:    PAGE - Contains a list of the LINE Block objects that are detected on a specific page.    WORD - One or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of equally spaced words.   In text analysis operations, the following types are returned:    PAGE - Contains a list of child Block objects that are detected on a specific page.    KEY_VALUE_SET - Stores the KEY and VALUE Block objects for a field that's detected in a document. Use the EntityType field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block object.     WORD - One or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words.    TABLE - A table that's detected in the document.    CELL - A cell within a detected table. The cell is the parent of the block that contains the text in the cell.  
      */
    var BlockType: js.UndefOr[BlockType] = js.undefined
    /**
      * The column in which a table cell appears. The first column position is 1. ColumnIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
      */
    var ColumnIndex: js.UndefOr[UInteger] = js.undefined
    /**
      * The number of columns that a table cell spans. ColumnSpan isn't returned by DetectDocumentText and GetDocumentTextDetection. 
      */
    var ColumnSpan: js.UndefOr[UInteger] = js.undefined
    /**
      * The confidence that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry points around the recognized text.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * The type of entity. The following can be returned:    KEY - An identifier for a field on the document.    VALUE - The field text.    EntityTypes isn't returned by DetectDocumentText and GetDocumentTextDetection.
      */
    var EntityTypes: js.UndefOr[EntityTypes] = js.undefined
    /**
      * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds the text, and a finer-grain polygon for more accurate spatial information. 
      */
    var Geometry: js.UndefOr[Geometry] = js.undefined
    /**
      * The identifier for the recognized text. The identifier is only unique for a single operation. 
      */
    var Id: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The page in which a block was detected.
      */
    var Page: js.UndefOr[UInteger] = js.undefined
    /**
      * A list of child blocks of the current block. For example a LINE object has child blocks for each WORD block that's part of the line of text. There aren't Relationship objects in the list for relationships that don't exist, such as when the current block has no child blocks. The list size can be the following:   0 - The block has no child blocks.   1 - The block has child blocks.  
      */
    var Relationships: js.UndefOr[RelationshipList] = js.undefined
    /**
      * The row in which a table cell is located. The first row position is 1. RowIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
      */
    var RowIndex: js.UndefOr[UInteger] = js.undefined
    /**
      * The number of rows that a table spans. RowSpan isn't returned by DetectDocumentText and GetDocumentTextDetection.
      */
    var RowSpan: js.UndefOr[UInteger] = js.undefined
    /**
      * The word or line of text that's recognized by Amazon Textract. 
      */
    var Text: js.UndefOr[String] = js.undefined
  }
  
  trait BoundingBox extends js.Object {
    /**
      * The height of the bounding box as a ratio of the overall document page height.
      */
    var Height: js.UndefOr[Float] = js.undefined
    /**
      * The left coordinate of the bounding box as a ratio of overall document page width.
      */
    var Left: js.UndefOr[Float] = js.undefined
    /**
      * The top coordinate of the bounding box as a ratio of overall document page height.
      */
    var Top: js.UndefOr[Float] = js.undefined
    /**
      * The width of the bounding box as a ratio of the overall document page width.
      */
    var Width: js.UndefOr[Float] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait DetectDocumentTextRequest extends js.Object {
    /**
      * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPG or PNG format.
      */
    var Document: awsDashSdkLib.clientsTextractMod.TextractNs.Document
  }
  
  trait DetectDocumentTextResponse extends js.Object {
    /**
      * An array of Block objects containing the text detected in the document.
      */
    var Blocks: js.UndefOr[BlockList] = js.undefined
    /**
      * Metadata about the document. Contains the number of pages that are detected in the document.
      */
    var DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined
  }
  
  trait Document extends js.Object {
    /**
      * A blob of documents bytes. The maximum size of a document that's provided in a blob of bytes is 5 MB.
      */
    var Bytes: js.UndefOr[ImageBlob] = js.undefined
    /**
      * Identifies an S3 object as the document source. The maximum size of a document stored in an S3 bucket is 5 MB.
      */
    var S3Object: js.UndefOr[S3Object] = js.undefined
  }
  
  trait DocumentLocation extends js.Object {
    /**
      * The Amazon S3 bucket that contains the input document.
      */
    var S3Object: js.UndefOr[S3Object] = js.undefined
  }
  
  trait DocumentMetadata extends js.Object {
    /**
      * The number of pages detected in the document.
      */
    var Pages: js.UndefOr[UInteger] = js.undefined
  }
  
  trait Geometry extends js.Object {
    /**
      * An axis-aligned coarse representation of the location of the recognized text on the document page.
      */
    var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * Within the bounding box, a fine-grained polygon around the recognized text.
      */
    var Polygon: js.UndefOr[Polygon] = js.undefined
  }
  
  trait GetDocumentAnalysisRequest extends js.Object {
    /**
      * A unique identifier for the text-detection job. The JobId is returned from StartDocumentAnalysis.
      */
    var JobId: awsDashSdkLib.clientsTextractMod.TextractNs.JobId
    /**
      * The maximum number of results to return per paginated call. The largest value that you can specify is 1,000. If you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default value is 1,000.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract returns a pagination token in the response. You can use this pagination token to retrieve the next set of blocks.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait GetDocumentAnalysisResponse extends js.Object {
    /**
      * The results of the text analysis operation.
      */
    var Blocks: js.UndefOr[BlockList] = js.undefined
    /**
      * Information about a document that Amazon Textract processed. DocumentMetadata is returned in every page of paginated responses from an Amazon Textract video operation.
      */
    var DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined
    /**
      * The current status of the text detection job.
      */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
      * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of text detection results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The current status of an asynchronous document analysis operation.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * A list of warnings that occurred during the document analysis operation.
      */
    var Warnings: js.UndefOr[Warnings] = js.undefined
  }
  
  trait GetDocumentTextDetectionRequest extends js.Object {
    /**
      * A unique identifier for the text detection job. The JobId is returned from StartDocumentTextDetection.
      */
    var JobId: awsDashSdkLib.clientsTextractMod.TextractNs.JobId
    /**
      * The maximum number of results to return per paginated call. The largest value you can specify is 1,000. If you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default value is 1,000.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract returns a pagination token in the response. You can use this pagination token to retrieve the next set of blocks.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait GetDocumentTextDetectionResponse extends js.Object {
    /**
      * The results of the text-detection operation.
      */
    var Blocks: js.UndefOr[BlockList] = js.undefined
    /**
      * Information about a document that Amazon Textract processed. DocumentMetadata is returned in every page of paginated responses from an Amazon Textract video operation.
      */
    var DocumentMetadata: js.UndefOr[DocumentMetadata] = js.undefined
    /**
      * The current status of the text detection job.
      */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
      * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of text-detection results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The current status of an asynchronous document text-detection operation. 
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * A list of warnings that occurred during the document text-detection operation.
      */
    var Warnings: js.UndefOr[Warnings] = js.undefined
  }
  
  trait NotificationChannel extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the Amazon SNS topic. 
      */
    var RoleArn: awsDashSdkLib.clientsTextractMod.TextractNs.RoleArn
    /**
      * The Amazon SNS topic that Amazon Textract posts the completion status to.
      */
    var SNSTopicArn: awsDashSdkLib.clientsTextractMod.TextractNs.SNSTopicArn
  }
  
  trait Point extends js.Object {
    /**
      * The value of the X coordinate for a point on a Polygon.
      */
    var X: js.UndefOr[Float] = js.undefined
    /**
      * The value of the Y coordinate for a point on a Polygon.
      */
    var Y: js.UndefOr[Float] = js.undefined
  }
  
  trait Relationship extends js.Object {
    /**
      * An array of IDs for related blocks. You can get the type of the relationship from the Type element.
      */
    var Ids: js.UndefOr[IdList] = js.undefined
    /**
      * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be VALUE or CHILD.
      */
    var Type: js.UndefOr[RelationshipType] = js.undefined
  }
  
  trait S3Object extends js.Object {
    /**
      * The name of the S3 bucket.
      */
    var Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * The file name of the input document. It must be an image file (.JPG or .PNG format). Asynchronous operations also support PDF files.
      */
    var Name: js.UndefOr[S3ObjectName] = js.undefined
    /**
      * If the bucket has versioning enabled, you can specify the object version. 
      */
    var Version: js.UndefOr[S3ObjectVersion] = js.undefined
  }
  
  trait StartDocumentAnalysisRequest extends js.Object {
    /**
      * The idempotent token that you use to identify the start request. If you use the same token with multiple StartDocumentAnalysis requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentally started more than once. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The location of the document to be processed.
      */
    var DocumentLocation: awsDashSdkLib.clientsTextractMod.TextractNs.DocumentLocation
    /**
      * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that are detected in the input document. Add FORMS to return detected fields and the associated text. To perform both types of analysis, add TABLES and FORMS to FeatureTypes.
      */
    var FeatureTypes: awsDashSdkLib.clientsTextractMod.TextractNs.FeatureTypes
    /**
      * The unique identifier you specify to identify the job in the completion status that's published to the Amazon SNS topic.
      */
    var JobTag: js.UndefOr[JobTag] = js.undefined
    /**
      * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to. 
      */
    var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
  }
  
  trait StartDocumentAnalysisResponse extends js.Object {
    /**
      * The identifier for the document text-detection job. Use JobId to identify the job in a subsequent call to GetDocumentAnalysis.
      */
    var JobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait StartDocumentTextDetectionRequest extends js.Object {
    /**
      * The idempotent token that's used to identify the start request. If you use the same token with multiple StartDocumentTextDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentally started more than once. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The location of the document to be processed.
      */
    var DocumentLocation: awsDashSdkLib.clientsTextractMod.TextractNs.DocumentLocation
    /**
      * A unique identifier you specify to identify the job in the completion status that's published to the Amazon Simple Notification Service (Amazon SNS) topic.
      */
    var JobTag: js.UndefOr[JobTag] = js.undefined
    /**
      * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to. 
      */
    var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
  }
  
  trait StartDocumentTextDetectionResponse extends js.Object {
    /**
      * The identifier for the document text-detection job. Use JobId to identify the job in a subsequent call to GetDocumentTextDetection.
      */
    var JobId: js.UndefOr[JobId] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait Warning extends js.Object {
    /**
      * The error code for the warning.
      */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
      * A list of the pages that the warning applies to.
      */
    var Pages: js.UndefOr[Pages] = js.undefined
  }
  
  trait _BlockType extends js.Object
  
  trait _EntityType extends js.Object
  
  trait _FeatureType extends js.Object
  
  trait _JobStatus extends js.Object
  
  trait _RelationshipType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type BlockList = js.Array[Block]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.KEY_VALUE_SET
    - awsDashSdkLib.awsDashSdkLibStrings.PAGE
    - awsDashSdkLib.awsDashSdkLibStrings.LINE
    - awsDashSdkLib.awsDashSdkLibStrings.WORD
    - awsDashSdkLib.awsDashSdkLibStrings.TABLE
    - awsDashSdkLib.awsDashSdkLibStrings.CELL
    - java.lang.String
  */
  type BlockType = _BlockType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.KEY
    - awsDashSdkLib.awsDashSdkLibStrings.VALUE
    - java.lang.String
  */
  type EntityType = _EntityType | java.lang.String
  type EntityTypes = js.Array[EntityType]
  type ErrorCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TABLES
    - awsDashSdkLib.awsDashSdkLibStrings.FORMS
    - java.lang.String
  */
  type FeatureType = _FeatureType | java.lang.String
  type FeatureTypes = js.Array[FeatureType]
  type Float = scala.Double
  type IdList = js.Array[NonEmptyString]
  type ImageBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsTextractMod.Blob | java.lang.String
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.PARTIAL_SUCCESS
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JobTag = java.lang.String
  type MaxResults = scala.Double
  type NonEmptyString = java.lang.String
  type Pages = js.Array[UInteger]
  type PaginationToken = java.lang.String
  type Percent = scala.Double
  type Polygon = js.Array[Point]
  type RelationshipList = js.Array[Relationship]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VALUE
    - awsDashSdkLib.awsDashSdkLibStrings.CHILD
    - java.lang.String
  */
  type RelationshipType = _RelationshipType | java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type UInteger = scala.Double
  type Warnings = js.Array[Warning]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-06-27`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

