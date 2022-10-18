package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectBuildBatchConfig extends StObject {
  
  /**
    * Specifies how build status reports are sent to the source provider for the batch build. This property is only used when the source provider for your project is Bitbucket, GitHub, or GitHub Enterprise, and your project is configured to report build statuses to the source provider.  REPORT_AGGREGATED_BATCH  (Default) Aggregate all of the build statuses into a single status report.  REPORT_INDIVIDUAL_BUILDS  Send a separate status report for each individual build.  
    */
  var batchReportMode: js.UndefOr[BatchReportModeType] = js.undefined
  
  /**
    * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
    */
  var combineArtifacts: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * A BatchRestrictions object that specifies the restrictions for the batch build.
    */
  var restrictions: js.UndefOr[BatchRestrictions] = js.undefined
  
  /**
    * Specifies the service role ARN for the batch build project.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
    */
  var timeoutInMins: js.UndefOr[WrapperInt] = js.undefined
}
object ProjectBuildBatchConfig {
  
  inline def apply(): ProjectBuildBatchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectBuildBatchConfig]
  }
  
  extension [Self <: ProjectBuildBatchConfig](x: Self) {
    
    inline def setBatchReportMode(value: BatchReportModeType): Self = StObject.set(x, "batchReportMode", value.asInstanceOf[js.Any])
    
    inline def setBatchReportModeUndefined: Self = StObject.set(x, "batchReportMode", js.undefined)
    
    inline def setCombineArtifacts(value: WrapperBoolean): Self = StObject.set(x, "combineArtifacts", value.asInstanceOf[js.Any])
    
    inline def setCombineArtifactsUndefined: Self = StObject.set(x, "combineArtifacts", js.undefined)
    
    inline def setRestrictions(value: BatchRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setServiceRole(value: NonEmptyString): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    inline def setTimeoutInMins(value: WrapperInt): Self = StObject.set(x, "timeoutInMins", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinsUndefined: Self = StObject.set(x, "timeoutInMins", js.undefined)
  }
}
