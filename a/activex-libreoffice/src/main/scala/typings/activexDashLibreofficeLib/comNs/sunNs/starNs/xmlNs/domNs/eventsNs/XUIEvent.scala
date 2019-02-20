package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUIEvent extends XEvent {
  val Detail: scala.Double
  val View: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView
  def getDetail(): scala.Double
  def getView(): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView
  def initUIEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView,
    detailArg: scala.Double
  ): scala.Unit
}

