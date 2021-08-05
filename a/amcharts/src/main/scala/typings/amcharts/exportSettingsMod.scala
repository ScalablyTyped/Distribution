package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportSettingsMod {
  
  @JSImport("amcharts/ExportSettings", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ExportSettings {
    
    /* CompleteClass */
    override def capture(config: js.Any, callback: js.Function0[Unit]): js.Any = js.native
    
    /* CompleteClass */
    var config: js.Any = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    var libs: js.Object = js.native
    
    /* CompleteClass */
    var menu: js.Object = js.native
    
    /* CompleteClass */
    override def toArray(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toBlob(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toCSV(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toCanvas(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toImage(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toJPG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toJSON(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toPDF(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toPNG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toSVG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def toXLSX(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  }
  
  trait ExportSettings extends StObject {
    
    def capture(config: js.Any, callback: js.Function0[Unit]): js.Any
    
    var config: js.Any
    
    var enabled: Boolean
    
    var libs: js.Object
    
    var menu: js.Object
    
    def toArray(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toBlob(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toCSV(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toCanvas(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toImage(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toJPG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toJSON(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toPDF(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toPNG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toSVG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
    
    def toXLSX(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  }
  object ExportSettings {
    
    inline def apply(
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
    
    extension [Self <: ExportSettings](x: Self) {
      
      inline def setCapture(value: (js.Any, js.Function0[Unit]) => js.Any): Self = StObject.set(x, "capture", js.Any.fromFunction2(value))
      
      inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setLibs(value: js.Object): Self = StObject.set(x, "libs", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: js.Object): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setToArray(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toArray", js.Any.fromFunction2(value))
      
      inline def setToBlob(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toBlob", js.Any.fromFunction2(value))
      
      inline def setToCSV(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toCSV", js.Any.fromFunction2(value))
      
      inline def setToCanvas(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toCanvas", js.Any.fromFunction2(value))
      
      inline def setToImage(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toImage", js.Any.fromFunction2(value))
      
      inline def setToJPG(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toJPG", js.Any.fromFunction2(value))
      
      inline def setToJSON(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction2(value))
      
      inline def setToPDF(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toPDF", js.Any.fromFunction2(value))
      
      inline def setToPNG(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toPNG", js.Any.fromFunction2(value))
      
      inline def setToSVG(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toSVG", js.Any.fromFunction2(value))
      
      inline def setToXLSX(value: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "toXLSX", js.Any.fromFunction2(value))
    }
  }
}
