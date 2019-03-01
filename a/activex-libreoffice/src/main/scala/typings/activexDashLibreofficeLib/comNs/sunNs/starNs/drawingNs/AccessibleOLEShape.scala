package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link AccessibleOLEShape} service is implemented by OLE shapes.
  *
  * This includes generic OLE shapes, frames, plug-ins, and applets.
  *
  * This service supports the additional {@link com.sun.star.accessibility.XAccessibleAction} interface.
  *
  * OLE objects are handled as place holders. While not activated the accessible OLE shape is the only indicator of the OLE object's existence. When an
  * OLE object has been activated then the accessibility tree representing it (as far as that is available) is included directly under the accessible
  * document view and not under the OLE object. This is due to underlying implementation constraints and may change in the future.
  * @since OOo 1.1.2
  */
trait AccessibleOLEShape
  extends AccessibleShape
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleAction

object AccessibleOLEShape {
  @scala.inline
  def apply(
    AccessibleActionCount: scala.Double,
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
    doAccessibleAction: js.Function1[scala.Double, scala.Boolean],
    getAccessibleActionCount: js.Function0[scala.Double],
    getAccessibleActionDescription: js.Function1[scala.Double, java.lang.String],
    getAccessibleActionKeyBinding: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleKeyBinding
    ],
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
  ): AccessibleOLEShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleActionCount")(AccessibleActionCount)
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
    __obj.updateDynamic("doAccessibleAction")(doAccessibleAction)
    __obj.updateDynamic("getAccessibleActionCount")(getAccessibleActionCount)
    __obj.updateDynamic("getAccessibleActionDescription")(getAccessibleActionDescription)
    __obj.updateDynamic("getAccessibleActionKeyBinding")(getAccessibleActionKeyBinding)
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
    __obj.asInstanceOf[AccessibleOLEShape]
  }
}

