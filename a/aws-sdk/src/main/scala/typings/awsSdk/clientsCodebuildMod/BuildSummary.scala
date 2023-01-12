package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSummary extends StObject {
  
  /**
    * The batch build ARN.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the build group.  FAILED  The build group failed.  FAULT  The build group faulted.  IN_PROGRESS  The build group is still in progress.  STOPPED  The build group stopped.  SUCCEEDED  The build group succeeded.  TIMED_OUT  The build group timed out.  
    */
  var buildStatus: js.UndefOr[StatusType] = js.undefined
  
  /**
    * A ResolvedArtifact object that represents the primary build artifacts for the build group.
    */
  var primaryArtifact: js.UndefOr[ResolvedArtifact] = js.undefined
  
  /**
    * When the build was started, expressed in Unix time format.
    */
  var requestedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An array of ResolvedArtifact objects that represents the secondary build artifacts for the build group.
    */
  var secondaryArtifacts: js.UndefOr[ResolvedSecondaryArtifacts] = js.undefined
}
object BuildSummary {
  
  inline def apply(): BuildSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBuildStatus(value: StatusType): Self = StObject.set(x, "buildStatus", value.asInstanceOf[js.Any])
    
    inline def setBuildStatusUndefined: Self = StObject.set(x, "buildStatus", js.undefined)
    
    inline def setPrimaryArtifact(value: ResolvedArtifact): Self = StObject.set(x, "primaryArtifact", value.asInstanceOf[js.Any])
    
    inline def setPrimaryArtifactUndefined: Self = StObject.set(x, "primaryArtifact", js.undefined)
    
    inline def setRequestedOn(value: js.Date): Self = StObject.set(x, "requestedOn", value.asInstanceOf[js.Any])
    
    inline def setRequestedOnUndefined: Self = StObject.set(x, "requestedOn", js.undefined)
    
    inline def setSecondaryArtifacts(value: ResolvedSecondaryArtifacts): Self = StObject.set(x, "secondaryArtifacts", value.asInstanceOf[js.Any])
    
    inline def setSecondaryArtifactsUndefined: Self = StObject.set(x, "secondaryArtifacts", js.undefined)
    
    inline def setSecondaryArtifactsVarargs(value: ResolvedArtifact*): Self = StObject.set(x, "secondaryArtifacts", js.Array(value*))
  }
}
