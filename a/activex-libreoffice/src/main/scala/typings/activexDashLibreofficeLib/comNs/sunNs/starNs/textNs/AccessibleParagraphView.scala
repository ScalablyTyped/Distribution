package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The accessible view of a paragraph fragment.
  * @since OOo 1.1.2
  */
trait AccessibleParagraphView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEditableText
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleSelection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTextAttributes

object AccessibleParagraphView {
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
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    LocationOnScreen: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    SelectedAccessibleChildCount: scala.Double,
    SelectedText: java.lang.String,
    SelectionEnd: scala.Double,
    SelectionStart: scala.Double,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Text: java.lang.String,
    acquire: () => scala.Unit,
    addAccessibleEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener => scala.Unit,
    clearAccessibleSelection: () => scala.Unit,
    containsPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Boolean,
    copyText: (scala.Double, scala.Double) => scala.Boolean,
    cutText: (scala.Double, scala.Double) => scala.Boolean,
    deleteText: (scala.Double, scala.Double) => scala.Boolean,
    deselectAccessibleChild: scala.Double => scala.Unit,
    getAccessibleAtPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleChild: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleChildCount: () => scala.Double,
    getAccessibleDescription: () => java.lang.String,
    getAccessibleIndexInParent: () => scala.Double,
    getAccessibleName: () => java.lang.String,
    getAccessibleParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleRelationSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet,
    getAccessibleRole: () => scala.Double,
    getAccessibleStateSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet,
    getBackground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getBounds: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getCaretPosition: () => scala.Double,
    getCharacter: scala.Double => java.lang.String,
    getCharacterAttributes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getCharacterBounds: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getCharacterCount: () => scala.Double,
    getDefaultAttributes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getForeground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getIndexAtPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Double,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getLocation: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getLocationOnScreen: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getRunAttributes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getSelectedAccessibleChild: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getSelectedAccessibleChildCount: () => scala.Double,
    getSelectedText: () => java.lang.String,
    getSelectionEnd: () => scala.Double,
    getSelectionStart: () => scala.Double,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getText: () => java.lang.String,
    getTextAtIndex: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.TextSegment,
    getTextBeforeIndex: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.TextSegment,
    getTextBehindIndex: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.TextSegment,
    getTextRange: (scala.Double, scala.Double) => java.lang.String,
    grabFocus: () => scala.Unit,
    insertText: (java.lang.String, scala.Double) => scala.Boolean,
    isAccessibleChildSelected: scala.Double => scala.Boolean,
    pasteText: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeAccessibleEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener => scala.Unit,
    replaceText: (scala.Double, scala.Double, java.lang.String) => scala.Boolean,
    selectAccessibleChild: scala.Double => scala.Unit,
    selectAllAccessibleChildren: () => scala.Unit,
    setAttributes: (scala.Double, scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Boolean,
    setCaretPosition: scala.Double => scala.Boolean,
    setSelection: (scala.Double, scala.Double) => scala.Boolean,
    setText: java.lang.String => scala.Boolean
  ): AccessibleParagraphView = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, CaretPosition = CaretPosition, CharacterCount = CharacterCount, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, SelectedAccessibleChildCount = SelectedAccessibleChildCount, SelectedText = SelectedText, SelectionEnd = SelectionEnd, SelectionStart = SelectionStart, Size = Size, Text = Text, acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), clearAccessibleSelection = js.Any.fromFunction0(clearAccessibleSelection), containsPoint = js.Any.fromFunction1(containsPoint), copyText = js.Any.fromFunction2(copyText), cutText = js.Any.fromFunction2(cutText), deleteText = js.Any.fromFunction2(deleteText), deselectAccessibleChild = js.Any.fromFunction1(deselectAccessibleChild), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getDefaultAttributes = js.Any.fromFunction1(getDefaultAttributes), getForeground = js.Any.fromFunction0(getForeground), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getRunAttributes = js.Any.fromFunction2(getRunAttributes), getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = js.Any.fromFunction0(getSelectedAccessibleChildCount), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getSize = js.Any.fromFunction0(getSize), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), grabFocus = js.Any.fromFunction0(grabFocus), insertText = js.Any.fromFunction2(insertText), isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), pasteText = js.Any.fromFunction1(pasteText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), replaceText = js.Any.fromFunction3(replaceText), selectAccessibleChild = js.Any.fromFunction1(selectAccessibleChild), selectAllAccessibleChildren = js.Any.fromFunction0(selectAllAccessibleChildren), setAttributes = js.Any.fromFunction3(setAttributes), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[AccessibleParagraphView]
  }
}

