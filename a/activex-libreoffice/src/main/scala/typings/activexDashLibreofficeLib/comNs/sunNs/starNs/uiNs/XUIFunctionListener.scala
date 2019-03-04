package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * special interface to receive notification that a user interface element will execute a function.
  * @since OOo 2.0
  */
trait XUIFunctionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * gets called to notify a component that a user interface element wants to execute a function.
    * @param aUIElementName a string which identifies the user interface element that wants to execute a function.
    * @param aCommand a string which identifies the function that has been selected by a user.
    */
  def functionExecute(aUIElementName: java.lang.String, aCommand: java.lang.String): scala.Unit
}

object XUIFunctionListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    functionExecute: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUIFunctionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, functionExecute = functionExecute, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XUIFunctionListener]
  }
}

