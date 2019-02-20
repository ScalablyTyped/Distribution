package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a string resource represented by a {@link com.sun.star.resource.XStringResourceResolver} . */
trait XStringResourceSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Provides access to a string resource. Depending on the context the returned object may also support {@link
    * com.sun.star.resource.XStringResourceManager} or {@link com.sun.star.resource.XStringResourcePersistence} or {@link
    * com.sun.star.resource.XStringResourceWithStorage}
    * @returns an interface {@link com.sun.star.resource.XStringResourceResolver}
    */
  val StringResource: XStringResourceResolver
  /**
    * Provides access to a string resource. Depending on the context the returned object may also support {@link
    * com.sun.star.resource.XStringResourceManager} or {@link com.sun.star.resource.XStringResourcePersistence} or {@link
    * com.sun.star.resource.XStringResourceWithStorage}
    * @returns an interface {@link com.sun.star.resource.XStringResourceResolver}
    */
  def getStringResource(): XStringResourceResolver
}

