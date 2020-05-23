package typings.activexLibreoffice.com_.sun.star.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object binding {
  /**
    * this service specifies a {@link BindableControlModel} which reflects an integer value, out of a range of permitted integer values.
    *
    * BindableIntegerValueRanges have a value property, a minimum, and a maximum, all of type integer.
    */
  type BindableIntegerValueRange = typings.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel
  /** thrown to indicate that the types of an {@link XValueBinding} and an {@link XBindableValue} are incompatible */
  type IncompatibleTypesException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /** thrown when an {@link XValueBinding} cannot perform a requested operation due to an invalid state. */
  type InvalidBindingStateException = typings.activexLibreoffice.com_.sun.star.uno.Exception
}
