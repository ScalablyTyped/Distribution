package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule extends StObject {
  
  /**
    * The condition configures when the pipeline should trigger a new image build. When the pipelineExecutionStartCondition is set to EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE, and you use semantic version filters on the base image or components in your image recipe, EC2 Image Builder will build a new image only when there are new versions of the image or components in your recipe that match the semantic version filter. When it is set to EXPRESSION_MATCH_ONLY, it will build a new image every time the CRON expression matches the current time. For semantic version syntax, see CreateComponent in the  EC2 Image Builder API Reference.
    */
  var pipelineExecutionStartCondition: js.UndefOr[PipelineExecutionStartCondition] = js.undefined
  
  /**
    * The cron expression determines how often EC2 Image Builder evaluates your pipelineExecutionStartCondition. For information on how to format a cron expression in Image Builder, see Use cron expressions in EC2 Image Builder.
    */
  var scheduleExpression: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timezone that applies to the scheduling expression. For example, "Etc/UTC", "America/Los_Angeles" in the IANA timezone format. If not specified this defaults to UTC.
    */
  var timezone: js.UndefOr[Timezone] = js.undefined
}
object Schedule {
  
  inline def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  extension [Self <: Schedule](x: Self) {
    
    inline def setPipelineExecutionStartCondition(value: PipelineExecutionStartCondition): Self = StObject.set(x, "pipelineExecutionStartCondition", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionStartConditionUndefined: Self = StObject.set(x, "pipelineExecutionStartCondition", js.undefined)
    
    inline def setScheduleExpression(value: NonEmptyString): Self = StObject.set(x, "scheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "scheduleExpression", js.undefined)
    
    inline def setTimezone(value: Timezone): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
