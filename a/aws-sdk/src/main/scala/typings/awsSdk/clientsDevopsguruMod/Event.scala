package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    *  The source, AWS_CLOUD_TRAIL or AWS_CODE_DEPLOY, where DevOps Guru analysis found the event. 
    */
  var DataSource: js.UndefOr[EventDataSource] = js.undefined
  
  /**
    *  The class of the event. The class specifies what the event is related to, such as an infrastructure change, a deployment, or a schema change. 
    */
  var EventClass: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.EventClass] = js.undefined
  
  /**
    *  The Amazon Web Services source that emitted the event. 
    */
  var EventSource: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.EventSource] = js.undefined
  
  /**
    *  The ID of the event. 
    */
  var Id: js.UndefOr[EventId] = js.undefined
  
  /**
    *  The name of the event. 
    */
  var Name: js.UndefOr[EventName] = js.undefined
  
  var ResourceCollection: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ResourceCollection] = js.undefined
  
  /**
    *  An EventResource object that contains information about the resource that emitted the event. 
    */
  var Resources: js.UndefOr[EventResources] = js.undefined
  
  /**
    *  A Timestamp that specifies the time the event occurred. 
    */
  var Time: js.UndefOr[js.Date] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setDataSource(value: EventDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setEventClass(value: EventClass): Self = StObject.set(x, "EventClass", value.asInstanceOf[js.Any])
    
    inline def setEventClassUndefined: Self = StObject.set(x, "EventClass", js.undefined)
    
    inline def setEventSource(value: EventSource): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceUndefined: Self = StObject.set(x, "EventSource", js.undefined)
    
    inline def setId(value: EventId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: EventName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceCollection(value: ResourceCollection): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
    
    inline def setResources(value: EventResources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: EventResource*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "Time", js.undefined)
  }
}
