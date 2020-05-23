package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows notification when a new volatile function result is available.
  * @see com.sun.star.sheet.XVolatileResult
  */
trait XResultListener extends XEventListener {
  /** is called when a new value is available. */
  def modified(aEvent: ResultEvent): Unit
}

object XResultListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    modified: ResultEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XResultListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), modified = js.Any.fromFunction1(modified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XResultListener]
  }
}

