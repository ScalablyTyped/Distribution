package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Problem extends StObject {
  
  /**
    * The resource affected by the problem.
    */
  var AffectedResource: js.UndefOr[typings.awsSdk.applicationinsightsMod.AffectedResource] = js.native
  
  /**
    * The time when the problem ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.EndTime] = js.native
  
  /**
    * Feedback provided by the user about the problem.
    */
  var Feedback: js.UndefOr[typings.awsSdk.applicationinsightsMod.Feedback] = js.native
  
  /**
    * The ID of the problem.
    */
  var Id: js.UndefOr[ProblemId] = js.native
  
  /**
    * A detailed analysis of the problem using machine learning.
    */
  var Insights: js.UndefOr[typings.awsSdk.applicationinsightsMod.Insights] = js.native
  
  /**
    * The name of the resource group affected by the problem.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
  
  /**
    * A measure of the level of impact of the problem.
    */
  var SeverityLevel: js.UndefOr[typings.awsSdk.applicationinsightsMod.SeverityLevel] = js.native
  
  /**
    * The time when the problem started, in epoch seconds.
    */
  var StartTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.StartTime] = js.native
  
  /**
    * The status of the problem.
    */
  var Status: js.UndefOr[typings.awsSdk.applicationinsightsMod.Status] = js.native
  
  /**
    * The name of the problem.
    */
  var Title: js.UndefOr[typings.awsSdk.applicationinsightsMod.Title] = js.native
}
object Problem {
  
  @scala.inline
  def apply(): Problem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Problem]
  }
  
  @scala.inline
  implicit class ProblemMutableBuilder[Self <: Problem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectedResource(value: AffectedResource): Self = StObject.set(x, "AffectedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectedResourceUndefined: Self = StObject.set(x, "AffectedResource", js.undefined)
    
    @scala.inline
    def setEndTime(value: EndTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setFeedback(value: Feedback): Self = StObject.set(x, "Feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackUndefined: Self = StObject.set(x, "Feedback", js.undefined)
    
    @scala.inline
    def setId(value: ProblemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInsights(value: Insights): Self = StObject.set(x, "Insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsUndefined: Self = StObject.set(x, "Insights", js.undefined)
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
    
    @scala.inline
    def setSeverityLevel(value: SeverityLevel): Self = StObject.set(x, "SeverityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityLevelUndefined: Self = StObject.set(x, "SeverityLevel", js.undefined)
    
    @scala.inline
    def setStartTime(value: StartTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTitle(value: Title): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
