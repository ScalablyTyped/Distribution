package typings.activexLibreoffice.com_.sun.star.configuration.backend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * holds the data needed to identify a template.
  * @since OOo 1.1.2
  */
@js.native
trait TemplateIdentifier extends StObject {
  
  /** specifies the component where the template originates. */
  var Component: String = js.native
  
  /**
    * specifies the name of the template.
    *
    * The name is unique within a component.
    */
  var Name: String = js.native
}
object TemplateIdentifier {
  
  @scala.inline
  def apply(Component: String, Name: String): TemplateIdentifier = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateIdentifier]
  }
  
  @scala.inline
  implicit class TemplateIdentifierMutableBuilder[Self <: TemplateIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: String): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
