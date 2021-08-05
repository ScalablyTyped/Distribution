package typings.activexLibreoffice.com_.sun.star.configuration.backend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * holds the data needed to identify a template.
  * @since OOo 1.1.2
  */
trait TemplateIdentifier extends StObject {
  
  /** specifies the component where the template originates. */
  var Component: String
  
  /**
    * specifies the name of the template.
    *
    * The name is unique within a component.
    */
  var Name: String
}
object TemplateIdentifier {
  
  inline def apply(Component: String, Name: String): TemplateIdentifier = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateIdentifier]
  }
  
  extension [Self <: TemplateIdentifier](x: Self) {
    
    inline def setComponent(value: String): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
