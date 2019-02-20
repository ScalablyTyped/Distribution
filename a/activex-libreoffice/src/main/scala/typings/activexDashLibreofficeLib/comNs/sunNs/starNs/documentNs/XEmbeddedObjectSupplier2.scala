package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier2 extends XEmbeddedObjectSupplier {
  /** allows to control the aspect of the object. */
  var Aspect: scala.Double
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  val ExtendedControlOverEmbeddedObject: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XEmbeddedObject
  /** allows to get the replacement image of the object. */
  var ReplacementGraphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  def getExtendedControlOverEmbeddedObject(): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XEmbeddedObject
}

