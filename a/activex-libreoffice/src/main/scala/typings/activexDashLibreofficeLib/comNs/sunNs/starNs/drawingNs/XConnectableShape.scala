package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XConnectableShape
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def canConnect(
    nPos: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    bCreateGluePoint: scala.Boolean,
    nMaxDist: scala.Double
  ): scala.Boolean
  def doConnect(
    nPos: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    bCreateGluePoint: scala.Boolean,
    nMaxDist: scala.Double
  ): scala.Boolean
}

object XConnectableShape {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    canConnect: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Boolean, scala.Double) => scala.Boolean,
    doConnect: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Boolean, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XConnectableShape = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), canConnect = js.Any.fromFunction3(canConnect), doConnect = js.Any.fromFunction3(doConnect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XConnectableShape]
  }
}

