package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateConfiguration extends StObject {
  
  /**
    * The template schema used for the data source, where templates schemas are supported. See Data source template schemas.
    */
  var Template: js.UndefOr[typings.awsSdk.clientsKendraMod.Template] = js.undefined
}
object TemplateConfiguration {
  
  inline def apply(): TemplateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "Template", js.undefined)
  }
}
