package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineInfo extends StObject {
  
  /**
    * The time when the pipeline info was configured.
    */
  var pipelineConfigurationTimeStamp: js.UndefOr[String] = js.undefined
  
  /**
    * The type of pipeline.
    */
  var pipelineType: js.UndefOr[PipelineType] = js.undefined
}
object PipelineInfo {
  
  inline def apply(): PipelineInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineInfo] (val x: Self) extends AnyVal {
    
    inline def setPipelineConfigurationTimeStamp(value: String): Self = StObject.set(x, "pipelineConfigurationTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setPipelineConfigurationTimeStampUndefined: Self = StObject.set(x, "pipelineConfigurationTimeStamp", js.undefined)
    
    inline def setPipelineType(value: PipelineType): Self = StObject.set(x, "pipelineType", value.asInstanceOf[js.Any])
    
    inline def setPipelineTypeUndefined: Self = StObject.set(x, "pipelineType", js.undefined)
  }
}
