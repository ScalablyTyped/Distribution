package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderUiTemplateResponse extends StObject {
  
  /**
    * A list of one or more RenderingError objects if any were encountered while rendering the template. If there were no errors, the list is empty.
    */
  var Errors: RenderingErrorList
  
  /**
    * A Liquid template that renders the HTML for the worker UI.
    */
  var RenderedContent: String
}
object RenderUiTemplateResponse {
  
  inline def apply(Errors: RenderingErrorList, RenderedContent: String): RenderUiTemplateResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any], RenderedContent = RenderedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderUiTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderUiTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: RenderingErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: RenderingError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setRenderedContent(value: String): Self = StObject.set(x, "RenderedContent", value.asInstanceOf[js.Any])
  }
}
