package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateMetadata extends StObject {
  
  /**
    * The time and date the template was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the template.
    */
  var Name: js.UndefOr[TemplateName] = js.undefined
}
object TemplateMetadata {
  
  inline def apply(): TemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateMetadata]
  }
  
  extension [Self <: TemplateMetadata](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setName(value: TemplateName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
