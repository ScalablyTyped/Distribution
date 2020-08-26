package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typings.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlEdit} . */
@js.native
trait UnoControlEditModel extends UnoControlModel {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: Double = js.native
  /**
    * If set to true an horizontal scrollbar will be added automatically when needed.
    * @since OOo 2.3
    */
  var AutoHScroll: Boolean = js.native
  /**
    * If set to true an vertical scrollbar will be added automatically when needed.
    * @since OOo 2.3
    */
  var AutoVScroll: Boolean = js.native
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: Color = js.native
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double = js.native
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double = js.native
  /** specifies the echo character for a password edit field. */
  var EchoChar: Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double = js.native
  /** specifies if the content of the control can be scrolled in the horizontal direction. */
  var HScroll: Boolean = js.native
  /** specifies if hard line breaks will be returned in the {@link XTextComponent.getText()} method. */
  var HardLineBreaks: Boolean = js.native
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  /**
    * specifies whether the selection in the control should be hidden when the control is not active (focused).
    * @since OOo 2.0
    */
  var HideInactiveSelection: Boolean = js.native
  /**
    * specifies which line end type should be used for multi line text
    *
    * Controls working with this model care for this setting when the user enters text. Every line break entered into the control will be treated according
    * to this setting, so that the {@link Text} property always contains only line ends in the format specified.
    *
    * Possible values are all constants from the {@link LineEndFormat} group.
    *
    * Note that this setting is usually not relevant when you set new text via the API. No matter which line end format is used in this new text then, usual
    * control implementations should recognize all line end formats and display them properly.
    * @since OOo 2.0
    */
  var LineEndFormat: Double = js.native
  /**
    * specifies the maximum character count.
    *
    * There's no limitation, if set to 0.
    */
  var MaxTextLen: Double = js.native
  /** specifies that the control may have more than one line. */
  var MultiLine: Boolean = js.native
  /**
    * specifies whether the control paints it background or not.
    * @since OOo 2.3
    */
  var PaintTransparent: Boolean = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: Boolean = js.native
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean = js.native
  /** specifies the text displayed in the control. */
  var Text: String = js.native
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color = js.native
  /** specifies if the content of the control can be scrolled in the vertical direction. */
  var VScroll: Boolean = js.native
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 3.3
    */
  var VerticalAlign: VerticalAlignment = js.native
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: Double = js.native
}

object UnoControlEditModel {
  @scala.inline
  def apply(
    Align: Double,
    AutoHScroll: Boolean,
    AutoVScroll: Boolean,
    BackgroundColor: Color,
    Border: Double,
    BorderColor: Double,
    DefaultControl: String,
    EchoChar: Double,
    Enabled: Boolean,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: Double,
    FontRelief: Double,
    HScroll: Boolean,
    HardLineBreaks: Boolean,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    HideInactiveSelection: Boolean,
    LineEndFormat: Double,
    MaxTextLen: Double,
    MultiLine: Boolean,
    Name: String,
    PaintTransparent: Boolean,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ReadOnly: Boolean,
    ServiceName: String,
    Step: Double,
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
    Text: String,
    TextColor: Color,
    TextLineColor: Color,
    VScroll: Boolean,
    VerticalAlign: VerticalAlignment,
    Width: Double,
    WritingMode: Double,
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
  ): UnoControlEditModel = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], AutoHScroll = AutoHScroll.asInstanceOf[js.Any], AutoVScroll = AutoVScroll.asInstanceOf[js.Any], BackgroundColor = BackgroundColor.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], EchoChar = EchoChar.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontEmphasisMark = FontEmphasisMark.asInstanceOf[js.Any], FontRelief = FontRelief.asInstanceOf[js.Any], HScroll = HScroll.asInstanceOf[js.Any], HardLineBreaks = HardLineBreaks.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], HideInactiveSelection = HideInactiveSelection.asInstanceOf[js.Any], LineEndFormat = LineEndFormat.asInstanceOf[js.Any], MaxTextLen = MaxTextLen.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PaintTransparent = PaintTransparent.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tabstop = Tabstop.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], TextLineColor = TextLineColor.asInstanceOf[js.Any], VScroll = VScroll.asInstanceOf[js.Any], VerticalAlign = VerticalAlign.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[UnoControlEditModel]
  }
  @scala.inline
  implicit class UnoControlEditModelOps[Self <: UnoControlEditModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlign(value: Double): Self = this.set("Align", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoHScroll(value: Boolean): Self = this.set("AutoHScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoVScroll(value: Boolean): Self = this.set("AutoVScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("BackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorder(value: Double): Self = this.set("Border", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: Double): Self = this.set("BorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEchoChar(value: Double): Self = this.set("EchoChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontDescriptor(value: FontDescriptor): Self = this.set("FontDescriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontEmphasisMark(value: Double): Self = this.set("FontEmphasisMark", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontRelief(value: Double): Self = this.set("FontRelief", value.asInstanceOf[js.Any])
    @scala.inline
    def setHScroll(value: Boolean): Self = this.set("HScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setHardLineBreaks(value: Boolean): Self = this.set("HardLineBreaks", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpText(value: String): Self = this.set("HelpText", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpURL(value: String): Self = this.set("HelpURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideInactiveSelection(value: Boolean): Self = this.set("HideInactiveSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineEndFormat(value: Double): Self = this.set("LineEndFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTextLen(value: Double): Self = this.set("MaxTextLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiLine(value: Boolean): Self = this.set("MultiLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaintTransparent(value: Boolean): Self = this.set("PaintTransparent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintable(value: Boolean): Self = this.set("Printable", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabstop(value: Boolean): Self = this.set("Tabstop", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextColor(value: Color): Self = this.set("TextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextLineColor(value: Color): Self = this.set("TextLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVScroll(value: Boolean): Self = this.set("VScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalAlign(value: VerticalAlignment): Self = this.set("VerticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritingMode(value: Double): Self = this.set("WritingMode", value.asInstanceOf[js.Any])
  }
  
}

