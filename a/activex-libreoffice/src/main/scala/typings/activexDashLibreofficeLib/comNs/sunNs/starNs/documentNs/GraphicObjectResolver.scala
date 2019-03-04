package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait GraphicObjectResolver extends XGraphicObjectResolver {
  def createWithStorage(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

object GraphicObjectResolver {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createWithStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resolveGraphicObjectURL: js.Function1[java.lang.String, java.lang.String]
  ): GraphicObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = acquire, createWithStorage = createWithStorage, queryInterface = queryInterface, release = release, resolveGraphicObjectURL = resolveGraphicObjectURL)
  
    __obj.asInstanceOf[GraphicObjectResolver]
  }
}

