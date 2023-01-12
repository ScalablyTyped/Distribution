package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportSettingsMod {
  
  @JSImport("amcharts/ExportSettings", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ExportSettings {
    
    /* CompleteClass */
    override def capture(config: Any, callback: js.Function0[Unit]): Any = js.native
    
    /* CompleteClass */
    var config: Any = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    var libs: js.Object = js.native
    
    /* CompleteClass */
    var menu: js.Object = js.native
    
    /* CompleteClass */
    override def toArray(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toBlob(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toCSV(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toCanvas(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toImage(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toJPG(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toJSON(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toPDF(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toPNG(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toSVG(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def toXLSX(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any = js.native
  }
  
  trait ExportSettings extends StObject {
    
    def capture(config: Any, callback: js.Function0[Unit]): Any
    
    var config: Any
    
    var enabled: Boolean
    
    var libs: js.Object
    
    var menu: js.Object
    
    def toArray(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toBlob(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toCSV(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toCanvas(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toImage(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toJPG(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toJSON(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toPDF(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toPNG(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toSVG(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
    
    def toXLSX(options: Any, callback: js.Function1[/* data */ Any, Unit]): Any
  }
  object ExportSettings {
    
    inline def apply(
      capture: (Any, js.Function0[Unit]) => Any,
      config: Any,
      enabled: Boolean,
      libs: js.Object,
      menu: js.Object,
      toArray: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toBlob: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toCSV: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toCanvas: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toImage: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toJPG: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toJSON: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toPDF: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toPNG: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toSVG: (Any, js.Function1[/* data */ Any, Unit]) => Any,
      toXLSX: (Any, js.Function1[/* data */ Any, Unit]) => Any
    ): ExportSettings = {
      val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), config = config.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], libs = libs.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], toArray = js.Any.fromFunction2(toArray), toBlob = js.Any.fromFunction2(toBlob), toCSV = js.Any.fromFunction2(toCSV), toCanvas = js.Any.fromFunction2(toCanvas), toImage = js.Any.fromFunction2(toImage), toJPG = js.Any.fromFunction2(toJPG), toJSON = js.Any.fromFunction2(toJSON), toPDF = js.Any.fromFunction2(toPDF), toPNG = js.Any.fromFunction2(toPNG), toSVG = js.Any.fromFunction2(toSVG), toXLSX = js.Any.fromFunction2(toXLSX))
      __obj.asInstanceOf[ExportSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportSettings] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: (Any, js.Function0[Unit]) => Any): Self = StObject.set(x, "capture", js.Any.fromFunction2(value))
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setLibs(value: js.Object): Self = StObject.set(x, "libs", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: js.Object): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setToArray(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toArray", js.Any.fromFunction2(value))
      
      inline def setToBlob(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toBlob", js.Any.fromFunction2(value))
      
      inline def setToCSV(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toCSV", js.Any.fromFunction2(value))
      
      inline def setToCanvas(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toCanvas", js.Any.fromFunction2(value))
      
      inline def setToImage(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toImage", js.Any.fromFunction2(value))
      
      inline def setToJPG(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toJPG", js.Any.fromFunction2(value))
      
      inline def setToJSON(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction2(value))
      
      inline def setToPDF(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toPDF", js.Any.fromFunction2(value))
      
      inline def setToPNG(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toPNG", js.Any.fromFunction2(value))
      
      inline def setToSVG(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toSVG", js.Any.fromFunction2(value))
      
      inline def setToXLSX(value: (Any, js.Function1[/* data */ Any, Unit]) => Any): Self = StObject.set(x, "toXLSX", js.Any.fromFunction2(value))
    }
  }
}
