package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XConnectableShape extends XInterface {
  def canConnect(nPos: Point, bCreateGluePoint: Boolean, nMaxDist: Double): Boolean
  def doConnect(nPos: Point, bCreateGluePoint: Boolean, nMaxDist: Double): Boolean
}

object XConnectableShape {
  @scala.inline
  def apply(
    acquire: () => Unit,
    canConnect: (Point, Boolean, Double) => Boolean,
    doConnect: (Point, Boolean, Double) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConnectableShape = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), canConnect = js.Any.fromFunction3(canConnect), doConnect = js.Any.fromFunction3(doConnect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XConnectableShape]
  }
}

