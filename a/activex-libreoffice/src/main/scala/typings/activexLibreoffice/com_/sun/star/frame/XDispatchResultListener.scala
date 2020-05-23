package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * listener for results of {@link XNotifyingDispatch.dispatchWithNotification()}
  * @see XNotifyingDispatch
  */
trait XDispatchResultListener extends XEventListener {
  /**
    * indicates finished dispatch
    * @param Result contains the result of the dispatch action
    * @see DispatchResultEvent
    */
  def dispatchFinished(Result: DispatchResultEvent): Unit
}

object XDispatchResultListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    dispatchFinished: DispatchResultEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDispatchResultListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dispatchFinished = js.Any.fromFunction1(dispatchFinished), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDispatchResultListener]
  }
}

