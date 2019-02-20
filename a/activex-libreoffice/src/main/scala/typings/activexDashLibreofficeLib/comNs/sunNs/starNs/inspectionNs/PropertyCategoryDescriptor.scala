package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

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
  var HelpURL: java.lang.String
  /**
    * contains the programmatic name of the category.
    *
    * This programmatic name is used internally: {@link XPropertyHandler.describePropertyLine()} sets a programmatic category name at {@link
    * LineDescriptor.Category} , and an object inspector uses this to find the proper {@link PropertyCategoryDescriptor} .
    */
  var ProgrammaticName: java.lang.String
  /** provides a human-readable name (which can be presented at the UI) for a category. */
  var UIName: java.lang.String
}

