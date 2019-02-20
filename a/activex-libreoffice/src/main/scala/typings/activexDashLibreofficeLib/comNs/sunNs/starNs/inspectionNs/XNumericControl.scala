package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for an {@link XPropertyControl} which supports displaying and entering numerical values.
  * @since OOo 2.0.3
  */
trait XNumericControl extends XPropertyControl {
  /** describes the number of decimal digits to use for the value */
  var DecimalDigits: scala.Double
  /**
    * describes a {@link com.sun.star.util.MeasureUnit} to be applied for displaying values.
    *
    * Only a certain set of {@link com.sun.star.util.MeasureUnit} values is supported. In particular, every value which denotes a fraction of another unit
    * (like 100th millimeters) cannot be used as DisplayUnit.
    * @throws com::sun::star::lang::IllegalArgumentException if the caller attempts to set an unsupported {@link com.sun.star.util.MeasureUnit}
    */
  var DisplayUnit: scala.Double
  /** describes the maximum value which is allowed to be entered in the control */
  var MaxValue: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[scala.Double]
  /** describes the minimum value which is allowed to be entered in the control */
  var MinValue: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[scala.Double]
  /**
    * describes a {@link com.sun.star.util.MeasureUnit} to be applied for transferring values.
    *
    * The core measurement unit for a property value might differ from the unit which is used by the control to display it. For instance, your property
    * value might require that your values denote 100th millimeters, but to the user, you want to present the value as, say, inches. In this case, a numeric
    * control can automatically handle the value conversion for you, if you give it a ValueUnit different from the DisplayUnit.
    * @see XPropertyControl.Value
    */
  var ValueUnit: scala.Double
}

