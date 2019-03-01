package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies accessibility support for a button.
  * @since OOo 1.1.2
  */
trait AccessibleButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleExtendedComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleText
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleAction
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleValue

object AccessibleButton {
  @scala.inline
  def apply(
    AccessibleActionCount: scala.Double,
    AccessibleChildCount: scala.Double,
    AccessibleDescription: java.lang.String,
    AccessibleIndexInParent: scala.Double,
    AccessibleName: java.lang.String,
    AccessibleParent: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    AccessibleRelationSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet,
    AccessibleRole: scala.Double,
    AccessibleStateSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet,
    Background: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Bounds: Rectangle,
    CaretPosition: scala.Double,
    CharacterCount: scala.Double,
    CurrentValue: js.Any,
    Font: XFont,
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: Point,
    LocationOnScreen: Point,
    MaximumValue: js.Any,
    MinimumValue: js.Any,
    SelectedText: java.lang.String,
    SelectionEnd: scala.Double,
    SelectionStart: scala.Double,
    Size: Size,
    Text: java.lang.String,
    TitledBorderText: java.lang.String,
    ToolTipText: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addAccessibleEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener, 
      scala.Unit
    ],
    containsPoint: js.Function1[Point, scala.Boolean],
    copyText: js.Function2[scala.Double, scala.Double, scala.Boolean],
    doAccessibleAction: js.Function1[scala.Double, scala.Boolean],
    getAccessibleActionCount: js.Function0[scala.Double],
    getAccessibleActionDescription: js.Function1[scala.Double, java.lang.String],
    getAccessibleActionKeyBinding: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleKeyBinding
    ],
    getAccessibleAtPoint: js.Function1[Point, activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible],
    getAccessibleChild: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
    getAccessibleChildCount: js.Function0[scala.Double],
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
    getBounds: js.Function0[Rectangle],
    getCaretPosition: js.Function0[scala.Double],
    getCharacter: js.Function1[scala.Double, java.lang.String],
    getCharacterAttributes: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getCharacterBounds: js.Function1[scala.Double, Rectangle],
    getCharacterCount: js.Function0[scala.Double],
    getCurrentValue: js.Function0[js.Any],
    getFont: js.Function0[XFont],
    getForeground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getIndexAtPoint: js.Function1[Point, scala.Double],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getLocation: js.Function0[Point],
    getLocationOnScreen: js.Function0[Point],
    getMaximumValue: js.Function0[js.Any],
    getMinimumValue: js.Function0[js.Any],
    getSelectedText: js.Function0[java.lang.String],
    getSelectionEnd: js.Function0[scala.Double],
    getSelectionStart: js.Function0[scala.Double],
    getSize: js.Function0[Size],
    getText: js.Function0[java.lang.String],
    getTextAtIndex: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.TextSegment
    ],
    getTextBeforeIndex: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.TextSegment
    ],
    getTextBehindIndex: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.TextSegment
    ],
    getTextRange: js.Function2[scala.Double, scala.Double, java.lang.String],
    getTitledBorderText: js.Function0[java.lang.String],
    getToolTipText: js.Function0[java.lang.String],
    grabFocus: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAccessibleEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener, 
      scala.Unit
    ],
    setCaretPosition: js.Function1[scala.Double, scala.Boolean],
    setCurrentValue: js.Function1[js.Any, scala.Boolean],
    setSelection: js.Function2[scala.Double, scala.Double, scala.Boolean]
  ): AccessibleButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleActionCount")(AccessibleActionCount)
    __obj.updateDynamic("AccessibleChildCount")(AccessibleChildCount)
    __obj.updateDynamic("AccessibleDescription")(AccessibleDescription)
    __obj.updateDynamic("AccessibleIndexInParent")(AccessibleIndexInParent)
    __obj.updateDynamic("AccessibleName")(AccessibleName)
    __obj.updateDynamic("AccessibleParent")(AccessibleParent)
    __obj.updateDynamic("AccessibleRelationSet")(AccessibleRelationSet)
    __obj.updateDynamic("AccessibleRole")(AccessibleRole)
    __obj.updateDynamic("AccessibleStateSet")(AccessibleStateSet)
    __obj.updateDynamic("Background")(Background)
    __obj.updateDynamic("Bounds")(Bounds)
    __obj.updateDynamic("CaretPosition")(CaretPosition)
    __obj.updateDynamic("CharacterCount")(CharacterCount)
    __obj.updateDynamic("CurrentValue")(CurrentValue)
    __obj.updateDynamic("Font")(Font)
    __obj.updateDynamic("Foreground")(Foreground)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Location")(Location)
    __obj.updateDynamic("LocationOnScreen")(LocationOnScreen)
    __obj.updateDynamic("MaximumValue")(MaximumValue)
    __obj.updateDynamic("MinimumValue")(MinimumValue)
    __obj.updateDynamic("SelectedText")(SelectedText)
    __obj.updateDynamic("SelectionEnd")(SelectionEnd)
    __obj.updateDynamic("SelectionStart")(SelectionStart)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("Text")(Text)
    __obj.updateDynamic("TitledBorderText")(TitledBorderText)
    __obj.updateDynamic("ToolTipText")(ToolTipText)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addAccessibleEventListener")(addAccessibleEventListener)
    __obj.updateDynamic("containsPoint")(containsPoint)
    __obj.updateDynamic("copyText")(copyText)
    __obj.updateDynamic("doAccessibleAction")(doAccessibleAction)
    __obj.updateDynamic("getAccessibleActionCount")(getAccessibleActionCount)
    __obj.updateDynamic("getAccessibleActionDescription")(getAccessibleActionDescription)
    __obj.updateDynamic("getAccessibleActionKeyBinding")(getAccessibleActionKeyBinding)
    __obj.updateDynamic("getAccessibleAtPoint")(getAccessibleAtPoint)
    __obj.updateDynamic("getAccessibleChild")(getAccessibleChild)
    __obj.updateDynamic("getAccessibleChildCount")(getAccessibleChildCount)
    __obj.updateDynamic("getAccessibleDescription")(getAccessibleDescription)
    __obj.updateDynamic("getAccessibleIndexInParent")(getAccessibleIndexInParent)
    __obj.updateDynamic("getAccessibleName")(getAccessibleName)
    __obj.updateDynamic("getAccessibleParent")(getAccessibleParent)
    __obj.updateDynamic("getAccessibleRelationSet")(getAccessibleRelationSet)
    __obj.updateDynamic("getAccessibleRole")(getAccessibleRole)
    __obj.updateDynamic("getAccessibleStateSet")(getAccessibleStateSet)
    __obj.updateDynamic("getBackground")(getBackground)
    __obj.updateDynamic("getBounds")(getBounds)
    __obj.updateDynamic("getCaretPosition")(getCaretPosition)
    __obj.updateDynamic("getCharacter")(getCharacter)
    __obj.updateDynamic("getCharacterAttributes")(getCharacterAttributes)
    __obj.updateDynamic("getCharacterBounds")(getCharacterBounds)
    __obj.updateDynamic("getCharacterCount")(getCharacterCount)
    __obj.updateDynamic("getCurrentValue")(getCurrentValue)
    __obj.updateDynamic("getFont")(getFont)
    __obj.updateDynamic("getForeground")(getForeground)
    __obj.updateDynamic("getIndexAtPoint")(getIndexAtPoint)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getLocation")(getLocation)
    __obj.updateDynamic("getLocationOnScreen")(getLocationOnScreen)
    __obj.updateDynamic("getMaximumValue")(getMaximumValue)
    __obj.updateDynamic("getMinimumValue")(getMinimumValue)
    __obj.updateDynamic("getSelectedText")(getSelectedText)
    __obj.updateDynamic("getSelectionEnd")(getSelectionEnd)
    __obj.updateDynamic("getSelectionStart")(getSelectionStart)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getTextAtIndex")(getTextAtIndex)
    __obj.updateDynamic("getTextBeforeIndex")(getTextBeforeIndex)
    __obj.updateDynamic("getTextBehindIndex")(getTextBehindIndex)
    __obj.updateDynamic("getTextRange")(getTextRange)
    __obj.updateDynamic("getTitledBorderText")(getTitledBorderText)
    __obj.updateDynamic("getToolTipText")(getToolTipText)
    __obj.updateDynamic("grabFocus")(grabFocus)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeAccessibleEventListener")(removeAccessibleEventListener)
    __obj.updateDynamic("setCaretPosition")(setCaretPosition)
    __obj.updateDynamic("setCurrentValue")(setCurrentValue)
    __obj.updateDynamic("setSelection")(setSelection)
    __obj.asInstanceOf[AccessibleButton]
  }
}

