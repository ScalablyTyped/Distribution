package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the base for all event objects and identifies the source of the event. */
trait EventObject extends StObject {
  
  /** refers to the object that fired the event. */
  var Source: XInterface
}
object EventObject {
  
  inline def apply(Source: XInterface): EventObject = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  
  extension [Self <: EventObject](x: Self) {
    
    inline def setSource(value: XInterface): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
