package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleExtendedComponent
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XFont
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link AccessibleShape} service is implemented by UNO shapes to provide accessibility information that describe the shape's features. A UNO shape
  * is any object that implements the {@link com.sun.star.drawing.XShape} interface.
  *
  * The content of a draw page is modelled as tree of accessible shapes and accessible text paragraphs. The root of this (sub-)tree is the accessible draw
  * document view. An accessible shape implements either this service or one of the "derived" services {@link AccessibleGraphicShape} or {@link
  * AccessibleOLEShape} . See the section Children in the description of the {@link com.sun.star.accessibility.XAccessibleContext} interface support for
  * more details.
  *
  * There are two services that extend this one: the {@link AccessibleGraphicShape} and the {@link AccessibleOLEShape} services provide additional
  * interfaces. See there for details.
  *
  * A shape object is either fully or partially visible on the screen or has set the {@link com.sun.star.accessibility.AccessibleStateType.DEFUNC} state
  * to indicate that it is no longer actively supported by its parent.
  *
  * Each shape object that has not set the DEFUNC state has a valid parent. That is either the containing draw page or a group shape or a 3D scene object.
  * @since OOo 1.1.2
  */
trait AccessibleShape
  extends StObject
     with XAccessible
     with XAccessibleContext
     with XAccessibleExtendedComponent
object AccessibleShape {
  
  @scala.inline
  def apply(
    AccessibleChildCount: Double,
    AccessibleContext: XAccessibleContext,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Background: Color,
    Bounds: Rectangle,
    Font: XFont,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    Size: Size,
    TitledBorderText: String,
    ToolTipText: String,
    acquire: () => Unit,
    containsPoint: Point => Boolean,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: () => Double,
    getAccessibleContext: () => XAccessibleContext,
    getAccessibleDescription: () => String,
    getAccessibleIndexInParent: () => Double,
    getAccessibleName: () => String,
    getAccessibleParent: () => XAccessible,
    getAccessibleRelationSet: () => XAccessibleRelationSet,
    getAccessibleRole: () => Double,
    getAccessibleStateSet: () => XAccessibleStateSet,
    getBackground: () => Color,
    getBounds: () => Rectangle,
    getFont: () => XFont,
    getForeground: () => Color,
    getLocale: () => Locale,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getSize: () => Size,
    getTitledBorderText: () => String,
    getToolTipText: () => String,
    grabFocus: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): AccessibleShape = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleContext = AccessibleContext.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TitledBorderText = TitledBorderText.asInstanceOf[js.Any], ToolTipText = ToolTipText.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), containsPoint = js.Any.fromFunction1(containsPoint), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getFont = js.Any.fromFunction0(getFont), getForeground = js.Any.fromFunction0(getForeground), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSize = js.Any.fromFunction0(getSize), getTitledBorderText = js.Any.fromFunction0(getTitledBorderText), getToolTipText = js.Any.fromFunction0(getToolTipText), grabFocus = js.Any.fromFunction0(grabFocus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[AccessibleShape]
  }
}
