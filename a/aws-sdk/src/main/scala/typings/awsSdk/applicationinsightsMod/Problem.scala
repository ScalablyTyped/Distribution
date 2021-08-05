package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Problem extends StObject {
  
  /**
    * The resource affected by the problem.
    */
  var AffectedResource: js.UndefOr[typings.awsSdk.applicationinsightsMod.AffectedResource] = js.undefined
  
  /**
    * The time when the problem ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.EndTime] = js.undefined
  
  /**
    * Feedback provided by the user about the problem.
    */
  var Feedback: js.UndefOr[typings.awsSdk.applicationinsightsMod.Feedback] = js.undefined
  
  /**
    * The ID of the problem.
    */
  var Id: js.UndefOr[ProblemId] = js.undefined
  
  /**
    * A detailed analysis of the problem using machine learning.
    */
  var Insights: js.UndefOr[typings.awsSdk.applicationinsightsMod.Insights] = js.undefined
  
  /**
    * The name of the resource group affected by the problem.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.undefined
  
  /**
    * A measure of the level of impact of the problem.
    */
  var SeverityLevel: js.UndefOr[typings.awsSdk.applicationinsightsMod.SeverityLevel] = js.undefined
  
  /**
    * The time when the problem started, in epoch seconds.
    */
  var StartTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.StartTime] = js.undefined
  
  /**
    * The status of the problem.
    */
  var Status: js.UndefOr[typings.awsSdk.applicationinsightsMod.Status] = js.undefined
  
  /**
    * The name of the problem.
    */
  var Title: js.UndefOr[typings.awsSdk.applicationinsightsMod.Title] = js.undefined
}
object Problem {
  
  inline def apply(): Problem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Problem]
  }
  
  extension [Self <: Problem](x: Self) {
    
    inline def setAffectedResource(value: AffectedResource): Self = StObject.set(x, "AffectedResource", value.asInstanceOf[js.Any])
    
    inline def setAffectedResourceUndefined: Self = StObject.set(x, "AffectedResource", js.undefined)
    
    inline def setEndTime(value: EndTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFeedback(value: Feedback): Self = StObject.set(x, "Feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "Feedback", js.undefined)
    
    inline def setId(value: ProblemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInsights(value: Insights): Self = StObject.set(x, "Insights", value.asInstanceOf[js.Any])
    
    inline def setInsightsUndefined: Self = StObject.set(x, "Insights", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
    
    inline def setSeverityLevel(value: SeverityLevel): Self = StObject.set(x, "SeverityLevel", value.asInstanceOf[js.Any])
    
    inline def setSeverityLevelUndefined: Self = StObject.set(x, "SeverityLevel", js.undefined)
    
    inline def setStartTime(value: StartTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTitle(value: Title): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
