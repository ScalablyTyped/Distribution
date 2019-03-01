package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The accessible view of a spreadsheet document
  * @since OOo 1.1.2
  */
trait AccessibleCell
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleValue
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleText

object AccessibleCell {
  @scala.inline
  def apply(
    AccessibleChildCount: scala.Double,
    AccessibleDescription: java.lang.String,
    AccessibleIndexInParent: scala.Double,
    AccessibleName: java.lang.String,
    AccessibleParent: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    AccessibleRelationSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet,
    AccessibleRole: scala.Double,
    AccessibleStateSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet,
    Background: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Bounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    CaretPosition: scala.Double,
    CharacterCount: scala.Double,
    CurrentValue: js.Any,
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    LocationOnScreen: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    MaximumValue: js.Any,
    MinimumValue: js.Any,
    SelectedText: java.lang.String,
    SelectionEnd: scala.Double,
    SelectionStart: scala.Double,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Text: java.lang.String,
    acquire: js.Function0[scala.Unit],
    containsPoint: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Boolean],
    copyText: js.Function2[scala.Double, scala.Double, scala.Boolean],
    getAccessibleAtPoint: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
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
    getBounds: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getCaretPosition: js.Function0[scala.Double],
    getCharacter: js.Function1[scala.Double, java.lang.String],
    getCharacterAttributes: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getCharacterBounds: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getCharacterCount: js.Function0[scala.Double],
    getCurrentValue: js.Function0[js.Any],
    getForeground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getIndexAtPoint: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Double],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getLocation: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getLocationOnScreen: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getMaximumValue: js.Function0[js.Any],
    getMinimumValue: js.Function0[js.Any],
    getSelectedText: js.Function0[java.lang.String],
    getSelectionEnd: js.Function0[scala.Double],
    getSelectionStart: js.Function0[scala.Double],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
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
    grabFocus: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCaretPosition: js.Function1[scala.Double, scala.Boolean],
    setCurrentValue: js.Function1[js.Any, scala.Boolean],
    setSelection: js.Function2[scala.Double, scala.Double, scala.Boolean]
  ): AccessibleCell = {
    val __obj = js.Dynamic.literal()
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
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("containsPoint")(containsPoint)
    __obj.updateDynamic("copyText")(copyText)
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
    __obj.updateDynamic("grabFocus")(grabFocus)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setCaretPosition")(setCaretPosition)
    __obj.updateDynamic("setCurrentValue")(setCurrentValue)
    __obj.updateDynamic("setSelection")(setSelection)
    __obj.asInstanceOf[AccessibleCell]
  }
}

