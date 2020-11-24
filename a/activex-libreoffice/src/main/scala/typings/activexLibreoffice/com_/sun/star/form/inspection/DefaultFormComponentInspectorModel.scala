package typings.activexLibreoffice.com_.sun.star.form.inspection

import typings.activexLibreoffice.com_.sun.star.inspection.PropertyCategoryDescriptor
import typings.activexLibreoffice.com_.sun.star.inspection.XObjectInspectorModel
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implements a {@link com.sun.star.inspection.XObjectInspectorModel} for inspecting form components, in particular all components implementing the
  * {@link FormComponent} service.
  *
  * A {@link DefaultFormComponentInspectorModel} provides the following handlers by default: {@link ButtonNavigationHandler}{@link
  * CellBindingPropertyHandler}{@link EditPropertyHandler}{@link EventHandler}{@link FormComponentPropertyHandler}{@link SubmissionPropertyHandler}{@link
  * XMLFormsPropertyHandler}{@link XSDValidationPropertyHandler}
  * @see com.sun.star.inspection.XObjectInspectorModel.HandlerFactories
  */
@js.native
trait DefaultFormComponentInspectorModel extends XObjectInspectorModel {
  
  /**
    * creates a default {@link DefaultFormComponentInspectorModel} , providing factories for all handlers listed above.
    * @since OOo 2.2
    */
  def createDefault(): Unit = js.native
  
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
  def createWithHelpSection(minHelpTextLines: Double, maxHelpTextLines: Double): Unit = js.native
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
  
  @scala.inline
  implicit class DefaultFormComponentInspectorModelOps[Self <: DefaultFormComponentInspectorModel] (val x: Self) extends AnyVal {
    
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
    def setCreateDefault(value: () => Unit): Self = this.set("createDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWithHelpSection(value: (Double, Double) => Unit): Self = this.set("createWithHelpSection", js.Any.fromFunction2(value))
  }
}
