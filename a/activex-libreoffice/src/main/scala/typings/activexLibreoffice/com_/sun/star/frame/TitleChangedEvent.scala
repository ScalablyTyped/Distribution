package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information about a changed title. */
trait TitleChangedEvent
  extends StObject
     with EventObject {
  
  /** The new title */
  var Title: String
}
object TitleChangedEvent {
  
  inline def apply(Source: XInterface, Title: String): TitleChangedEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleChangedEvent]
  }
  
  extension [Self <: TitleChangedEvent](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
