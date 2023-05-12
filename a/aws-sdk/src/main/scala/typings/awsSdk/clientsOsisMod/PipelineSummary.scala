package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineSummary extends StObject {
  
  /**
    * The date and time when the pipeline was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the pipeline was last updated.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
    */
  var MaxUnits: js.UndefOr[PipelineUnits] = js.undefined
  
  /**
    * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
    */
  var MinUnits: js.UndefOr[PipelineUnits] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var PipelineArn: js.UndefOr[typings.awsSdk.clientsOsisMod.PipelineArn] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var PipelineName: js.UndefOr[typings.awsSdk.clientsOsisMod.PipelineName] = js.undefined
  
  /**
    * The current status of the pipeline.
    */
  var Status: js.UndefOr[PipelineStatus] = js.undefined
  
  var StatusReason: js.UndefOr[PipelineStatusReason] = js.undefined
}
object PipelineSummary {
  
  inline def apply(): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setMaxUnits(value: PipelineUnits): Self = StObject.set(x, "MaxUnits", value.asInstanceOf[js.Any])
    
    inline def setMaxUnitsUndefined: Self = StObject.set(x, "MaxUnits", js.undefined)
    
    inline def setMinUnits(value: PipelineUnits): Self = StObject.set(x, "MinUnits", value.asInstanceOf[js.Any])
    
    inline def setMinUnitsUndefined: Self = StObject.set(x, "MinUnits", js.undefined)
    
    inline def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "PipelineArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineArnUndefined: Self = StObject.set(x, "PipelineArn", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineNameUndefined: Self = StObject.set(x, "PipelineName", js.undefined)
    
    inline def setStatus(value: PipelineStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: PipelineStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
