package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XImageControl
  extends XReportControlModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XImageProducerSupplier {
  /** specifies an URL to an image to use for the control. */
  var ImageURL: java.lang.String
  /**
    * Specifies that the IRI given in the data field should be preserved, otherwise the content will be inserted in the resulting report document. If the
    * data field contains something different as string then this attribute will be ignored.
    */
  var PreserveIRI: scala.Boolean
  /**
    * defines how to scale the image
    *
    * If this property is present, it supersedes the ScaleImage property.
    *
    * The value of this property is one of the {@link com.sun.star.awt.ImageScaleMode} constants.
    * @since OOo 3.2
    */
  var ScaleMode: scala.Double
}

