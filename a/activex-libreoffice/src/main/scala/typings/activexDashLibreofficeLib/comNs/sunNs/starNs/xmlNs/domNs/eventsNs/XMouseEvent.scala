package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMouseEvent extends XUIEvent {
  val AltKey: scala.Boolean
  val Button: scala.Double
  val ClientX: scala.Double
  val ClientY: scala.Double
  val CtrlKey: scala.Boolean
  val MetaKey: scala.Boolean
  val RelatedTarget: XEventTarget
  val ScreenX: scala.Double
  val ScreenY: scala.Double
  val ShiftKey: scala.Boolean
  def getAltKey(): scala.Boolean
  def getButton(): scala.Double
  def getClientX(): scala.Double
  def getClientY(): scala.Double
  def getCtrlKey(): scala.Boolean
  def getMetaKey(): scala.Boolean
  def getRelatedTarget(): XEventTarget
  def getScreenX(): scala.Double
  def getScreenY(): scala.Double
  def getShiftKey(): scala.Boolean
  def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView,
    detailArg: scala.Double,
    screenXArg: scala.Double,
    screenYArg: scala.Double,
    clientXArg: scala.Double,
    clientYArg: scala.Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: scala.Double,
    relatedTargetArg: XEventTarget
  ): scala.Unit
}

