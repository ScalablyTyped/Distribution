package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCrawlerScheduleRequest extends StObject {
  
  /**
    * The name of the crawler whose schedule to update.
    */
  var CrawlerName: NameString
  
  /**
    * The updated cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[CronExpression] = js.undefined
}
object UpdateCrawlerScheduleRequest {
  
  inline def apply(CrawlerName: NameString): UpdateCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCrawlerScheduleRequest]
  }
  
  extension [Self <: UpdateCrawlerScheduleRequest](x: Self) {
    
    inline def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: CronExpression): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
  }
}
