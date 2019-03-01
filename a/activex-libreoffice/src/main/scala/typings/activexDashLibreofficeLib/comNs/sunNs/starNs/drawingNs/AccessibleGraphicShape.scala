package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link AccessibleGraphicShape} service is implemented by the graphic object shapes shapes {@link com.sun.star.drawing.GraphicObjectShape} and
  * {@link com.sun.star.presentation.GraphicObjectShape} .
  *
  * It differs from the included {@link AccessibleShape} "base" service by the additional support of the {@link
  * com.sun.star.accessibility.XAccessibleImage} interface.
  * @since OOo 1.1.2
  */
trait AccessibleGraphicShape
  extends AccessibleShape
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleImage

object AccessibleGraphicShape {
  @scala.inline
  def apply(
    AccessibleChildCount: scala.Double,
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    AccessibleDescription: java.lang.String,
    AccessibleImageDescription: java.lang.String,
    AccessibleImageHeight: scala.Double,
    AccessibleImageWidth: scala.Double,
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
    getAccessibleImageDescription: js.Function0[java.lang.String],
    getAccessibleImageHeight: js.Function0[scala.Double],
    getAccessibleImageWidth: js.Function0[scala.Double],
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
  ): AccessibleGraphicShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleChildCount")(AccessibleChildCount)
    __obj.updateDynamic("AccessibleContext")(AccessibleContext)
    __obj.updateDynamic("AccessibleDescription")(AccessibleDescription)
    __obj.updateDynamic("AccessibleImageDescription")(AccessibleImageDescription)
    __obj.updateDynamic("AccessibleImageHeight")(AccessibleImageHeight)
    __obj.updateDynamic("AccessibleImageWidth")(AccessibleImageWidth)
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
    __obj.updateDynamic("getAccessibleImageDescription")(getAccessibleImageDescription)
    __obj.updateDynamic("getAccessibleImageHeight")(getAccessibleImageHeight)
    __obj.updateDynamic("getAccessibleImageWidth")(getAccessibleImageWidth)
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
    __obj.asInstanceOf[AccessibleGraphicShape]
  }
}

