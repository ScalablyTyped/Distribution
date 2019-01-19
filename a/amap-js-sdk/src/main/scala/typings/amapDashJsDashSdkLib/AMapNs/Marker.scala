package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 点标记。
  */
@JSGlobal("AMap.Marker")
@js.native
class Marker () extends EventBindable {
  def this(options: MarkerOptions) = this()
  def getAngle(): scala.Double = js.native
  def getAnimation(): java.lang.String = js.native
  def getClickable(): scala.Boolean = js.native
  def getContent(): java.lang.String = js.native
  def getDraggable(): scala.Boolean = js.native
  def getExtData(): js.Any = js.native
  def getIcon(): java.lang.String | Icon = js.native
  def getLabel(): amapDashJsDashSdkLib.Anon_ContentOffset = js.native
  def getMap(): Map = js.native
  def getOffset(): Pixel = js.native
  def getPosition(): LngLat = js.native
  def getShadow(): Icon = js.native
  def getShape(): MarkerShape = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): scala.Boolean = js.native
  def hide(): scala.Unit = js.native
  def markOnAMAP(obj: amapDashJsDashSdkLib.Anon_Name): scala.Unit = js.native
  def moveAlong(lnglatlist: js.Array[LngLat]): scala.Unit = js.native
  def moveAlong(lnglatlist: js.Array[LngLat], speed: scala.Double): scala.Unit = js.native
  def moveAlong(
    lnglatlist: js.Array[LngLat],
    speed: scala.Double,
    f: js.Function1[/* k */ scala.Double, scala.Double]
  ): scala.Unit = js.native
  def moveAlong(
    lnglatlist: js.Array[LngLat],
    speed: scala.Double,
    f: js.Function1[/* k */ scala.Double, scala.Double],
    circlable: scala.Boolean
  ): scala.Unit = js.native
  def moveTo(lnglat: LngLat): scala.Unit = js.native
  def moveTo(lnglat: LngLat, speed: scala.Double): scala.Unit = js.native
  def moveTo(lnglat: LngLat, speed: scala.Double, f: js.Function1[/* k */ scala.Double, scala.Double]): scala.Unit = js.native
  def setAngle(angle: scala.Double): scala.Unit = js.native
  def setAnimation(animate: java.lang.String): scala.Unit = js.native
  def setClickable(clickable: scala.Boolean): scala.Unit = js.native
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setContent(content: stdLib.HTMLElement): scala.Unit = js.native
  def setCursor(cursor: java.lang.String): scala.Unit = js.native
  def setDraggable(draggable: scala.Boolean): scala.Unit = js.native
  def setExtData(ext: js.Any): scala.Unit = js.native
  def setIcon(content: Icon): scala.Unit = js.native
  def setIcon(content: java.lang.String): scala.Unit = js.native
  def setLabel(label: amapDashJsDashSdkLib.Anon_ContentOffset): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOffset(offset: Pixel): scala.Unit = js.native
  def setPosition(lnglat: LngLat): scala.Unit = js.native
  def setShadow(icon: Icon): scala.Unit = js.native
  def setShape(shape: MarkerShape): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setTop(isTop: scala.Boolean): scala.Unit = js.native
  def setzIndex(index: scala.Double): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def stopMove(): scala.Unit = js.native
}

