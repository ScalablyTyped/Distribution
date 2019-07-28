package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The description of a change to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait RemoteContentProviderChangeEvent extends EventObject {
  /** An indicator whether a remote content provider has been added or removed. */
  var Action: RemoteContentProviderChangeAction
  /** The identifier with which the remote content provider is registered at the {@link com.sun.star.ucb.XRemoteContentProviderSupplier} . */
  var Identifier: String
}

object RemoteContentProviderChangeEvent {
  @scala.inline
  def apply(Action: RemoteContentProviderChangeAction, Identifier: String, Source: XInterface): RemoteContentProviderChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action, Identifier = Identifier, Source = Source)
  
    __obj.asInstanceOf[RemoteContentProviderChangeEvent]
  }
}

