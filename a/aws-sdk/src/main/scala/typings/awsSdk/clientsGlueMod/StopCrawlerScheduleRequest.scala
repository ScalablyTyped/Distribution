package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopCrawlerScheduleRequest extends StObject {
  
  /**
    * Name of the crawler whose schedule state to set.
    */
  var CrawlerName: NameString
}
object StopCrawlerScheduleRequest {
  
  inline def apply(CrawlerName: NameString): StopCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCrawlerScheduleRequest]
  }
  
  extension [Self <: StopCrawlerScheduleRequest](x: Self) {
    
    inline def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
  }
}
