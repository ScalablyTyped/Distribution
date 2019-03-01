package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give access to actions that can be executed for accessible objects.
  *
  * Every accessible object that can be manipulated beyond its methods exported over the accessibility API should support this interface to expose all
  * actions that it can perform. Each action can be performed or be queried for a description or associated key bindings.
  * @since OOo 1.1.2
  */
trait XAccessibleAction
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the number of accessible actions available in this object.
    *
    * If there are more than one, the first one is considered the "default" action of the object.
    * @returns The returned value of the number of actions is zero if there are no actions.
    */
  val AccessibleActionCount: scala.Double
  /**
    * Perform the specified Action on the object.
    * @param nIndex This index specifies the action to perform. If it lies outside the valid range `FALSE` is returned and no action is performed.
    * @returns Returns `TRUE` if the action was successfully performed. If the action could not be performed successfully `FALSE` is returned.
    * @throws IndexOutOfBoundsException If no action with the given index exists then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is thrown.
    */
  def doAccessibleAction(nIndex: scala.Double): scala.Boolean
  /**
    * Returns the number of accessible actions available in this object.
    *
    * If there are more than one, the first one is considered the "default" action of the object.
    * @returns The returned value of the number of actions is zero if there are no actions.
    */
  def getAccessibleActionCount(): scala.Double
  /**
    * Returns a description of the specified action of the object.
    * @param nIndex This index specifies the action of which to return a description. If it lies outside the valid range an empty string is returned.
    * @returns The returned value is a localized string of the specified action.
    * @throws IndexOutOfBoundsException If the given index lies not in the valid range then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is
    */
  def getAccessibleActionDescription(nIndex: scala.Double): java.lang.String
  /**
    * Returns a key binding object, if there is one, associated with the specified action. Note that there can be several alternative key bindings for an
    * action. See {@link XAccessibleKeyBinding} for more information about how key bindings are represented.
    * @param nIndex This index specifies the action of which to return the key binding.
    * @returns The returned object describes a set of key bindings associated with the specified action.
    * @throws IndexOutOfBoundsException if the given index is not valid.
    */
  def getAccessibleActionKeyBinding(nIndex: scala.Double): XAccessibleKeyBinding
}

object XAccessibleAction {
  @scala.inline
  def apply(
    AccessibleActionCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    doAccessibleAction: js.Function1[scala.Double, scala.Boolean],
    getAccessibleActionCount: js.Function0[scala.Double],
    getAccessibleActionDescription: js.Function1[scala.Double, java.lang.String],
    getAccessibleActionKeyBinding: js.Function1[scala.Double, XAccessibleKeyBinding],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAccessibleAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleActionCount")(AccessibleActionCount)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("doAccessibleAction")(doAccessibleAction)
    __obj.updateDynamic("getAccessibleActionCount")(getAccessibleActionCount)
    __obj.updateDynamic("getAccessibleActionDescription")(getAccessibleActionDescription)
    __obj.updateDynamic("getAccessibleActionKeyBinding")(getAccessibleActionKeyBinding)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAccessibleAction]
  }
}

