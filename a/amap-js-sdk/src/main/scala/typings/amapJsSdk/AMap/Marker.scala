package typings.amapJsSdk.AMap

import typings.amapJsSdk.anon.Name
import typings.amapJsSdk.anon.Offset
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 点标记。
  */
@js.native
trait Marker
  extends StObject
     with EventBindable {
  
  def getAngle(): Double = js.native
  
  def getAnimation(): String = js.native
  
  def getClickable(): Boolean = js.native
  
  def getContent(): String = js.native
  
  def getDraggable(): Boolean = js.native
  
  def getExtData(): Any = js.native
  
  def getIcon(): String | Icon = js.native
  
  def getLabel(): Offset = js.native
  
  def getMap(): Map = js.native
  
  def getOffset(): Pixel = js.native
  
  def getPosition(): LngLat = js.native
  
  def getShadow(): Icon = js.native
  
  def getShape(): MarkerShape = js.native
  
  def getTitle(): String = js.native
  
  def getTop(): Boolean = js.native
  
  def hide(): Unit = js.native
  
  def markOnAMAP(obj: Name): Unit = js.native
  
  def moveAlong(lnglatlist: js.Array[LngLat]): Unit = js.native
  def moveAlong(lnglatlist: js.Array[LngLat], speed: Double): Unit = js.native
  def moveAlong(lnglatlist: js.Array[LngLat], speed: Double, f: js.Function1[/* k */ Double, Double]): Unit = js.native
  def moveAlong(
    lnglatlist: js.Array[LngLat],
    speed: Double,
    f: js.Function1[/* k */ Double, Double],
    circlable: Boolean
  ): Unit = js.native
  def moveAlong(lnglatlist: js.Array[LngLat], speed: Double, f: Unit, circlable: Boolean): Unit = js.native
  def moveAlong(lnglatlist: js.Array[LngLat], speed: Unit, f: js.Function1[/* k */ Double, Double]): Unit = js.native
  def moveAlong(
    lnglatlist: js.Array[LngLat],
    speed: Unit,
    f: js.Function1[/* k */ Double, Double],
    circlable: Boolean
  ): Unit = js.native
  def moveAlong(lnglatlist: js.Array[LngLat], speed: Unit, f: Unit, circlable: Boolean): Unit = js.native
  
  def moveTo(lnglat: LngLat): Unit = js.native
  def moveTo(lnglat: LngLat, speed: Double): Unit = js.native
  def moveTo(lnglat: LngLat, speed: Double, f: js.Function1[/* k */ Double, Double]): Unit = js.native
  def moveTo(lnglat: LngLat, speed: Unit, f: js.Function1[/* k */ Double, Double]): Unit = js.native
  
  def setAngle(angle: Double): Unit = js.native
  
  def setAnimation(animate: String): Unit = js.native
  
  def setClickable(clickable: Boolean): Unit = js.native
  
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  def setCursor(cursor: String): Unit = js.native
  
  def setDraggable(draggable: Boolean): Unit = js.native
  
  def setExtData(ext: Any): Unit = js.native
  
  def setIcon(content: String): Unit = js.native
  def setIcon(content: Icon): Unit = js.native
  
  def setLabel(label: Offset): Unit = js.native
  
  def setMap(map: Map): Unit = js.native
  
  def setOffset(offset: Pixel): Unit = js.native
  
  def setPosition(lnglat: LngLat): Unit = js.native
  
  def setShadow(icon: Icon): Unit = js.native
  
  def setShape(shape: MarkerShape): Unit = js.native
  
  def setTitle(title: String): Unit = js.native
  
  def setTop(isTop: Boolean): Unit = js.native
  
  def setzIndex(index: Double): Unit = js.native
  
  def show(): Unit = js.native
  
  def stopMove(): Unit = js.native
}
