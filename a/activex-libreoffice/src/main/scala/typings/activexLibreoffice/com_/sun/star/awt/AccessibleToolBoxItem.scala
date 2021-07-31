package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.AccessibleContext
import typings.activexLibreoffice.com_.sun.star.accessibility.TextSegment
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleAction
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventListener
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleExtendedComponent
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleKeyBinding
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleText
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies accessibility support for a tool box item.
  * @see com.sun.star.accessibility.AccessibleContext
  * @see com.sun.star.accessibility.XAccessibleComponent
  * @see com.sun.star.accessibility.XAccessibleExtendedComponent
  * @see com.sun.star.accessibility.XAccessibleAction
  * @see com.sun.star.accessibility.XAccessibleText
  * @see com.sun.star.accessibility.XAccessibleValue
  * @since OOo 1.1.2
  */
trait AccessibleToolBoxItem
  extends StObject
     with AccessibleContext
     with XAccessibleExtendedComponent
     with XAccessibleAction
     with XAccessibleText
     with XAccessibleValue
object AccessibleToolBoxItem {
  
  @scala.inline
  def apply(
    AccessibleActionCount: Double,
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
    CurrentValue: js.Any,
    Font: XFont,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    MaximumValue: js.Any,
    MinimumValue: js.Any,
    SelectedText: String,
    SelectionEnd: Double,
    SelectionStart: Double,
    Size: Size,
    Text: String,
    TitledBorderText: String,
    ToolTipText: String,
    acquire: () => Unit,
    addAccessibleEventListener: XAccessibleEventListener => Unit,
    containsPoint: Point => Boolean,
    copyText: (Double, Double) => Boolean,
    doAccessibleAction: Double => Boolean,
    getAccessibleActionCount: () => Double,
    getAccessibleActionDescription: Double => String,
    getAccessibleActionKeyBinding: Double => XAccessibleKeyBinding,
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
    getCurrentValue: () => js.Any,
    getFont: () => XFont,
    getForeground: () => Color,
    getIndexAtPoint: Point => Double,
    getLocale: () => Locale,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getMaximumValue: () => js.Any,
    getMinimumValue: () => js.Any,
    getSelectedText: () => String,
    getSelectionEnd: () => Double,
    getSelectionStart: () => Double,
    getSize: () => Size,
    getText: () => String,
    getTextAtIndex: (Double, Double) => TextSegment,
    getTextBeforeIndex: (Double, Double) => TextSegment,
    getTextBehindIndex: (Double, Double) => TextSegment,
    getTextRange: (Double, Double) => String,
    getTitledBorderText: () => String,
    getToolTipText: () => String,
    grabFocus: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAccessibleEventListener: XAccessibleEventListener => Unit,
    setCaretPosition: Double => Boolean,
    setCurrentValue: js.Any => Boolean,
    setSelection: (Double, Double) => Boolean
  ): AccessibleToolBoxItem = {
    val __obj = js.Dynamic.literal(AccessibleActionCount = AccessibleActionCount.asInstanceOf[js.Any], AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], CaretPosition = CaretPosition.asInstanceOf[js.Any], CharacterCount = CharacterCount.asInstanceOf[js.Any], CurrentValue = CurrentValue.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], MaximumValue = MaximumValue.asInstanceOf[js.Any], MinimumValue = MinimumValue.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], SelectionEnd = SelectionEnd.asInstanceOf[js.Any], SelectionStart = SelectionStart.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TitledBorderText = TitledBorderText.asInstanceOf[js.Any], ToolTipText = ToolTipText.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), containsPoint = js.Any.fromFunction1(containsPoint), copyText = js.Any.fromFunction2(copyText), doAccessibleAction = js.Any.fromFunction1(doAccessibleAction), getAccessibleActionCount = js.Any.fromFunction0(getAccessibleActionCount), getAccessibleActionDescription = js.Any.fromFunction1(getAccessibleActionDescription), getAccessibleActionKeyBinding = js.Any.fromFunction1(getAccessibleActionKeyBinding), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getCurrentValue = js.Any.fromFunction0(getCurrentValue), getFont = js.Any.fromFunction0(getFont), getForeground = js.Any.fromFunction0(getForeground), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getMaximumValue = js.Any.fromFunction0(getMaximumValue), getMinimumValue = js.Any.fromFunction0(getMinimumValue), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getSize = js.Any.fromFunction0(getSize), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), getTitledBorderText = js.Any.fromFunction0(getTitledBorderText), getToolTipText = js.Any.fromFunction0(getToolTipText), grabFocus = js.Any.fromFunction0(grabFocus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setCurrentValue = js.Any.fromFunction1(setCurrentValue), setSelection = js.Any.fromFunction2(setSelection))
    __obj.asInstanceOf[AccessibleToolBoxItem]
  }
}
