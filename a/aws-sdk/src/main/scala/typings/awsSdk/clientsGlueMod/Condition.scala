package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * The state of the crawler to which this condition applies.
    */
  var CrawlState: js.UndefOr[typings.awsSdk.clientsGlueMod.CrawlState] = js.undefined
  
  /**
    * The name of the crawler to which this condition applies.
    */
  var CrawlerName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The name of the job whose JobRuns this condition applies to, and on which this trigger waits.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * A logical operator.
    */
  var LogicalOperator: js.UndefOr[typings.awsSdk.clientsGlueMod.LogicalOperator] = js.undefined
  
  /**
    * The condition state. Currently, the only job states that a trigger can listen for are SUCCEEDED, STOPPED, FAILED, and TIMEOUT. The only crawler states that a trigger can listen for are SUCCEEDED, FAILED, and CANCELLED.
    */
  var State: js.UndefOr[JobRunState] = js.undefined
}
object Condition {
  
  inline def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setCrawlState(value: CrawlState): Self = StObject.set(x, "CrawlState", value.asInstanceOf[js.Any])
    
    inline def setCrawlStateUndefined: Self = StObject.set(x, "CrawlState", js.undefined)
    
    inline def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
    
    inline def setCrawlerNameUndefined: Self = StObject.set(x, "CrawlerName", js.undefined)
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setLogicalOperator(value: LogicalOperator): Self = StObject.set(x, "LogicalOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperatorUndefined: Self = StObject.set(x, "LogicalOperator", js.undefined)
    
    inline def setState(value: JobRunState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
