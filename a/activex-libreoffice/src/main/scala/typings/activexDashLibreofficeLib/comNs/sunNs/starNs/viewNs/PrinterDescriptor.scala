package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a printer by specifying the queue name and some settings.
  *
  * This service may be represented by a {@link com.sun.star.beans.PropertyValue} [].
  * @see com.sun.star.beans.PropertyValue
  */
trait PrinterDescriptor extends js.Object {
  /** indicates, whether the printer allows changes to {@link PrinterDescriptor.PaperFormat} . */
  var CanSetPaperFormat: scala.Boolean
  /** indicates, whether the printer allows changes to {@link PrinterDescriptor.PaperOrientation} . */
  var CanSetPaperOrientation: scala.Boolean
  /** indicates if the printer allows changes to {@link PrinterDescriptor.PaperSize} . */
  var CanSetPaperSize: scala.Boolean
  /** indicates, whether the printer is busy or not. */
  var IsBusy: scala.Boolean
  /**
    * specifies the name of the printer queue to be used.
    *
    * Which printer queues are available, can be figured out with the system library of the used programming language/environment.
    */
  var Name: java.lang.String
  /**
    * specifies a predefined paper size or if the paper size is a user-defined size.
    *
    * Setting this property may change the value of {@link PrinterDescriptor.PaperSize} .
    */
  var PaperFormat: PaperFormat
  /** specifies the orientation of the paper. */
  var PaperOrientation: PaperOrientation
  /**
    * specifies the size of the paper in 100th mm.
    *
    * Setting this property may change the value of {@link PrinterDescriptor.PaperFormat} .
    */
  var PaperSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
}

