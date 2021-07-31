package typings.activexLibreoffice.com_.sun.star.inspection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a category of properties
  * @see ObjectInspector
  * @see XObjectInspectorModel.describeCategory
  * @see LineDescriptor.Category
  * @since OOo 2.0.3
  */
trait PropertyCategoryDescriptor extends StObject {
  
  /** provides a help URL to be associated with a category */
  var HelpURL: String
  
  /**
    * contains the programmatic name of the category.
    *
    * This programmatic name is used internally: {@link XPropertyHandler.describePropertyLine()} sets a programmatic category name at {@link
    * LineDescriptor.Category} , and an object inspector uses this to find the proper {@link PropertyCategoryDescriptor} .
    */
  var ProgrammaticName: String
  
  /** provides a human-readable name (which can be presented at the UI) for a category. */
  var UIName: String
}
object PropertyCategoryDescriptor {
  
  @scala.inline
  def apply(HelpURL: String, ProgrammaticName: String, UIName: String): PropertyCategoryDescriptor = {
    val __obj = js.Dynamic.literal(HelpURL = HelpURL.asInstanceOf[js.Any], ProgrammaticName = ProgrammaticName.asInstanceOf[js.Any], UIName = UIName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyCategoryDescriptor]
  }
  
  @scala.inline
  implicit class PropertyCategoryDescriptorMutableBuilder[Self <: PropertyCategoryDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgrammaticName(value: String): Self = StObject.set(x, "ProgrammaticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIName(value: String): Self = StObject.set(x, "UIName", value.asInstanceOf[js.Any])
  }
}
