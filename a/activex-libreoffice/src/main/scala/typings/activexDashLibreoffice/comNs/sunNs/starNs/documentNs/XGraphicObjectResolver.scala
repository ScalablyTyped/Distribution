package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** this interface converts graphic object URLs from one URL space to another. */
trait XGraphicObjectResolver extends XInterface {
  /** converts the given URL from the source URL namespace to the destination URL space of this instance. */
  def resolveGraphicObjectURL(aURL: String): String
}

object XGraphicObjectResolver {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resolveGraphicObjectURL: String => String
  ): XGraphicObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveGraphicObjectURL = js.Any.fromFunction1(resolveGraphicObjectURL))
  
    __obj.asInstanceOf[XGraphicObjectResolver]
  }
}

