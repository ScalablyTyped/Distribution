package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSystemTemplateResponse extends StObject {
  
  /**
    * An object containing summary information about the updated system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.undefined
}
object UpdateSystemTemplateResponse {
  
  inline def apply(): UpdateSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSystemTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSystemTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setSummary(value: SystemTemplateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
