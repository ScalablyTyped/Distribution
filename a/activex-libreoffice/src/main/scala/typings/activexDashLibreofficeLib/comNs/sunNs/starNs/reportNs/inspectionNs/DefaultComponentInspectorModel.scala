package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.inspectionNs

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
trait DefaultComponentInspectorModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.XObjectInspectorModel {
  /**
    * creates a default {@link DefaultComponentInspectorModel} , providing factories for all handlers listed above.
    * @since OOo 2.2
    */
  def createDefault(): scala.Unit
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
  def createWithHelpSection(minHelpTextLines: scala.Double, maxHelpTextLines: scala.Double): scala.Unit
}

object DefaultComponentInspectorModel {
  @scala.inline
  def apply(
    HandlerFactories: activexDashInteropLib.SafeArray[_],
    HasHelpSection: scala.Boolean,
    IsReadOnly: scala.Boolean,
    MaxHelpTextLines: scala.Double,
    MinHelpTextLines: scala.Double,
    createDefault: js.Function0[scala.Unit],
    createWithHelpSection: js.Function2[scala.Double, scala.Double, scala.Unit],
    describeCategories: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.PropertyCategoryDescriptor
      ]
    ],
    getPropertyOrderIndex: js.Function1[java.lang.String, scala.Double]
  ): DefaultComponentInspectorModel = {
    val __obj = js.Dynamic.literal(HandlerFactories = HandlerFactories, HasHelpSection = HasHelpSection, IsReadOnly = IsReadOnly, MaxHelpTextLines = MaxHelpTextLines, MinHelpTextLines = MinHelpTextLines, createDefault = createDefault, createWithHelpSection = createWithHelpSection, describeCategories = describeCategories, getPropertyOrderIndex = getPropertyOrderIndex)
  
    __obj.asInstanceOf[DefaultComponentInspectorModel]
  }
}

