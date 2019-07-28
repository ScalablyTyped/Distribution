package typings.activexDashLibreoffice.comNs.sunNs.starNs.reportNs.inspectionNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs.PropertyCategoryDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs.XObjectInspectorModel
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a {@link com.sun.star.inspection.XObjectInspectorModel} for inspecting form components, in particular all components implementing the
  * ReportComponent service.
  *
  * A {@link DefaultComponentInspectorModel} provides the following handlers by default: GeometryHandler{@link ReportComponentHandler}{@link
  * com.sun.star.form.inspection.EditPropertyHandler}
  * @see com.sun.star.inspection.XObjectInspectorModel.HandlerFactories
  */
trait DefaultComponentInspectorModel extends XObjectInspectorModel {
  /**
    * creates a default {@link DefaultComponentInspectorModel} , providing factories for all handlers listed above.
    * @since OOo 2.2
    */
  def createDefault(): Unit
  /**
    * creates a default {@link DefaultComponentInspectorModel} , providing factories for all handlers listed above, and describing an ObjectInspector which
    * has a help section.
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

object DefaultComponentInspectorModel {
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
  ): DefaultComponentInspectorModel = {
    val __obj = js.Dynamic.literal(HandlerFactories = HandlerFactories, HasHelpSection = HasHelpSection, IsReadOnly = IsReadOnly, MaxHelpTextLines = MaxHelpTextLines, MinHelpTextLines = MinHelpTextLines, createDefault = js.Any.fromFunction0(createDefault), createWithHelpSection = js.Any.fromFunction2(createWithHelpSection), describeCategories = js.Any.fromFunction0(describeCategories), getPropertyOrderIndex = js.Any.fromFunction1(getPropertyOrderIndex))
  
    __obj.asInstanceOf[DefaultComponentInspectorModel]
  }
}

