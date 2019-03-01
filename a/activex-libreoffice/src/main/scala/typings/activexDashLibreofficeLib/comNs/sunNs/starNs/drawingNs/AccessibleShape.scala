package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleExtendedComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext

object AccessibleShape {
  @scala.inline
  def apply(
    AccessibleChildCount: scala.Double,
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    AccessibleDescription: java.lang.String,
    AccessibleIndexInParent: scala.Double,
    AccessibleName: java.lang.String,
    AccessibleParent: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    AccessibleRelationSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet,
    AccessibleRole: scala.Double,
    AccessibleStateSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet,
    Background: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Bounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Font: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFont,
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    LocationOnScreen: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    TitledBorderText: java.lang.String,
    ToolTipText: java.lang.String,
    acquire: js.Function0[scala.Unit],
    containsPoint: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Boolean],
    getAccessibleAtPoint: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
    getAccessibleChild: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
    getAccessibleChildCount: js.Function0[scala.Double],
    getAccessibleContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext],
    getAccessibleDescription: js.Function0[java.lang.String],
    getAccessibleIndexInParent: js.Function0[scala.Double],
    getAccessibleName: js.Function0[java.lang.String],
    getAccessibleParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible],
    getAccessibleRelationSet: js.Function0[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet
    ],
    getAccessibleRole: js.Function0[scala.Double],
    getAccessibleStateSet: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet],
    getBackground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getBounds: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getFont: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFont],
    getForeground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getLocation: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getLocationOnScreen: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getTitledBorderText: js.Function0[java.lang.String],
    getToolTipText: js.Function0[java.lang.String],
    grabFocus: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): AccessibleShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleChildCount")(AccessibleChildCount)
    __obj.updateDynamic("AccessibleContext")(AccessibleContext)
    __obj.updateDynamic("AccessibleDescription")(AccessibleDescription)
    __obj.updateDynamic("AccessibleIndexInParent")(AccessibleIndexInParent)
    __obj.updateDynamic("AccessibleName")(AccessibleName)
    __obj.updateDynamic("AccessibleParent")(AccessibleParent)
    __obj.updateDynamic("AccessibleRelationSet")(AccessibleRelationSet)
    __obj.updateDynamic("AccessibleRole")(AccessibleRole)
    __obj.updateDynamic("AccessibleStateSet")(AccessibleStateSet)
    __obj.updateDynamic("Background")(Background)
    __obj.updateDynamic("Bounds")(Bounds)
    __obj.updateDynamic("Font")(Font)
    __obj.updateDynamic("Foreground")(Foreground)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Location")(Location)
    __obj.updateDynamic("LocationOnScreen")(LocationOnScreen)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("TitledBorderText")(TitledBorderText)
    __obj.updateDynamic("ToolTipText")(ToolTipText)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("containsPoint")(containsPoint)
    __obj.updateDynamic("getAccessibleAtPoint")(getAccessibleAtPoint)
    __obj.updateDynamic("getAccessibleChild")(getAccessibleChild)
    __obj.updateDynamic("getAccessibleChildCount")(getAccessibleChildCount)
    __obj.updateDynamic("getAccessibleContext")(getAccessibleContext)
    __obj.updateDynamic("getAccessibleDescription")(getAccessibleDescription)
    __obj.updateDynamic("getAccessibleIndexInParent")(getAccessibleIndexInParent)
    __obj.updateDynamic("getAccessibleName")(getAccessibleName)
    __obj.updateDynamic("getAccessibleParent")(getAccessibleParent)
    __obj.updateDynamic("getAccessibleRelationSet")(getAccessibleRelationSet)
    __obj.updateDynamic("getAccessibleRole")(getAccessibleRole)
    __obj.updateDynamic("getAccessibleStateSet")(getAccessibleStateSet)
    __obj.updateDynamic("getBackground")(getBackground)
    __obj.updateDynamic("getBounds")(getBounds)
    __obj.updateDynamic("getFont")(getFont)
    __obj.updateDynamic("getForeground")(getForeground)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getLocation")(getLocation)
    __obj.updateDynamic("getLocationOnScreen")(getLocationOnScreen)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getTitledBorderText")(getTitledBorderText)
    __obj.updateDynamic("getToolTipText")(getToolTipText)
    __obj.updateDynamic("grabFocus")(grabFocus)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[AccessibleShape]
  }
}

