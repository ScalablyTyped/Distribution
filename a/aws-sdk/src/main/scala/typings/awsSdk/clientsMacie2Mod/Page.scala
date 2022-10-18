package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  /**
    *  Reserved for future use.
    */
  var lineRange: js.UndefOr[Range] = js.undefined
  
  /**
    *  Reserved for future use.
    */
  var offsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The page number of the page that contains the sensitive data.
    */
  var pageNumber: js.UndefOr[long] = js.undefined
}
object Page {
  
  inline def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  extension [Self <: Page](x: Self) {
    
    inline def setLineRange(value: Range): Self = StObject.set(x, "lineRange", value.asInstanceOf[js.Any])
    
    inline def setLineRangeUndefined: Self = StObject.set(x, "lineRange", js.undefined)
    
    inline def setOffsetRange(value: Range): Self = StObject.set(x, "offsetRange", value.asInstanceOf[js.Any])
    
    inline def setOffsetRangeUndefined: Self = StObject.set(x, "offsetRange", js.undefined)
    
    inline def setPageNumber(value: long): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
  }
}
