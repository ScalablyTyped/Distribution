package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFilter extends StObject {
  
  /**
    * The source of the events.
    */
  var Source: typings.awsSdk.clientsAppintegrationsMod.Source
}
object EventFilter {
  
  inline def apply(Source: Source): EventFilter = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventFilter] (val x: Self) extends AnyVal {
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
