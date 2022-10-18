package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crawl extends StObject {
  
  /**
    * The date and time on which the crawl completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The error message associated with the crawl.
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
    * The date and time on which the crawl started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the crawler.
    */
  var State: js.UndefOr[CrawlState] = js.undefined
}
object Crawl {
  
  inline def apply(): Crawl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crawl]
  }
  
  extension [Self <: Crawl](x: Self) {
    
    inline def setCompletedOn(value: js.Date): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setErrorMessage(value: DescriptionString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLogGroup(value: LogGroup): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
    
    inline def setLogStream(value: LogStream): Self = StObject.set(x, "LogStream", value.asInstanceOf[js.Any])
    
    inline def setLogStreamUndefined: Self = StObject.set(x, "LogStream", js.undefined)
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    inline def setState(value: CrawlState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
