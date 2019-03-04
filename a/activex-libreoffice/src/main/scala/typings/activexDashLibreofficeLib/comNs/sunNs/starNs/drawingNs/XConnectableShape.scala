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
    acquire: js.Function0[scala.Unit],
    canConnect: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      scala.Boolean, 
      scala.Double, 
      scala.Boolean
    ],
    doConnect: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      scala.Boolean, 
      scala.Double, 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConnectableShape = {
    val __obj = js.Dynamic.literal(acquire = acquire, canConnect = canConnect, doConnect = doConnect, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XConnectableShape]
  }
}

