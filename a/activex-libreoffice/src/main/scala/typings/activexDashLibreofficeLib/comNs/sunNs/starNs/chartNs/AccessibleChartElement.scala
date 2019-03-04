package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is supported by all components that are contained in the view of a chart document that are controlled by the chart. Shapes added by a
  * user via the clipboard are not treated as chart elements.
  *
  * The list of objects that implement this service is {@link com.sun.star.chart.ChartTitle} , {@link com.sun.star.chart.ChartLegend} , {@link
  * com.sun.star.chart.Diagram} , {@link com.sun.star.chart.ChartAxis} , {@link com.sun.star.chart.ChartDataRowProperties} , {@link
  * com.sun.star.chart.ChartDataPointProperties} .
  *
  * The {@link com.sun.star.accessibility.XAccessibleExtendedComponent} is supported by all chart elements.
  * @since OOo 1.1.2
  */
trait AccessibleChartElement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleExtendedComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext

object AccessibleChartElement {
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
  ): AccessibleChartElement = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleContext = AccessibleContext, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, Font = Font, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, Size = Size, TitledBorderText = TitledBorderText, ToolTipText = ToolTipText, acquire = acquire, containsPoint = containsPoint, getAccessibleAtPoint = getAccessibleAtPoint, getAccessibleChild = getAccessibleChild, getAccessibleChildCount = getAccessibleChildCount, getAccessibleContext = getAccessibleContext, getAccessibleDescription = getAccessibleDescription, getAccessibleIndexInParent = getAccessibleIndexInParent, getAccessibleName = getAccessibleName, getAccessibleParent = getAccessibleParent, getAccessibleRelationSet = getAccessibleRelationSet, getAccessibleRole = getAccessibleRole, getAccessibleStateSet = getAccessibleStateSet, getBackground = getBackground, getBounds = getBounds, getFont = getFont, getForeground = getForeground, getLocale = getLocale, getLocation = getLocation, getLocationOnScreen = getLocationOnScreen, getSize = getSize, getTitledBorderText = getTitledBorderText, getToolTipText = getToolTipText, grabFocus = grabFocus, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[AccessibleChartElement]
  }
}

