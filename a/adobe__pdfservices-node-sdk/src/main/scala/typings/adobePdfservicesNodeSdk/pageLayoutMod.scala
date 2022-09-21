package typings.adobePdfservicesNodeSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageLayoutMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/createpdf/page-layout", "PageLayout")
  @js.native
  open class PageLayout () extends StObject {
    
    var pageHeight: Double = js.native
    
    var pageWidth: Double = js.native
    
    /**
      * Sets a custom page size.<br>
      * Page size and orientation can also be set using paged media CSS which overrides the SDK Page Layout settings.
      */
    def setPageSize(pageWidth: Double, pageHeight: Double): Unit = js.native
  }
}
