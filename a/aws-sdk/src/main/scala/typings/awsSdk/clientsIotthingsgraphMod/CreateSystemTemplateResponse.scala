package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSystemTemplateResponse extends StObject {
  
  /**
    * The summary object that describes the created system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.undefined
}
object CreateSystemTemplateResponse {
  
  inline def apply(): CreateSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSystemTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSystemTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setSummary(value: SystemTemplateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
