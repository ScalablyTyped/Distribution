package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loa extends StObject {
  
  /**
    * The binary contents of the LOA-CFA document.
    */
  var loaContent: js.UndefOr[LoaContent] = js.undefined
  
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.undefined
}
object Loa {
  
  inline def apply(): Loa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Loa] (val x: Self) extends AnyVal {
    
    inline def setLoaContent(value: LoaContent): Self = StObject.set(x, "loaContent", value.asInstanceOf[js.Any])
    
    inline def setLoaContentType(value: LoaContentType): Self = StObject.set(x, "loaContentType", value.asInstanceOf[js.Any])
    
    inline def setLoaContentTypeUndefined: Self = StObject.set(x, "loaContentType", js.undefined)
    
    inline def setLoaContentUndefined: Self = StObject.set(x, "loaContent", js.undefined)
  }
}
