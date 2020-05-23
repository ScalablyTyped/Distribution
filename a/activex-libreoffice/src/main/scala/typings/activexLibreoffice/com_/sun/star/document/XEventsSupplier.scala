package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameReplace
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a list of URLs bound to events of this object */
trait XEventsSupplier extends XInterface {
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  val Events: XNameReplace
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  def getEvents(): XNameReplace
}

object XEventsSupplier {
  @scala.inline
  def apply(
    Events: XNameReplace,
    acquire: () => Unit,
    getEvents: () => XNameReplace,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEventsSupplier = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEvents = js.Any.fromFunction0(getEvents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEventsSupplier]
  }
}

