package typings.activexLibreoffice.com_.sun.star.report

import typings.activexLibreoffice.com_.sun.star.inspection.PropertyCategoryDescriptor
import typings.activexLibreoffice.com_.sun.star.inspection.XObjectInspectorModel
import typings.activexLibreoffice.com_.sun.star.inspection.XPropertyHandler
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspection {
  
  /**
    * implements the default property handler for all known types of com::sun::star::chart2::data::XDataProviders.
    * @see com.sun.star.inspection.XPropertyHandler
    */
  type DataProviderHandler = XPropertyHandler
  
  /**
    * implements a {@link com.sun.star.inspection.XObjectInspectorModel} for inspecting form components, in particular all components implementing the
    * ReportComponent service.
    *
    * A {@link DefaultComponentInspectorModel} provides the following handlers by default: GeometryHandler{@link ReportComponentHandler}{@link
    * com.sun.star.form.inspection.EditPropertyHandler}
    * @see com.sun.star.inspection.XObjectInspectorModel.HandlerFactories
    */
  trait DefaultComponentInspectorModel
    extends StObject
       with XObjectInspectorModel {
    
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
      HandlerFactories: SafeArray[js.Any],
      HasHelpSection: Boolean,
      IsReadOnly: Boolean,
      MaxHelpTextLines: Double,
      MinHelpTextLines: Double,
      createDefault: () => Unit,
      createWithHelpSection: (Double, Double) => Unit,
      describeCategories: () => SafeArray[PropertyCategoryDescriptor],
      getPropertyOrderIndex: String => Double
    ): DefaultComponentInspectorModel = {
      val __obj = js.Dynamic.literal(HandlerFactories = HandlerFactories.asInstanceOf[js.Any], HasHelpSection = HasHelpSection.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], MaxHelpTextLines = MaxHelpTextLines.asInstanceOf[js.Any], MinHelpTextLines = MinHelpTextLines.asInstanceOf[js.Any], createDefault = js.Any.fromFunction0(createDefault), createWithHelpSection = js.Any.fromFunction2(createWithHelpSection), describeCategories = js.Any.fromFunction0(describeCategories), getPropertyOrderIndex = js.Any.fromFunction1(getPropertyOrderIndex))
      __obj.asInstanceOf[DefaultComponentInspectorModel]
    }
    
    @scala.inline
    implicit class DefaultComponentInspectorModelMutableBuilder[Self <: DefaultComponentInspectorModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateDefault(value: () => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateWithHelpSection(value: (Double, Double) => Unit): Self = StObject.set(x, "createWithHelpSection", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * implements the default property handler for all known types of com::sun::star::report::XReportComponents.
    * @see com.sun.star.inspection.XPropertyHandler
    */
  type ReportComponentHandler = XPropertyHandler
}
