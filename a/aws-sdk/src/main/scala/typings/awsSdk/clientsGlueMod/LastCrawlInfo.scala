package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastCrawlInfo extends StObject {
  
  /**
    * If an error occurred, the error information about the last crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The log group for the last crawl.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.clientsGlueMod.LogGroup] = js.undefined
  
  /**
    * The log stream for the last crawl.
    */
  var LogStream: js.UndefOr[typings.awsSdk.clientsGlueMod.LogStream] = js.undefined
  
  /**
    * The prefix for a message about this crawl.
    */
  var MessagePrefix: js.UndefOr[typings.awsSdk.clientsGlueMod.MessagePrefix] = js.undefined
  
  /**
    * The time at which the crawl started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status of the last crawl.
    */
  var Status: js.UndefOr[LastCrawlStatus] = js.undefined
}
object LastCrawlInfo {
  
  inline def apply(): LastCrawlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastCrawlInfo]
  }
  
  extension [Self <: LastCrawlInfo](x: Self) {
    
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
    
    inline def setStatus(value: LastCrawlStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
