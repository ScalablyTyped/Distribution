package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * indicates that {@link XPackageRegistry.bindPackage()} was previously called with a different value for the `removed` parameter and that the {@link
  * XPackage} object created by that call still exist.
  * @since OOo 3.3
  */
trait InvalidRemovedParameterException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /**
    * the {@link XPackage} that was already bound to the provided `url` parameter during {@link XPackageRegistry.bindPackage()} .
    *
    * Must not be `NULL` .
    */
  var Extension: XPackage
  /**
    * the value of the `removed` parameter which was used in {@link XPackageRegistry.bindPackage()} to create the currently existing {@link XPackage}
    * object.
    */
  var PreviousValue: scala.Boolean
}

