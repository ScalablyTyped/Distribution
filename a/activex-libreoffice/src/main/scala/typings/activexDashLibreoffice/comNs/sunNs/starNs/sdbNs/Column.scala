package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the common properties of a database column. */
trait Column
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.Column
     with ColumnSettings

object Column {
  @scala.inline
  def apply(
    Align: Double,
    ControlDefault: String,
    ControlModel: XPropertySet,
    DefaultValue: String,
    Description: String,
    FormatKey: Double,
    HelpText: String,
    Hidden: Boolean,
    IsAutoIncrement: Boolean,
    IsCurrency: Boolean,
    IsNullable: Double,
    IsRowVersion: Boolean,
    Name: String,
    Position: Double,
    Precision: Double,
    PropertySetInfo: XPropertySetInfo,
    Scale: Double,
    Type: Double,
    TypeName: String,
    Width: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Column = {
    val __obj = js.Dynamic.literal(Align = Align, ControlDefault = ControlDefault, ControlModel = ControlModel, DefaultValue = DefaultValue, Description = Description, FormatKey = FormatKey, HelpText = HelpText, Hidden = Hidden, IsAutoIncrement = IsAutoIncrement, IsCurrency = IsCurrency, IsNullable = IsNullable, IsRowVersion = IsRowVersion, Name = Name, Position = Position, Precision = Precision, PropertySetInfo = PropertySetInfo, Scale = Scale, Type = Type, TypeName = TypeName, Width = Width, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Column]
  }
}

