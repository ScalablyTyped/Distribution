package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XAccessibleExtendedComponent} interface contains additional methods to those of the {@link XAccessibleComponent} interface. These methods
  * provide information that is used not as often. The division into two interfaces allows classes to support the more frequently used methods of the
  * {@link XAccessibleComponent} interface and only support the {@link XAccessibleExtendedComponent} interface if that makes sense for the class.
  *
  * This interface provides extended access to retrieve information concerning the graphical representation of an object. This interface combines methods
  * from the Java interfaces `javax.accessibility.AccessibleComponent` and `javax.accessibility.AccessibleExtendedComponent` .
  * @since OOo 1.1.2
  */
trait XAccessibleExtendedComponent extends XAccessibleComponent {
  /**
    * Returns the font of this object.
    * @returns The returned reference to a font object is empty if a font is not supported by this object.
    */
  val Font: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFont
  /**
    * Returns the titled border text.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns The returned value is the titled border text of the object or empty if that is not supported.
    */
  val TitledBorderText: java.lang.String
  /**
    * Returns the tool tip text of this object.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns Returns the localized tool tip text of the object. If tool tips are not supported and empty string is returned.
    */
  val ToolTipText: java.lang.String
  /**
    * Returns the font of this object.
    * @returns The returned reference to a font object is empty if a font is not supported by this object.
    */
  def getFont(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFont
  /**
    * Returns the titled border text.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns The returned value is the titled border text of the object or empty if that is not supported.
    */
  def getTitledBorderText(): java.lang.String
  /**
    * Returns the tool tip text of this object.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns Returns the localized tool tip text of the object. If tool tips are not supported and empty string is returned.
    */
  def getToolTipText(): java.lang.String
}

object XAccessibleExtendedComponent {
  @scala.inline
  def apply(
    Background: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Bounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Font: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFont,
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Location: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    LocationOnScreen: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    TitledBorderText: java.lang.String,
    ToolTipText: java.lang.String,
    acquire: () => scala.Unit,
    containsPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Boolean,
    getAccessibleAtPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => XAccessible,
    getBackground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getBounds: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getFont: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFont,
    getForeground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getLocation: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getLocationOnScreen: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getTitledBorderText: () => java.lang.String,
    getToolTipText: () => java.lang.String,
    grabFocus: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAccessibleExtendedComponent = {
    val __obj = js.Dynamic.literal(Background = Background, Bounds = Bounds, Font = Font, Foreground = Foreground, Location = Location, LocationOnScreen = LocationOnScreen, Size = Size, TitledBorderText = TitledBorderText, ToolTipText = ToolTipText, acquire = js.Any.fromFunction0(acquire), containsPoint = js.Any.fromFunction1(containsPoint), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getFont = js.Any.fromFunction0(getFont), getForeground = js.Any.fromFunction0(getForeground), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSize = js.Any.fromFunction0(getSize), getTitledBorderText = js.Any.fromFunction0(getTitledBorderText), getToolTipText = js.Any.fromFunction0(getToolTipText), grabFocus = js.Any.fromFunction0(grabFocus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessibleExtendedComponent]
  }
}

