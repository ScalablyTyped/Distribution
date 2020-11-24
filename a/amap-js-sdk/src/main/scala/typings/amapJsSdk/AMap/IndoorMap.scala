package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndoorMap extends js.Object {
  
  def getOpacity(): Double = js.native
  
  def getSelectedBuilding(): String = js.native
  
  def getSelectedBuildingId(): String = js.native
  
  def hide(): Unit = js.native
  
  def hideFloorBar(): Unit = js.native
  
  def hideLabels(): Unit = js.native
  
  def setMap(map: Map): Unit = js.native
  
  def setOpacity(alpha: Double): Unit = js.native
  
  def setzIndex(): Unit = js.native
  
  def show(): Unit = js.native
  
  def showFloor(floor: Double, noMove: Boolean): Unit = js.native
  
  def showFloorBar(): Unit = js.native
  
  def showIndoorMap(indoorid: String, floor: Double, shopid: String): Unit = js.native
  
  def showLabels(): Unit = js.native
}
object IndoorMap {
  
  @scala.inline
  def apply(
    getOpacity: () => Double,
    getSelectedBuilding: () => String,
    getSelectedBuildingId: () => String,
    hide: () => Unit,
    hideFloorBar: () => Unit,
    hideLabels: () => Unit,
    setMap: Map => Unit,
    setOpacity: Double => Unit,
    setzIndex: () => Unit,
    show: () => Unit,
    showFloor: (Double, Boolean) => Unit,
    showFloorBar: () => Unit,
    showIndoorMap: (String, Double, String) => Unit,
    showLabels: () => Unit
  ): IndoorMap = {
    val __obj = js.Dynamic.literal(getOpacity = js.Any.fromFunction0(getOpacity), getSelectedBuilding = js.Any.fromFunction0(getSelectedBuilding), getSelectedBuildingId = js.Any.fromFunction0(getSelectedBuildingId), hide = js.Any.fromFunction0(hide), hideFloorBar = js.Any.fromFunction0(hideFloorBar), hideLabels = js.Any.fromFunction0(hideLabels), setMap = js.Any.fromFunction1(setMap), setOpacity = js.Any.fromFunction1(setOpacity), setzIndex = js.Any.fromFunction0(setzIndex), show = js.Any.fromFunction0(show), showFloor = js.Any.fromFunction2(showFloor), showFloorBar = js.Any.fromFunction0(showFloorBar), showIndoorMap = js.Any.fromFunction3(showIndoorMap), showLabels = js.Any.fromFunction0(showLabels))
    __obj.asInstanceOf[IndoorMap]
  }
  
  @scala.inline
  implicit class IndoorMapOps[Self <: IndoorMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetOpacity(value: () => Double): Self = this.set("getOpacity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedBuilding(value: () => String): Self = this.set("getSelectedBuilding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedBuildingId(value: () => String): Self = this.set("getSelectedBuildingId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideFloorBar(value: () => Unit): Self = this.set("hideFloorBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideLabels(value: () => Unit): Self = this.set("hideLabels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMap(value: Map => Unit): Self = this.set("setMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpacity(value: Double => Unit): Self = this.set("setOpacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetzIndex(value: () => Unit): Self = this.set("setzIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowFloor(value: (Double, Boolean) => Unit): Self = this.set("showFloor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowFloorBar(value: () => Unit): Self = this.set("showFloorBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowIndoorMap(value: (String, Double, String) => Unit): Self = this.set("showIndoorMap", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShowLabels(value: () => Unit): Self = this.set("showLabels", js.Any.fromFunction0(value))
  }
}
