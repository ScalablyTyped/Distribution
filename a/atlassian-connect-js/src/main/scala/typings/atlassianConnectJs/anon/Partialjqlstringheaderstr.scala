package typings.atlassianConnectJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  jql :string,   header :string,   descriptionText :string,   submitText :string,   cancelText :string}> */
trait Partialjqlstringheaderstr extends StObject {
  
  var cancelText: js.UndefOr[String] = js.undefined
  
  var descriptionText: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
  
  var jql: js.UndefOr[String] = js.undefined
  
  var submitText: js.UndefOr[String] = js.undefined
}
object Partialjqlstringheaderstr {
  
  inline def apply(): Partialjqlstringheaderstr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialjqlstringheaderstr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialjqlstringheaderstr] (val x: Self) extends AnyVal {
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setDescriptionText(value: String): Self = StObject.set(x, "descriptionText", value.asInstanceOf[js.Any])
    
    inline def setDescriptionTextUndefined: Self = StObject.set(x, "descriptionText", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setJql(value: String): Self = StObject.set(x, "jql", value.asInstanceOf[js.Any])
    
    inline def setJqlUndefined: Self = StObject.set(x, "jql", js.undefined)
    
    inline def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
    
    inline def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
  }
}
