package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the standard model of an {@link UnoControlSpinButton} .
  *
  * A spin button is a control which has a numeric value associated with it, and allows to change this value using two spin buttons.
  *
  * A spin button is similar to a scroll bar, but it usually has no (own) visual representation of the associated value, but is used to propagate its
  * value to other controls.
  * @see UnoControlScrollBarModel
  */
trait UnoControlSpinButtonModel extends UnoControlModel {
  /** specifies the RGB color to be used for the control */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: scala.Double
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: scala.Double
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
    * you can control under which circumstances this is possible.
    */
  var MouseWheelBehavior: scala.Double
  /** specifies the {@link ScrollBarOrientation} of the control. */
  var Orientation: scala.Double
  /** specifies whether the control will be printed with the document. */
  var Printable: scala.Boolean
  /** specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed. */
  var Repeat: scala.Boolean
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    */
  var RepeatDelay: scala.Double
  /** specifies the increment by which the value is changed when using operating the spin button. */
  var SpinIncrement: scala.Double
  /** specifies the current value of the control. */
  var SpinValue: scala.Double
  /** specifies the maximum value of the control. */
  var SpinValueMax: scala.Double
  /** specifies the minimum value of the control. */
  var SpinValueMin: scala.Double
  /** specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons. */
  var SymbolColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
}

object UnoControlSpinButtonModel {
  @scala.inline
  def apply(
    BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Border: scala.Double,
    BorderColor: scala.Double,
    DefaultControl: java.lang.String,
    Enabled: scala.Boolean,
    Height: scala.Double,
    HelpText: java.lang.String,
    HelpURL: java.lang.String,
    MouseWheelBehavior: scala.Double,
    Name: java.lang.String,
    Orientation: scala.Double,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Repeat: scala.Boolean,
    RepeatDelay: scala.Double,
    ServiceName: java.lang.String,
    SpinIncrement: scala.Double,
    SpinValue: scala.Double,
    SpinValueMax: scala.Double,
    SpinValueMin: scala.Double,
    Step: scala.Double,
    SymbolColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TabIndex: scala.Double,
    Tag: java.lang.String,
    Width: scala.Double,
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
  ): UnoControlSpinButtonModel = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor, Border = Border, BorderColor = BorderColor, DefaultControl = DefaultControl, Enabled = Enabled, Height = Height, HelpText = HelpText, HelpURL = HelpURL, MouseWheelBehavior = MouseWheelBehavior, Name = Name, Orientation = Orientation, PositionX = PositionX, PositionY = PositionY, Printable = Printable, PropertySetInfo = PropertySetInfo, Repeat = Repeat, RepeatDelay = RepeatDelay, ServiceName = ServiceName, SpinIncrement = SpinIncrement, SpinValue = SpinValue, SpinValueMax = SpinValueMax, SpinValueMin = SpinValueMin, Step = Step, SymbolColor = SymbolColor, TabIndex = TabIndex, Tag = Tag, Width = Width, acquire = acquire, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, dispose = dispose, firePropertiesChangeEvent = firePropertiesChangeEvent, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getServiceName = getServiceName, queryInterface = queryInterface, read = read, release = release, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, write = write)
  
    __obj.asInstanceOf[UnoControlSpinButtonModel]
  }
}

