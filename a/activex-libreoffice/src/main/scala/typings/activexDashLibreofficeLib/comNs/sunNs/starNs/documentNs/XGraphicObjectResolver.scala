package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** this interface converts graphic object URLs from one URL space to another. */
trait XGraphicObjectResolver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** converts the given URL from the source URL namespace to the destination URL space of this instance. */
  def resolveGraphicObjectURL(aURL: java.lang.String): java.lang.String
}

object XGraphicObjectResolver {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resolveGraphicObjectURL: js.Function1[java.lang.String, java.lang.String]
  ): XGraphicObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, resolveGraphicObjectURL = resolveGraphicObjectURL)
  
    __obj.asInstanceOf[XGraphicObjectResolver]
  }
}

