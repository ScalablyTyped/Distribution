package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzerSummary extends StObject {
  
  /**
    * The ARN of the analyzer.
    */
  var arn: AnalyzerArn
  
  /**
    * A timestamp for the time at which the analyzer was created.
    */
  var createdAt: js.Date
  
  /**
    * The resource that was most recently analyzed by the analyzer.
    */
  var lastResourceAnalyzed: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the most recently analyzed resource was analyzed.
    */
  var lastResourceAnalyzedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the analyzer.
    */
  var name: Name
  
  /**
    * The status of the analyzer. An Active analyzer successfully monitors supported resources and generates new findings. The analyzer is Disabled when a user action, such as removing trusted access for Identity and Access Management Access Analyzer from Organizations, causes the analyzer to stop generating new findings. The status is Creating when the analyzer creation is in progress and Failed when the analyzer creation has failed. 
    */
  var status: AnalyzerStatus
  
  /**
    * The statusReason provides more details about the current status of the analyzer. For example, if the creation for the analyzer fails, a Failed status is returned. For an analyzer with organization as the type, this failure can be due to an issue with creating the service-linked roles required in the member accounts of the Amazon Web Services organization.
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
  
  /**
    * The tags added to the analyzer.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
    */
  var `type`: Type
}
object AnalyzerSummary {
  
  inline def apply(arn: AnalyzerArn, createdAt: js.Date, name: Name, status: AnalyzerStatus, `type`: Type): AnalyzerSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzerSummary]
  }
  
  extension [Self <: AnalyzerSummary](x: Self) {
    
    inline def setArn(value: AnalyzerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setLastResourceAnalyzed(value: String): Self = StObject.set(x, "lastResourceAnalyzed", value.asInstanceOf[js.Any])
    
    inline def setLastResourceAnalyzedAt(value: js.Date): Self = StObject.set(x, "lastResourceAnalyzedAt", value.asInstanceOf[js.Any])
    
    inline def setLastResourceAnalyzedAtUndefined: Self = StObject.set(x, "lastResourceAnalyzedAt", js.undefined)
    
    inline def setLastResourceAnalyzedUndefined: Self = StObject.set(x, "lastResourceAnalyzed", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AnalyzerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
