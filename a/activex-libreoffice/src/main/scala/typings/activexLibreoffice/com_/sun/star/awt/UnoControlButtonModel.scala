package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typings.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the standard model of an {@link UnoControlButton} . */
@js.native
trait UnoControlButtonModel extends UnoControlModel {
  
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: Double = js.native
  
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: Color = js.native
  
  /** specifies that the button is the default button on the document. */
  var DefaultButton: Boolean = js.native
  
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  
  /**
    * specifies whether the button control should grab the focus when clicked.
    *
    * If set to `TRUE` (which is the default), the button control automatically grabs the focus when the user clicks onto it with the mouse. ;  If set to
    * `FALSE` , the focus is preserved when the user operates the button control with the mouse.
    * @since OOo 2.0
    */
  var FocusOnClick: Boolean = js.native
  
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double = js.native
  
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double = js.native
  
  /**
    * specifies a graphic to be displayed at the button
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.1
    */
  var Graphic: XGraphic = js.native
  
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  
  /** specifies the alignment of the image inside the button as {@link ImageAlign} value. */
  var ImageAlign: Double = js.native
  
  /**
    * specifies the position of the image, if any, relative to the text, if any
    *
    * Valid values of this property are specified with {@link ImagePosition} .
    *
    * If this property is present, it supersedes the {@link ImageAlign} property - setting one of both properties sets the other one to the best possible
    * match.
    */
  var ImagePosition: Double = js.native
  
  /**
    * specifies an URL to an image to use for the button.
    * @see Graphic
    */
  var ImageURL: String = js.native
  
  /** specifies the label of the control. */
  var Label: String = js.native
  
  /**
    * specifies that the text may be displayed on more than one line.
    * @since OOo 2.0
    */
  var MultiLine: Boolean = js.native
  
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  
  /** specifies the default action of the button as PushButtonType value. */
  var PushButtonType: Double = js.native
  
  /**
    * specifies whether the control should show repeating behavior.
    *
    * Normally, when you click a button with the mouse, you need to release the mouse button, and press it again. With this property set to `TRUE` , the
    * button is repeatedly pressed while you hold down the mouse button.
    * @since OOo 2.0
    */
  var Repeat: Boolean = js.native
  
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as pressing the button), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: Double = js.native
  
  /**
    * specifies the state of the control.
    *
    * If {@link Toggle} property is set to `TRUE` , the pressed state is enabled and its pressed state can be obtained with this property.
    *
    * `; 0: not pressed; 1: pressed; 2: don't know; `
    * @see Toggle
    */
  var State: Double = js.native
  
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean = js.native
  
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
  
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color = js.native
  
  /**
    * specifies whether the button should toggle on a single operation.
    *
    * If this property is set to `TRUE` , a single operation of the button control (pressing space while it is focused, or clicking onto it) toggles it
    * between a **pressed** and a **not pressed** state.
    *
    * The default for this property is `FALSE` , which means the button behaves like a usual push button.
    * @since OOo 2.0
    */
  var Toggle: Boolean = js.native
  
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 2.0
    */
  var VerticalAlign: VerticalAlignment = js.native
}
object UnoControlButtonModel {
  
  @scala.inline
  def apply(
    Align: Double,
    BackgroundColor: Color,
    DefaultButton: Boolean,
    DefaultControl: String,
    Enabled: Boolean,
    FocusOnClick: Boolean,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: Double,
    FontRelief: Double,
    Graphic: XGraphic,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    ImageAlign: Double,
    ImagePosition: Double,
    ImageURL: String,
    Label: String,
    MultiLine: Boolean,
    Name: String,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    PushButtonType: Double,
    Repeat: Boolean,
    RepeatDelay: Double,
    ServiceName: String,
    State: Double,
    Step: Double,
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
    TextColor: Color,
    TextLineColor: Color,
    Toggle: Boolean,
    VerticalAlign: VerticalAlignment,
    Width: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    read: XObjectInputStream => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit,
    write: XObjectOutputStream => Unit
  ): UnoControlButtonModel = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], BackgroundColor = BackgroundColor.asInstanceOf[js.Any], DefaultButton = DefaultButton.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FocusOnClick = FocusOnClick.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontEmphasisMark = FontEmphasisMark.asInstanceOf[js.Any], FontRelief = FontRelief.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], ImageAlign = ImageAlign.asInstanceOf[js.Any], ImagePosition = ImagePosition.asInstanceOf[js.Any], ImageURL = ImageURL.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], PushButtonType = PushButtonType.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], RepeatDelay = RepeatDelay.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tabstop = Tabstop.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], TextLineColor = TextLineColor.asInstanceOf[js.Any], Toggle = Toggle.asInstanceOf[js.Any], VerticalAlign = VerticalAlign.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[UnoControlButtonModel]
  }
  
  @scala.inline
  implicit class UnoControlButtonModelMutableBuilder[Self <: UnoControlButtonModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Double): Self = StObject.set(x, "Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultButton(value: Boolean): Self = StObject.set(x, "DefaultButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOnClick(value: Boolean): Self = StObject.set(x, "FocusOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDescriptor(value: FontDescriptor): Self = StObject.set(x, "FontDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontEmphasisMark(value: Double): Self = StObject.set(x, "FontEmphasisMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontRelief(value: Double): Self = StObject.set(x, "FontRelief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphic(value: XGraphic): Self = StObject.set(x, "Graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageAlign(value: Double): Self = StObject.set(x, "ImageAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePosition(value: Double): Self = StObject.set(x, "ImagePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageURL(value: String): Self = StObject.set(x, "ImageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLine(value: Boolean): Self = StObject.set(x, "MultiLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintable(value: Boolean): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushButtonType(value: Double): Self = StObject.set(x, "PushButtonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: Boolean): Self = StObject.set(x, "Repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatDelay(value: Double): Self = StObject.set(x, "RepeatDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabstop(value: Boolean): Self = StObject.set(x, "Tabstop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: Color): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLineColor(value: Color): Self = StObject.set(x, "TextLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(value: Boolean): Self = StObject.set(x, "Toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignment): Self = StObject.set(x, "VerticalAlign", value.asInstanceOf[js.Any])
  }
}
