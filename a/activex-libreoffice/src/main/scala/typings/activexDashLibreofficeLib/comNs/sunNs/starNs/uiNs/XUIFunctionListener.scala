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

