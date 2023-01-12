package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventsFilters extends StObject {
  
  /**
    *  The source, AWS_CLOUD_TRAIL or AWS_CODE_DEPLOY, of the events you want returned. 
    */
  var DataSource: js.UndefOr[EventDataSource] = js.undefined
  
  /**
    *  The class of the events you want to filter for, such as an infrastructure change, a deployment, or a schema change. 
    */
  var EventClass: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.EventClass] = js.undefined
  
  /**
    *  The Amazon Web Services source that emitted the events you want to filter for. 
    */
  var EventSource: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.EventSource] = js.undefined
  
  /**
    *  A time range during which you want the filtered events to have occurred. 
    */
  var EventTimeRange: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.EventTimeRange] = js.undefined
  
  /**
    *  An ID of an insight that is related to the events you want to filter for. 
    */
  var InsightId: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.InsightId] = js.undefined
  
  var ResourceCollection: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ResourceCollection] = js.undefined
}
object ListEventsFilters {
  
  inline def apply(): ListEventsFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventsFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEventsFilters] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: EventDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setEventClass(value: EventClass): Self = StObject.set(x, "EventClass", value.asInstanceOf[js.Any])
    
    inline def setEventClassUndefined: Self = StObject.set(x, "EventClass", js.undefined)
    
    inline def setEventSource(value: EventSource): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceUndefined: Self = StObject.set(x, "EventSource", js.undefined)
    
    inline def setEventTimeRange(value: EventTimeRange): Self = StObject.set(x, "EventTimeRange", value.asInstanceOf[js.Any])
    
    inline def setEventTimeRangeUndefined: Self = StObject.set(x, "EventTimeRange", js.undefined)
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    inline def setInsightIdUndefined: Self = StObject.set(x, "InsightId", js.undefined)
    
    inline def setResourceCollection(value: ResourceCollection): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
  }
}
