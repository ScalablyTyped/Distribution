package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The description of a change to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
@js.native
trait RemoteContentProviderChangeEvent extends EventObject {
  /** An indicator whether a remote content provider has been added or removed. */
  var Action: RemoteContentProviderChangeAction = js.native
  /** The identifier with which the remote content provider is registered at the {@link com.sun.star.ucb.XRemoteContentProviderSupplier} . */
  var Identifier: String = js.native
}

object RemoteContentProviderChangeEvent {
  @scala.inline
  def apply(Action: RemoteContentProviderChangeAction, Identifier: String, Source: XInterface): RemoteContentProviderChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteContentProviderChangeEvent]
  }
  @scala.inline
  implicit class RemoteContentProviderChangeEventOps[Self <: RemoteContentProviderChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: RemoteContentProviderChangeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("Identifier", value.asInstanceOf[js.Any])
  }
  
}

