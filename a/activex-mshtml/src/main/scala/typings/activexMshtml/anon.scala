package typings.activexMshtml

import typings.activexMshtml.MSHTML.IHTMLEventObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Description extends StObject {
    
    val description: String
    
    val line: Double
    
    val url: String
  }
  object Description {
    
    inline def apply(description: String, line: Double, url: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventData extends StObject {
    
    val eventData: js.Any
    
    val name: String
  }
  object EventData {
    
    inline def apply(eventData: js.Any, name: String): EventData = {
      val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    extension [Self <: EventData](x: Self) {
      
      inline def setEventData(value: js.Any): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PEvtObj extends StObject {
    
    val pEvtObj: IHTMLEventObj
  }
  object PEvtObj {
    
    inline def apply(pEvtObj: IHTMLEventObj): PEvtObj = {
      val __obj = js.Dynamic.literal(pEvtObj = pEvtObj.asInstanceOf[js.Any])
      __obj.asInstanceOf[PEvtObj]
    }
    
    extension [Self <: PEvtObj](x: Self) {
      
      inline def setPEvtObj(value: IHTMLEventObj): Self = StObject.set(x, "pEvtObj", value.asInstanceOf[js.Any])
    }
  }
}
