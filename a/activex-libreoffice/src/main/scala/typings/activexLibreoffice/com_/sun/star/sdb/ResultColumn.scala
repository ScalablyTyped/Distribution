package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a column of a result set. */
trait ResultColumn
  extends typings.activexLibreoffice.com_.sun.star.sdbcx.Column
     with ColumnSettings {
  /** gets a column's table's catalog name. */
  var CatalogName: String
  /** indicates the column's normal max width in chars. */
  var DisplaySize: Double
  /** indicates that a column is case sensitive. */
  var IsCaseSensitive: Boolean
  /** indicates whether a write on the column will definitely succeed. */
  var IsDefinitelyWritable: Boolean
  /** indicates whether a column is definitely, not writable. */
  var IsReadOnly: Boolean
  /** indicates whether the column can be used in a Where clause. */
  var IsSearchable: Boolean
  /** indicates whether values in the column are signed numbers. */
  var IsSigned: Boolean
  /** indicates whether it is possible for a write on the column to succeed. */
  var IsWritable: Boolean
  /** gets the suggested column title for use in printouts and displays. */
  var Label: String
  /** gets a column's schema name. */
  var SchemaName: String
  /**
    * returns the fully-qualified name of the service whose instances are manufactured if the method {@link com.sun.star.sdbc.XRow.getObject} )= is called
    * to retrieve a value from the column.
    */
  var ServiceName: String
  /** gets a column's table name. */
  var TableName: String
}

object ResultColumn {
  @scala.inline
  def apply(
    Align: Double,
    CatalogName: String,
    ControlDefault: String,
    ControlModel: XPropertySet,
    DefaultValue: String,
    Description: String,
    DisplaySize: Double,
    FormatKey: Double,
    HelpText: String,
    Hidden: Boolean,
    IsAutoIncrement: Boolean,
    IsCaseSensitive: Boolean,
    IsCurrency: Boolean,
    IsDefinitelyWritable: Boolean,
    IsNullable: Double,
    IsReadOnly: Boolean,
    IsRowVersion: Boolean,
    IsSearchable: Boolean,
    IsSigned: Boolean,
    IsWritable: Boolean,
    Label: String,
    Name: String,
    Position: Double,
    Precision: Double,
    PropertySetInfo: XPropertySetInfo,
    Scale: Double,
    SchemaName: String,
    ServiceName: String,
    TableName: String,
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
  ): ResultColumn = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], CatalogName = CatalogName.asInstanceOf[js.Any], ControlDefault = ControlDefault.asInstanceOf[js.Any], ControlModel = ControlModel.asInstanceOf[js.Any], DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplaySize = DisplaySize.asInstanceOf[js.Any], FormatKey = FormatKey.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAutoIncrement = IsAutoIncrement.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], IsCurrency = IsCurrency.asInstanceOf[js.Any], IsDefinitelyWritable = IsDefinitelyWritable.asInstanceOf[js.Any], IsNullable = IsNullable.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsRowVersion = IsRowVersion.asInstanceOf[js.Any], IsSearchable = IsSearchable.asInstanceOf[js.Any], IsSigned = IsSigned.asInstanceOf[js.Any], IsWritable = IsWritable.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ResultColumn]
  }
}

