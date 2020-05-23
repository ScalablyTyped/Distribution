package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
trait XAccessibleAction extends XInterface {
  /**
    * Returns the number of accessible actions available in this object.
    *
    * If there are more than one, the first one is considered the "default" action of the object.
    * @returns The returned value of the number of actions is zero if there are no actions.
    */
  val AccessibleActionCount: Double
  /**
    * Perform the specified Action on the object.
    * @param nIndex This index specifies the action to perform. If it lies outside the valid range `FALSE` is returned and no action is performed.
    * @returns Returns `TRUE` if the action was successfully performed. If the action could not be performed successfully `FALSE` is returned.
    * @throws IndexOutOfBoundsException If no action with the given index exists then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is thrown.
    */
  def doAccessibleAction(nIndex: Double): Boolean
  /**
    * Returns the number of accessible actions available in this object.
    *
    * If there are more than one, the first one is considered the "default" action of the object.
    * @returns The returned value of the number of actions is zero if there are no actions.
    */
  def getAccessibleActionCount(): Double
  /**
    * Returns a description of the specified action of the object.
    * @param nIndex This index specifies the action of which to return a description. If it lies outside the valid range an empty string is returned.
    * @returns The returned value is a localized string of the specified action.
    * @throws IndexOutOfBoundsException If the given index lies not in the valid range then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is
    */
  def getAccessibleActionDescription(nIndex: Double): String
  /**
    * Returns a key binding object, if there is one, associated with the specified action. Note that there can be several alternative key bindings for an
    * action. See {@link XAccessibleKeyBinding} for more information about how key bindings are represented.
    * @param nIndex This index specifies the action of which to return the key binding.
    * @returns The returned object describes a set of key bindings associated with the specified action.
    * @throws IndexOutOfBoundsException if the given index is not valid.
    */
  def getAccessibleActionKeyBinding(nIndex: Double): XAccessibleKeyBinding
}

object XAccessibleAction {
  @scala.inline
  def apply(
    AccessibleActionCount: Double,
    acquire: () => Unit,
    doAccessibleAction: Double => Boolean,
    getAccessibleActionCount: () => Double,
    getAccessibleActionDescription: Double => String,
    getAccessibleActionKeyBinding: Double => XAccessibleKeyBinding,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleAction = {
    val __obj = js.Dynamic.literal(AccessibleActionCount = AccessibleActionCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), doAccessibleAction = js.Any.fromFunction1(doAccessibleAction), getAccessibleActionCount = js.Any.fromFunction0(getAccessibleActionCount), getAccessibleActionDescription = js.Any.fromFunction1(getAccessibleActionDescription), getAccessibleActionKeyBinding = js.Any.fromFunction1(getAccessibleActionKeyBinding), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleAction]
  }
}

