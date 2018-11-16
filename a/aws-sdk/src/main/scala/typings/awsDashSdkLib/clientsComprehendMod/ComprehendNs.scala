package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/comprehend", "Comprehend")
@js.native
object ComprehendNs extends js.Object {
  
  trait BatchDetectDominantLanguageItemResult extends js.Object {
    /**
         * The zero-based index of the document in the input list.
         */
    var Index: js.UndefOr[Integer] = js.undefined
    /**
         * One or more DominantLanguage objects describing the dominant languages in the document.
         */
    var Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
  }
  
  
  trait BatchDetectDominantLanguageRequest extends js.Object {
    /**
         * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document should contain at least 20 characters and must contain fewer than 5,000 bytes of UTF-8 encoded characters.
         */
    var TextList: StringList
  }
  
  
  trait BatchDetectDominantLanguageResponse extends js.Object {
    /**
         * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
         */
    var ErrorList: BatchItemErrorList
    /**
         * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
         */
    var ResultList: ListOfDetectDominantLanguageResult
  }
  
  
  trait BatchDetectEntitiesItemResult extends js.Object {
    /**
         * One or more Entity objects, one for each entity detected in the document.
         */
    var Entities: js.UndefOr[ListOfEntities] = js.undefined
    /**
         * The zero-based index of the document in the input list.
         */
    var Index: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait BatchDetectEntitiesRequest extends js.Object {
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: LanguageCode
    /**
         * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer than 5,000 bytes of UTF-8 encoded characters.
         */
    var TextList: StringList
  }
  
  
  trait BatchDetectEntitiesResponse extends js.Object {
    /**
         * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
         */
    var ErrorList: BatchItemErrorList
    /**
         * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
         */
    var ResultList: ListOfDetectEntitiesResult
  }
  
  
  trait BatchDetectKeyPhrasesItemResult extends js.Object {
    /**
         * The zero-based index of the document in the input list.
         */
    var Index: js.UndefOr[Integer] = js.undefined
    /**
         * One or more KeyPhrase objects, one for each key phrase detected in the document.
         */
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined
  }
  
  
  trait BatchDetectKeyPhrasesRequest extends js.Object {
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: LanguageCode
    /**
         * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer that 5,000 bytes of UTF-8 encoded characters.
         */
    var TextList: StringList
  }
  
  
  trait BatchDetectKeyPhrasesResponse extends js.Object {
    /**
         * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
         */
    var ErrorList: BatchItemErrorList
    /**
         * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
         */
    var ResultList: ListOfDetectKeyPhrasesResult
  }
  
  
  trait BatchDetectSentimentItemResult extends js.Object {
    /**
         * The zero-based index of the document in the input list.
         */
    var Index: js.UndefOr[Integer] = js.undefined
    /**
         * The sentiment detected in the document.
         */
    var Sentiment: js.UndefOr[SentimentType] = js.undefined
    /**
         * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
         */
    var SentimentScore: js.UndefOr[SentimentScore] = js.undefined
  }
  
  
  trait BatchDetectSentimentRequest extends js.Object {
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: LanguageCode
    /**
         * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer that 5,000 bytes of UTF-8 encoded characters.
         */
    var TextList: StringList
  }
  
  
  trait BatchDetectSentimentResponse extends js.Object {
    /**
         * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
         */
    var ErrorList: BatchItemErrorList
    /**
         * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
         */
    var ResultList: ListOfDetectSentimentResult
  }
  
  
  trait BatchDetectSyntaxItemResult extends js.Object {
    /**
         * The zero-based index of the document in the input list.
         */
    var Index: js.UndefOr[Integer] = js.undefined
    /**
         * The syntax tokens for the words in the document, one token for each word.
         */
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
  }
  
  
  trait BatchDetectSyntaxRequest extends js.Object {
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: SyntaxLanguageCode
    /**
         * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer that 5,000 bytes of UTF-8 encoded characters.
         */
    var TextList: StringList
  }
  
  
  trait BatchDetectSyntaxResponse extends js.Object {
    /**
         * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
         */
    var ErrorList: BatchItemErrorList
    /**
         * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
         */
    var ResultList: ListOfDetectSyntaxResult
  }
  
  
  trait BatchItemError extends js.Object {
    /**
         * The numeric error code of the error.
         */
    var ErrorCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A text description of the error.
         */
    var ErrorMessage: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The zero-based index of the document in the input list.
         */
    var Index: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DescribeDominantLanguageDetectionJobRequest extends js.Object {
    /**
         * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
         */
    var JobId: JobId
  }
  
  
  trait DescribeDominantLanguageDetectionJobResponse extends js.Object {
    /**
         * An object that contains the properties associated with a dominant language detection job.
         */
    var DominantLanguageDetectionJobProperties: js.UndefOr[DominantLanguageDetectionJobProperties] = js.undefined
  }
  
  
  trait DescribeEntitiesDetectionJobRequest extends js.Object {
    /**
         * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
         */
    var JobId: JobId
  }
  
  
  trait DescribeEntitiesDetectionJobResponse extends js.Object {
    /**
         * An object that contains the properties associated with an entities detection job.
         */
    var EntitiesDetectionJobProperties: js.UndefOr[EntitiesDetectionJobProperties] = js.undefined
  }
  
  
  trait DescribeKeyPhrasesDetectionJobRequest extends js.Object {
    /**
         * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
         */
    var JobId: JobId
  }
  
  
  trait DescribeKeyPhrasesDetectionJobResponse extends js.Object {
    /**
         * An object that contains the properties associated with a key phrases detection job. 
         */
    var KeyPhrasesDetectionJobProperties: js.UndefOr[KeyPhrasesDetectionJobProperties] = js.undefined
  }
  
  
  trait DescribeSentimentDetectionJobRequest extends js.Object {
    /**
         * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
         */
    var JobId: JobId
  }
  
  
  trait DescribeSentimentDetectionJobResponse extends js.Object {
    /**
         * An object that contains the properties associated with a sentiment detection job.
         */
    var SentimentDetectionJobProperties: js.UndefOr[SentimentDetectionJobProperties] = js.undefined
  }
  
  
  trait DescribeTopicsDetectionJobRequest extends js.Object {
    /**
         * The identifier assigned by the user to the detection job.
         */
    var JobId: JobId
  }
  
  
  trait DescribeTopicsDetectionJobResponse extends js.Object {
    /**
         * The list of properties for the requested job.
         */
    var TopicsDetectionJobProperties: js.UndefOr[TopicsDetectionJobProperties] = js.undefined
  }
  
  
  trait DetectDominantLanguageRequest extends js.Object {
    /**
         * A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000 bytes of UTF-8 encoded characters.
         */
    var Text: java.lang.String
  }
  
  
  trait DetectDominantLanguageResponse extends js.Object {
    /**
         * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
         */
    var Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
  }
  
  
  trait DetectEntitiesRequest extends js.Object {
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: LanguageCode
    /**
         * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
         */
    var Text: java.lang.String
  }
  
  
  trait DetectEntitiesResponse extends js.Object {
    /**
         * A collection of entities identified in the input text. For each entity, the response provides the entity text, entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the detection. For a list of entity types, see how-entities. 
         */
    var Entities: js.UndefOr[ListOfEntities] = js.undefined
  }
  
  
  trait DetectKeyPhrasesRequest extends js.Object {
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: LanguageCode
    /**
         * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
         */
    var Text: java.lang.String
  }
  
  
  trait DetectKeyPhrasesResponse extends js.Object {
    /**
         * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence that Amazon Comprehend has in the accuracy of the detection. 
         */
    var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined
  }
  
  
  trait DetectSentimentRequest extends js.Object {
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: LanguageCode
    /**
         * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
         */
    var Text: java.lang.String
  }
  
  
  trait DetectSentimentResponse extends js.Object {
    /**
         * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
         */
    var Sentiment: js.UndefOr[SentimentType] = js.undefined
    /**
         * An object that lists the sentiments, and their corresponding confidence levels.
         */
    var SentimentScore: js.UndefOr[SentimentScore] = js.undefined
  }
  
  
  trait DetectSyntaxRequest extends js.Object {
    /**
         * The language code of the input documents. You can specify English ("en") or Spanish ("es").
         */
    var LanguageCode: SyntaxLanguageCode
    /**
         * A UTF-8 string. Each string must contain fewer that 5,000 bytes of UTF encoded characters.
         */
    var Text: java.lang.String
  }
  
  
  trait DetectSyntaxResponse extends js.Object {
    /**
         * A collection of syntax tokens describing the text. For each token, the response provides the text, the token type, where the text begins and ends, and the level of confidence that Amazon Comprehend has that the token is correct. For a list of token types, see how-syntax.
         */
    var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
  }
  
  
  trait DominantLanguage extends js.Object {
    /**
         * The RFC 5646 language code for the dominant language. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
         */
    var LanguageCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
         */
    var Score: js.UndefOr[Float] = js.undefined
  }
  
  
  trait DominantLanguageDetectionJobFilter extends js.Object {
    /**
         * Filters on the name of the job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * Filters the list of jobs based on job status. Returns only jobs with the specified status.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
         */
    var SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
         */
    var SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait DominantLanguageDetectionJobProperties extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access to your input data.
         */
    var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    /**
         * The time that the dominant language detection job completed.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The input data configuration that you supplied when you created the dominant language detection job.
         */
    var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
    /**
         * The identifier assigned to the dominant language detection job.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The name that you assigned to the dominant language detection job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The current status of the dominant language detection job. If the status is FAILED, the Message field shows the reason for the failure.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * A description for the status of a job.
         */
    var Message: js.UndefOr[AnyLengthString] = js.undefined
    /**
         * The output data configuration that you supplied when you created the dominant language detection job.
         */
    var OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
    /**
         * The time that the dominant language detection job was submitted for processing.
         */
    var SubmitTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait EntitiesDetectionJobFilter extends js.Object {
    /**
         * Filters on the name of the job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * Filters the list of jobs based on job status. Returns only jobs with the specified status.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
         */
    var SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
         */
    var SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait EntitiesDetectionJobProperties extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access to your input data.
         */
    var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    /**
         * The time that the entities detection job completed
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The input data configuration that you supplied when you created the entities detection job.
         */
    var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
    /**
         * The identifier assigned to the entities detection job.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The name that you assigned the entities detection job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The current status of the entities detection job. If the status is FAILED, the Message field shows the reason for the failure.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * The language code of the input documents.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * A description of the status of a job.
         */
    var Message: js.UndefOr[AnyLengthString] = js.undefined
    /**
         * The output data configuration that you supplied when you created the entities detection job. 
         */
    var OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
    /**
         * The time that the entities detection job was submitted for processing.
         */
    var SubmitTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait Entity extends js.Object {
    /**
         * A character offset in the input text that shows where the entity begins (the first character is at position 0). The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
         */
    var BeginOffset: js.UndefOr[Integer] = js.undefined
    /**
         * A character offset in the input text that shows where the entity ends. The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point. 
         */
    var EndOffset: js.UndefOr[Integer] = js.undefined
    /**
         * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
         */
    var Score: js.UndefOr[Float] = js.undefined
    /**
         * The text of the entity.
         */
    var Text: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The entity's type.
         */
    var Type: js.UndefOr[EntityType] = js.undefined
  }
  
  
  trait InputDataConfig extends js.Object {
    /**
         * Specifies how the text in an input file should be processed:    ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are processing large documents, such as newspaper articles or scientific papers.    ONE_DOC_PER_LINE - Each line in a file is considered a separate document. Use this option when you are processing many short documents, such as text messages.  
         */
    var InputFormat: js.UndefOr[InputFormat] = js.undefined
    /**
         * The Amazon S3 URI for the input data. The URI must be in same region as the API endpoint that you are calling. The URI can point to a single input file or it can provide the prefix for a collection of data files.  For example, if you use the URI S3://bucketName/prefix, if the prefix is a single file, Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of them as input.
         */
    var S3Uri: S3Uri
  }
  
  
  trait KeyPhrase extends js.Object {
    /**
         * A character offset in the input text that shows where the key phrase begins (the first character is at position 0). The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
         */
    var BeginOffset: js.UndefOr[Integer] = js.undefined
    /**
         * A character offset in the input text where the key phrase ends. The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
         */
    var EndOffset: js.UndefOr[Integer] = js.undefined
    /**
         * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
         */
    var Score: js.UndefOr[Float] = js.undefined
    /**
         * The text of a key noun phrase.
         */
    var Text: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait KeyPhrasesDetectionJobFilter extends js.Object {
    /**
         * Filters on the name of the job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * Filters the list of jobs based on job status. Returns only jobs with the specified status.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
         */
    var SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
         */
    var SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait KeyPhrasesDetectionJobProperties extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access to your input data.
         */
    var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    /**
         * The time that the key phrases detection job completed.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The input data configuration that you supplied when you created the key phrases detection job.
         */
    var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
    /**
         * The identifier assigned to the key phrases detection job.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The name that you assigned the key phrases detection job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The current status of the key phrases detection job. If the status is FAILED, the Message field shows the reason for the failure.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * The language code of the input documents.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * A description of the status of a job.
         */
    var Message: js.UndefOr[AnyLengthString] = js.undefined
    /**
         * The output data configuration that you supplied when you created the key phrases detection job.
         */
    var OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
    /**
         * The time that the key phrases detection job was submitted for processing.
         */
    var SubmitTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait ListDominantLanguageDetectionJobsRequest extends js.Object {
    /**
         * Filters that jobs that are returned. You can filter jobs on their name, status, or the date and time that they were submitted. You can only set one filter at a time.
         */
    var Filter: js.UndefOr[DominantLanguageDetectionJobFilter] = js.undefined
    /**
         * The maximum number of results to return in each page. The default is 100.
         */
    var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListDominantLanguageDetectionJobsResponse extends js.Object {
    /**
         * A list containing the properties of each job that is returned.
         */
    var DominantLanguageDetectionJobPropertiesList: js.UndefOr[DominantLanguageDetectionJobPropertiesList] = js.undefined
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListEntitiesDetectionJobsRequest extends js.Object {
    /**
         * Filters the jobs that are returned. You can filter jobs on their name, status, or the date and time that they were submitted. You can only set one filter at a time.
         */
    var Filter: js.UndefOr[EntitiesDetectionJobFilter] = js.undefined
    /**
         * The maximum number of results to return in each page. The default is 100.
         */
    var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListEntitiesDetectionJobsResponse extends js.Object {
    /**
         * A list containing the properties of each job that is returned.
         */
    var EntitiesDetectionJobPropertiesList: js.UndefOr[EntitiesDetectionJobPropertiesList] = js.undefined
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListKeyPhrasesDetectionJobsRequest extends js.Object {
    /**
         * Filters the jobs that are returned. You can filter jobs on their name, status, or the date and time that they were submitted. You can only set one filter at a time.
         */
    var Filter: js.UndefOr[KeyPhrasesDetectionJobFilter] = js.undefined
    /**
         * The maximum number of results to return in each page. The default is 100.
         */
    var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListKeyPhrasesDetectionJobsResponse extends js.Object {
    /**
         * A list containing the properties of each job that is returned.
         */
    var KeyPhrasesDetectionJobPropertiesList: js.UndefOr[KeyPhrasesDetectionJobPropertiesList] = js.undefined
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListSentimentDetectionJobsRequest extends js.Object {
    /**
         * Filters the jobs that are returned. You can filter jobs on their name, status, or the date and time that they were submitted. You can only set one filter at a time.
         */
    var Filter: js.UndefOr[SentimentDetectionJobFilter] = js.undefined
    /**
         * The maximum number of results to return in each page. The default is 100.
         */
    var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListSentimentDetectionJobsResponse extends js.Object {
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A list containing the properties of each job that is returned.
         */
    var SentimentDetectionJobPropertiesList: js.UndefOr[SentimentDetectionJobPropertiesList] = js.undefined
  }
  
  
  trait ListTopicsDetectionJobsRequest extends js.Object {
    /**
         * Filters the jobs that are returned. Jobs can be filtered on their name, status, or the date and time that they were submitted. You can set only one filter at a time.
         */
    var Filter: js.UndefOr[TopicsDetectionJobFilter] = js.undefined
    /**
         * The maximum number of results to return in each page. The default is 100.
         */
    var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListTopicsDetectionJobsResponse extends js.Object {
    /**
         * Identifies the next page of results to return.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A list containing the properties of each job that is returned.
         */
    var TopicsDetectionJobPropertiesList: js.UndefOr[TopicsDetectionJobPropertiesList] = js.undefined
  }
  
  
  trait OutputDataConfig extends js.Object {
    /**
         * When you use the OutputDataConfig object with asynchronous operations, you specify the Amazon S3 location where you want to write the output data. The URI must be in the same region as the API endpoint that you are calling. The location is used as the prefix for the actual location of the output file. When the topic detection job is finished, the service creates an output file in a directory specific to the job. The S3Uri field contains the location of the output file, called output.tar.gz. It is a compressed archive that contains the ouput of the operation.
         */
    var S3Uri: S3Uri
  }
  
  
  trait PartOfSpeechTag extends js.Object {
    /**
         * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
         */
    var Score: js.UndefOr[Float] = js.undefined
    /**
         * Identifies the part of speech that the token represents.
         */
    var Tag: js.UndefOr[PartOfSpeechTagType] = js.undefined
  }
  
  
  trait SentimentDetectionJobFilter extends js.Object {
    /**
         * Filters on the name of the job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * Filters the list of jobs based on job status. Returns only jobs with the specified status.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
         */
    var SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
         */
    var SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait SentimentDetectionJobProperties extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access to your input data.
         */
    var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    /**
         * The time that the sentiment detection job ended.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The input data configuration that you supplied when you created the sentiment detection job.
         */
    var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
    /**
         * The identifier assigned to the sentiment detection job.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The name that you assigned to the sentiment detection job
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The current status of the sentiment detection job. If the status is FAILED, the Messages field shows the reason for the failure.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * The language code of the input documents.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * A description of the status of a job.
         */
    var Message: js.UndefOr[AnyLengthString] = js.undefined
    /**
         * The output data configuration that you supplied when you created the sentiment detection job.
         */
    var OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
    /**
         * The time that the sentiment detection job was submitted for processing.
         */
    var SubmitTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait SentimentScore extends js.Object {
    /**
         * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the MIXED sentiment.
         */
    var Mixed: js.UndefOr[Float] = js.undefined
    /**
         * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEGATIVE sentiment.
         */
    var Negative: js.UndefOr[Float] = js.undefined
    /**
         * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEUTRAL sentiment.
         */
    var Neutral: js.UndefOr[Float] = js.undefined
    /**
         * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the POSITIVE sentiment.
         */
    var Positive: js.UndefOr[Float] = js.undefined
  }
  
  
  trait StartDominantLanguageDetectionJobRequest extends js.Object {
    /**
         * A unique identifier for the request. If you do not set the client request token, Amazon Comprehend generates one.
         */
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data. For more information, see https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions.
         */
    var DataAccessRoleArn: IamRoleArn
    /**
         * Specifies the format and location of the input data for the job.
         */
    var InputDataConfig: InputDataConfig
    /**
         * An identifier for the job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * Specifies where to send the output files.
         */
    var OutputDataConfig: OutputDataConfig
  }
  
  
  trait StartDominantLanguageDetectionJobResponse extends js.Object {
    /**
         * The identifier generated for the job. To get the status of a job, use this identifier with the operation.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The status of the job.    SUBMITTED - The job has been received and is queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. To get details, use the operation.  
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait StartEntitiesDetectionJobRequest extends js.Object {
    /**
         * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
         */
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data. For more information, see https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions.
         */
    var DataAccessRoleArn: IamRoleArn
    /**
         * Specifies the format and location of the input data for the job.
         */
    var InputDataConfig: InputDataConfig
    /**
         * The identifier of the job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: LanguageCode
    /**
         * Specifies where to send the output files.
         */
    var OutputDataConfig: OutputDataConfig
  }
  
  
  trait StartEntitiesDetectionJobResponse extends js.Object {
    /**
         * The identifier generated for the job. To get the status of job, use this identifier with the operation.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The status of the job.    SUBMITTED - The job has been received and is queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. To get details, use the operation.  
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait StartKeyPhrasesDetectionJobRequest extends js.Object {
    /**
         * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
         */
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data. For more information, see https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions.
         */
    var DataAccessRoleArn: IamRoleArn
    /**
         * Specifies the format and location of the input data for the job.
         */
    var InputDataConfig: InputDataConfig
    /**
         * The identifier of the job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: LanguageCode
    /**
         * Specifies where to send the output files.
         */
    var OutputDataConfig: OutputDataConfig
  }
  
  
  trait StartKeyPhrasesDetectionJobResponse extends js.Object {
    /**
         * The identifier generated for the job. To get the status of a job, use this identifier with the operation.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The status of the job.    SUBMITTED - The job has been received and is queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. To get details, use the operation.  
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait StartSentimentDetectionJobRequest extends js.Object {
    /**
         * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
         */
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data. For more information, see https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions.
         */
    var DataAccessRoleArn: IamRoleArn
    /**
         * Specifies the format and location of the input data for the job.
         */
    var InputDataConfig: InputDataConfig
    /**
         * The identifier of the job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
         */
    var LanguageCode: LanguageCode
    /**
         * Specifies where to send the output files. 
         */
    var OutputDataConfig: OutputDataConfig
  }
  
  
  trait StartSentimentDetectionJobResponse extends js.Object {
    /**
         * The identifier generated for the job. To get the status of a job, use this identifier with the operation.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The status of the job.    SUBMITTED - The job has been received and is queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. To get details, use the operation.  
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait StartTopicsDetectionJobRequest extends js.Object {
    /**
         * A unique identifier for the request. If you do not set the client request token, Amazon Comprehend generates one.
         */
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data. For more information, see https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions.
         */
    var DataAccessRoleArn: IamRoleArn
    /**
         * Specifies the format and location of the input data for the job.
         */
    var InputDataConfig: InputDataConfig
    /**
         * The identifier of the job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The number of topics to detect.
         */
    var NumberOfTopics: js.UndefOr[NumberOfTopicsInteger] = js.undefined
    /**
         * Specifies where to send the output files. The output is a compressed archive with two files, topic-terms.csv that lists the terms associated with each topic, and doc-topics.csv that lists the documents associated with each topic
         */
    var OutputDataConfig: OutputDataConfig
  }
  
  
  trait StartTopicsDetectionJobResponse extends js.Object {
    /**
         * The identifier generated for the job. To get the status of the job, use this identifier with the DescribeTopicDetectionJob operation.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The status of the job:    SUBMITTED - The job has been received and is queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. To get details, use the DescribeTopicDetectionJob operation.  
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait StopDominantLanguageDetectionJobRequest extends js.Object {
    /**
         * The identifier of the dominant language detection job to stop.
         */
    var JobId: JobId
  }
  
  
  trait StopDominantLanguageDetectionJobResponse extends js.Object {
    /**
         * The identifier of the dominant language detection job to stop.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopDominantLanguageDetectionJob operation.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait StopEntitiesDetectionJobRequest extends js.Object {
    /**
         * The identifier of the entities detection job to stop.
         */
    var JobId: JobId
  }
  
  
  trait StopEntitiesDetectionJobResponse extends js.Object {
    /**
         * The identifier of the entities detection job to stop.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopEntitiesDetectionJob operation.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait StopKeyPhrasesDetectionJobRequest extends js.Object {
    /**
         * The identifier of the key phrases detection job to stop.
         */
    var JobId: JobId
  }
  
  
  trait StopKeyPhrasesDetectionJobResponse extends js.Object {
    /**
         * The identifier of the key phrases detection job to stop.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopKeyPhrasesDetectionJob operation.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait StopSentimentDetectionJobRequest extends js.Object {
    /**
         * The identifier of the sentiment detection job to stop.
         */
    var JobId: JobId
  }
  
  
  trait StopSentimentDetectionJobResponse extends js.Object {
    /**
         * The identifier of the sentiment detection job to stop.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopSentimentDetectionJob operation.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait SyntaxToken extends js.Object {
    /**
         * The zero-based offset from the beginning of the source text to the first character in the word.
         */
    var BeginOffset: js.UndefOr[Integer] = js.undefined
    /**
         * The zero-based offset from the beginning of the source text to the last character in the word.
         */
    var EndOffset: js.UndefOr[Integer] = js.undefined
    /**
         * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was correctly identified. For more information, see how-syntax.
         */
    var PartOfSpeech: js.UndefOr[PartOfSpeechTag] = js.undefined
    /**
         * The word that was recognized in the source text.
         */
    var Text: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A unique identifier for a token.
         */
    var TokenId: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait TopicsDetectionJobFilter extends js.Object {
    /**
         * 
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
         */
    var SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined
    /**
         * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted before the specified time. Jobs are returned in descending order, newest to oldest.
         */
    var SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait TopicsDetectionJobProperties extends js.Object {
    /**
         * The time that the topic detection job was completed.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The input data configuration supplied when you created the topic detection job.
         */
    var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
    /**
         * The identifier assigned to the topic detection job.
         */
    var JobId: js.UndefOr[JobId] = js.undefined
    /**
         * The name of the topic detection job.
         */
    var JobName: js.UndefOr[JobName] = js.undefined
    /**
         * The current status of the topic detection job. If the status is Failed, the reason for the failure is shown in the Message field.
         */
    var JobStatus: js.UndefOr[JobStatus] = js.undefined
    /**
         * A description for the status of a job.
         */
    var Message: js.UndefOr[AnyLengthString] = js.undefined
    /**
         * The number of topics to detect supplied when you created the topic detection job. The default is 10. 
         */
    var NumberOfTopics: js.UndefOr[Integer] = js.undefined
    /**
         * The output data configuration supplied when you created the topic detection job.
         */
    var OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
    /**
         * The time that the topic detection job was submitted for processing.
         */
    var SubmitTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
       */
    def batchDetectDominantLanguage(): awsDashSdkLib.libRequestMod.Request[BatchDetectDominantLanguageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
       */
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
    /**
       * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
       */
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
    /**
       * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
       */
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
    /**
       * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
       */
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
    /**
       * Detects the key noun phrases found in a batch of documents.
       */
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
    /**
       * Detects the key noun phrases found in a batch of documents.
       */
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
    /**
       * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
       */
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
    /**
       * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
       */
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
    /**
       * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
       */
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
    /**
       * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
       */
    def batchDetectSyntax(
      params: BatchDetectSyntaxRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDetectSyntaxResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
       */
    def describeDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[DescribeDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
       */
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
    /**
       * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
       */
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
    /**
       * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
       */
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
    /**
       * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
       */
    def describeEntitiesDetectionJob(
      params: DescribeEntitiesDetectionJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEntitiesDetectionJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
       */
    def describeKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[DescribeKeyPhrasesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
       */
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
    /**
       * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
       */
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
    /**
       * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
       */
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
    /**
       * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
       */
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
    /**
       * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
       */
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
    /**
       * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
       */
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
    /**
       * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
       */
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
    /**
       * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
       */
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
    /**
       * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
       */
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
    /**
       * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
       */
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
    /**
       * Detects the key noun phrases found in the text. 
       */
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
    /**
       * Detects the key noun phrases found in the text. 
       */
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
    /**
       * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
       */
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
    /**
       * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
       */
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
    /**
       * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
       */
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
    /**
       * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
       */
    def detectSyntax(
      params: DetectSyntaxRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectSyntaxResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectSyntaxResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of the dominant language detection jobs that you have submitted.
       */
    def listDominantLanguageDetectionJobs(): awsDashSdkLib.libRequestMod.Request[ListDominantLanguageDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of the dominant language detection jobs that you have submitted.
       */
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
    /**
       * Gets a list of the dominant language detection jobs that you have submitted.
       */
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
    /**
       * Gets a list of the entity detection jobs that you have submitted.
       */
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
    /**
       * Gets a list of the entity detection jobs that you have submitted.
       */
    def listEntitiesDetectionJobs(
      params: ListEntitiesDetectionJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEntitiesDetectionJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEntitiesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Get a list of key phrase detection jobs that you have submitted.
       */
    def listKeyPhrasesDetectionJobs(): awsDashSdkLib.libRequestMod.Request[ListKeyPhrasesDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Get a list of key phrase detection jobs that you have submitted.
       */
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
    /**
       * Get a list of key phrase detection jobs that you have submitted.
       */
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
    /**
       * Gets a list of sentiment detection jobs that you have submitted.
       */
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
    /**
       * Gets a list of sentiment detection jobs that you have submitted.
       */
    def listSentimentDetectionJobs(
      params: ListSentimentDetectionJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSentimentDetectionJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSentimentDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of the topic detection jobs that you have submitted.
       */
    def listTopicsDetectionJobs(): awsDashSdkLib.libRequestMod.Request[ListTopicsDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of the topic detection jobs that you have submitted.
       */
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
    /**
       * Gets a list of the topic detection jobs that you have submitted.
       */
    def listTopicsDetectionJobs(
      params: ListTopicsDetectionJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTopicsDetectionJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTopicsDetectionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
       */
    def startDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[StartDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
       */
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
    /**
       * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
       */
    def startDominantLanguageDetectionJob(
      params: StartDominantLanguageDetectionJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDominantLanguageDetectionJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDominantLanguageDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job.
       */
    def startEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[StartEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job.
       */
    def startEntitiesDetectionJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartEntitiesDetectionJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job.
       */
    def startEntitiesDetectionJob(params: StartEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[StartEntitiesDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job.
       */
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
    /**
       * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
       */
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
    /**
       * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
       */
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
    /**
       * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
       */
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
    /**
       * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
       */
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
    /**
       * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
       */
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
    /**
       * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
       */
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
    /**
       * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
       */
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
    /**
       * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
       */
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
    /**
       * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
       */
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
    /**
       * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
       */
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
    /**
       * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
       */
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
    /**
       * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
       */
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
    /**
       * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
       */
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
    /**
       * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
       */
    def stopSentimentDetectionJob(
      params: StopSentimentDetectionJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopSentimentDetectionJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopSentimentDetectionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type AnyLengthString = java.lang.String
  type BatchItemErrorList = js.Array[BatchItemError]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type DominantLanguageDetectionJobPropertiesList = js.Array[DominantLanguageDetectionJobProperties]
  type EntitiesDetectionJobPropertiesList = js.Array[EntitiesDetectionJobProperties]
  type EntityType = awsDashSdkLib.awsDashSdkLibStrings.PERSON | awsDashSdkLib.awsDashSdkLibStrings.LOCATION | awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION | awsDashSdkLib.awsDashSdkLibStrings.COMMERCIAL_ITEM | awsDashSdkLib.awsDashSdkLibStrings.EVENT | awsDashSdkLib.awsDashSdkLibStrings.DATE | awsDashSdkLib.awsDashSdkLibStrings.QUANTITY | awsDashSdkLib.awsDashSdkLibStrings.TITLE | awsDashSdkLib.awsDashSdkLibStrings.OTHER | java.lang.String
  type Float = scala.Double
  type IamRoleArn = java.lang.String
  type InputFormat = awsDashSdkLib.awsDashSdkLibStrings.ONE_DOC_PER_FILE | awsDashSdkLib.awsDashSdkLibStrings.ONE_DOC_PER_LINE | java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobName = java.lang.String
  type JobStatus = awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.STOP_REQUESTED | awsDashSdkLib.awsDashSdkLibStrings.STOPPED | java.lang.String
  type KeyPhrasesDetectionJobPropertiesList = js.Array[KeyPhrasesDetectionJobProperties]
  type LanguageCode = awsDashSdkLib.awsDashSdkLibStrings.en | awsDashSdkLib.awsDashSdkLibStrings.es | awsDashSdkLib.awsDashSdkLibStrings.fr | awsDashSdkLib.awsDashSdkLibStrings.de | awsDashSdkLib.awsDashSdkLibStrings.it | awsDashSdkLib.awsDashSdkLibStrings.pt | java.lang.String
  type ListOfDetectDominantLanguageResult = js.Array[BatchDetectDominantLanguageItemResult]
  type ListOfDetectEntitiesResult = js.Array[BatchDetectEntitiesItemResult]
  type ListOfDetectKeyPhrasesResult = js.Array[BatchDetectKeyPhrasesItemResult]
  type ListOfDetectSentimentResult = js.Array[BatchDetectSentimentItemResult]
  type ListOfDetectSyntaxResult = js.Array[BatchDetectSyntaxItemResult]
  type ListOfDominantLanguages = js.Array[DominantLanguage]
  type ListOfEntities = js.Array[Entity]
  type ListOfKeyPhrases = js.Array[KeyPhrase]
  type ListOfSyntaxTokens = js.Array[SyntaxToken]
  type MaxResultsInteger = scala.Double
  type NumberOfTopicsInteger = scala.Double
  type PartOfSpeechTagType = awsDashSdkLib.awsDashSdkLibStrings.ADJ | awsDashSdkLib.awsDashSdkLibStrings.ADP | awsDashSdkLib.awsDashSdkLibStrings.ADV | awsDashSdkLib.awsDashSdkLibStrings.AUX | awsDashSdkLib.awsDashSdkLibStrings.CONJ | awsDashSdkLib.awsDashSdkLibStrings.DET | awsDashSdkLib.awsDashSdkLibStrings.INTJ | awsDashSdkLib.awsDashSdkLibStrings.NOUN | awsDashSdkLib.awsDashSdkLibStrings.NUM | awsDashSdkLib.awsDashSdkLibStrings.O | awsDashSdkLib.awsDashSdkLibStrings.PART | awsDashSdkLib.awsDashSdkLibStrings.PRON | awsDashSdkLib.awsDashSdkLibStrings.PROPN | awsDashSdkLib.awsDashSdkLibStrings.PUNCT | awsDashSdkLib.awsDashSdkLibStrings.SCONJ | awsDashSdkLib.awsDashSdkLibStrings.SYM | awsDashSdkLib.awsDashSdkLibStrings.VERB | java.lang.String
  type S3Uri = java.lang.String
  type SentimentDetectionJobPropertiesList = js.Array[SentimentDetectionJobProperties]
  type SentimentType = awsDashSdkLib.awsDashSdkLibStrings.POSITIVE | awsDashSdkLib.awsDashSdkLibStrings.NEGATIVE | awsDashSdkLib.awsDashSdkLibStrings.NEUTRAL | awsDashSdkLib.awsDashSdkLibStrings.MIXED | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[java.lang.String]
  type SyntaxLanguageCode = awsDashSdkLib.awsDashSdkLibStrings.en | awsDashSdkLib.awsDashSdkLibStrings.es | awsDashSdkLib.awsDashSdkLibStrings.fr | awsDashSdkLib.awsDashSdkLibStrings.de | awsDashSdkLib.awsDashSdkLibStrings.it | awsDashSdkLib.awsDashSdkLibStrings.pt | java.lang.String
  type Timestamp = stdLib.Date
  type TopicsDetectionJobPropertiesList = js.Array[TopicsDetectionJobProperties]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-11-27` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

