package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * What occurs to start the revision publish action.
    */
  var RevisionPublished: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.RevisionPublished] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    inline def setRevisionPublished(value: RevisionPublished): Self = StObject.set(x, "RevisionPublished", value.asInstanceOf[js.Any])
    
    inline def setRevisionPublishedUndefined: Self = StObject.set(x, "RevisionPublished", js.undefined)
  }
}
