package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The description of a change to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait RemoteContentProviderChangeEvent
  extends StObject
     with EventObject {
  
  /** An indicator whether a remote content provider has been added or removed. */
  var Action: RemoteContentProviderChangeAction
  
  /** The identifier with which the remote content provider is registered at the {@link com.sun.star.ucb.XRemoteContentProviderSupplier} . */
  var Identifier: String
}
object RemoteContentProviderChangeEvent {
  
  inline def apply(Action: RemoteContentProviderChangeAction, Identifier: String, Source: XInterface): RemoteContentProviderChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteContentProviderChangeEvent]
  }
  
  extension [Self <: RemoteContentProviderChangeEvent](x: Self) {
    
    inline def setAction(value: RemoteContentProviderChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
