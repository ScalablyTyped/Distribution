package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailTemplateMetadata extends StObject {
  
  /**
    * The time and date the template was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the template.
    */
  var TemplateName: js.UndefOr[EmailTemplateName] = js.undefined
}
object EmailTemplateMetadata {
  
  inline def apply(): EmailTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailTemplateMetadata]
  }
  
  extension [Self <: EmailTemplateMetadata](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
  }
}
