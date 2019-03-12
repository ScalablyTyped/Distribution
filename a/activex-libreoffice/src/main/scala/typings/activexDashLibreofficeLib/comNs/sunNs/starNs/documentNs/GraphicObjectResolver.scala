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
    acquire: () => scala.Unit,
    createWithStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    resolveGraphicObjectURL: java.lang.String => java.lang.String
  ): GraphicObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithStorage = js.Any.fromFunction1(createWithStorage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveGraphicObjectURL = js.Any.fromFunction1(resolveGraphicObjectURL))
  
    __obj.asInstanceOf[GraphicObjectResolver]
  }
}

