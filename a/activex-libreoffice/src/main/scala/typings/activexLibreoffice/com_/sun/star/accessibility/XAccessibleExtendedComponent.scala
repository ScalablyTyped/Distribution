package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XFont
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XAccessibleExtendedComponent} interface contains additional methods to those of the {@link XAccessibleComponent} interface. These methods
  * provide information that is used not as often. The division into two interfaces allows classes to support the more frequently used methods of the
  * {@link XAccessibleComponent} interface and only support the {@link XAccessibleExtendedComponent} interface if that makes sense for the class.
  *
  * This interface provides extended access to retrieve information concerning the graphical representation of an object. This interface combines methods
  * from the Java interfaces `javax.accessibility.AccessibleComponent` and `javax.accessibility.AccessibleExtendedComponent` .
  * @since OOo 1.1.2
  */
trait XAccessibleExtendedComponent
  extends StObject
     with XAccessibleComponent {
  
  /**
    * Returns the font of this object.
    * @returns The returned reference to a font object is empty if a font is not supported by this object.
    */
  val Font: XFont
  
  /**
    * Returns the titled border text.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns The returned value is the titled border text of the object or empty if that is not supported.
    */
  val TitledBorderText: String
  
  /**
    * Returns the tool tip text of this object.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns Returns the localized tool tip text of the object. If tool tips are not supported and empty string is returned.
    */
  val ToolTipText: String
  
  /**
    * Returns the font of this object.
    * @returns The returned reference to a font object is empty if a font is not supported by this object.
    */
  def getFont(): XFont
  
  /**
    * Returns the titled border text.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns The returned value is the titled border text of the object or empty if that is not supported.
    */
  def getTitledBorderText(): String
  
  /**
    * Returns the tool tip text of this object.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns Returns the localized tool tip text of the object. If tool tips are not supported and empty string is returned.
    */
  def getToolTipText(): String
}
object XAccessibleExtendedComponent {
  
  @scala.inline
  def apply(
    Background: Color,
    Bounds: Rectangle,
    Font: XFont,
    Foreground: Color,
    Location: Point,
    LocationOnScreen: Point,
    Size: Size,
    TitledBorderText: String,
    ToolTipText: String,
    acquire: () => Unit,
    containsPoint: Point => Boolean,
    getAccessibleAtPoint: Point => XAccessible,
    getBackground: () => Color,
    getBounds: () => Rectangle,
    getFont: () => XFont,
    getForeground: () => Color,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getSize: () => Size,
    getTitledBorderText: () => String,
    getToolTipText: () => String,
    grabFocus: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleExtendedComponent = {
    val __obj = js.Dynamic.literal(Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TitledBorderText = TitledBorderText.asInstanceOf[js.Any], ToolTipText = ToolTipText.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), containsPoint = js.Any.fromFunction1(containsPoint), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getFont = js.Any.fromFunction0(getFont), getForeground = js.Any.fromFunction0(getForeground), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSize = js.Any.fromFunction0(getSize), getTitledBorderText = js.Any.fromFunction0(getTitledBorderText), getToolTipText = js.Any.fromFunction0(getToolTipText), grabFocus = js.Any.fromFunction0(grabFocus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleExtendedComponent]
  }
  
  @scala.inline
  implicit class XAccessibleExtendedComponentMutableBuilder[Self <: XAccessibleExtendedComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: XFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFont(value: () => XFont): Self = StObject.set(x, "getFont", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitledBorderText(value: () => String): Self = StObject.set(x, "getTitledBorderText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetToolTipText(value: () => String): Self = StObject.set(x, "getToolTipText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitledBorderText(value: String): Self = StObject.set(x, "TitledBorderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipText(value: String): Self = StObject.set(x, "ToolTipText", value.asInstanceOf[js.Any])
  }
}
