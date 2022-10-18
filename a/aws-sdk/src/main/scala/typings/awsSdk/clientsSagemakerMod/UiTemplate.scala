package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiTemplate extends StObject {
  
  /**
    * The content of the Liquid template for the worker user interface.
    */
  var Content: TemplateContent
}
object UiTemplate {
  
  inline def apply(Content: TemplateContent): UiTemplate = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiTemplate]
  }
  
  extension [Self <: UiTemplate](x: Self) {
    
    inline def setContent(value: TemplateContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
  }
}
