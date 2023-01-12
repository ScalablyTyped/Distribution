package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait ObjectInspectorModel
  extends StObject
     with XObjectInspectorModel {
  
  /** creates a default {@link ObjectInspectorModel} , whose one and only handler factory creates a {@link GenericPropertyHandler} . */
  def createDefault(): Unit
  
  /**
    * creates a default {@link ObjectInspectorModel} , using an externally provided sequence of property handler factories.
    * @param handlerFactories a sequence of handler factories, as to be provided in the {@link XObjectInspectorModel.HandlerFactories} method.
    * @see XObjectInspectorModel.HandlerFactories
    * @throws com::sun::star::lang::IllegalArgumentException if the given sequence is empty.
    */
  def createWithHandlerFactories(handlerFactories: SeqEquiv[Any]): Unit
  
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
  def createWithHandlerFactoriesAndHelpSection(handlerFactories: SeqEquiv[Any], minHelpTextLines: Double, maxHelpTextLines: Double): Unit
}
object ObjectInspectorModel {
  
  inline def apply(
    HandlerFactories: SafeArray[Any],
    HasHelpSection: Boolean,
    IsReadOnly: Boolean,
    MaxHelpTextLines: Double,
    MinHelpTextLines: Double,
    createDefault: () => Unit,
    createWithHandlerFactories: SeqEquiv[Any] => Unit,
    createWithHandlerFactoriesAndHelpSection: (SeqEquiv[Any], Double, Double) => Unit,
    describeCategories: () => SafeArray[PropertyCategoryDescriptor],
    getPropertyOrderIndex: String => Double
  ): ObjectInspectorModel = {
    val __obj = js.Dynamic.literal(HandlerFactories = HandlerFactories.asInstanceOf[js.Any], HasHelpSection = HasHelpSection.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], MaxHelpTextLines = MaxHelpTextLines.asInstanceOf[js.Any], MinHelpTextLines = MinHelpTextLines.asInstanceOf[js.Any], createDefault = js.Any.fromFunction0(createDefault), createWithHandlerFactories = js.Any.fromFunction1(createWithHandlerFactories), createWithHandlerFactoriesAndHelpSection = js.Any.fromFunction3(createWithHandlerFactoriesAndHelpSection), describeCategories = js.Any.fromFunction0(describeCategories), getPropertyOrderIndex = js.Any.fromFunction1(getPropertyOrderIndex))
    __obj.asInstanceOf[ObjectInspectorModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectInspectorModel] (val x: Self) extends AnyVal {
    
    inline def setCreateDefault(value: () => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
    
    inline def setCreateWithHandlerFactories(value: SeqEquiv[Any] => Unit): Self = StObject.set(x, "createWithHandlerFactories", js.Any.fromFunction1(value))
    
    inline def setCreateWithHandlerFactoriesAndHelpSection(value: (SeqEquiv[Any], Double, Double) => Unit): Self = StObject.set(x, "createWithHandlerFactoriesAndHelpSection", js.Any.fromFunction3(value))
  }
}
