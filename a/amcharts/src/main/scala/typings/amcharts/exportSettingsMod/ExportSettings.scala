package typings.amcharts.exportSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSettings extends js.Object {
  
  def capture(config: js.Any, callback: js.Function0[Unit]): js.Any = js.native
  
  var config: js.Any = js.native
  
  var enabled: Boolean = js.native
  
  var libs: js.Object = js.native
  
  var menu: js.Object = js.native
  
  def toArray(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toBlob(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toCSV(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toCanvas(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toImage(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toJPG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toJSON(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toPDF(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toPNG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toSVG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def toXLSX(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
}
object ExportSettings {
  
  @scala.inline
  def apply(
    capture: (js.Any, js.Function0[Unit]) => js.Any,
    config: js.Any,
    enabled: Boolean,
    libs: js.Object,
    menu: js.Object,
    toArray: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toBlob: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toCSV: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toCanvas: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toImage: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toJPG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toJSON: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toPDF: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toPNG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toSVG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toXLSX: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any
  ): ExportSettings = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), config = config.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], libs = libs.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], toArray = js.Any.fromFunction2(toArray), toBlob = js.Any.fromFunction2(toBlob), toCSV = js.Any.fromFunction2(toCSV), toCanvas = js.Any.fromFunction2(toCanvas), toImage = js.Any.fromFunction2(toImage), toJPG = js.Any.fromFunction2(toJPG), toJSON = js.Any.fromFunction2(toJSON), toPDF = js.Any.fromFunction2(toPDF), toPNG = js.Any.fromFunction2(toPNG), toSVG = js.Any.fromFunction2(toSVG), toXLSX = js.Any.fromFunction2(toXLSX))
    __obj.asInstanceOf[ExportSettings]
  }
  
  @scala.inline
  implicit class ExportSettingsOps[Self <: ExportSettings] (val x: Self) extends AnyVal {
    
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
    def setCapture(value: (js.Any, js.Function0[Unit]) => js.Any): Self = this.set("capture", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibs(value: js.Object): Self = this.set("libs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: js.Object): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToArray(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toArray", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToBlob(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toBlob", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToCSV(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toCSV", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToCanvas(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toCanvas", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToImage(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toImage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToJPG(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toJPG", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToJSON(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toJSON", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToPDF(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toPDF", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToPNG(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toPNG", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToSVG(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toSVG", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToXLSX(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = this.set("toXLSX", js.Any.fromFunction2(value))
  }
}
