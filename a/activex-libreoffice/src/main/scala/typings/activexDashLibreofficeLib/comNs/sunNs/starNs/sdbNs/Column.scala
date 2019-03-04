package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the common properties of a database column. */
trait Column
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Column
     with ColumnSettings

object Column {
  @scala.inline
  def apply(
    Align: scala.Double,
    ControlDefault: java.lang.String,
    ControlModel: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    DefaultValue: java.lang.String,
    Description: java.lang.String,
    FormatKey: scala.Double,
    HelpText: java.lang.String,
    Hidden: scala.Boolean,
    IsAutoIncrement: scala.Boolean,
    IsCurrency: scala.Boolean,
    IsNullable: scala.Double,
    IsRowVersion: scala.Boolean,
    Name: java.lang.String,
    Position: scala.Double,
    Precision: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Scale: scala.Double,
    Type: scala.Double,
    TypeName: java.lang.String,
    Width: scala.Double,
    acquire: js.Function0[scala.Unit],
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
    createDataDescriptor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): Column = {
    val __obj = js.Dynamic.literal(Align = Align, ControlDefault = ControlDefault, ControlModel = ControlModel, DefaultValue = DefaultValue, Description = Description, FormatKey = FormatKey, HelpText = HelpText, Hidden = Hidden, IsAutoIncrement = IsAutoIncrement, IsCurrency = IsCurrency, IsNullable = IsNullable, IsRowVersion = IsRowVersion, Name = Name, Position = Position, Precision = Precision, PropertySetInfo = PropertySetInfo, Scale = Scale, Type = Type, TypeName = TypeName, Width = Width, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createDataDescriptor = createDataDescriptor, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Column]
  }
}

