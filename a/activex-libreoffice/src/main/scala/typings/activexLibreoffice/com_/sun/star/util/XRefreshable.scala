package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects with data that can be refreshed from a data source. */
trait XRefreshable extends XInterface {
  /** adds the specified listener to receive the event "refreshed." */
  def addRefreshListener(l: XRefreshListener): Unit
  /** refreshes the data of the object from the connected data source. */
  def refresh(): Unit
  /** removes the specified listener. */
  def removeRefreshListener(l: XRefreshListener): Unit
}

object XRefreshable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addRefreshListener: XRefreshListener => Unit,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeRefreshListener: XRefreshListener => Unit
  ): XRefreshable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener))
    __obj.asInstanceOf[XRefreshable]
  }
}

