package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give access to a single numerical value.
  *
  * The {@link XAccessibleValue} interface represents a single numerical value and should be implemented by any class that supports numerical value like
  * scroll bars and spin boxes. This interface lets you access the value and its upper and lower bounds.
  * @since OOo 1.1.2
  */
trait XAccessibleValue extends XInterface {
  /**
    * Returns the value of this object as a number.
    *
    * The exact return type is implementation dependent. Typical types are long and double.
    * @returns Returns the current value represented by this object.
    */
  var CurrentValue: js.Any
  /**
    * Returns the maximal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the maximal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  val MaximumValue: js.Any
  /**
    * Returns the minimal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the minimal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  val MinimumValue: js.Any
  /**
    * Returns the value of this object as a number.
    *
    * The exact return type is implementation dependent. Typical types are long and double.
    * @returns Returns the current value represented by this object.
    */
  def getCurrentValue(): js.Any
  /**
    * Returns the maximal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the maximal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  def getMaximumValue(): js.Any
  /**
    * Returns the minimal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the minimal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  def getMinimumValue(): js.Any
  /**
    * Sets the value of this object to the given number.
    *
    * The argument is clipped to the valid interval whose upper and lower bounds are returned by the methods getMaximumAccessibleValue() and
    * getMinimumAccessibleValue(), i.e. if it is lower than the minimum value the new value will be the minimum and if it is greater than the maximum then
    * the new value will be the maximum.
    * @param aNumber The new value represented by this object. The set of admissible types for this argument is implementation dependent.
    * @returns Returns `TRUE` if the new value could successfully be set and `FALSE` otherwise.
    */
  def setCurrentValue(aNumber: js.Any): Boolean
}

object XAccessibleValue {
  @scala.inline
  def apply(
    CurrentValue: js.Any,
    MaximumValue: js.Any,
    MinimumValue: js.Any,
    acquire: () => Unit,
    getCurrentValue: () => js.Any,
    getMaximumValue: () => js.Any,
    getMinimumValue: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentValue: js.Any => Boolean
  ): XAccessibleValue = {
    val __obj = js.Dynamic.literal(CurrentValue = CurrentValue.asInstanceOf[js.Any], MaximumValue = MaximumValue.asInstanceOf[js.Any], MinimumValue = MinimumValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCurrentValue = js.Any.fromFunction0(getCurrentValue), getMaximumValue = js.Any.fromFunction0(getMaximumValue), getMinimumValue = js.Any.fromFunction0(getMinimumValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentValue = js.Any.fromFunction1(setCurrentValue))
    __obj.asInstanceOf[XAccessibleValue]
  }
}

