package typings.activexLibreoffice.com_.sun.star.inspection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a category of properties
  * @see ObjectInspector
  * @see XObjectInspectorModel.describeCategory
  * @see LineDescriptor.Category
  * @since OOo 2.0.3
  */
@js.native
trait PropertyCategoryDescriptor extends js.Object {
  
  /** provides a help URL to be associated with a category */
  var HelpURL: String = js.native
  
  /**
    * contains the programmatic name of the category.
    *
    * This programmatic name is used internally: {@link XPropertyHandler.describePropertyLine()} sets a programmatic category name at {@link
    * LineDescriptor.Category} , and an object inspector uses this to find the proper {@link PropertyCategoryDescriptor} .
    */
  var ProgrammaticName: String = js.native
  
  /** provides a human-readable name (which can be presented at the UI) for a category. */
  var UIName: String = js.native
}
object PropertyCategoryDescriptor {
  
  @scala.inline
  def apply(HelpURL: String, ProgrammaticName: String, UIName: String): PropertyCategoryDescriptor = {
    val __obj = js.Dynamic.literal(HelpURL = HelpURL.asInstanceOf[js.Any], ProgrammaticName = ProgrammaticName.asInstanceOf[js.Any], UIName = UIName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyCategoryDescriptor]
  }
  
  @scala.inline
  implicit class PropertyCategoryDescriptorOps[Self <: PropertyCategoryDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHelpURL(value: String): Self = this.set("HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgrammaticName(value: String): Self = this.set("ProgrammaticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIName(value: String): Self = this.set("UIName", value.asInstanceOf[js.Any])
  }
}
