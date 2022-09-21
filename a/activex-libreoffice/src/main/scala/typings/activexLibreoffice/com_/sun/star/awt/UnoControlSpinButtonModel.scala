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
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the standard model of an {@link UnoControlSpinButton} .
  *
  * A spin button is a control which has a numeric value associated with it, and allows to change this value using two spin buttons.
  *
  * A spin button is similar to a scroll bar, but it usually has no (own) visual representation of the associated value, but is used to propagate its
  * value to other controls.
  * @see UnoControlScrollBarModel
  */
trait UnoControlSpinButtonModel
  extends StObject
     with UnoControlModel {
  
  /** specifies the RGB color to be used for the control */
  var BackgroundColor: Color
  
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double
  
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double
  
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean
  
  /** specifies the help text of the control. */
  var HelpText: String
  
  /** specifies the help URL of the control. */
  var HelpURL: String
  
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
    * you can control under which circumstances this is possible.
    */
  var MouseWheelBehavior: Double
  
  /** specifies the {@link ScrollBarOrientation} of the control. */
  var Orientation: Double
  
  /** specifies whether the control will be printed with the document. */
  var Printable: Boolean
  
  /** specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed. */
  var Repeat: Boolean
  
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    */
  var RepeatDelay: Double
  
  /** specifies the increment by which the value is changed when using operating the spin button. */
  var SpinIncrement: Double
  
  /** specifies the current value of the control. */
  var SpinValue: Double
  
  /** specifies the maximum value of the control. */
  var SpinValueMax: Double
  
  /** specifies the minimum value of the control. */
  var SpinValueMin: Double
  
  /** specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons. */
  var SymbolColor: Color
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object UnoControlSpinButtonModel {
  
  inline def apply(
    BackgroundColor: Color,
    Border: Double,
    BorderColor: Double,
    DefaultControl: String,
    Enabled: Boolean,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    MouseWheelBehavior: Double,
    Name: String,
    Orientation: Double,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    Repeat: Boolean,
    RepeatDelay: Double,
    ServiceName: String,
    SpinIncrement: Double,
    SpinValue: Double,
    SpinValueMax: Double,
    SpinValueMin: Double,
    Step: Double,
    SymbolColor: Color,
    TabIndex: Double,
    Tag: String,
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
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    getServiceName: () => String,
    queryInterface: `type` => Any,
    read: XObjectInputStream => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Unit,
    write: XObjectOutputStream => Unit
  ): UnoControlSpinButtonModel = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], MouseWheelBehavior = MouseWheelBehavior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], RepeatDelay = RepeatDelay.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], SpinIncrement = SpinIncrement.asInstanceOf[js.Any], SpinValue = SpinValue.asInstanceOf[js.Any], SpinValueMax = SpinValueMax.asInstanceOf[js.Any], SpinValueMin = SpinValueMin.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], SymbolColor = SymbolColor.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[UnoControlSpinButtonModel]
  }
  
  extension [Self <: UnoControlSpinButtonModel](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Double): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    
    inline def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    inline def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelBehavior(value: Double): Self = StObject.set(x, "MouseWheelBehavior", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setPrintable(value: Boolean): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "Repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "RepeatDelay", value.asInstanceOf[js.Any])
    
    inline def setSpinIncrement(value: Double): Self = StObject.set(x, "SpinIncrement", value.asInstanceOf[js.Any])
    
    inline def setSpinValue(value: Double): Self = StObject.set(x, "SpinValue", value.asInstanceOf[js.Any])
    
    inline def setSpinValueMax(value: Double): Self = StObject.set(x, "SpinValueMax", value.asInstanceOf[js.Any])
    
    inline def setSpinValueMin(value: Double): Self = StObject.set(x, "SpinValueMin", value.asInstanceOf[js.Any])
    
    inline def setSymbolColor(value: Color): Self = StObject.set(x, "SymbolColor", value.asInstanceOf[js.Any])
  }
}
