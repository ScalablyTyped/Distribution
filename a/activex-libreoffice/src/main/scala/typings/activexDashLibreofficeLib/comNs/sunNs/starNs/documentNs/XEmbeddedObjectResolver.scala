package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** this interface converts embedded object URLs from one URL space to another. */
trait XEmbeddedObjectResolver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** converts the given URL from the source URL namespace to the destination URL space of this instance. */
  def resolveEmbeddedObjectURL(aURL: java.lang.String): java.lang.String
}

object XEmbeddedObjectResolver {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resolveEmbeddedObjectURL: js.Function1[java.lang.String, java.lang.String]
  ): XEmbeddedObjectResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("resolveEmbeddedObjectURL")(resolveEmbeddedObjectURL)
    __obj.asInstanceOf[XEmbeddedObjectResolver]
  }
}

