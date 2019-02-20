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

