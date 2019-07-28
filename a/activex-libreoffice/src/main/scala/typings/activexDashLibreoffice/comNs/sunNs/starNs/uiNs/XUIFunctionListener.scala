package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * special interface to receive notification that a user interface element will execute a function.
  * @since OOo 2.0
  */
trait XUIFunctionListener extends XEventListener {
  /**
    * gets called to notify a component that a user interface element wants to execute a function.
    * @param aUIElementName a string which identifies the user interface element that wants to execute a function.
    * @param aCommand a string which identifies the function that has been selected by a user.
    */
  def functionExecute(aUIElementName: String, aCommand: String): Unit
}

object XUIFunctionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    functionExecute: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUIFunctionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), functionExecute = js.Any.fromFunction2(functionExecute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUIFunctionListener]
  }
}

