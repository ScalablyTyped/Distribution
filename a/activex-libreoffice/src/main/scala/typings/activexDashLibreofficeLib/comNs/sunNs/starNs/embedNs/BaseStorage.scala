package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a service that allows to get access to a storage hierarchy. */
trait BaseStorage
  extends XStorage
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * allows to get the mode the storage is opened in.
    *
    * Can be a combination of values from {@link ElementModes} .
    */
  var OpenMode: scala.Double
  /** allows to retrieve URL the storage is based on. */
  var URL: java.lang.String
}

