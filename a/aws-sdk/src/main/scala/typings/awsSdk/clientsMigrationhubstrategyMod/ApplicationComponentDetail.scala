package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationComponentDetail extends StObject {
  
  /**
    *  The status of analysis, if the application component has source code or an associated database. 
    */
  var analysisStatus: js.UndefOr[SrcCodeOrDbAnalysisStatus] = js.undefined
  
  /**
    *  The S3 bucket name and the Amazon S3 key name for the anti-pattern report. 
    */
  var antipatternReportS3Object: js.UndefOr[S3Object] = js.undefined
  
  /**
    *  The status of the anti-pattern report generation.
    */
  var antipatternReportStatus: js.UndefOr[AntipatternReportStatus] = js.undefined
  
  /**
    *  The status message for the anti-pattern. 
    */
  var antipatternReportStatusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    *  The type of application component. 
    */
  var appType: js.UndefOr[AppType] = js.undefined
  
  /**
    *  The ID of the server that the application component is running on. 
    */
  var associatedServerId: js.UndefOr[ServerId] = js.undefined
  
  /**
    *  Configuration details for the database associated with the application component. 
    */
  var databaseConfigDetail: js.UndefOr[DatabaseConfigDetail] = js.undefined
  
  /**
    *  The ID of the application component. 
    */
  var id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    *  Indicates whether the application component has been included for server recommendation or not. 
    */
  var inclusionStatus: js.UndefOr[InclusionStatus] = js.undefined
  
  /**
    *  The timestamp of when the application component was assessed. 
    */
  var lastAnalyzedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  A list of anti-pattern severity summaries. 
    */
  var listAntipatternSeveritySummary: js.UndefOr[ListAntipatternSeveritySummary] = js.undefined
  
  /**
    *  Set to true if the application component is running on multiple servers.
    */
  var moreServerAssociationExists: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The name of application component. 
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    *  OS driver. 
    */
  var osDriver: js.UndefOr[String] = js.undefined
  
  /**
    *  OS version. 
    */
  var osVersion: js.UndefOr[String] = js.undefined
  
  /**
    *  The top recommendation set for the application component. 
    */
  var recommendationSet: js.UndefOr[RecommendationSet] = js.undefined
  
  /**
    *  The application component subtype.
    */
  var resourceSubType: js.UndefOr[ResourceSubType] = js.undefined
  
  /**
    *  Details about the source code repository associated with the application component. 
    */
  var sourceCodeRepositories: js.UndefOr[SourceCodeRepositories] = js.undefined
  
  /**
    *  A detailed description of the analysis status and any failure message. 
    */
  var statusMessage: js.UndefOr[StatusMessage] = js.undefined
}
object ApplicationComponentDetail {
  
  inline def apply(): ApplicationComponentDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationComponentDetail]
  }
  
  extension [Self <: ApplicationComponentDetail](x: Self) {
    
    inline def setAnalysisStatus(value: SrcCodeOrDbAnalysisStatus): Self = StObject.set(x, "analysisStatus", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStatusUndefined: Self = StObject.set(x, "analysisStatus", js.undefined)
    
    inline def setAntipatternReportS3Object(value: S3Object): Self = StObject.set(x, "antipatternReportS3Object", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportS3ObjectUndefined: Self = StObject.set(x, "antipatternReportS3Object", js.undefined)
    
    inline def setAntipatternReportStatus(value: AntipatternReportStatus): Self = StObject.set(x, "antipatternReportStatus", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportStatusMessage(value: StatusMessage): Self = StObject.set(x, "antipatternReportStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportStatusMessageUndefined: Self = StObject.set(x, "antipatternReportStatusMessage", js.undefined)
    
    inline def setAntipatternReportStatusUndefined: Self = StObject.set(x, "antipatternReportStatus", js.undefined)
    
    inline def setAppType(value: AppType): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
    
    inline def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
    
    inline def setAssociatedServerId(value: ServerId): Self = StObject.set(x, "associatedServerId", value.asInstanceOf[js.Any])
    
    inline def setAssociatedServerIdUndefined: Self = StObject.set(x, "associatedServerId", js.undefined)
    
    inline def setDatabaseConfigDetail(value: DatabaseConfigDetail): Self = StObject.set(x, "databaseConfigDetail", value.asInstanceOf[js.Any])
    
    inline def setDatabaseConfigDetailUndefined: Self = StObject.set(x, "databaseConfigDetail", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInclusionStatus(value: InclusionStatus): Self = StObject.set(x, "inclusionStatus", value.asInstanceOf[js.Any])
    
    inline def setInclusionStatusUndefined: Self = StObject.set(x, "inclusionStatus", js.undefined)
    
    inline def setLastAnalyzedTimestamp(value: js.Date): Self = StObject.set(x, "lastAnalyzedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastAnalyzedTimestampUndefined: Self = StObject.set(x, "lastAnalyzedTimestamp", js.undefined)
    
    inline def setListAntipatternSeveritySummary(value: ListAntipatternSeveritySummary): Self = StObject.set(x, "listAntipatternSeveritySummary", value.asInstanceOf[js.Any])
    
    inline def setListAntipatternSeveritySummaryUndefined: Self = StObject.set(x, "listAntipatternSeveritySummary", js.undefined)
    
    inline def setListAntipatternSeveritySummaryVarargs(value: AntipatternSeveritySummary*): Self = StObject.set(x, "listAntipatternSeveritySummary", js.Array(value*))
    
    inline def setMoreServerAssociationExists(value: Boolean): Self = StObject.set(x, "moreServerAssociationExists", value.asInstanceOf[js.Any])
    
    inline def setMoreServerAssociationExistsUndefined: Self = StObject.set(x, "moreServerAssociationExists", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOsDriver(value: String): Self = StObject.set(x, "osDriver", value.asInstanceOf[js.Any])
    
    inline def setOsDriverUndefined: Self = StObject.set(x, "osDriver", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setRecommendationSet(value: RecommendationSet): Self = StObject.set(x, "recommendationSet", value.asInstanceOf[js.Any])
    
    inline def setRecommendationSetUndefined: Self = StObject.set(x, "recommendationSet", js.undefined)
    
    inline def setResourceSubType(value: ResourceSubType): Self = StObject.set(x, "resourceSubType", value.asInstanceOf[js.Any])
    
    inline def setResourceSubTypeUndefined: Self = StObject.set(x, "resourceSubType", js.undefined)
    
    inline def setSourceCodeRepositories(value: SourceCodeRepositories): Self = StObject.set(x, "sourceCodeRepositories", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeRepositoriesUndefined: Self = StObject.set(x, "sourceCodeRepositories", js.undefined)
    
    inline def setSourceCodeRepositoriesVarargs(value: SourceCodeRepository*): Self = StObject.set(x, "sourceCodeRepositories", js.Array(value*))
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
