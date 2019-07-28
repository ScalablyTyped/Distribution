package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XObjectInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XObjectOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlProgressBar} . */
trait UnoControlProgressBarModel extends UnoControlModel {
  /** specifies the background color (RGB) of the control. */
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
  /** specifies the fill color (RGB) of the control. */
  var FillColor: Color
  /** specifies the help text of the control. */
  var HelpText: String
  /** specifies the help URL of the control. */
  var HelpURL: String
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean
  /** specifies the progress value of the control. */
  var ProgressValue: Double
  /** specifies the maximum progress value of the control. */
  var ProgressValueMax: Double
  /** specifies the minimum progress value of the control. */
  var ProgressValueMin: Double
}

object UnoControlProgressBarModel {
  @scala.inline
  def apply(
    BackgroundColor: Color,
    Border: Double,
    BorderColor: Double,
    DefaultControl: String,
    Enabled: Boolean,
    FillColor: Color,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    Name: String,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    ProgressValue: Double,
    ProgressValueMax: Double,
    ProgressValueMin: Double,
    PropertySetInfo: XPropertySetInfo,
    ServiceName: String,
    Step: Double,
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
  ): UnoControlProgressBarModel = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor, Border = Border, BorderColor = BorderColor, DefaultControl = DefaultControl, Enabled = Enabled, FillColor = FillColor, Height = Height, HelpText = HelpText, HelpURL = HelpURL, Name = Name, PositionX = PositionX, PositionY = PositionY, Printable = Printable, ProgressValue = ProgressValue, ProgressValueMax = ProgressValueMax, ProgressValueMin = ProgressValueMin, PropertySetInfo = PropertySetInfo, ServiceName = ServiceName, Step = Step, TabIndex = TabIndex, Tag = Tag, Width = Width, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[UnoControlProgressBarModel]
  }
}

