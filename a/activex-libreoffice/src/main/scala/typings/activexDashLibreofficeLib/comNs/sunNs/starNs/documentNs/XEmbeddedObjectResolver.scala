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
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    resolveEmbeddedObjectURL: java.lang.String => java.lang.String
  ): XEmbeddedObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveEmbeddedObjectURL = js.Any.fromFunction1(resolveEmbeddedObjectURL))
  
    __obj.asInstanceOf[XEmbeddedObjectResolver]
  }
}

