package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a default implementation of an {@link ObjectInspectorModel}
  *
  * This service simplifies usage of an {@link ObjectInspector} .
  *
  * The {@link XObjectInspectorModel} implemented by this service will not provide any property categories, nor apply any particular order to the
  * properties provided by its handler(s).
  * @see ObjectInspector
  * @see XObjectInspectorModel
  * @see XObjectInspectorModel.describeCategories
  * @see XObjectInspectorModel.getPropertyOrderIndex
  * @since OOo 2.0.3
  */
trait ObjectInspectorModel extends XObjectInspectorModel {
  /** creates a default {@link ObjectInspectorModel} , whose one and only handler factory creates a {@link GenericPropertyHandler} . */
  def createDefault(): scala.Unit
  /**
    * creates a default {@link ObjectInspectorModel} , using an externally provided sequence of property handler factories.
    * @param handlerFactories a sequence of handler factories, as to be provided in the {@link XObjectInspectorModel.HandlerFactories} method.
    * @see XObjectInspectorModel.HandlerFactories
    * @throws com::sun::star::lang::IllegalArgumentException if the given sequence is empty.
    */
  def createWithHandlerFactories(handlerFactories: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): scala.Unit
  /**
    * creates a default {@link ObjectInspectorModel} , using an externally provided sequence of property handler factories, and describing an {@link
    * ObjectInspector} which has a help section.
    * @param handlerFactories a sequence of handler factories, as to be provided in the {@link XObjectInspectorModel.HandlerFactories} method.
    * @param minHelpTextLines denotes the minimum number of lines of text to be reserved for the help section.
    * @param maxHelpTextLines denotes the maximum number of lines of text to be reserved for the help section.
    * @see XObjectInspectorModel.HandlerFactories
    * @see XObjectInspectorModel.HasHelpSection
    * @see XObjectInspectorModel.MinHelpTextLines
    * @see XObjectInspectorModel.MaxHelpTextLines
    * @since OOo 2.2
    * @throws com::sun::star::lang::IllegalArgumentException if handlerFactories is empty.
    * @throws com::sun::star::lang::IllegalArgumentException if minHelpTextLines or maxHelpTextLines are negative, or if minHelpTextLines is greater than maxHe
    */
  def createWithHandlerFactoriesAndHelpSection(
    handlerFactories: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    minHelpTextLines: scala.Double,
    maxHelpTextLines: scala.Double
  ): scala.Unit
}

object ObjectInspectorModel {
  @scala.inline
  def apply(
    HandlerFactories: stdLib.SafeArray[_],
    HasHelpSection: scala.Boolean,
    IsReadOnly: scala.Boolean,
    MaxHelpTextLines: scala.Double,
    MinHelpTextLines: scala.Double,
    createDefault: () => scala.Unit,
    createWithHandlerFactories: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    createWithHandlerFactoriesAndHelpSection: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Double, scala.Double) => scala.Unit,
    describeCategories: () => stdLib.SafeArray[PropertyCategoryDescriptor],
    getPropertyOrderIndex: java.lang.String => scala.Double
  ): ObjectInspectorModel = {
    val __obj = js.Dynamic.literal(HandlerFactories = HandlerFactories, HasHelpSection = HasHelpSection, IsReadOnly = IsReadOnly, MaxHelpTextLines = MaxHelpTextLines, MinHelpTextLines = MinHelpTextLines, createDefault = js.Any.fromFunction0(createDefault), createWithHandlerFactories = js.Any.fromFunction1(createWithHandlerFactories), createWithHandlerFactoriesAndHelpSection = js.Any.fromFunction3(createWithHandlerFactoriesAndHelpSection), describeCategories = js.Any.fromFunction0(describeCategories), getPropertyOrderIndex = js.Any.fromFunction1(getPropertyOrderIndex))
  
    __obj.asInstanceOf[ObjectInspectorModel]
  }
}

