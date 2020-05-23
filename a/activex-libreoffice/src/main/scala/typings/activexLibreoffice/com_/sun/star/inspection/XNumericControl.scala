package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.beans.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for an {@link XPropertyControl} which supports displaying and entering numerical values.
  * @since OOo 2.0.3
  */
trait XNumericControl extends XPropertyControl {
  /** describes the number of decimal digits to use for the value */
  var DecimalDigits: Double
  /**
    * describes a {@link com.sun.star.util.MeasureUnit} to be applied for displaying values.
    *
    * Only a certain set of {@link com.sun.star.util.MeasureUnit} values is supported. In particular, every value which denotes a fraction of another unit
    * (like 100th millimeters) cannot be used as DisplayUnit.
    * @throws com::sun::star::lang::IllegalArgumentException if the caller attempts to set an unsupported {@link com.sun.star.util.MeasureUnit}
    */
  var DisplayUnit: Double
  /** describes the maximum value which is allowed to be entered in the control */
  var MaxValue: Optional[Double]
  /** describes the minimum value which is allowed to be entered in the control */
  var MinValue: Optional[Double]
  /**
    * describes a {@link com.sun.star.util.MeasureUnit} to be applied for transferring values.
    *
    * The core measurement unit for a property value might differ from the unit which is used by the control to display it. For instance, your property
    * value might require that your values denote 100th millimeters, but to the user, you want to present the value as, say, inches. In this case, a numeric
    * control can automatically handle the value conversion for you, if you give it a ValueUnit different from the DisplayUnit.
    * @see XPropertyControl.Value
    */
  var ValueUnit: Double
}

object XNumericControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    DecimalDigits: Double,
    DisplayUnit: Double,
    MaxValue: Optional[Double],
    MinValue: Optional[Double],
    Value: js.Any,
    ValueType: `type`,
    ValueUnit: Double,
    isModified: () => Boolean,
    notifyModifiedValue: () => Unit
  ): XNumericControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext.asInstanceOf[js.Any], ControlType = ControlType.asInstanceOf[js.Any], ControlWindow = ControlWindow.asInstanceOf[js.Any], DecimalDigits = DecimalDigits.asInstanceOf[js.Any], DisplayUnit = DisplayUnit.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], ValueUnit = ValueUnit.asInstanceOf[js.Any], isModified = js.Any.fromFunction0(isModified), notifyModifiedValue = js.Any.fromFunction0(notifyModifiedValue))
    __obj.asInstanceOf[XNumericControl]
  }
}

