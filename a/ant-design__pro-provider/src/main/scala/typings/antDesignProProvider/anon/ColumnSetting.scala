package typings.antDesignProProvider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSetting extends js.Object {
  
  var columnDisplay: String = js.native
  
  var columnSetting: String = js.native
  
  var density: String = js.native
  
  var densityLarger: String = js.native
  
  var densityMiddle: String = js.native
  
  var densitySmall: String = js.native
  
  var exitFullScreen: String = js.native
  
  var fullScreen: String = js.native
  
  var leftFixedTitle: String = js.native
  
  var leftPin: String = js.native
  
  var noFixedTitle: String = js.native
  
  var noPin: String = js.native
  
  var reload: String = js.native
  
  var reset: String = js.native
  
  var rightFixedTitle: String = js.native
  
  var rightPin: String = js.native
}
object ColumnSetting {
  
  @scala.inline
  def apply(
    columnDisplay: String,
    columnSetting: String,
    density: String,
    densityLarger: String,
    densityMiddle: String,
    densitySmall: String,
    exitFullScreen: String,
    fullScreen: String,
    leftFixedTitle: String,
    leftPin: String,
    noFixedTitle: String,
    noPin: String,
    reload: String,
    reset: String,
    rightFixedTitle: String,
    rightPin: String
  ): ColumnSetting = {
    val __obj = js.Dynamic.literal(columnDisplay = columnDisplay.asInstanceOf[js.Any], columnSetting = columnSetting.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], densityLarger = densityLarger.asInstanceOf[js.Any], densityMiddle = densityMiddle.asInstanceOf[js.Any], densitySmall = densitySmall.asInstanceOf[js.Any], exitFullScreen = exitFullScreen.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], leftFixedTitle = leftFixedTitle.asInstanceOf[js.Any], leftPin = leftPin.asInstanceOf[js.Any], noFixedTitle = noFixedTitle.asInstanceOf[js.Any], noPin = noPin.asInstanceOf[js.Any], reload = reload.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], rightFixedTitle = rightFixedTitle.asInstanceOf[js.Any], rightPin = rightPin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSetting]
  }
  
  @scala.inline
  implicit class ColumnSettingOps[Self <: ColumnSetting] (val x: Self) extends AnyVal {
    
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
    def setColumnDisplay(value: String): Self = this.set("columnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSetting(value: String): Self = this.set("columnSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensity(value: String): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensityLarger(value: String): Self = this.set("densityLarger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensityMiddle(value: String): Self = this.set("densityMiddle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensitySmall(value: String): Self = this.set("densitySmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitFullScreen(value: String): Self = this.set("exitFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: String): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftFixedTitle(value: String): Self = this.set("leftFixedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftPin(value: String): Self = this.set("leftPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoFixedTitle(value: String): Self = this.set("noFixedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoPin(value: String): Self = this.set("noPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReload(value: String): Self = this.set("reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: String): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightFixedTitle(value: String): Self = this.set("rightFixedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightPin(value: String): Self = this.set("rightPin", value.asInstanceOf[js.Any])
  }
}
