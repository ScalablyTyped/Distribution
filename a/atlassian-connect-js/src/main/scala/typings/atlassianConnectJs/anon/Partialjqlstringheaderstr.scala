package typings.atlassianConnectJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  jql :string,   header :string,   descriptionText :string,   submitText :string,   cancelText :string}> */
@js.native
trait Partialjqlstringheaderstr extends StObject {
  
  var cancelText: js.UndefOr[String] = js.native
  
  var descriptionText: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[String] = js.native
  
  var jql: js.UndefOr[String] = js.native
  
  var submitText: js.UndefOr[String] = js.native
}
object Partialjqlstringheaderstr {
  
  @scala.inline
  def apply(): Partialjqlstringheaderstr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialjqlstringheaderstr]
  }
  
  @scala.inline
  implicit class PartialjqlstringheaderstrMutableBuilder[Self <: Partialjqlstringheaderstr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setDescriptionText(value: String): Self = StObject.set(x, "descriptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionTextUndefined: Self = StObject.set(x, "descriptionText", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setJql(value: String): Self = StObject.set(x, "jql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqlUndefined: Self = StObject.set(x, "jql", js.undefined)
    
    @scala.inline
    def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
  }
}
