package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.awt.XItemList
import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.container.XContentEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.form.submission.XSubmissionSupplier
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.sdb.RowSet
import typings.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesComplex
import typings.activexLibreoffice.com_.sun.star.style.ParagraphProperties
import typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typings.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object component {
  
  /**
    * specifies the model of a check box control
    *
    * The model supports the properties required for HTML, thus you can build up HTMLForms with it
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlCheckBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, Graphic, HelpText, HelpURL, ImagePosition, ImageURL, Label, MultiLine, Printable, State, Tabstop, TextColor, TextLineColor, TriState, VerticalAlign, VisualEffect, WritingMode */ @js.native
  trait CheckBox
    extends FormControlModel
       with XReset {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      * @since OOo 2.0
      */
    var Align: Double = js.native
    
    /** specifies the background color (RGB) of the control. */
    var BackgroundColor: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlCheckBoxModel.State
      * @see com.sun.star.form.XReset
      */
    var DefaultState: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /**
      * specifies a graphic to be displayed besides the label of the control
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
    
    /**
      * specifies the position of the image, if any, relative to the text, if any
      *
      * Valid values of this property are specified with {@link ImagePosition} .
      */
    var ImagePosition: Double = js.native
    
    /**
      * specifies an URL to an image to display besides the label of the control
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
    
    /**
      * contains a reference value which is used for submission in a HTML form
      *
      * When submitting a {@link HTMLForm} which contains a check box, which is checked, the RefValue is used for submission.
      */
    var RefValue: String = js.native
    
    /**
      * specifies the state of the control.
      *
      * `; 0: not checked; 1: checked; 2: don't know; `
      */
    var State: Double = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies that the control may have the state "don't know". */
    var TriState: Boolean = js.native
    
    /**
      * specifies the vertical alignment of the text in the control.
      * @since OOo 2.0
      */
    var VerticalAlign: VerticalAlignment = js.native
    
    /**
      * specifies a visual effect to apply to the check box control
      *
      * Possible values for this property are {@link VisualEffect.FLAT} and {@link VisualEffect.LOOK3D} .
      * @see com.sun.star.awt.VisualEffect
      * @since OOo 2.0
      */
    var VisualEffect: Double = js.native
    
    /**
      * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
      *
      * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
      * @since OOo 3.1
      */
    var WritingMode: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies a component which allows the input of text or selection of text from a list of text values. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlComboBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, Autocomplete, BackgroundColor, Border, BorderColor, Dropdown, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, LineCount, MaxTextLen, MouseWheelBehavior, Printable, ReadOnly, StringItemList, Tabstop, Text, TextColor, TextLineColor, WritingMode */ @js.native
  trait ComboBox
    extends FormControlModel
       with XReset
       with XItemList {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      */
    var Align: Double = js.native
    
    /** specifies whether automatic completion of text is enabled. */
    var Autocomplete: Boolean = js.native
    
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
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlComboBoxModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /** specifies if the control has a drop down button. */
    var Dropdown: Boolean = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /**
      * specifies whether the selection in the control should be hidden when the control is not active (focused).
      * @since OOo 2.0
      */
    var HideInactiveSelection: Boolean = js.native
    
    /** specifies the maximum line count displayed in the drop down box. */
    var LineCount: Double = js.native
    
    /**
      * specifies the maximum character count.
      *
      * There's no limitation, if set to 0.
      */
    var MaxTextLen: Double = js.native
    
    /**
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel scroll through the control's entry list. Using this property, and one of the {@link MouseWheelBehavior} constants, you can
      * control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /** specifies the list of items. */
    var StringItemList: SafeArray[String] = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text displayed in the control. */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /**
      * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
      *
      * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
      * @since OOo 3.1
      */
    var WritingMode: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * specifies the control model for a clickable button which is part of a form component hierarchy.
    * @see ImageButton
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlButtonModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, DefaultButton, Enabled, FocusOnClick, FontDescriptor, FontEmphasisMark, FontRelief, Graphic, HelpText, HelpURL, ImageAlign, ImagePosition, ImageURL, Label, MultiLine, Printable, PushButtonType, Repeat, RepeatDelay, State, Tabstop, TextColor, TextLineColor, Toggle, VerticalAlign */ @js.native
  trait CommandButton
    extends FormControlModel
       with XImageProducerSupplier
       with XReset {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      */
    var Align: Double = js.native
    
    /** specifies the background color (RGB) of the control. */
    var BackgroundColor: Color = js.native
    
    /** describes the action to be executed by the button when pressed. */
    var ButtonType: FormButtonType = js.native
    
    /** specifies that the button is the default button on the document. */
    var DefaultButton: Boolean = js.native
    
    /**
      * specifies the default toggle state for the button, used when it is reset.
      *
      * This property is meaningful only when {@link com.sun.star.awt.UnoControlButtonModel.Toggle} is `TRUE` . In this case, the `DefaultState` controls to
      * which `State` the button will be reset.
      *
      * For a given implementation of the interface, if this (optional) property is present, then also the optional interface {@link com.sun.star.form.XReset}
      * must be present.
      */
    var DefaultState: Boolean = js.native
    
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
    
    /**
      * describes the frame, where to open the document specified by the TargetURL.
      *
      * This property is evaluated if the button is of type URL.
      *
      * As always, there is a number of target names which have a special meaning, and force a special {@link com.sun.star.frame.Frame} to be used.
      */
    var TargetFrame: String = js.native
    
    /**
      * specifies the URL, which should be opened if the button was clicked.
      *
      * This property is evaluated if the button is of type URL.
      * @see com.sun.star.form.FormButtonType
      */
    var TargetURL: String = js.native
    
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
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies the ControlModel for an edit field which contains a currency value. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlCurrencyFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, CurrencySymbol, DecimalAccuracy, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, MouseWheelBehavior, PrependCurrencySymbol, Printable, ReadOnly, Repeat, RepeatDelay, ShowThousandsSeparator, Spin, StrictFormat, Tabstop, TextColor, TextLineColor, Value, ValueMax, ValueMin, ValueStep, VerticalAlign, WritingMode */ @js.native
  trait CurrencyField
    extends FormControlModel
       with XReset {
    
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
    
    /** specifies the currency symbol. */
    var CurrencySymbol: String = js.native
    
    /** specifies the decimal accuracy. */
    var DecimalAccuracy: Double = js.native
    
    /**
      * contains a default value for the control.
      * @see com.sun.star.awt.UnoControlCurrencyFieldModel.Value
      * @see com.sun.star.form.XReset
      */
    var DefaultValue: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
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
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies whether the currency symbol is to be prepended. */
    var PrependCurrencySymbol: Boolean = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies whether the thousands separator is to be displayed. */
    var ShowThousandsSeparator: Boolean = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /** specifies that the value is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies the value displayed in the control. */
    var Value: Double = js.native
    
    /** specifies the maximum value that can be entered. */
    var ValueMax: Double = js.native
    
    /** specifies the minimum value that can be entered. */
    var ValueMin: Double = js.native
    
    /** specifies the value step when using the spin button. */
    var ValueStep: Double = js.native
    
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
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a form which is connected to a database and displays the results of SQL queries. It provides the possibility of adding new data
    * records, modifying existing ones, or deleting them.
    *
    * A database form is a special kind of enhanced database row set which provides all information for displaying the data and has more possibilities for
    * configuring the data manipulation.
    */
  @js.native
  trait DataForm
    extends RowSet
       with Form
       with XReset
       with XLoadable
       with XDatabaseParameterBroadcaster {
    
    /**
      * determines if deletions of records of the form are allowed.
      *
      * Note that this is a recommendation for user interface components displaying the form. {@link Form} implementations may decide to allow for deletions
      * done via the API, even if the property is set to `FALSE` , but the user interface should respect the property value.
      */
    var AllowDeletes: Boolean = js.native
    
    /**
      * determines if insertions into the form's row set are allowed.
      *
      * Note that this is a recommendation for user interface components displaying the form. {@link Form} implementations may decide to allow for insertions
      * done via the API, even if the property is set to `FALSE` , but the user interface should respect the property value.
      */
    var AllowInserts: Boolean = js.native
    
    /**
      * determines if modifications of the current record of the form are allowed.
      *
      * Note that this is a recommendation for user interface components displaying the form. {@link Form} implementations may decide to allow for updates
      * done via the API, even if the property is set to `FALSE` , but the user interface should respect the property value.
      */
    var AllowUpdates: Boolean = js.native
    
    /** returns the kind of tabulator controlling. */
    var Cycle: TabulatorCycle = js.native
    
    /**
      * is used for subforms and contains the names of the columns of the subform which are related to the master fields of the parent form.
      *
      * Entries in this sequence can either denote column names in the sub form, or parameter names. ;  For instance, you could base the form on the SQL
      * statement `SELECT * FROM invoices WHERE cust_ref = :cid` , and add `cid` to the DetailFields property. In this case, the parameter will be filled from
      * the corresponding master field. ;  Alternatively, you could simply base your form on the table `invoices` , and add the column name `cust_ref` to the
      * DetailFields. In this case, and implicit filter clause `WHERE cust_ref = :<new_param_name>` will be created, and the artificial parameter will be
      * filled from the corresponding master field. ;  If a string in this property denotes both a column name and a parameter name, it is undefined which way
      * it is interpreted, but implementations of the service are required to either decide for the parameter or the column, and proceed as usual.
      *
      * The columns specified herein typically represent a part of the primary key fields or their aliases of the detail form.
      *
      * If the form is no sub form (e.g. its parent is not a form itself), this property is not evaluated.
      */
    var DetailFields: SafeArray[String] = js.native
    
    /**
      * is used for subforms and contains the names of columns of the parent form.
      *
      * These columns are typically the foreign key fields of the parent form. The values of theses columns are used to identify the data for the subform.
      * Each time the parent form changes its current row, the subform requeries it's data based on the values of the master fields.
      *
      * If the form is no sub form (e.g. its parent is not a form itself), this property is not evaluated.
      */
    var MasterFields: SafeArray[String] = js.native
    
    /** determines how an navigation bar for this form should act. */
    var NavigationBarMode: typings.activexLibreoffice.com_.sun.star.form.NavigationBarMode = js.native
  }
  
  /**
    * This service specifies a check box which is data-aware, and can be bound to a database field.
    *
    * Mostly, you will create data-aware checkboxes as tristate checkboxes, because this is a requirement to correctly handle `NULL` values in databases.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.TriState
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlCheckBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, Graphic, HelpText, HelpURL, ImagePosition, ImageURL, Label, MultiLine, Printable, State, Tabstop, TextColor, TextLineColor, TriState, VerticalAlign, VisualEffect, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.CheckBox because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultState, RefValue */ @js.native
  trait DatabaseCheckBox extends DataAwareControlModel {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      * @since OOo 2.0
      */
    var Align: Double = js.native
    
    /** specifies the background color (RGB) of the control. */
    var BackgroundColor: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlCheckBoxModel.State
      * @see com.sun.star.form.XReset
      */
    var DefaultState: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /**
      * specifies a graphic to be displayed besides the label of the control
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
    
    /**
      * specifies the position of the image, if any, relative to the text, if any
      *
      * Valid values of this property are specified with {@link ImagePosition} .
      */
    var ImagePosition: Double = js.native
    
    /**
      * specifies an URL to an image to display besides the label of the control
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
    
    /**
      * contains a reference value which is used for submission in a HTML form
      *
      * When submitting a {@link HTMLForm} which contains a check box, which is checked, the RefValue is used for submission.
      */
    var RefValue: String = js.native
    
    /**
      * specifies the state of the control.
      *
      * `; 0: not checked; 1: checked; 2: don't know; `
      */
    var State: Double = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies that the control may have the state "don't know". */
    var TriState: Boolean = js.native
    
    /**
      * specifies the vertical alignment of the text in the control.
      * @since OOo 2.0
      */
    var VerticalAlign: VerticalAlignment = js.native
    
    /**
      * specifies a visual effect to apply to the check box control
      *
      * Possible values for this property are {@link VisualEffect.FLAT} and {@link VisualEffect.LOOK3D} .
      * @see com.sun.star.awt.VisualEffect
      * @since OOo 2.0
      */
    var VisualEffect: Double = js.native
    
    /**
      * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
      *
      * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
      * @since OOo 3.1
      */
    var WritingMode: Double = js.native
  }
  
  /**
    * This service specifies a combo box which is data-aware, and can be bound to a database field.
    *
    * Like most other data aware controls, such a combo box will display the actual content of the field it is bound to. In addition, as a combo box
    * contains a list where the user can choose items to fill into the control, this list can be filled with different data from a database, too.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlComboBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, Autocomplete, BackgroundColor, Border, BorderColor, Dropdown, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, LineCount, MaxTextLen, MouseWheelBehavior, Printable, ReadOnly, StringItemList, Tabstop, Text, TextColor, TextLineColor, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.ComboBox because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultText */ @js.native
  trait DatabaseComboBox
    extends DataAwareControlModel
       with XItemList {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      */
    var Align: Double = js.native
    
    /** specifies whether automatic completion of text is enabled. */
    var Autocomplete: Boolean = js.native
    
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
    
    /**
      * determines if an empty text should be treated as a `NULL` value.
      *
      * When the user enters text into a combo box, and after this, the control content is to be committed into the database field the control is bound to, a
      * decision must be made how to deal with empty strings. ;  This is controlled by {@link ConvertEmptyToNull} .
      *
      * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
      */
    var ConvertEmptyToNull: Boolean = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlComboBoxModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /** specifies if the control has a drop down button. */
    var Dropdown: Boolean = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /**
      * specifies whether the selection in the control should be hidden when the control is not active (focused).
      * @since OOo 2.0
      */
    var HideInactiveSelection: Boolean = js.native
    
    /** specifies the maximum line count displayed in the drop down box. */
    var LineCount: Double = js.native
    
    /**
      * describes the source of items in the combo box's list.
      *
      * The concrete meaning of this property depends on the value of {@link ListSourceType}
      */
    var ListSource: String = js.native
    
    /**
      * specifies the kind of list source.
      *
      * Note: A value of com::sun::star::form::ListSourceType::VALUELIST is not valid for a combo box. It won't be rejected when setting it, but controls will
      * usually ignore it and leave the list empty.
      */
    var ListSourceType: typings.activexLibreoffice.com_.sun.star.form.ListSourceType = js.native
    
    /**
      * specifies the maximum character count.
      *
      * There's no limitation, if set to 0.
      */
    var MaxTextLen: Double = js.native
    
    /**
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel scroll through the control's entry list. Using this property, and one of the {@link MouseWheelBehavior} constants, you can
      * control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /** specifies the list of items. */
    var StringItemList: SafeArray[String] = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text displayed in the control. */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /**
      * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
      *
      * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
      * @since OOo 3.1
      */
    var WritingMode: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a currency field which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlCurrencyFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, CurrencySymbol, DecimalAccuracy, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, MouseWheelBehavior, PrependCurrencySymbol, Printable, ReadOnly, Repeat, RepeatDelay, ShowThousandsSeparator, Spin, StrictFormat, Tabstop, TextColor, TextLineColor, Value, ValueMax, ValueMin, ValueStep, VerticalAlign, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.CurrencyField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultValue */ @js.native
  trait DatabaseCurrencyField extends DataAwareControlModel {
    
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
    
    /** specifies the currency symbol. */
    var CurrencySymbol: String = js.native
    
    /** specifies the decimal accuracy. */
    var DecimalAccuracy: Double = js.native
    
    /**
      * contains a default value for the control.
      * @see com.sun.star.awt.UnoControlCurrencyFieldModel.Value
      * @see com.sun.star.form.XReset
      */
    var DefaultValue: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
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
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies whether the currency symbol is to be prepended. */
    var PrependCurrencySymbol: Boolean = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies whether the thousands separator is to be displayed. */
    var ShowThousandsSeparator: Boolean = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /** specifies that the value is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies the value displayed in the control. */
    var Value: Double = js.native
    
    /** specifies the maximum value that can be entered. */
    var ValueMax: Double = js.native
    
    /** specifies the minimum value that can be entered. */
    var ValueMin: Double = js.native
    
    /** specifies the value step when using the spin button. */
    var ValueStep: Double = js.native
    
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
  
  /** This service specifies a date field which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDateFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Date, DateFormat, DateMax, DateMin, DateShowCentury, Dropdown, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, MouseWheelBehavior, Printable, ReadOnly, Repeat, RepeatDelay, Spin, StrictFormat, Tabstop, Text, TextColor, TextLineColor, VerticalAlign, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.DateField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultDate */ @js.native
  trait DatabaseDateField extends DataAwareControlModel {
    
    /** specifies the background color(RGB) of the control. */
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
    
    /** specifies the date displayed in the control. */
    var Date: typings.activexLibreoffice.com_.sun.star.util.Date = js.native
    
    /**
      * specifies the format of the displayed date.
      *
      * `; 0:   system short; 1:   system short YY; 2:   system short YYYY; 3:   system long; 4:   short DDMMYY; 5:   short MMDDYY; 6:   short YYMMDD; 7:
      * short DDMMYYYY; 8:   short MMDDYYYY; 9:   short YYYYMMDD; 10:  short YYMMDD DIN5008; 11:  short YYYYMMDD DIN5008; `
      */
    var DateFormat: Double = js.native
    
    /** specifies the maximum date that can be entered. */
    var DateMax: Date = js.native
    
    /** specifies the minimum date that can be entered. */
    var DateMin: Date = js.native
    
    /** specifies, if the date century is displayed. */
    var DateShowCentury: Boolean = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlDateFieldModel.Date
      * @see com.sun.star.form.XReset
      */
    var DefaultDate: Double = js.native
    
    /** specifies, if the control has a dropdown button. */
    var Dropdown: Boolean = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
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
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /** specifies that the date is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /**
      * specifies the text displayed in the control.
      * @since OOo 2.0
      */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
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
  
  /** This service specifies a formatted field model which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlFormattedFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Border, BorderColor, EffectiveDefault, EffectiveMax, EffectiveMin, EffectiveValue, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, FormatKey, FormatsSupplier, HelpText, HelpURL, HideInactiveSelection, MaxTextLen, MouseWheelBehavior, Printable, ReadOnly, Repeat, RepeatDelay, Spin, StrictFormat, Tabstop, Text, TextColor, TextLineColor, TreatAsNumber, VerticalAlign, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.FormattedField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait DatabaseFormattedField extends DataAwareControlModel {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      */
    var Align: Double = js.native
    
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
    
    /**
      * determines if an empty text should be treated as a `NULL` value.
      *
      * When the user enters text into a formatted field control, and after this, the control content is to be committed into the database field the control
      * is bound to, a decision must be made how to deal with empty strings. ;  This is controlled by {@link ConvertEmptyToNull} .
      *
      * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
      */
    var ConvertEmptyToNull: Boolean = js.native
    
    /**
      * specifies the default value of the formatted field.
      *
      * This may be a numeric value (double) or a string, depending on the formatting of the field.
      */
    var EffectiveDefault: js.Any = js.native
    
    /**
      * specifies the maximum value that can be entered.
      *
      * This property is ignored if the format of the field is no numeric format.
      */
    var EffectiveMax: Double = js.native
    
    /**
      * specifies the minimum value that can be entered.
      *
      * This property is ignored if the format of the field is no numeric format.
      */
    var EffectiveMin: Double = js.native
    
    /**
      * specifies the current value of the formatted field.
      *
      * This may be a numeric value (double) or a string, depending on the formatting of the field.
      */
    var EffectiveValue: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /**
      * specifies the format to be used when formatting the field input and output.
      *
      * This value is meaningful relative to the FormatsSupplier property only.
      */
    var FormatKey: Double = js.native
    
    /** supplies the formats the field should work with. */
    var FormatsSupplier: XNumberFormatsSupplier = js.native
    
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
      * specifies the maximum character count.
      *
      * There's no limitation, if set to 0.
      */
    var MaxTextLen: Double = js.native
    
    /**
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /**
      * specifies that the text is checked during the user input.
      *
      * This property is optional - not every component implementing this service is required to provide it, as real-time input checking on a formatted field
      * may be pretty expensive.
      */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text displayed in the control. */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies that the text is treated as a number. */
    var TreatAsNumber: Boolean = js.native
    
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
  
  /**
    * specifies the model of a control used for displaying images stored in a database.
    *
    * As every {@link com.sun.star.form.DataAwareControlModel} , an image control can be bound to a database field. This means that for instance with every
    * record change, the content of the database field is taken, interpreted as image, and displayed in the control. ;  Unlike other more text-based
    * controls, it does not interpret the content of the field as text or double, but as binary stream (see {@link
    * com.sun.star.sdb.XColumn.getBinaryStream()} ).
    *
    * Usually, an image control model can be bound to binary columns only, namely {@link com.sun.star.sdbc.DataType.BINARY} , {@link
    * com.sun.star.sdbc.DataType.VARBINARY} , {@link com.sun.star.sdbc.DataType.LONGVARBINARY} , {@link com.sun.star.sdbc.DataType.OTHER} , {@link
    * com.sun.star.sdbc.DataType.LONGVARCHAR}
    *
    * Note that besides taking the image to be displayed from the bound field, there is another option. The {@link
    * com.sun.star.awt.UnoControlImageControlModel.ImageURL} property specifies the URL of an image to be displayed. If this property is changed from
    * outside, the respective file is loaded and set as image source.
    *
    * In a usual data form, the scenario will be as follows: There is a {@link DatabaseImageControl} as part of the document model, which acts as control
    * model for an {@link com.sun.star.form.control.ImageControl} .
    *
    * The control is an {@link com.sun.star.awt.XImageConsumer} for the {@link com.sun.star.awt.XImageProducer} supplied by the model.
    *
    * Whenever the form's cursor is positioned on a new record, the column the control model is bound to is examined for a binary data stream. This stream
    * is set as source at the image producer, which notifies it's consumers, which leads to the control displaying the image.
    *
    * When the user by some interaction tells the control to contain a new image, this is exchanged by URL. For example, implementations of the control
    * service may allow the user to browse for image. After this, the URL of the image is set as {@link
    * com.sun.star.awt.UnoControlImageControlModel.ImageURL} property at the model. ;  Now the control loads the image determined by the property value, and
    * starts producing a new data stream, which is displayed by the control (which is a consumer for this stream). ;  From now on, the control and thus the
    * database record counts as modified. If the cursor of the form is moved further, the modified record is saved, means the content of the image pointed
    * to by {@link com.sun.star.awt.UnoControlImageControlModel.ImageURL} is saved into the column.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlImageControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Enabled, Graphic, HelpText, HelpURL, ImageURL, Printable, ScaleImage, ScaleMode, Tabstop */ @js.native
  trait DatabaseImageControl
    extends DataAwareControlModel
       with XImageProducerSupplier {
    
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
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /**
      * specifies a graphic to be displayed on the control
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
    
    /**
      * specifies an URL to an image to use for the control.
      * @see Graphic
      */
    var ImageURL: String = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** indicates if it is possible to change the image being displayed. */
    var ReadOnly: Boolean = js.native
    
    /** specifies if the image is automatically scaled to the size of the control. */
    var ScaleImage: Boolean = js.native
    
    /**
      * defines how to scale the image
      *
      * If this property is present, it supersedes the {@link ScaleImage} property.
      *
      * The value of this property is one of the {@link ImageScaleMode} constants.
      * @since OOo 3.1
      */
    var ScaleMode: Double = js.native
    
    /**
      * specifies that the control can be reached with the TAB key.
      * @since OOo 1.1.2
      */
    var Tabstop: Boolean = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a data-aware list box control model.
    *
    * The base service for list boxes ( {@link ListBox} ) offers only one possibility to specify the list entries: The display strings in the {@link
    * com.sun.star.awt.UnoControlListBoxModel.StringItemList} property and the corresponding values in the {@link ListBox.ListSource} property.
    *
    * This service here extends this mimic. It allows to fill the list from a data source. This means that a second result set is opened, which works on the
    * same connection as the form which the list box belongs to, but can be based on an arbitrary table or SQL statement.
    *
    * For instance, you may have a form which is bound to a table **invoice** , and you use it to enter invoices for your customers. Probably, you will have
    * a second table (say **customer** ), which (among other data) contains a unique key for identifying customers. In your invoice table, you will have a
    * foreign key referring to these customers. ;  Now, besides the result set the form is based on (all your invoices), the list box can be instructed to
    * open a second result set, this time for the **customer** table, and fill its list with entries from this result set. ;  Additionally, it allows to
    * model the relation between the two tables: When the user selects a customer from the list, this customer has the unique id we just talked about (which
    * is not necessarily visible to the user in any way). The list box then automatically transfers this id into the foreign key column of **invoice** ,
    * thus allowing the user to transparently work with human-readable strings instead of pure numbers. ;  Let's call this result set the list is filled
    * from the **list result set** here ...
    *
    * The display strings are always taken from the first column of that result set, and the corresponding value as per the BoundColumn property.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlListBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Border, BorderColor, Dropdown, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, ItemSeparatorPos, LineCount, MouseWheelBehavior, MultiSelection, Printable, ReadOnly, SelectedItems, StringItemList, Tabstop, TextColor, TextLineColor, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.ListBox because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultSelection, ListSource */ @js.native
  trait DatabaseListBox
    extends DataAwareControlModel
       with XItemList {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      */
    var Align: Double = js.native
    
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
    
    /**
      * specifies which column of the list result set should be used for data exchange.
      *
      * When you make a selection from a list box, the "BoundColumn" property reflects which column value of a result set should be used as the value of the
      * component. If the control is bound to a database field, the column value is stored in the database field identified by the property {@link
      * com.sun.star.form.DataAwareControlModel.DataField} .
      *
      * **-1 **: The index (starting at 0) of the selected list box entry is stored in the current database field.;
      *
      * **0 or greater **: The column value of the result set at the position (0-indexed) is stored in the current database field. In particular, for value 0,
      * the selected (displayed) list box string is stored.
      *
      *
      *
      * The bound column property is only used if a list source is defined and the list source matches with the types
      * com::sun::star::form::ListSourceType::TABLE, com::sun::star::form::ListSourceType::QUERY, com::sun::star::form::ListSourceType::SQL or
      * com::sun::star::form::ListSourceType::SQLPASSTHROUGH. Otherwise the property is ignored, as there is no result set from which to get the column
      * values.
      */
    var BoundColumn: Double = js.native
    
    /**
      * contains the indexes of entries of the listbox, which should selected by default.
      *
      * This selection is used initially or for a reset.
      * @see com.sun.star.awt.UnoControlListBoxModel.SelectedItems
      * @see com.sun.star.form.XReset
      */
    var DefaultSelection: SafeArray[Double] = js.native
    
    /** specifies if the control has a drop down button. */
    var Dropdown: Boolean = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /**
      * specifies where an item separator - a horizontal line - is drawn.
      *
      * If this is not `NULL` , then a horizontal line will be drawn between the item at the given position, and the following item.
      * @since OOo 3.3
      */
    var ItemSeparatorPos: Double = js.native
    
    /** specifies the maximum line count displayed in the drop down box. */
    var LineCount: Double = js.native
    
    /** contains the values associated to the strings to be displayed (which are specified by {@link com.sun.star.awt.UnoControlListBoxModel.StringItemList} ) */
    var ListSource: SafeArray[String] = js.native
    
    /**
      * describes the kind of list source used.
      *
      * Depending on the value of this property, the way the value of {@link ListBox.ListSource} is evaluated varies.
      * **com::sun::star::form::ListSourceType::VALUELIST **: The elements in the string sequence in {@link ListBox.ListSource} build up the entry list.;
      *
      * **com::sun::star::form::ListSourceType::TABLE **: The first element of the string sequence in {@link ListBox.ListSource} determines the table which
      * the list result set should be based on.;
      *
      * **com::sun::star::form::ListSourceType::QUERY **: The first element of the string sequence in {@link ListBox.ListSource} determines the query which
      * the list result set should be based on. ;  For retrieving the query, the connection which the data form is working with ( {@link
      * com.sun.star.sdb.RowSet.ActiveConnection} ) is queried for the {@link com.sun.star.sdb.XQueriesSupplier} interface.;
      *
      * **com::sun::star::form::ListSourceType::SQL **: The first element of the string sequence in {@link ListBox.ListSource} contains the SQL statement
      * which the list result set should be based on.; ;
      *
      * **com::sun::star::form::ListSourceType::SQLPASSTHROUGH **: The first element of the string sequence in {@link ListBox.ListSource} contains the SQL
      * statement which the list result set should be based on. ;  The statement is not analyzed by the parser. This means that you can use database specific
      * SQL features here, but, on the other hand, lose features like parameter value substitution.;
      *
      * **com::sun::star::form::ListSourceType::TABLEFIELDS **: The first element of the string sequence in {@link ListBox.ListSource} determines the table
      * whose column names should fill the list.
      */
    var ListSourceType: typings.activexLibreoffice.com_.sun.star.form.ListSourceType = js.native
    
    /**
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel scroll through the control's entry list. Using this property, and one of the {@link MouseWheelBehavior} constants, you can
      * control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies if more than one entry can be selected. */
    var MultiSelection: Boolean = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /** specifies the sequence of selected items, identified by the position. */
    var SelectedItems: SafeArray[Double] = js.native
    
    /** The selected value, if there is at most one. */
    var SelectedValue: js.Any = js.native
    
    /** The selected values. */
    var SelectedValues: SafeArray[_] = js.native
    
    /** specifies the list of items. */
    var StringItemList: SafeArray[String] = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /**
      * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
      *
      * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
      * @since OOo 3.1
      */
    var WritingMode: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a numeric field which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlNumericFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, DecimalAccuracy, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, MouseWheelBehavior, Printable, ReadOnly, Repeat, RepeatDelay, ShowThousandsSeparator, Spin, StrictFormat, Tabstop, TextColor, TextLineColor, Value, ValueMax, ValueMin, ValueStep, VerticalAlign, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.NumericField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultValue */ @js.native
  trait DatabaseNumericField extends DataAwareControlModel {
    
    /** specifies the background color(RGB) of the control. */
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
    
    /** specifies the decimal accuracy. */
    var DecimalAccuracy: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlNumericFieldModel.Value
      * @see com.sun.star.form.XReset
      */
    var DefaultValue: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
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
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies whether the thousands separator is to be displayed. */
    var ShowThousandsSeparator: Boolean = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /** specifies that the value is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies the value displayed in the control. */
    var Value: Double = js.native
    
    /** specifies the maximum value that can be entered. */
    var ValueMax: Double = js.native
    
    /** specifies the minimum value that can be entered. */
    var ValueMin: Double = js.native
    
    /** specifies the value step when using the spin button. */
    var ValueStep: Double = js.native
    
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
  
  /** This service specifies a data-aware control model for entering text which matches a specific pattern. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlPatternFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, EditMask, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, LiteralMask, MaxTextLen, MouseWheelBehavior, Printable, ReadOnly, StrictFormat, Tabstop, Text, TextColor, TextLineColor, VerticalAlign, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.PatternField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultText */ @js.native
  trait DatabasePatternField extends DataAwareControlModel {
    
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
    
    /**
      * determines if an empty text should be treated as a `NULL` value.
      *
      * When the user enters text into a pattern field, and after this, the control content is to be committed into the database field the control is bound
      * to, a decision must be made how to deal with empty strings. ;  This is controlled by this property.
      *
      * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
      */
    var ConvertEmptyToNull: Boolean = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlPatternFieldModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /** specifies the edit mask. */
    var EditMask: String = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /**
      * specifies whether the selection in the control should be hidden when the control is not active (focused).
      * @since OOo 2.0
      */
    var HideInactiveSelection: Boolean = js.native
    
    /** specifies the literal mask. */
    var LiteralMask: String = js.native
    
    /** specifies the maximum character count. */
    var MaxTextLen: Double = js.native
    
    /**
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /** specifies that the text is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text displayed in the control. */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
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
  
  /** This service specifies a radio button which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlRadioButtonModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, Graphic, HelpText, HelpURL, ImagePosition, ImageURL, Label, MultiLine, Printable, State, Tabstop, TextColor, TextLineColor, VerticalAlign, VisualEffect, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.RadioButton because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultState, RefValue, UncheckedRefValue */ @js.native
  trait DatabaseRadioButton extends DataAwareControlModel {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      * @since OOo 2.0
      */
    var Align: Double = js.native
    
    /** specifies the background color (RGB) of the control. */
    var BackgroundColor: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      *
      * In a group of radio buttons only one button should be checked by default.
      * @see com.sun.star.awt.UnoControlRadioButtonModel.State
      * @see com.sun.star.form.XReset
      */
    var DefaultState: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /**
      * specifies a graphic to be displayed besides the label of the control
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
    
    /**
      * specifies the position of the image, if any, relative to the text, if any
      *
      * Valid values of this property are specified with {@link ImagePosition} .
      */
    var ImagePosition: Double = js.native
    
    /**
      * specifies an URL to an image to display besides the label of the control
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
    
    /**
      * contains a reference value which is used for submission in a HTML form.
      *
      * If the form the control belongs to is to be submitted (see {@link com.sun.star.form.XSubmit} ), and the control is checked, this reference value is
      * used for submission.
      */
    var RefValue: String = js.native
    
    /**
      * specifies the state of the control.
      *
      * `; 0: not checked; 1: checked; `
      */
    var State: Double = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /**
      * specifies a value which is to be associated with the control when it's **not** selected.
      *
      * In various situations, the {@link RefValue} is associated with the control if and only if it is selected. ; {@link UncheckedRefValue} provides a
      * extensions of this concept: If present, the value should be associated with the control when it is **not** selected.
      */
    var UncheckedRefValue: String = js.native
    
    /**
      * specifies the vertical alignment of the text in the control.
      * @since OOo 2.0
      */
    var VerticalAlign: VerticalAlignment = js.native
    
    /**
      * specifies a visual effect to apply to the radio button control.
      *
      * Possible values for this property are {@link VisualEffect.FLAT} and {@link VisualEffect.LOOK3D} .
      * @see com.sun.star.awt.VisualEffect
      * @since OOo 2.0
      */
    var VisualEffect: Double = js.native
    
    /**
      * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
      *
      * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
      * @since OOo 3.1
      */
    var WritingMode: Double = js.native
  }
  
  /** This service specifies a text field which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseTextField
    extends TextField
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
    /**
      * determines if an empty text should be treated as a `NULL` value.
      *
      * When the user enters text into a text field, and after this, the control content is to be committed into the database field the control is bound to, a
      * decision must be made how to deal with empty strings. ;  This is controlled by this property.
      *
      * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
      */
    var ConvertEmptyToNull: Boolean = js.native
    
    /**
      * specifies the name of the bound database field.
      *
      * This property makes sense in the **context** of the control model only. Normally, a control model is a child of a {@link
      * com.sun.star.form.component.DataForm} , which is bound to a higher level object such as a table or query - more general, a result set. ;  This member
      * here describes the column of this result set which the control should act for.
      *
      * Not every control model can be bound to every database column. Usually, super services of the {@link DataAwareControlModel} restrict the column types
      * they can be used with.
      * @see DataAwareControlModel.BoundField
      */
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
    /**
      * references to a control model within the same document which should be used as a label.
      *
      * Any user interface action which needs to refer to the control is assumed to use this property. ;  A very common design method for forms is to group a
      * data aware control with a label control, with the latter describing the content of the former. For instance, you may have a {@link
      * com.sun.star.form.component.TextField} , which is bound to the e-mail column of your data source. Then you will probably add a {@link
      * com.sun.star.form.component.FixedText} whose label is "E-Mail", and associate it with the TextField by setting it as {@link LabelControl} . ;  Now if
      * you imagine a component offering data search in a form, this component will examine the {@link LabelControl} property, find the {@link
      * com.sun.star.form.component.FixedText} , examine it's label, and use this label to refer to the {@link com.sun.star.form.component.TextField} .
      *
      * When setting the property, a number of constraints apply: The object which is to be set has to support the following interfaces {@link
      * com.sun.star.awt.XControlModel}{@link com.sun.star.lang.XServiceInfo}{@link com.sun.star.beans.XPropertySet}{@link com.sun.star.container.XChild}It
      * has to be a part of the same document as the model who's property is to be modified.Additionally, the support of a special service, indicating that
      * the model is of the right type, is required. Which kind of service is in the request depends on the type of the control model. ;
      *
      * For instance, text fields ( {@link com.sun.star.form.component.TextField} ) can be labeled by label controls only ( {@link
      * com.sun.star.form.component.FixedText} ), and radio buttons ( {@link com.sun.star.form.component.RadioButton} ) can be labeled by group boxes ( {@link
      * com.sun.star.form.component.GroupBox} ) only.
      */
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a data-aware field for inputting a time value. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlTimeFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, MouseWheelBehavior, Printable, ReadOnly, Repeat, RepeatDelay, Spin, StrictFormat, Tabstop, Text, TextColor, TextLineColor, Time, TimeFormat, TimeMax, TimeMin, VerticalAlign, WritingMode
  - typings.activexLibreoffice.com_.sun.star.form.component.TimeField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultTime */ @js.native
  trait DatabaseTimeField extends DataAwareControlModel {
    
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
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlTimeFieldModel.Time
      * @see com.sun.star.form.XReset
      */
    var DefaultTime: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
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
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /** specifies that the date is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /**
      * specifies the text displayed in the control.
      * @since OOo 2.0
      */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies the time displayed in the control. */
    var Time: typings.activexLibreoffice.com_.sun.star.util.Time = js.native
    
    /**
      * specifies the format of the displayed time.
      *
      * `; 0:  24h short; 1:  24h long; 2:  12h short; 3:  12h long; 4:  Duration short; 5:  Duration long; `
      */
    var TimeFormat: Double = js.native
    
    /** specifies the maximum time that can be entered. */
    var TimeMax: Time = js.native
    
    /** specifies the minimum time that can be entered. */
    var TimeMin: Time = js.native
    
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
  
  /** specifies the model of a date field control, which is an edit field used to enter a date. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDateFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Date, DateFormat, DateMax, DateMin, DateShowCentury, Dropdown, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, MouseWheelBehavior, Printable, ReadOnly, Repeat, RepeatDelay, Spin, StrictFormat, Tabstop, Text, TextColor, TextLineColor, VerticalAlign, WritingMode */ @js.native
  trait DateField
    extends FormControlModel
       with XReset {
    
    /** specifies the background color(RGB) of the control. */
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
    
    /** specifies the date displayed in the control. */
    var Date: typings.activexLibreoffice.com_.sun.star.util.Date = js.native
    
    /**
      * specifies the format of the displayed date.
      *
      * `; 0:   system short; 1:   system short YY; 2:   system short YYYY; 3:   system long; 4:   short DDMMYY; 5:   short MMDDYY; 6:   short YYMMDD; 7:
      * short DDMMYYYY; 8:   short MMDDYYYY; 9:   short YYYYMMDD; 10:  short YYMMDD DIN5008; 11:  short YYYYMMDD DIN5008; `
      */
    var DateFormat: Double = js.native
    
    /** specifies the maximum date that can be entered. */
    var DateMax: Date = js.native
    
    /** specifies the minimum date that can be entered. */
    var DateMin: Date = js.native
    
    /** specifies, if the date century is displayed. */
    var DateShowCentury: Boolean = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlDateFieldModel.Date
      * @see com.sun.star.form.XReset
      */
    var DefaultDate: Double = js.native
    
    /** specifies, if the control has a dropdown button. */
    var Dropdown: Boolean = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
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
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /** specifies that the date is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /**
      * specifies the text displayed in the control.
      * @since OOo 2.0
      */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
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
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies the control model of an edit field for a file name. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlFileControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, Printable, ReadOnly, Tabstop, Text, TextColor, TextLineColor, VerticalAlign */ @js.native
  trait FileControl
    extends FormControlModel
       with XReset {
    
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
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlFileControlModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /** determines whether a control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /**
      * specifies whether the selection in the control should be hidden when the control is not active (focused).
      * @since OOo 2.0
      */
    var HideInactiveSelection: Boolean = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /**
      * specifies that the content of the control cannot be modified by the user.
      * @since OOo 1.1.2
      */
    var ReadOnly: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text displayed in the control. */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /**
      * specifies the vertical alignment of the text in the control.
      * @since OOo 3.3
      */
    var VerticalAlign: VerticalAlignment = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies the control model for a text which can be displayed, but not edited by the user.
    *
    * These kind of controls is usually used to label other controls.
    * @see com.sun.star.form.DataAwareControlModel.LabelControl
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlFixedTextModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Border, BorderColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, Label, MultiLine, NoLabel, Printable, TextColor, TextLineColor, VerticalAlign */ @js.native
  trait FixedText extends FormControlModel {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      */
    var Align: Double = js.native
    
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
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /** specifies the label of the control. */
    var Label: String = js.native
    
    /** specifies that the text may be displayed on more than one line. */
    var MultiLine: Boolean = js.native
    
    /**
      * suppresses automatic accelerator assignment on this control.
      * @since OOo 2.4
      */
    var NoLabel: Boolean = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /**
      * specifies the vertical alignment of the text in the control.
      * @since OOo 2.0
      */
    var VerticalAlign: VerticalAlignment = js.native
  }
  
  /**
    * This service specifies a form which is a group of {@link FormComponents} .
    *
    * A form fulfills several tasks, like storing the structure of its form components, storing the information concerning tab ordering and control
    * grouping, and last but not least, it provides the event environment for its contained elements.
    *
    * A form acts on the one hand like a container of {@link FormComponents} and on the other hand like a {@link FormComponent} . This generic construction
    * allows the definition of hierarchies of forms and their dependent subforms.
    * @see com.sun.star.form.FormControlModel
    */
  @js.native
  trait Form
    extends FormComponents
       with FormComponent
       with XTabControllerModel {
    
    def getPropertyValues(aPropertyNames: SeqEquiv[String]): SafeArray[_] = js.native
  }
  
  /**
    * This service specifies the control model of an edit field for entering text which can be (nearly) arbitrarily formatted.
    * @see com.sun.star.util.XNumberFormatsSupplier
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlFormattedFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Border, BorderColor, EffectiveDefault, EffectiveMax, EffectiveMin, EffectiveValue, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, FormatKey, FormatsSupplier, HelpText, HelpURL, HideInactiveSelection, MaxTextLen, MouseWheelBehavior, Printable, ReadOnly, Repeat, RepeatDelay, Spin, StrictFormat, Tabstop, Text, TextColor, TextLineColor, TreatAsNumber, VerticalAlign, WritingMode */ @js.native
  trait FormattedField
    extends FormControlModel
       with XReset {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      */
    var Align: Double = js.native
    
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
    
    /**
      * specifies the default value of the formatted field.
      *
      * This may be a numeric value (double) or a string, depending on the formatting of the field.
      */
    var EffectiveDefault: js.Any = js.native
    
    /**
      * specifies the maximum value that can be entered.
      *
      * This property is ignored if the format of the field is no numeric format.
      */
    var EffectiveMax: Double = js.native
    
    /**
      * specifies the minimum value that can be entered.
      *
      * This property is ignored if the format of the field is no numeric format.
      */
    var EffectiveMin: Double = js.native
    
    /**
      * specifies the current value of the formatted field.
      *
      * This may be a numeric value (double) or a string, depending on the formatting of the field.
      */
    var EffectiveValue: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /**
      * specifies the format to be used when formatting the field input and output.
      *
      * This value is meaningful relative to the FormatsSupplier property only.
      */
    var FormatKey: Double = js.native
    
    /** supplies the formats the field should work with. */
    var FormatsSupplier: XNumberFormatsSupplier = js.native
    
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
      * specifies the maximum character count.
      *
      * There's no limitation, if set to 0.
      */
    var MaxTextLen: Double = js.native
    
    /**
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /**
      * specifies that the text is checked during the user input.
      *
      * This property is optional - not every component implementing this service is required to provide it, as real-time input checking on a formatted field
      * may be pretty expensive.
      */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text displayed in the control. */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies that the text is treated as a number. */
    var TreatAsNumber: Boolean = js.native
    
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
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * specifies a model for a control which can display form data in a table-like way.
    *
    * In opposite to other form controls, grid controls do not only display the single current value of a column they are bound to. Moreover, they do
    * display not only the current row of the form, but all rows (at least potentially, limited by the control size, of course).
    *
    * The table rows in a grid control correspond to the rows in the {@link DataForm} the control belongs to, and the columns correspond to single columns
    * of the form's row set.
    *
    * Columns of a grid control are modeled by own objects, too. They are very similar to usual com::sun::star::form::DataAwareControlModels modeling other
    * "single-value" controls, but they are not described as own services. Instead, they need to be created using the {@link
    * com.sun.star.form.XGridColumnFactory} interface.
    */
  @js.native
  trait GridControl
    extends FormControlModel
       with FormComponents
       with XGridColumnFactory
       with XSelectionSupplier
       with XReset {
    
    /**
      * returns the border style of the control.
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
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** contains the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /**
      * specifies the height of a row of the grid.
      *
      * If the value is set to `NULL` , the height is determined automatically according to the current font used.
      * @see GridControl.FontDescriptor
      */
    var RowHeight: Double = js.native
    
    /** determines whether the control can be reached by the tabulator key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a model for a control which can be used to visually group controls. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlGroupBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, Label, Printable, TextColor, TextLineColor, WritingMode */ @js.native
  trait GroupBox extends FormControlModel {
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /** specifies the label of the control. */
    var Label: String = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /**
      * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
      *
      * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
      * @since OOo 3.1
      */
    var WritingMode: Double = js.native
  }
  
  /**
    * This service specifies the special kind of {@link Forms} for HTML documents.
    *
    * An {@link HTMLForm} fulfills the specification of forms in HTML. It supplies the possibility of submitting or resetting the contents of a form. For
    * more information on HTML forms, please see the documentation of HTML.
    */
  @js.native
  trait HTMLForm
    extends Form
       with XReset
       with XSubmit {
    
    /** specifies the kind of encoding for submission. */
    var SubmitEncoding: FormSubmitEncoding = js.native
    
    /** specifies the kind of submission. */
    var SubmitMethod: FormSubmitMethod = js.native
    
    /** describes the frame, where to open the document specified by the TargetURL. */
    var TargetFrame: String = js.native
    
    /** specifies the URL, which should be used for submission. */
    var TargetURL: String = js.native
  }
  
  /**
    * This service specifies the model of a hidden control.
    *
    * The only sense of a hidden control is to store data in the form which is not visible to the user.
    *
    * Usually, hidden controls are used in com::sun::star::form::component::HTMLForms, where they contain data which is to be submitted. ;  Nevertheless,
    * you can use them in your own forms for storing any data, for instance to evaluate it in some scripting macro.
    */
  @js.native
  trait HiddenControl extends FormComponent {
    
    /** specifies the value of the component. */
    var HiddenValue: String = js.native
    
    def getPropertyValues(aPropertyNames: SeqEquiv[String]): SafeArray[_] = js.native
  }
  
  /**
    * This service specifies the control model for a clickable button which is represented by an image.
    *
    * The image to be displayed is determined by {@link com.sun.star.awt.UnoControlImageControlModel.ImageURL} property specifies the URL of an image to be
    * displayed.
    * @see CommandButton
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlImageControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Enabled, Graphic, HelpText, HelpURL, ImageURL, Printable, ScaleImage, ScaleMode, Tabstop */ @js.native
  trait ImageButton
    extends FormControlModel
       with XImageProducerSupplier {
    
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
    
    /** describes the action to be executed by the button when pressed. */
    var ButtonType: FormButtonType = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /**
      * specifies a graphic to be displayed on the control
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
    
    /**
      * specifies an URL to an image to use for the control.
      * @see Graphic
      */
    var ImageURL: String = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies if the image is automatically scaled to the size of the control. */
    var ScaleImage: Boolean = js.native
    
    /**
      * defines how to scale the image
      *
      * If this property is present, it supersedes the {@link ScaleImage} property.
      *
      * The value of this property is one of the {@link ImageScaleMode} constants.
      * @since OOo 3.1
      */
    var ScaleMode: Double = js.native
    
    /**
      * specifies that the control can be reached with the TAB key.
      * @since OOo 1.1.2
      */
    var Tabstop: Boolean = js.native
    
    /**
      * describes the frame, where to open the document specified by the TargetURL.
      *
      * This property is evaluated if the button is of type URL.
      *
      * As always, there is a number of target names which have a special meaning, and force a special {@link com.sun.star.frame.Frame} to be used.
      */
    var TargetFrame: String = js.native
    
    /**
      * specifies the URL, which should be opened if the button was clicked.
      *
      * This property is evaluated if the button is of type URL.
      * @see com.sun.star.form.FormButtonType
      */
    var TargetURL: String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies a model for a control which allows to choose in a list of alternative values. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlListBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Border, BorderColor, Dropdown, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, ItemSeparatorPos, LineCount, MouseWheelBehavior, MultiSelection, Printable, ReadOnly, SelectedItems, StringItemList, Tabstop, TextColor, TextLineColor, WritingMode */ @js.native
  trait ListBox
    extends FormControlModel
       with XReset
       with XItemList {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      */
    var Align: Double = js.native
    
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
    
    /**
      * contains the indexes of entries of the listbox, which should selected by default.
      *
      * This selection is used initially or for a reset.
      * @see com.sun.star.awt.UnoControlListBoxModel.SelectedItems
      * @see com.sun.star.form.XReset
      */
    var DefaultSelection: SafeArray[Double] = js.native
    
    /** specifies if the control has a drop down button. */
    var Dropdown: Boolean = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /**
      * specifies where an item separator - a horizontal line - is drawn.
      *
      * If this is not `NULL` , then a horizontal line will be drawn between the item at the given position, and the following item.
      * @since OOo 3.3
      */
    var ItemSeparatorPos: Double = js.native
    
    /** specifies the maximum line count displayed in the drop down box. */
    var LineCount: Double = js.native
    
    /** contains the values associated to the strings to be displayed (which are specified by {@link com.sun.star.awt.UnoControlListBoxModel.StringItemList} ) */
    var ListSource: SafeArray[String] = js.native
    
    /**
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel scroll through the control's entry list. Using this property, and one of the {@link MouseWheelBehavior} constants, you can
      * control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies if more than one entry can be selected. */
    var MultiSelection: Boolean = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /** specifies the sequence of selected items, identified by the position. */
    var SelectedItems: SafeArray[Double] = js.native
    
    /** specifies the list of items. */
    var StringItemList: SafeArray[String] = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /**
      * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
      *
      * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
      * @since OOo 3.1
      */
    var WritingMode: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies the model for control which provides controller functionality for a {@link DataForm} , such as navigating or filtering the
    * form.
    */
  @js.native
  trait NavigationToolBar extends FormControlModel {
    
    /**
      * denotes the border style of the control.
      *
      * Allowed values are **0** : no border at all**1** : 3D border**2** : simple flat
      */
    var Border: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** contains the font attributes for the text in the control */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /**
      * specifies the emphasis mark for the font described in {@link FontDescriptor}
      *
      * The value must be one of the {@link com.sun.star.text.FontEmphasis} constants.
      */
    var FontEmphasisMark: Double = js.native
    
    /**
      * specifies the relief for the font described in {@link FontDescriptor}
      *
      * The value must be one of the {@link com.sun.star.text.FontRelief} constants.
      */
    var FontRelief: Double = js.native
    
    /**
      * specifies the size of the icons in the control
      *
      * At least the following values are to be supported: 0: small icons (16x16)1: medium size icons (26x26)
      */
    var IconSize: Double = js.native
    
    /**
      * specifies a repeat delay for the control
      *
      * Some buttons of a {@link NavigationToolBar} may show repeating behavior, e.g. may be repeatedly triggered when the user keeps the mouse pressed over
      * such a button. ;  The delay between two such triggers (in milliseconds) is specified with this property.
      */
    var RepeatDelay: Double = js.native
    
    /** determines whether the control should provide functionality for filtering and sorting the parent form */
    var ShowFilterSort: Boolean = js.native
    
    /** determines whether the control should provide functionality for navigating the parent form */
    var ShowNavigation: Boolean = js.native
    
    /** determines whether the control should provide functionality for positioning the parent form */
    var ShowPosition: Boolean = js.native
    
    /** determines whether the control should provide functionality for acting on the current record of the parent form */
    var ShowRecordActions: Boolean = js.native
    
    /** specifies the text color (as RGB value) of the control. */
    var TextColor: Double = js.native
    
    /**
      * specifies the text line color (as RGB value) of the control.
      *
      * This color is used if the {@link FontDescriptor} defines that the text in the control should be underlined or stroke out.
      */
    var TextLineColor: Double = js.native
  }
  
  /** specifies a component which allows the input of a numeric value. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlNumericFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, DecimalAccuracy, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, MouseWheelBehavior, Printable, ReadOnly, Repeat, RepeatDelay, ShowThousandsSeparator, Spin, StrictFormat, Tabstop, TextColor, TextLineColor, Value, ValueMax, ValueMin, ValueStep, VerticalAlign, WritingMode */ @js.native
  trait NumericField
    extends FormControlModel
       with XReset {
    
    /** specifies the background color(RGB) of the control. */
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
    
    /** specifies the decimal accuracy. */
    var DecimalAccuracy: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlNumericFieldModel.Value
      * @see com.sun.star.form.XReset
      */
    var DefaultValue: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
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
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies whether the thousands separator is to be displayed. */
    var ShowThousandsSeparator: Boolean = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /** specifies that the value is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies the value displayed in the control. */
    var Value: Double = js.native
    
    /** specifies the maximum value that can be entered. */
    var ValueMax: Double = js.native
    
    /** specifies the minimum value that can be entered. */
    var ValueMin: Double = js.native
    
    /** specifies the value step when using the spin button. */
    var ValueStep: Double = js.native
    
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
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies a component which allows the input of text which matches a specific pattern. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlPatternFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, EditMask, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, LiteralMask, MaxTextLen, MouseWheelBehavior, Printable, ReadOnly, StrictFormat, Tabstop, Text, TextColor, TextLineColor, VerticalAlign, WritingMode */ @js.native
  trait PatternField
    extends FormControlModel
       with XReset {
    
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
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlPatternFieldModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /** specifies the edit mask. */
    var EditMask: String = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /**
      * specifies whether the selection in the control should be hidden when the control is not active (focused).
      * @since OOo 2.0
      */
    var HideInactiveSelection: Boolean = js.native
    
    /** specifies the literal mask. */
    var LiteralMask: String = js.native
    
    /** specifies the maximum character count. */
    var MaxTextLen: Double = js.native
    
    /**
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /** specifies that the text is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text displayed in the control. */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
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
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * specifies a component which acts as a radio button as needed in HTMLForms.
    *
    * Radio buttons are controls which can be grouped together, and in every group, only one of the controls can be check. This means if one of them is
    * checked by a user interaction, all other controls in the same group are automatically unchecked
    *
    * Like in HTML, radio buttons are grouped together if and only if they have the same name (see {@link com.sun.star.form.FormComponent.Name} ).
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlRadioButtonModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, Graphic, HelpText, HelpURL, ImagePosition, ImageURL, Label, MultiLine, Printable, State, Tabstop, TextColor, TextLineColor, VerticalAlign, VisualEffect, WritingMode */ @js.native
  trait RadioButton
    extends FormControlModel
       with XReset {
    
    /**
      * specifies the horizontal alignment of the text in the control.
      *
      * `; 0: left; 1: center; 2: right; `
      * @since OOo 2.0
      */
    var Align: Double = js.native
    
    /** specifies the background color (RGB) of the control. */
    var BackgroundColor: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      *
      * In a group of radio buttons only one button should be checked by default.
      * @see com.sun.star.awt.UnoControlRadioButtonModel.State
      * @see com.sun.star.form.XReset
      */
    var DefaultState: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
    /**
      * specifies a graphic to be displayed besides the label of the control
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
    
    /**
      * specifies the position of the image, if any, relative to the text, if any
      *
      * Valid values of this property are specified with {@link ImagePosition} .
      */
    var ImagePosition: Double = js.native
    
    /**
      * specifies an URL to an image to display besides the label of the control
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
    
    /**
      * contains a reference value which is used for submission in a HTML form.
      *
      * If the form the control belongs to is to be submitted (see {@link com.sun.star.form.XSubmit} ), and the control is checked, this reference value is
      * used for submission.
      */
    var RefValue: String = js.native
    
    /**
      * specifies the state of the control.
      *
      * `; 0: not checked; 1: checked; `
      */
    var State: Double = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /**
      * specifies a value which is to be associated with the control when it's **not** selected.
      *
      * In various situations, the {@link RefValue} is associated with the control if and only if it is selected. ; {@link UncheckedRefValue} provides a
      * extensions of this concept: If present, the value should be associated with the control when it is **not** selected.
      */
    var UncheckedRefValue: String = js.native
    
    /**
      * specifies the vertical alignment of the text in the control.
      * @since OOo 2.0
      */
    var VerticalAlign: VerticalAlignment = js.native
    
    /**
      * specifies a visual effect to apply to the radio button control.
      *
      * Possible values for this property are {@link VisualEffect.FLAT} and {@link VisualEffect.LOOK3D} .
      * @see com.sun.star.awt.VisualEffect
      * @since OOo 2.0
      */
    var VisualEffect: Double = js.native
    
    /**
      * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
      *
      * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
      * @since OOo 3.1
      */
    var WritingMode: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies a component which extends the {@link com.sun.star.awt.UnoControlEditModel} with capabilities to display and input formatted text. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesComplex because var conflicts: WritingMode. Inlined 
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.text.TextRange because var conflicts: WritingMode. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlEditModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, AutoHScroll, AutoVScroll, BackgroundColor, Border, BorderColor, EchoChar, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HardLineBreaks, HelpText, HelpURL, HideInactiveSelection, HScroll, LineEndFormat, MaxTextLen, MultiLine, PaintTransparent, Printable, ReadOnly, Tabstop, Text, TextColor, TextLineColor, VerticalAlign, VScroll, WritingMode */ @js.native
  trait RichTextControl
    extends FormControlModel
       with XTextRange
       with XContentEnumerationAccess
       with CharacterProperties
       with CharacterPropertiesAsian
       with CharacterPropertiesComplex
       with ParagraphProperties
       with ParagraphPropertiesAsian {
    
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
    
    /**
      * specifies whether text should be automatically wrapped to fit into the control.
      *
      * If set to `TRUE` , users need to manually press the enter key to insert a line break. If set to `FALSE` , text is automatically wrapped at the control
      * border.
      */
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
    
    /**
      * specifies whether the control should display the text including all its formatting.
      *
      * If this is set to `FALSE` , the control will act as ordinary {@link com.sun.star.awt.UnoControlEditModel} .
      *
      * If the property is set to `TRUE` , the control will ignore the following properties: {@link com.sun.star.awt.UnoControlEditModel.EchoChar}{@link
      * com.sun.star.awt.UnoControlEditModel.MaxTextLen}{@link com.sun.star.awt.UnoControlEditModel.MultiLine}{@link
      * com.sun.star.awt.UnoControlEditModel.Align}
      */
    var RichText: Boolean = js.native
    
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
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies the model of a scroll bar control. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlScrollBarModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, BlockIncrement, Border, BorderColor, Enabled, HelpText, HelpURL, LineIncrement, LiveScroll, Orientation, Printable, RepeatDelay, ScrollValue, ScrollValueMax, ScrollValueMin, SymbolColor, Tabstop, VisibleSize */ @js.native
  trait ScrollBar
    extends FormControlModel
       with XReset {
    
    /**
      * specifies the RGB color to be used for the control.
      * @since OOo 2.0
      */
    var BackgroundColor: Color = js.native
    
    /** specifies the increment for a block move. */
    var BlockIncrement: Double = js.native
    
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
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlScrollBarModel.ScrollValue
      * @see com.sun.star.form.XReset
      */
    var DefaultScrollValue: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /** specifies the increment for a single line move. */
    var LineIncrement: Double = js.native
    
    /**
      * specifies the scrolling behavior of the control.
      *
      * `TRUE` means, that when the user moves the slider in the scroll bar, the content of the window is updated immediately. `FALSE` means, that the window
      * is only updated after the user has released the mouse button.
      * @since OOo 2.0
      */
    var LiveScroll: Boolean = js.native
    
    /** specifies the {@link ScrollBarOrientation} of the control. */
    var Orientation: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as scrolling the scrollbar), then usual control implementations
      * allow to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies the scroll value of the control. */
    var ScrollValue: Double = js.native
    
    /** specifies the maximum scroll value of the control. */
    var ScrollValueMax: Double = js.native
    
    /**
      * specifies the minimum scroll value of the control.
      *
      * If this optional property is not present, clients of the component should assume a minimal scroll value of 0.
      */
    var ScrollValueMin: Double = js.native
    
    /**
      * specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons.
      * @since OOo 2.0
      */
    var SymbolColor: Color = js.native
    
    /**
      * specifies that the control can be reached with the TAB key.
      * @since OOo 2.0
      */
    var Tabstop: Boolean = js.native
    
    /** specifies the visible size of the scroll bar. */
    var VisibleSize: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies the model of a scroll bar control. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlSpinButtonModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Enabled, HelpText, HelpURL, MouseWheelBehavior, Orientation, Printable, Repeat, RepeatDelay, SpinIncrement, SpinValue, SpinValueMax, SpinValueMin, SymbolColor */ @js.native
  trait SpinButton
    extends FormControlModel
       with XReset {
    
    /** specifies the RGB color to be used for the control */
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
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlSpinButtonModel.SpinValue
      * @see com.sun.star.form.XReset
      */
    var DefaultSpinValue: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the help text of the control. */
    var HelpText: String = js.native
    
    /** specifies the help URL of the control. */
    var HelpURL: String = js.native
    
    /**
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies the {@link ScrollBarOrientation} of the control. */
    var Orientation: Double = js.native
    
    /** specifies whether the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed. */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      */
    var RepeatDelay: Double = js.native
    
    /** specifies the increment by which the value is changed when using operating the spin button. */
    var SpinIncrement: Double = js.native
    
    /** specifies the current value of the control. */
    var SpinValue: Double = js.native
    
    /** specifies the maximum value of the control. */
    var SpinValueMax: Double = js.native
    
    /** specifies the minimum value of the control. */
    var SpinValueMin: Double = js.native
    
    /** specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons. */
    var SymbolColor: Color = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * specifies the control model for a button, part of a form component hierarchy, which can be bound to external submissions.
    * @see CommandButton
    */
  @js.native
  trait SubmitButton
    extends FormControlModel
       with XSubmissionSupplier {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies a component which allows the input of text, either single- or multi-line. */
  @js.native
  trait TextField
    extends RichTextControl
       with XReset {
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlEditModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies the control model for a field which can be used to input time values. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlTimeFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, MouseWheelBehavior, Printable, ReadOnly, Repeat, RepeatDelay, Spin, StrictFormat, Tabstop, Text, TextColor, TextLineColor, Time, TimeFormat, TimeMax, TimeMin, VerticalAlign, WritingMode */ @js.native
  trait TimeField
    extends FormControlModel
       with XReset {
    
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
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlTimeFieldModel.Time
      * @see com.sun.star.form.XReset
      */
    var DefaultTime: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** specifies the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
    var FontEmphasisMark: Double = js.native
    
    /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
    var FontRelief: Double = js.native
    
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
      * defines how the mouse wheel can be used to scroll through the control's content.
      *
      * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
      * you can control under which circumstances this is possible.
      */
    var MouseWheelBehavior: Double = js.native
    
    /** specifies that the control will be printed with the document. */
    var Printable: Boolean = js.native
    
    /** specifies that the content of the control cannot be modified by the user. */
    var ReadOnly: Boolean = js.native
    
    /**
      * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
      * @since OOo 2.0
      */
    var Repeat: Boolean = js.native
    
    /**
      * specifies the mouse repeat delay, in milliseconds.
      *
      * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
      * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
      * specified with this property.
      * @since OOo 2.0
      */
    var RepeatDelay: Double = js.native
    
    /** specifies that the control has a spin button. */
    var Spin: Boolean = js.native
    
    /** specifies that the date is checked during the user input. */
    var StrictFormat: Boolean = js.native
    
    /** specifies that the control can be reached with the TAB key. */
    var Tabstop: Boolean = js.native
    
    /**
      * specifies the text displayed in the control.
      * @since OOo 2.0
      */
    var Text: String = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /** specifies the text line color (RGB) of the control. */
    var TextLineColor: Color = js.native
    
    /** specifies the time displayed in the control. */
    var Time: typings.activexLibreoffice.com_.sun.star.util.Time = js.native
    
    /**
      * specifies the format of the displayed time.
      *
      * `; 0:  24h short; 1:  24h long; 2:  12h short; 3:  12h long; 4:  Duration short; 5:  Duration long; `
      */
    var TimeFormat: Double = js.native
    
    /** specifies the maximum time that can be entered. */
    var TimeMax: Time = js.native
    
    /** specifies the minimum time that can be entered. */
    var TimeMin: Time = js.native
    
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
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
}
