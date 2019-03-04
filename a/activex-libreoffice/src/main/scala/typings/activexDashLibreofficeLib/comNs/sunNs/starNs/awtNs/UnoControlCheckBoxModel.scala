package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlCheckBox} . */
trait UnoControlCheckBoxModel extends UnoControlModel {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    * @since OOo 2.0
    */
  var Align: scala.Double
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: scala.Double
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: FontDescriptor
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double
  /**
    * specifies a graphic to be displayed besides the label of the control
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.1
    */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /**
    * specifies the position of the image, if any, relative to the text, if any
    *
    * Valid values of this property are specified with {@link ImagePosition} .
    */
  var ImagePosition: scala.Double
  /**
    * specifies an URL to an image to display besides the label of the control
    * @see Graphic
    */
  var ImageURL: java.lang.String
  /** specifies the label of the control. */
  var Label: java.lang.String
  /**
    * specifies that the text may be displayed on more than one line.
    * @since OOo 2.0
    */
  var MultiLine: scala.Boolean
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /**
    * specifies the state of the control.
    *
    * `; 0: not checked; 1: checked; 2: don't know; `
    */
  var State: scala.Double
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies that the control may have the state "don't know". */
  var TriState: scala.Boolean
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 2.0
    */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
  /**
    * specifies a visual effect to apply to the check box control
    *
    * Possible values for this property are {@link VisualEffect.FLAT} and {@link VisualEffect.LOOK3D} .
    * @see com.sun.star.awt.VisualEffect
    * @since OOo 2.0
    */
  var VisualEffect: scala.Double
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: scala.Double
}

object UnoControlCheckBoxModel {
  @scala.inline
  def apply(
    Align: scala.Double,
    BackgroundColor: scala.Double,
    DefaultControl: java.lang.String,
    Enabled: scala.Boolean,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: scala.Double,
    FontRelief: scala.Double,
    Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic,
    Height: scala.Double,
    HelpText: java.lang.String,
    HelpURL: java.lang.String,
    ImagePosition: scala.Double,
    ImageURL: java.lang.String,
    Label: java.lang.String,
    MultiLine: scala.Boolean,
    Name: java.lang.String,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ServiceName: java.lang.String,
    State: scala.Double,
    Step: scala.Double,
    TabIndex: scala.Double,
    Tabstop: scala.Boolean,
    Tag: java.lang.String,
    TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TriState: scala.Boolean,
    VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment,
    VisualEffect: scala.Double,
    Width: scala.Double,
    WritingMode: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    dispose: js.Function0[scala.Unit],
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getServiceName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    read: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectInputStream, scala.Unit],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertiesChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ],
    write: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectOutputStream, scala.Unit]
  ): UnoControlCheckBoxModel = {
    val __obj = js.Dynamic.literal(Align = Align, BackgroundColor = BackgroundColor, DefaultControl = DefaultControl, Enabled = Enabled, FontDescriptor = FontDescriptor, FontEmphasisMark = FontEmphasisMark, FontRelief = FontRelief, Graphic = Graphic, Height = Height, HelpText = HelpText, HelpURL = HelpURL, ImagePosition = ImagePosition, ImageURL = ImageURL, Label = Label, MultiLine = MultiLine, Name = Name, PositionX = PositionX, PositionY = PositionY, Printable = Printable, PropertySetInfo = PropertySetInfo, ServiceName = ServiceName, State = State, Step = Step, TabIndex = TabIndex, Tabstop = Tabstop, Tag = Tag, TextColor = TextColor, TextLineColor = TextLineColor, TriState = TriState, VerticalAlign = VerticalAlign, VisualEffect = VisualEffect, Width = Width, WritingMode = WritingMode, acquire = acquire, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, dispose = dispose, firePropertiesChangeEvent = firePropertiesChangeEvent, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getServiceName = getServiceName, queryInterface = queryInterface, read = read, release = release, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, write = write)
  
    __obj.asInstanceOf[UnoControlCheckBoxModel]
  }
}

