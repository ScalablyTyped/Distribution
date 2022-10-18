package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  /**
    * An occurrence of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text files include files such as HTML, XML, JSON, and TXT files.
    */
  var LineRange: js.UndefOr[Range] = js.undefined
  
  /**
    * An occurrence of sensitive data detected in a binary text file.
    */
  var OffsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The page number of the page that contains the sensitive data.
    */
  var PageNumber: js.UndefOr[Long] = js.undefined
}
object Page {
  
  inline def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  extension [Self <: Page](x: Self) {
    
    inline def setLineRange(value: Range): Self = StObject.set(x, "LineRange", value.asInstanceOf[js.Any])
    
    inline def setLineRangeUndefined: Self = StObject.set(x, "LineRange", js.undefined)
    
    inline def setOffsetRange(value: Range): Self = StObject.set(x, "OffsetRange", value.asInstanceOf[js.Any])
    
    inline def setOffsetRangeUndefined: Self = StObject.set(x, "OffsetRange", js.undefined)
    
    inline def setPageNumber(value: Long): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "PageNumber", js.undefined)
  }
}
