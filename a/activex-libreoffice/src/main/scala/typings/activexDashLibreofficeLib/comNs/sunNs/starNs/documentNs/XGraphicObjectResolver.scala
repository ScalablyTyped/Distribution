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

