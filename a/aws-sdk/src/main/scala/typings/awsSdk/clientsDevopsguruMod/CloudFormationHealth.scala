package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFormationHealth extends StObject {
  
  /**
    *  Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services CloudFormation stack. 
    */
  var AnalyzedResourceCount: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnalyzedResourceCount] = js.undefined
  
  /**
    *  Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon Web Services CloudFormation stack, including the number of open proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights. 
    */
  var Insight: js.UndefOr[InsightHealth] = js.undefined
  
  /**
    *  The name of the CloudFormation stack. 
    */
  var StackName: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.StackName] = js.undefined
}
object CloudFormationHealth {
  
  inline def apply(): CloudFormationHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationHealth]
  }
  
  extension [Self <: CloudFormationHealth](x: Self) {
    
    inline def setAnalyzedResourceCount(value: AnalyzedResourceCount): Self = StObject.set(x, "AnalyzedResourceCount", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedResourceCountUndefined: Self = StObject.set(x, "AnalyzedResourceCount", js.undefined)
    
    inline def setInsight(value: InsightHealth): Self = StObject.set(x, "Insight", value.asInstanceOf[js.Any])
    
    inline def setInsightUndefined: Self = StObject.set(x, "Insight", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
