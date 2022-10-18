package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentSummary extends StObject {
  
  /**
    * When the experiment was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the experiment as displayed. If DisplayName isn't specified, ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExperimentArn] = js.undefined
  
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  var ExperimentSource: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExperimentSource] = js.undefined
  
  /**
    * When the experiment was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
}
object ExperimentSummary {
  
  inline def apply(): ExperimentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentSummary]
  }
  
  extension [Self <: ExperimentSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setExperimentArn(value: ExperimentArn): Self = StObject.set(x, "ExperimentArn", value.asInstanceOf[js.Any])
    
    inline def setExperimentArnUndefined: Self = StObject.set(x, "ExperimentArn", js.undefined)
    
    inline def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    inline def setExperimentNameUndefined: Self = StObject.set(x, "ExperimentName", js.undefined)
    
    inline def setExperimentSource(value: ExperimentSource): Self = StObject.set(x, "ExperimentSource", value.asInstanceOf[js.Any])
    
    inline def setExperimentSourceUndefined: Self = StObject.set(x, "ExperimentSource", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
