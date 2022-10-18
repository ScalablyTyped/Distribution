package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runbook extends StObject {
  
  /**
    * The name of the Automation runbook used in a runbook workflow.
    */
  var DocumentName: DocumentARN
  
  /**
    * The version of the Automation runbook used in a runbook workflow.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * The MaxConcurrency value specified by the user when the operation started, indicating the maximum number of resources that the runbook operation can run on at the same time.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  
  /**
    * The MaxErrors value specified by the user when the execution started, indicating the maximum number of errors that can occur during the operation before the updates are stopped or rolled back.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxErrors] = js.undefined
  
  /**
    * The key-value map of execution parameters, which were supplied when calling StartChangeRequestExecution.
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
  
  /**
    * Information about the Amazon Web Services Regions and Amazon Web Services accounts targeted by the current Runbook operation.
    */
  var TargetLocations: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetLocations] = js.undefined
  
  /**
    * A key-value mapping of runbook parameters to target resources. Both Targets and TargetMaps can't be specified together.
    */
  var TargetMaps: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetMaps] = js.undefined
  
  /**
    * The name of the parameter used as the target resource for the rate-controlled runbook workflow. Required if you specify Targets. 
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined
  
  /**
    * A key-value mapping to target resources that the runbook operation performs tasks on. Required if you specify TargetParameterName.
    */
  var Targets: js.UndefOr[typings.awsSdk.clientsSsmMod.Targets] = js.undefined
}
object Runbook {
  
  inline def apply(DocumentName: DocumentARN): Runbook = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runbook]
  }
  
  extension [Self <: Runbook](x: Self) {
    
    inline def setDocumentName(value: DocumentARN): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setParameters(value: AutomationParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setTargetLocations(value: TargetLocations): Self = StObject.set(x, "TargetLocations", value.asInstanceOf[js.Any])
    
    inline def setTargetLocationsUndefined: Self = StObject.set(x, "TargetLocations", js.undefined)
    
    inline def setTargetLocationsVarargs(value: TargetLocation*): Self = StObject.set(x, "TargetLocations", js.Array(value*))
    
    inline def setTargetMaps(value: TargetMaps): Self = StObject.set(x, "TargetMaps", value.asInstanceOf[js.Any])
    
    inline def setTargetMapsUndefined: Self = StObject.set(x, "TargetMaps", js.undefined)
    
    inline def setTargetMapsVarargs(value: TargetMap*): Self = StObject.set(x, "TargetMaps", js.Array(value*))
    
    inline def setTargetParameterName(value: AutomationParameterKey): Self = StObject.set(x, "TargetParameterName", value.asInstanceOf[js.Any])
    
    inline def setTargetParameterNameUndefined: Self = StObject.set(x, "TargetParameterName", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
