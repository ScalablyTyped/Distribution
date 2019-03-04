package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies accessibility support for an edit.
  * @since OOo 1.1.2
  */
trait AccessibleEdit
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleExtendedComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEditableText

object AccessibleEdit {
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
    Font: XFont,
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: Point,
    LocationOnScreen: Point,
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
    cutText: js.Function2[scala.Double, scala.Double, scala.Boolean],
    deleteText: js.Function2[scala.Double, scala.Double, scala.Boolean],
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
    getFont: js.Function0[XFont],
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
    getTitledBorderText: js.Function0[java.lang.String],
    getToolTipText: js.Function0[java.lang.String],
    grabFocus: js.Function0[scala.Unit],
    insertText: js.Function2[java.lang.String, scala.Double, scala.Boolean],
    pasteText: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAccessibleEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener, 
      scala.Unit
    ],
    replaceText: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Boolean],
    setAttributes: js.Function3[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    setCaretPosition: js.Function1[scala.Double, scala.Boolean],
    setSelection: js.Function2[scala.Double, scala.Double, scala.Boolean],
    setText: js.Function1[java.lang.String, scala.Boolean]
  ): AccessibleEdit = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, CaretPosition = CaretPosition, CharacterCount = CharacterCount, Font = Font, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, SelectedText = SelectedText, SelectionEnd = SelectionEnd, SelectionStart = SelectionStart, Size = Size, Text = Text, TitledBorderText = TitledBorderText, ToolTipText = ToolTipText, acquire = acquire, addAccessibleEventListener = addAccessibleEventListener, containsPoint = containsPoint, copyText = copyText, cutText = cutText, deleteText = deleteText, getAccessibleAtPoint = getAccessibleAtPoint, getAccessibleChild = getAccessibleChild, getAccessibleChildCount = getAccessibleChildCount, getAccessibleDescription = getAccessibleDescription, getAccessibleIndexInParent = getAccessibleIndexInParent, getAccessibleName = getAccessibleName, getAccessibleParent = getAccessibleParent, getAccessibleRelationSet = getAccessibleRelationSet, getAccessibleRole = getAccessibleRole, getAccessibleStateSet = getAccessibleStateSet, getBackground = getBackground, getBounds = getBounds, getCaretPosition = getCaretPosition, getCharacter = getCharacter, getCharacterAttributes = getCharacterAttributes, getCharacterBounds = getCharacterBounds, getCharacterCount = getCharacterCount, getFont = getFont, getForeground = getForeground, getIndexAtPoint = getIndexAtPoint, getLocale = getLocale, getLocation = getLocation, getLocationOnScreen = getLocationOnScreen, getSelectedText = getSelectedText, getSelectionEnd = getSelectionEnd, getSelectionStart = getSelectionStart, getSize = getSize, getText = getText, getTextAtIndex = getTextAtIndex, getTextBeforeIndex = getTextBeforeIndex, getTextBehindIndex = getTextBehindIndex, getTextRange = getTextRange, getTitledBorderText = getTitledBorderText, getToolTipText = getToolTipText, grabFocus = grabFocus, insertText = insertText, pasteText = pasteText, queryInterface = queryInterface, release = release, removeAccessibleEventListener = removeAccessibleEventListener, replaceText = replaceText, setAttributes = setAttributes, setCaretPosition = setCaretPosition, setSelection = setSelection, setText = setText)
  
    __obj.asInstanceOf[AccessibleEdit]
  }
}

