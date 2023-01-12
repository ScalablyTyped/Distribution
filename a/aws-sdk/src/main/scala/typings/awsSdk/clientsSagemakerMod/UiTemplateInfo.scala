package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiTemplateInfo extends StObject {
  
  /**
    * The SHA-256 digest of the contents of the template.
    */
  var ContentSha256: js.UndefOr[TemplateContentSha256] = js.undefined
  
  /**
    * The URL for the user interface template.
    */
  var Url: js.UndefOr[TemplateUrl] = js.undefined
}
object UiTemplateInfo {
  
  inline def apply(): UiTemplateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiTemplateInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UiTemplateInfo] (val x: Self) extends AnyVal {
    
    inline def setContentSha256(value: TemplateContentSha256): Self = StObject.set(x, "ContentSha256", value.asInstanceOf[js.Any])
    
    inline def setContentSha256Undefined: Self = StObject.set(x, "ContentSha256", js.undefined)
    
    inline def setUrl(value: TemplateUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
