package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerHistory extends StObject {
  
  /**
    * A UUID identifier for each crawl.
    */
  var CrawlId: js.UndefOr[typings.awsSdk.clientsGlueMod.CrawlId] = js.undefined
  
  /**
    * The number of data processing units (DPU) used in hours for the crawl.
    */
  var DPUHour: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * The date and time on which the crawl ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, the error message associated with the crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The log group associated with the crawl.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.clientsGlueMod.LogGroup] = js.undefined
  
  /**
    * The log stream associated with the crawl.
    */
  var LogStream: js.UndefOr[typings.awsSdk.clientsGlueMod.LogStream] = js.undefined
  
  /**
    * The prefix for a CloudWatch message about this crawl.
    */
  var MessagePrefix: js.UndefOr[typings.awsSdk.clientsGlueMod.MessagePrefix] = js.undefined
  
  /**
    * The date and time on which the crawl started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the crawl.
    */
  var State: js.UndefOr[CrawlerHistoryState] = js.undefined
  
  /**
    * A run summary for the specific crawl in JSON. Contains the catalog tables and partitions that were added, updated, or deleted.
    */
  var Summary: js.UndefOr[NameString] = js.undefined
}
object CrawlerHistory {
  
  inline def apply(): CrawlerHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerHistory]
  }
  
  extension [Self <: CrawlerHistory](x: Self) {
    
    inline def setCrawlId(value: CrawlId): Self = StObject.set(x, "CrawlId", value.asInstanceOf[js.Any])
    
    inline def setCrawlIdUndefined: Self = StObject.set(x, "CrawlId", js.undefined)
    
    inline def setDPUHour(value: NonNegativeDouble): Self = StObject.set(x, "DPUHour", value.asInstanceOf[js.Any])
    
    inline def setDPUHourUndefined: Self = StObject.set(x, "DPUHour", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setErrorMessage(value: DescriptionString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLogGroup(value: LogGroup): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
    
    inline def setLogStream(value: LogStream): Self = StObject.set(x, "LogStream", value.asInstanceOf[js.Any])
    
    inline def setLogStreamUndefined: Self = StObject.set(x, "LogStream", js.undefined)
    
    inline def setMessagePrefix(value: MessagePrefix): Self = StObject.set(x, "MessagePrefix", value.asInstanceOf[js.Any])
    
    inline def setMessagePrefixUndefined: Self = StObject.set(x, "MessagePrefix", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: CrawlerHistoryState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSummary(value: NameString): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
  }
}
