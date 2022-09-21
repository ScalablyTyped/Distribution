package typings.adobePdfservicesNodeSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageRangesMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/page-ranges", "PageRanges")
  @js.native
  open class PageRanges () extends StObject {
    
    var _ranges: js.Array[Any] = js.native
    
    /**
      * Adds a page range representing all pages.
      */
    def addAll(): Unit = js.native
    
    /**
      * Adds a page range from the specified start page index to the last page. Page index starts from 1.
      */
    def addAllFrom(start: Double): Unit = js.native
    
    /**
      *
      * Adds a page range. Page indexes start from 1.
      */
    def addPageRange(start: Double, end: Double): Unit = js.native
    
    /**
      * Adds a single page. Page index starts from 1.
      *
      */
    def addSinglePage(page: Double): Unit = js.native
    
    def getRanges(): js.Array[Any] = js.native
    
    def validate(): Unit = js.native
  }
}
