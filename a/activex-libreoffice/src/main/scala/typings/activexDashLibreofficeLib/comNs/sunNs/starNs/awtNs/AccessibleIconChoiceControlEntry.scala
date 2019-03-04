package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies accessibility support for an icon choice control entry.
  * @see com.sun.star.accessibility.AccessibleContext
  * @see com.sun.star.accessibility.XAccessibleComponent
  * @see com.sun.star.accessibility.XAccessibleText
  * @since OOo 1.1.2
  */
trait AccessibleIconChoiceControlEntry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.AccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleText

object AccessibleIconChoiceControlEntry {
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
    Bounds: Rectangle,
    CaretPosition: scala.Double,
    CharacterCount: scala.Double,
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: Point,
    LocationOnScreen: Point,
    SelectedText: java.lang.String,
    SelectionEnd: scala.Double,
    SelectionStart: scala.Double,
    Size: Size,
    Text: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addAccessibleEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener, 
      scala.Unit
    ],
    containsPoint: js.Function1[Point, scala.Boolean],
    copyText: js.Function2[scala.Double, scala.Double, scala.Boolean],
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
    getForeground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getIndexAtPoint: js.Function1[Point, scala.Double],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getLocation: js.Function0[Point],
    getLocationOnScreen: js.Function0[Point],
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
    grabFocus: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAccessibleEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener, 
      scala.Unit
    ],
    setCaretPosition: js.Function1[scala.Double, scala.Boolean],
    setSelection: js.Function2[scala.Double, scala.Double, scala.Boolean]
  ): AccessibleIconChoiceControlEntry = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, CaretPosition = CaretPosition, CharacterCount = CharacterCount, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, SelectedText = SelectedText, SelectionEnd = SelectionEnd, SelectionStart = SelectionStart, Size = Size, Text = Text, acquire = acquire, addAccessibleEventListener = addAccessibleEventListener, containsPoint = containsPoint, copyText = copyText, getAccessibleAtPoint = getAccessibleAtPoint, getAccessibleChild = getAccessibleChild, getAccessibleChildCount = getAccessibleChildCount, getAccessibleDescription = getAccessibleDescription, getAccessibleIndexInParent = getAccessibleIndexInParent, getAccessibleName = getAccessibleName, getAccessibleParent = getAccessibleParent, getAccessibleRelationSet = getAccessibleRelationSet, getAccessibleRole = getAccessibleRole, getAccessibleStateSet = getAccessibleStateSet, getBackground = getBackground, getBounds = getBounds, getCaretPosition = getCaretPosition, getCharacter = getCharacter, getCharacterAttributes = getCharacterAttributes, getCharacterBounds = getCharacterBounds, getCharacterCount = getCharacterCount, getForeground = getForeground, getIndexAtPoint = getIndexAtPoint, getLocale = getLocale, getLocation = getLocation, getLocationOnScreen = getLocationOnScreen, getSelectedText = getSelectedText, getSelectionEnd = getSelectionEnd, getSelectionStart = getSelectionStart, getSize = getSize, getText = getText, getTextAtIndex = getTextAtIndex, getTextBeforeIndex = getTextBeforeIndex, getTextBehindIndex = getTextBehindIndex, getTextRange = getTextRange, grabFocus = grabFocus, queryInterface = queryInterface, release = release, removeAccessibleEventListener = removeAccessibleEventListener, setCaretPosition = setCaretPosition, setSelection = setSelection)
  
    __obj.asInstanceOf[AccessibleIconChoiceControlEntry]
  }
}

