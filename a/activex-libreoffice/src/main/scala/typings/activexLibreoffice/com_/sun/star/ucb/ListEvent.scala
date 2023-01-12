package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the type of event fired by an {@link XDynamicResultSet} */
trait ListEvent
  extends StObject
     with EventObject {
  
  /**
    * If you apply the given ListActions one after the other to the old version of an result set in given order, you will get the positions in the new
    * version.
    */
  var Changes: SafeArray[ListAction]
}
object ListEvent {
  
  inline def apply(Changes: SafeArray[ListAction], Source: XInterface): ListEvent = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEvent] (val x: Self) extends AnyVal {
    
    inline def setChanges(value: SafeArray[ListAction]): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
  }
}
