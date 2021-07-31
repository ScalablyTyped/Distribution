package typings.angularPdfjsViewer

import typings.angular.mod.IServiceProvider
import typings.angularPdfjsViewer.angularPdfjsViewerStrings.errors
import typings.angularPdfjsViewer.angularPdfjsViewerStrings.infos
import typings.angularPdfjsViewer.angularPdfjsViewerStrings.warnings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object pdfjsViewer {
    
    @js.native
    trait ConfigProvider
      extends StObject
         with IServiceProvider {
      
      def disableWorker(): Unit = js.native
      
      def setCmapDir(dir: String): Unit = js.native
      
      def setImageDir(dir: String): Unit = js.native
      
      @JSName("setVerbosity")
      def setVerbosity_errors(verbosity: errors): Unit = js.native
      @JSName("setVerbosity")
      def setVerbosity_infos(verbosity: infos): Unit = js.native
      @JSName("setVerbosity")
      def setVerbosity_warnings(verbosity: warnings): Unit = js.native
      
      def setWorkerSrc(src: String): Unit = js.native
    }
  }
}
