package typings.activexLibreoffice.com_.sun.star.awt.tab

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XTabPageContainer} to notify changes in tab page activation.
  * @since OOo 3.4
  */
trait TabPageActivatedEvent extends EventObject {
  /** Contains the ID of the tab page */
  var TabPageID: Double
}

object TabPageActivatedEvent {
  @scala.inline
  def apply(Source: XInterface, TabPageID: Double): TabPageActivatedEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], TabPageID = TabPageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabPageActivatedEvent]
  }
}

