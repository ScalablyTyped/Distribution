package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsConnectcontactlensMod {
  
  @JSImport("aws-sdk/clients/connectcontactlens", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends ConnectContactLens {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  trait Categories extends StObject {
    
    /**
      * The category rules that have been matched in the analyzed segment.
      */
    var MatchedCategories: typings.awsSdk.clientsConnectcontactlensMod.MatchedCategories
    
    /**
      * The category rule that was matched and when it occurred in the transcript.
      */
    var MatchedDetails: typings.awsSdk.clientsConnectcontactlensMod.MatchedDetails
  }
  object Categories {
    
    inline def apply(MatchedCategories: MatchedCategories, MatchedDetails: MatchedDetails): Categories = {
      val __obj = js.Dynamic.literal(MatchedCategories = MatchedCategories.asInstanceOf[js.Any], MatchedDetails = MatchedDetails.asInstanceOf[js.Any])
      __obj.asInstanceOf[Categories]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Categories] (val x: Self) extends AnyVal {
      
      inline def setMatchedCategories(value: MatchedCategories): Self = StObject.set(x, "MatchedCategories", value.asInstanceOf[js.Any])
      
      inline def setMatchedCategoriesVarargs(value: CategoryName*): Self = StObject.set(x, "MatchedCategories", js.Array(value*))
      
      inline def setMatchedDetails(value: MatchedDetails): Self = StObject.set(x, "MatchedDetails", value.asInstanceOf[js.Any])
    }
  }
  
  trait CategoryDetails extends StObject {
    
    /**
      * The section of audio where the category rule was detected.
      */
    var PointsOfInterest: typings.awsSdk.clientsConnectcontactlensMod.PointsOfInterest
  }
  object CategoryDetails {
    
    inline def apply(PointsOfInterest: PointsOfInterest): CategoryDetails = {
      val __obj = js.Dynamic.literal(PointsOfInterest = PointsOfInterest.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CategoryDetails] (val x: Self) extends AnyVal {
      
      inline def setPointsOfInterest(value: PointsOfInterest): Self = StObject.set(x, "PointsOfInterest", value.asInstanceOf[js.Any])
      
      inline def setPointsOfInterestVarargs(value: PointOfInterest*): Self = StObject.set(x, "PointsOfInterest", js.Array(value*))
    }
  }
  
  type CategoryName = String
  
  type CharacterOffset = Double
  
  trait CharacterOffsets extends StObject {
    
    /**
      * The beginning of the issue.
      */
    var BeginOffsetChar: CharacterOffset
    
    /**
      * The end of the issue.
      */
    var EndOffsetChar: CharacterOffset
  }
  object CharacterOffsets {
    
    inline def apply(BeginOffsetChar: CharacterOffset, EndOffsetChar: CharacterOffset): CharacterOffsets = {
      val __obj = js.Dynamic.literal(BeginOffsetChar = BeginOffsetChar.asInstanceOf[js.Any], EndOffsetChar = EndOffsetChar.asInstanceOf[js.Any])
      __obj.asInstanceOf[CharacterOffsets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CharacterOffsets] (val x: Self) extends AnyVal {
      
      inline def setBeginOffsetChar(value: CharacterOffset): Self = StObject.set(x, "BeginOffsetChar", value.asInstanceOf[js.Any])
      
      inline def setEndOffsetChar(value: CharacterOffset): Self = StObject.set(x, "EndOffsetChar", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsConnectcontactlensMod.apiVersion] = js.undefined
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
  trait ConnectContactLens extends Service {
    
    @JSName("config")
    var config_ConnectContactLens: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Provides a list of analysis segments for a real-time analysis session.
      */
    def listRealtimeContactAnalysisSegments(): Request[ListRealtimeContactAnalysisSegmentsResponse, AWSError] = js.native
    def listRealtimeContactAnalysisSegments(
      callback: js.Function2[/* err */ AWSError, /* data */ ListRealtimeContactAnalysisSegmentsResponse, Unit]
    ): Request[ListRealtimeContactAnalysisSegmentsResponse, AWSError] = js.native
    /**
      * Provides a list of analysis segments for a real-time analysis session.
      */
    def listRealtimeContactAnalysisSegments(params: ListRealtimeContactAnalysisSegmentsRequest): Request[ListRealtimeContactAnalysisSegmentsResponse, AWSError] = js.native
    def listRealtimeContactAnalysisSegments(
      params: ListRealtimeContactAnalysisSegmentsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListRealtimeContactAnalysisSegmentsResponse, Unit]
    ): Request[ListRealtimeContactAnalysisSegmentsResponse, AWSError] = js.native
  }
  
  type ContactId = String
  
  type InstanceId = String
  
  trait IssueDetected extends StObject {
    
    /**
      * The offset for when the issue was detected in the segment.
      */
    var CharacterOffsets: typings.awsSdk.clientsConnectcontactlensMod.CharacterOffsets
  }
  object IssueDetected {
    
    inline def apply(CharacterOffsets: CharacterOffsets): IssueDetected = {
      val __obj = js.Dynamic.literal(CharacterOffsets = CharacterOffsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueDetected]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IssueDetected] (val x: Self) extends AnyVal {
      
      inline def setCharacterOffsets(value: CharacterOffsets): Self = StObject.set(x, "CharacterOffsets", value.asInstanceOf[js.Any])
    }
  }
  
  type IssuesDetected = js.Array[IssueDetected]
  
  trait ListRealtimeContactAnalysisSegmentsRequest extends StObject {
    
    /**
      * The identifier of the contact.
      */
    var ContactId: typings.awsSdk.clientsConnectcontactlensMod.ContactId
    
    /**
      * The identifier of the Amazon Connect instance.
      */
    var InstanceId: typings.awsSdk.clientsConnectcontactlensMod.InstanceId
    
    /**
      * The maximimum number of results to return per page.
      */
    var MaxResults: js.UndefOr[typings.awsSdk.clientsConnectcontactlensMod.MaxResults] = js.undefined
    
    /**
      * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
      */
    var NextToken: js.UndefOr[typings.awsSdk.clientsConnectcontactlensMod.NextToken] = js.undefined
  }
  object ListRealtimeContactAnalysisSegmentsRequest {
    
    inline def apply(ContactId: ContactId, InstanceId: InstanceId): ListRealtimeContactAnalysisSegmentsRequest = {
      val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRealtimeContactAnalysisSegmentsRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListRealtimeContactAnalysisSegmentsRequest] (val x: Self) extends AnyVal {
      
      inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
      
      inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
      
      inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait ListRealtimeContactAnalysisSegmentsResponse extends StObject {
    
    /**
      * If there are additional results, this is the token for the next set of results. If response includes nextToken there are two possible scenarios:   There are more segments so another call is required to get them.   There are no more segments at this time, but more may be available later (real-time analysis is in progress) so the client should call the operation again to get new segments.   If response does not include nextToken, the analysis is completed (successfully or failed) and there are no more segments to retrieve.
      */
    var NextToken: js.UndefOr[typings.awsSdk.clientsConnectcontactlensMod.NextToken] = js.undefined
    
    /**
      * An analyzed transcript or category.
      */
    var Segments: RealtimeContactAnalysisSegments
  }
  object ListRealtimeContactAnalysisSegmentsResponse {
    
    inline def apply(Segments: RealtimeContactAnalysisSegments): ListRealtimeContactAnalysisSegmentsResponse = {
      val __obj = js.Dynamic.literal(Segments = Segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRealtimeContactAnalysisSegmentsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListRealtimeContactAnalysisSegmentsResponse] (val x: Self) extends AnyVal {
      
      inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setSegments(value: RealtimeContactAnalysisSegments): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: RealtimeContactAnalysisSegment*): Self = StObject.set(x, "Segments", js.Array(value*))
    }
  }
  
  type MatchedCategories = js.Array[CategoryName]
  
  type MatchedDetails = StringDictionary[CategoryDetails]
  
  type MaxResults = Double
  
  type NextToken = String
  
  type OffsetMillis = Double
  
  type ParticipantId = String
  
  type ParticipantRole = String
  
  trait PointOfInterest extends StObject {
    
    /**
      * The beginning offset in milliseconds where the category rule was detected.
      */
    var BeginOffsetMillis: OffsetMillis
    
    /**
      * The ending offset in milliseconds where the category rule was detected.
      */
    var EndOffsetMillis: OffsetMillis
  }
  object PointOfInterest {
    
    inline def apply(BeginOffsetMillis: OffsetMillis, EndOffsetMillis: OffsetMillis): PointOfInterest = {
      val __obj = js.Dynamic.literal(BeginOffsetMillis = BeginOffsetMillis.asInstanceOf[js.Any], EndOffsetMillis = EndOffsetMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointOfInterest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointOfInterest] (val x: Self) extends AnyVal {
      
      inline def setBeginOffsetMillis(value: OffsetMillis): Self = StObject.set(x, "BeginOffsetMillis", value.asInstanceOf[js.Any])
      
      inline def setEndOffsetMillis(value: OffsetMillis): Self = StObject.set(x, "EndOffsetMillis", value.asInstanceOf[js.Any])
    }
  }
  
  type PointsOfInterest = js.Array[PointOfInterest]
  
  trait RealtimeContactAnalysisSegment extends StObject {
    
    /**
      * The matched category rules.
      */
    var Categories: js.UndefOr[typings.awsSdk.clientsConnectcontactlensMod.Categories] = js.undefined
    
    /**
      * The analyzed transcript.
      */
    var Transcript: js.UndefOr[typings.awsSdk.clientsConnectcontactlensMod.Transcript] = js.undefined
  }
  object RealtimeContactAnalysisSegment {
    
    inline def apply(): RealtimeContactAnalysisSegment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RealtimeContactAnalysisSegment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RealtimeContactAnalysisSegment] (val x: Self) extends AnyVal {
      
      inline def setCategories(value: Categories): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "Categories", js.undefined)
      
      inline def setTranscript(value: Transcript): Self = StObject.set(x, "Transcript", value.asInstanceOf[js.Any])
      
      inline def setTranscriptUndefined: Self = StObject.set(x, "Transcript", js.undefined)
    }
  }
  
  type RealtimeContactAnalysisSegments = js.Array[RealtimeContactAnalysisSegment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.POSITIVE
    - typings.awsSdk.awsSdkStrings.NEUTRAL
    - typings.awsSdk.awsSdkStrings.NEGATIVE
    - java.lang.String
  */
  type SentimentValue = _SentimentValue | String
  
  trait Transcript extends StObject {
    
    /**
      * The beginning offset in the contact for this transcript.
      */
    var BeginOffsetMillis: OffsetMillis
    
    /**
      * The content of the transcript.
      */
    var Content: TranscriptContent
    
    /**
      * The end offset in the contact for this transcript.
      */
    var EndOffsetMillis: OffsetMillis
    
    /**
      * The identifier of the transcript.
      */
    var Id: TranscriptId
    
    /**
      * List of positions where issues were detected on the transcript.
      */
    var IssuesDetected: js.UndefOr[typings.awsSdk.clientsConnectcontactlensMod.IssuesDetected] = js.undefined
    
    /**
      * The identifier of the participant.
      */
    var ParticipantId: typings.awsSdk.clientsConnectcontactlensMod.ParticipantId
    
    /**
      * The role of participant. For example, is it a customer, agent, or system.
      */
    var ParticipantRole: typings.awsSdk.clientsConnectcontactlensMod.ParticipantRole
    
    /**
      * The sentiment of the detected for this piece of transcript.
      */
    var Sentiment: SentimentValue
  }
  object Transcript {
    
    inline def apply(
      BeginOffsetMillis: OffsetMillis,
      Content: TranscriptContent,
      EndOffsetMillis: OffsetMillis,
      Id: TranscriptId,
      ParticipantId: ParticipantId,
      ParticipantRole: ParticipantRole,
      Sentiment: SentimentValue
    ): Transcript = {
      val __obj = js.Dynamic.literal(BeginOffsetMillis = BeginOffsetMillis.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], EndOffsetMillis = EndOffsetMillis.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ParticipantId = ParticipantId.asInstanceOf[js.Any], ParticipantRole = ParticipantRole.asInstanceOf[js.Any], Sentiment = Sentiment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transcript]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transcript] (val x: Self) extends AnyVal {
      
      inline def setBeginOffsetMillis(value: OffsetMillis): Self = StObject.set(x, "BeginOffsetMillis", value.asInstanceOf[js.Any])
      
      inline def setContent(value: TranscriptContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setEndOffsetMillis(value: OffsetMillis): Self = StObject.set(x, "EndOffsetMillis", value.asInstanceOf[js.Any])
      
      inline def setId(value: TranscriptId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIssuesDetected(value: IssuesDetected): Self = StObject.set(x, "IssuesDetected", value.asInstanceOf[js.Any])
      
      inline def setIssuesDetectedUndefined: Self = StObject.set(x, "IssuesDetected", js.undefined)
      
      inline def setIssuesDetectedVarargs(value: IssueDetected*): Self = StObject.set(x, "IssuesDetected", js.Array(value*))
      
      inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "ParticipantId", value.asInstanceOf[js.Any])
      
      inline def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
      
      inline def setSentiment(value: SentimentValue): Self = StObject.set(x, "Sentiment", value.asInstanceOf[js.Any])
    }
  }
  
  type TranscriptContent = String
  
  type TranscriptId = String
  
  trait _SentimentValue extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2020-08-21`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
