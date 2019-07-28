package typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a category of properties
  * @see ObjectInspector
  * @see XObjectInspectorModel.describeCategory
  * @see LineDescriptor.Category
  * @since OOo 2.0.3
  */
trait PropertyCategoryDescriptor extends js.Object {
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
    val __obj = js.Dynamic.literal(HelpURL = HelpURL, ProgrammaticName = ProgrammaticName, UIName = UIName)
  
    __obj.asInstanceOf[PropertyCategoryDescriptor]
  }
}

