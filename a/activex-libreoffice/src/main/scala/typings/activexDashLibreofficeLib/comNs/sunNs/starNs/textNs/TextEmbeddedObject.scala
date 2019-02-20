package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the properties and methods of an embedded object. */
trait TextEmbeddedObject
  extends BaseFrame
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEmbeddedObjectSupplier {
  var CLSID: java.lang.String
  /** This is the component for the OLE2 object. */
  var Component: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
  /**
    * This is the model for the OLE2 object.
    *
    * This property if void if the OLE2 is not an Office component.
    */
  var Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
}

