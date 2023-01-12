package typings.angularPdfjsViewer

import typings.angular.mod.IServiceProvider
import typings.angularPdfjsViewer.angularPdfjsViewerStrings.errors
import typings.angularPdfjsViewer.angularPdfjsViewerStrings.infos
import typings.angularPdfjsViewer.angularPdfjsViewerStrings.warnings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object pdfjsViewer {
    
    trait ConfigProvider
      extends StObject
         with IServiceProvider {
      
      def disableWorker(): Unit
      
      def setCmapDir(dir: String): Unit
      
      def setImageDir(dir: String): Unit
      
      def setVerbosity(verbosity: errors | warnings | infos): Unit
      
      def setWorkerSrc(src: String): Unit
    }
    object ConfigProvider {
      
      inline def apply(
        $get: Any,
        disableWorker: () => Unit,
        setCmapDir: String => Unit,
        setImageDir: String => Unit,
        setVerbosity: errors | warnings | infos => Unit,
        setWorkerSrc: String => Unit
      ): ConfigProvider = {
        val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], disableWorker = js.Any.fromFunction0(disableWorker), setCmapDir = js.Any.fromFunction1(setCmapDir), setImageDir = js.Any.fromFunction1(setImageDir), setVerbosity = js.Any.fromFunction1(setVerbosity), setWorkerSrc = js.Any.fromFunction1(setWorkerSrc))
        __obj.asInstanceOf[ConfigProvider]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ConfigProvider] (val x: Self) extends AnyVal {
        
        inline def setDisableWorker(value: () => Unit): Self = StObject.set(x, "disableWorker", js.Any.fromFunction0(value))
        
        inline def setSetCmapDir(value: String => Unit): Self = StObject.set(x, "setCmapDir", js.Any.fromFunction1(value))
        
        inline def setSetImageDir(value: String => Unit): Self = StObject.set(x, "setImageDir", js.Any.fromFunction1(value))
        
        inline def setSetVerbosity(value: errors | warnings | infos => Unit): Self = StObject.set(x, "setVerbosity", js.Any.fromFunction1(value))
        
        inline def setSetWorkerSrc(value: String => Unit): Self = StObject.set(x, "setWorkerSrc", js.Any.fromFunction1(value))
      }
    }
  }
}
