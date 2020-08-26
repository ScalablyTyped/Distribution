package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.TextSegment
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleComponent
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEditableText
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventBroadcaster
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventListener
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleSelection
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleTextAttributes
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The accessible view of a paragraph fragment.
  * @since OOo 1.1.2
  */
@js.native
trait AccessibleParagraphView
  extends XAccessibleEditableText
     with XAccessibleContext
     with XAccessibleComponent
     with XAccessibleSelection
     with XAccessibleEventBroadcaster
     with XAccessibleTextAttributes

object AccessibleParagraphView {
  @scala.inline
  def apply(
    AccessibleChildCount: Double,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Background: Color,
    Bounds: Rectangle,
    CaretPosition: Double,
    CharacterCount: Double,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    SelectedAccessibleChildCount: Double,
    SelectedText: String,
    SelectionEnd: Double,
    SelectionStart: Double,
    Size: Size,
    Text: String,
    acquire: () => Unit,
    addAccessibleEventListener: XAccessibleEventListener => Unit,
    clearAccessibleSelection: () => Unit,
    containsPoint: Point => Boolean,
    copyText: (Double, Double) => Boolean,
    cutText: (Double, Double) => Boolean,
    deleteText: (Double, Double) => Boolean,
    deselectAccessibleChild: Double => Unit,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: () => Double,
    getAccessibleDescription: () => String,
    getAccessibleIndexInParent: () => Double,
    getAccessibleName: () => String,
    getAccessibleParent: () => XAccessible,
    getAccessibleRelationSet: () => XAccessibleRelationSet,
    getAccessibleRole: () => Double,
    getAccessibleStateSet: () => XAccessibleStateSet,
    getBackground: () => Color,
    getBounds: () => Rectangle,
    getCaretPosition: () => Double,
    getCharacter: Double => String,
    getCharacterAttributes: (Double, SeqEquiv[String]) => SafeArray[PropertyValue],
    getCharacterBounds: Double => Rectangle,
    getCharacterCount: () => Double,
    getDefaultAttributes: SeqEquiv[String] => SafeArray[PropertyValue],
    getForeground: () => Color,
    getIndexAtPoint: Point => Double,
    getLocale: () => Locale,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getRunAttributes: (Double, SeqEquiv[String]) => SafeArray[PropertyValue],
    getSelectedAccessibleChild: Double => XAccessible,
    getSelectedAccessibleChildCount: () => Double,
    getSelectedText: () => String,
    getSelectionEnd: () => Double,
    getSelectionStart: () => Double,
    getSize: () => Size,
    getText: () => String,
    getTextAtIndex: (Double, Double) => TextSegment,
    getTextBeforeIndex: (Double, Double) => TextSegment,
    getTextBehindIndex: (Double, Double) => TextSegment,
    getTextRange: (Double, Double) => String,
    grabFocus: () => Unit,
    insertText: (String, Double) => Boolean,
    isAccessibleChildSelected: Double => Boolean,
    pasteText: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAccessibleEventListener: XAccessibleEventListener => Unit,
    replaceText: (Double, Double, String) => Boolean,
    selectAccessibleChild: Double => Unit,
    selectAllAccessibleChildren: () => Unit,
    setAttributes: (Double, Double, SeqEquiv[PropertyValue]) => Boolean,
    setCaretPosition: Double => Boolean,
    setSelection: (Double, Double) => Boolean,
    setText: String => Boolean
  ): AccessibleParagraphView = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], CaretPosition = CaretPosition.asInstanceOf[js.Any], CharacterCount = CharacterCount.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], SelectedAccessibleChildCount = SelectedAccessibleChildCount.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], SelectionEnd = SelectionEnd.asInstanceOf[js.Any], SelectionStart = SelectionStart.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), clearAccessibleSelection = js.Any.fromFunction0(clearAccessibleSelection), containsPoint = js.Any.fromFunction1(containsPoint), copyText = js.Any.fromFunction2(copyText), cutText = js.Any.fromFunction2(cutText), deleteText = js.Any.fromFunction2(deleteText), deselectAccessibleChild = js.Any.fromFunction1(deselectAccessibleChild), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getDefaultAttributes = js.Any.fromFunction1(getDefaultAttributes), getForeground = js.Any.fromFunction0(getForeground), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getRunAttributes = js.Any.fromFunction2(getRunAttributes), getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = js.Any.fromFunction0(getSelectedAccessibleChildCount), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getSize = js.Any.fromFunction0(getSize), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), grabFocus = js.Any.fromFunction0(grabFocus), insertText = js.Any.fromFunction2(insertText), isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), pasteText = js.Any.fromFunction1(pasteText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), replaceText = js.Any.fromFunction3(replaceText), selectAccessibleChild = js.Any.fromFunction1(selectAccessibleChild), selectAllAccessibleChildren = js.Any.fromFunction0(selectAllAccessibleChildren), setAttributes = js.Any.fromFunction3(setAttributes), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[AccessibleParagraphView]
  }
}

