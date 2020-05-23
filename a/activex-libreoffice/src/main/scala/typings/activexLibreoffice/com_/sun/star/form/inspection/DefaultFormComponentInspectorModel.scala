package typings.activexLibreoffice.com_.sun.star.form.inspection

import typings.activexLibreoffice.com_.sun.star.inspection.PropertyCategoryDescriptor
import typings.activexLibreoffice.com_.sun.star.inspection.XObjectInspectorModel
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a {@link com.sun.star.inspection.XObjectInspectorModel} for inspecting form components, in particular all components implementing the
  * {@link FormComponent} service.
  *
  * A {@link DefaultFormComponentInspectorModel} provides the following handlers by default: {@link ButtonNavigationHandler}{@link
  * CellBindingPropertyHandler}{@link EditPropertyHandler}{@link EventHandler}{@link FormComponentPropertyHandler}{@link SubmissionPropertyHandler}{@link
  * XMLFormsPropertyHandler}{@link XSDValidationPropertyHandler}
  * @see com.sun.star.inspection.XObjectInspectorModel.HandlerFactories
  */
trait DefaultFormComponentInspectorModel extends XObjectInspectorModel {
  /**
    * creates a default {@link DefaultFormComponentInspectorModel} , providing factories for all handlers listed above.
    * @since OOo 2.2
    */
  def createDefault(): Unit
  /**
    * creates a default {@link DefaultFormComponentInspectorModel} , providing factories for all handlers listed above, and describing an ObjectInspector
    * which has a help section.
    * @param minHelpTextLines denotes the minimum number of lines of text to be reserved for the help section.
    * @param maxHelpTextLines denotes the maximum number of lines of text to be reserved for the help section.
    * @see XObjectInspectorModel.HasHelpSection
    * @see XObjectInspectorModel.MinHelpTextLines
    * @see XObjectInspectorModel.MaxHelpTextLines
    * @since OOo 2.2
    * @throws com::sun::star::lang::IllegalArgumentException if minHelpTextLines or maxHelpTextLines are negative, or if minHelpTextLines is greater than maxHe
    */
  def createWithHelpSection(minHelpTextLines: Double, maxHelpTextLines: Double): Unit
}

object DefaultFormComponentInspectorModel {
  @scala.inline
  def apply(
    HandlerFactories: SafeArray[_],
    HasHelpSection: Boolean,
    IsReadOnly: Boolean,
    MaxHelpTextLines: Double,
    MinHelpTextLines: Double,
    createDefault: () => Unit,
    createWithHelpSection: (Double, Double) => Unit,
    describeCategories: () => SafeArray[PropertyCategoryDescriptor],
    getPropertyOrderIndex: String => Double
  ): DefaultFormComponentInspectorModel = {
    val __obj = js.Dynamic.literal(HandlerFactories = HandlerFactories.asInstanceOf[js.Any], HasHelpSection = HasHelpSection.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], MaxHelpTextLines = MaxHelpTextLines.asInstanceOf[js.Any], MinHelpTextLines = MinHelpTextLines.asInstanceOf[js.Any], createDefault = js.Any.fromFunction0(createDefault), createWithHelpSection = js.Any.fromFunction2(createWithHelpSection), describeCategories = js.Any.fromFunction0(describeCategories), getPropertyOrderIndex = js.Any.fromFunction1(getPropertyOrderIndex))
    __obj.asInstanceOf[DefaultFormComponentInspectorModel]
  }
}

