package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** adds a property to specify the referenced column. This is used to specify foreign keys. */
trait KeyColumn extends Column {
  /** is the name of a reference column out of the referenced table. */
  var RelatedColumn: java.lang.String
}

object KeyColumn {
  @scala.inline
  def apply(
    DefaultValue: java.lang.String,
    Description: java.lang.String,
    IsAutoIncrement: scala.Boolean,
    IsCurrency: scala.Boolean,
    IsNullable: scala.Double,
    IsRowVersion: scala.Boolean,
    Name: java.lang.String,
    Precision: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RelatedColumn: java.lang.String,
    Scale: scala.Double,
    Type: scala.Double,
    TypeName: java.lang.String,
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
  ): KeyColumn = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue, Description = Description, IsAutoIncrement = IsAutoIncrement, IsCurrency = IsCurrency, IsNullable = IsNullable, IsRowVersion = IsRowVersion, Name = Name, Precision = Precision, PropertySetInfo = PropertySetInfo, RelatedColumn = RelatedColumn, Scale = Scale, Type = Type, TypeName = TypeName, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createDataDescriptor = createDataDescriptor, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[KeyColumn]
  }
}

