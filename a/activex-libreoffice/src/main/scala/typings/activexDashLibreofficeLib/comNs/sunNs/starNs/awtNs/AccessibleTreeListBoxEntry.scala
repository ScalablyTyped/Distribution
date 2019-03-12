package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies accessibility support for a treelistbox entry.
  * @see com.sun.star.accessibility.AccessibleContext
  * @see com.sun.star.accessibility.XAccessibleAction
  * @see com.sun.star.accessibility.XAccessibleSelection
  * @see com.sun.star.accessibility.XAccessibleText
  * @since OOo 1.1.2
  */
trait AccessibleTreeListBoxEntry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.AccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleAction
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleSelection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleText

object AccessibleTreeListBoxEntry {
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
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: Point,
    LocationOnScreen: Point,
    SelectedAccessibleChildCount: scala.Double,
    SelectedText: java.lang.String,
    SelectionEnd: scala.Double,
    SelectionStart: scala.Double,
    Size: Size,
    Text: java.lang.String,
    acquire: () => scala.Unit,
    addAccessibleEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener => scala.Unit,
    clearAccessibleSelection: () => scala.Unit,
    containsPoint: Point => scala.Boolean,
    copyText: (scala.Double, scala.Double) => scala.Boolean,
    deselectAccessibleChild: scala.Double => scala.Unit,
    doAccessibleAction: scala.Double => scala.Boolean,
    getAccessibleActionCount: () => scala.Double,
    getAccessibleActionDescription: scala.Double => java.lang.String,
    getAccessibleActionKeyBinding: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleKeyBinding,
    getAccessibleAtPoint: Point => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
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
    getBounds: () => Rectangle,
    getCaretPosition: () => scala.Double,
    getCharacter: scala.Double => java.lang.String,
    getCharacterAttributes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getCharacterBounds: scala.Double => Rectangle,
    getCharacterCount: () => scala.Double,
    getForeground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getIndexAtPoint: Point => scala.Double,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getSelectedAccessibleChild: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getSelectedAccessibleChildCount: () => scala.Double,
    getSelectedText: () => java.lang.String,
    getSelectionEnd: () => scala.Double,
    getSelectionStart: () => scala.Double,
    getSize: () => Size,
    getText: () => java.lang.String,
    getTextAtIndex: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.TextSegment,
    getTextBeforeIndex: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.TextSegment,
    getTextBehindIndex: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.TextSegment,
    getTextRange: (scala.Double, scala.Double) => java.lang.String,
    grabFocus: () => scala.Unit,
    isAccessibleChildSelected: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeAccessibleEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener => scala.Unit,
    selectAccessibleChild: scala.Double => scala.Unit,
    selectAllAccessibleChildren: () => scala.Unit,
    setCaretPosition: scala.Double => scala.Boolean,
    setSelection: (scala.Double, scala.Double) => scala.Boolean
  ): AccessibleTreeListBoxEntry = {
    val __obj = js.Dynamic.literal(AccessibleActionCount = AccessibleActionCount, AccessibleChildCount = AccessibleChildCount, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, CaretPosition = CaretPosition, CharacterCount = CharacterCount, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, SelectedAccessibleChildCount = SelectedAccessibleChildCount, SelectedText = SelectedText, SelectionEnd = SelectionEnd, SelectionStart = SelectionStart, Size = Size, Text = Text, acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), clearAccessibleSelection = js.Any.fromFunction0(clearAccessibleSelection), containsPoint = js.Any.fromFunction1(containsPoint), copyText = js.Any.fromFunction2(copyText), deselectAccessibleChild = js.Any.fromFunction1(deselectAccessibleChild), doAccessibleAction = js.Any.fromFunction1(doAccessibleAction), getAccessibleActionCount = js.Any.fromFunction0(getAccessibleActionCount), getAccessibleActionDescription = js.Any.fromFunction1(getAccessibleActionDescription), getAccessibleActionKeyBinding = js.Any.fromFunction1(getAccessibleActionKeyBinding), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getForeground = js.Any.fromFunction0(getForeground), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = js.Any.fromFunction0(getSelectedAccessibleChildCount), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getSize = js.Any.fromFunction0(getSize), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), grabFocus = js.Any.fromFunction0(grabFocus), isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), selectAccessibleChild = js.Any.fromFunction1(selectAccessibleChild), selectAllAccessibleChildren = js.Any.fromFunction0(selectAllAccessibleChildren), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection))
  
    __obj.asInstanceOf[AccessibleTreeListBoxEntry]
  }
}

