package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.view.PaperOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This abstract service is implemented by every page of a {@link DrawingDocument} .
  *
  * Example to create and insert a couple of LineShapes:
  *
  * {{program example here, see documentation}}
  */
@js.native
trait GenericDrawPage
  extends XShapes
     with XShapeGrouper
     with XShapeCombiner
     with XShapeBinder
     with XNamed
     with XPropertySet {
  
  /** This is the border at the bottom. */
  var BorderBottom: Double = js.native
  
  /** This is the border at the left. */
  var BorderLeft: Double = js.native
  
  /** This is the border at the right. */
  var BorderRight: Double = js.native
  
  /** This is the border at the top. */
  var BorderTop: Double = js.native
  
  /** This is the height. */
  var Height: Double = js.native
  
  /**
    * this property is true if the averaged background filling colors luminance is belove an application specified threshold value. This can be used to
    * determine the actual value of an auto color.
    */
  var IsBackgroundDark: Boolean = js.native
  
  /**
    * this index access defines a navigation order for the top level shapes inside this page. By default this is equal to the index access of the slide
    * itself, making the z-order the default navigation order for top level shapes.
    */
  var NavigationOrder: XIndexAccess = js.native
  
  /** This is the number of this page, starting with 1. */
  var Number: Double = js.native
  
  /** This is the orientation of this page. */
  var Orientation: PaperOrientation = js.native
  
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var UserDefinedAttributes: XNameContainer = js.native
  
  /** This is the width. */
  var Width: Double = js.native
}
object GenericDrawPage {
  
  @scala.inline
  def apply(
    BorderBottom: Double,
    BorderLeft: Double,
    BorderRight: Double,
    BorderTop: Double,
    Count: Double,
    ElementType: `type`,
    Height: Double,
    IsBackgroundDark: Boolean,
    Name: String,
    NavigationOrder: XIndexAccess,
    Number: Double,
    Orientation: PaperOrientation,
    PropertySetInfo: XPropertySetInfo,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    acquire: () => Unit,
    add: XShape => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    bind: XShapes => XShape,
    combine: XShapes => XShape,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    group: XShapes => XShapeGroup,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XShape => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    split: XShape => Unit,
    unbind: XShape => Unit,
    ungroup: XShapeGroup => Unit
  ): GenericDrawPage = {
    val __obj = js.Dynamic.literal(BorderBottom = BorderBottom.asInstanceOf[js.Any], BorderLeft = BorderLeft.asInstanceOf[js.Any], BorderRight = BorderRight.asInstanceOf[js.Any], BorderTop = BorderTop.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsBackgroundDark = IsBackgroundDark.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), bind = js.Any.fromFunction1(bind), combine = js.Any.fromFunction1(combine), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), group = js.Any.fromFunction1(group), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), split = js.Any.fromFunction1(split), unbind = js.Any.fromFunction1(unbind), ungroup = js.Any.fromFunction1(ungroup))
    __obj.asInstanceOf[GenericDrawPage]
  }
  
  @scala.inline
  implicit class GenericDrawPageMutableBuilder[Self <: GenericDrawPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBottom(value: Double): Self = StObject.set(x, "BorderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeft(value: Double): Self = StObject.set(x, "BorderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRight(value: Double): Self = StObject.set(x, "BorderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTop(value: Double): Self = StObject.set(x, "BorderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBackgroundDark(value: Boolean): Self = StObject.set(x, "IsBackgroundDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOrder(value: XIndexAccess): Self = StObject.set(x, "NavigationOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: PaperOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "UserDefinedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
