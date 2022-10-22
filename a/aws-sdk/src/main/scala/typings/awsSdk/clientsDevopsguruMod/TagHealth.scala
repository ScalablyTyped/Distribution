package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagHealth extends StObject {
  
  /**
    *  Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services tag. 
    */
  var AnalyzedResourceCount: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnalyzedResourceCount] = js.undefined
  
  /**
    * An Amazon Web Services tag key that is used to identify the Amazon Web Services resources that DevOps Guru analyzes. All Amazon Web Services resources in your account and Region tagged with this key make up your DevOps Guru application and analysis boundary.  The string used for a key in a tag that you use to define your resource coverage must begin with the prefix Devops-guru-. The tag key might be DevOps-Guru-deployment-application or devops-guru-rds-application. When you create a key, the case of characters in the key can be whatever you choose. After you create a key, it is case-sensitive. For example, DevOps Guru works with a key named devops-guru-rds and a key named DevOps-Guru-RDS, and these act as two different keys. Possible key/value pairs in your application might be Devops-Guru-production-application/RDS or Devops-Guru-production-application/containers. 
    */
  var AppBoundaryKey: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AppBoundaryKey] = js.undefined
  
  /**
    * Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon Web Services tag, including the number of open proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights. 
    */
  var Insight: js.UndefOr[InsightHealth] = js.undefined
  
  /**
    * The value in an Amazon Web Services tag. The tag's value is an optional field used to associate a string with the tag key (for example, 111122223333, Production, or a team name). The key and value are the tag's key pair. Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case-sensitive. You can specify a maximum of 256 characters for a tag value.
    */
  var TagValue: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.TagValue] = js.undefined
}
object TagHealth {
  
  inline def apply(): TagHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagHealth]
  }
  
  extension [Self <: TagHealth](x: Self) {
    
    inline def setAnalyzedResourceCount(value: AnalyzedResourceCount): Self = StObject.set(x, "AnalyzedResourceCount", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedResourceCountUndefined: Self = StObject.set(x, "AnalyzedResourceCount", js.undefined)
    
    inline def setAppBoundaryKey(value: AppBoundaryKey): Self = StObject.set(x, "AppBoundaryKey", value.asInstanceOf[js.Any])
    
    inline def setAppBoundaryKeyUndefined: Self = StObject.set(x, "AppBoundaryKey", js.undefined)
    
    inline def setInsight(value: InsightHealth): Self = StObject.set(x, "Insight", value.asInstanceOf[js.Any])
    
    inline def setInsightUndefined: Self = StObject.set(x, "Insight", js.undefined)
    
    inline def setTagValue(value: TagValue): Self = StObject.set(x, "TagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueUndefined: Self = StObject.set(x, "TagValue", js.undefined)
  }
}
