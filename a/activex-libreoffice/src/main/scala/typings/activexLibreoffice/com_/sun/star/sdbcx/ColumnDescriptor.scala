package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the common properties of a database column. Could be used for the creation of a database columns within a table.
  * @see com.sun.star.sdbcx.Column
  * @see com.sun.star.sdbcx.Table
  */
@js.native
trait ColumnDescriptor extends Descriptor {
  
  /** specifies how to create an auto-increment column. */
  var AutoIncrementCreation: String = js.native
  
  /** keeps a default value for a column, is provided as string. */
  var DefaultValue: String = js.native
  
  /** keeps a description of the object. */
  var Description: String = js.native
  
  /**
    * indicates whether the column is automatically numbered, thus read-only.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsAutoIncrement: Boolean = js.native
  
  /**
    * indicates the nullability of values in the designated column.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsNullable: Double = js.native
  
  /** indicates that the column contains some kind of time or date stamp used to track updates. */
  var IsRowVersion: Boolean = js.native
  
  /** gets a column's number of decimal digits. */
  var Precision: Double = js.native
  
  /** gets a column's number of digits to right of the decimal point. */
  var Scale: Double = js.native
  
  /** is the {@link com.sun.star.sdbc.DataType} of the column. */
  var Type: Double = js.native
  
  /** is the type name used by the database. If the column type is a user-defined type, then a fully-qualified type name is returned. May be empty. */
  var TypeName: String = js.native
}
object ColumnDescriptor {
  
  @scala.inline
  def apply(
    AutoIncrementCreation: String,
    DefaultValue: String,
    Description: String,
    IsAutoIncrement: Boolean,
    IsNullable: Double,
    IsRowVersion: Boolean,
    Name: String,
    Precision: Double,
    PropertySetInfo: XPropertySetInfo,
    Scale: Double,
    Type: Double,
    TypeName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ColumnDescriptor = {
    val __obj = js.Dynamic.literal(AutoIncrementCreation = AutoIncrementCreation.asInstanceOf[js.Any], DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IsAutoIncrement = IsAutoIncrement.asInstanceOf[js.Any], IsNullable = IsNullable.asInstanceOf[js.Any], IsRowVersion = IsRowVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ColumnDescriptor]
  }
  
  @scala.inline
  implicit class ColumnDescriptorOps[Self <: ColumnDescriptor] (val x: Self) extends AnyVal {
    
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
    def setAutoIncrementCreation(value: String): Self = this.set("AutoIncrementCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoIncrement(value: Boolean): Self = this.set("IsAutoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNullable(value: Double): Self = this.set("IsNullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRowVersion(value: Boolean): Self = this.set("IsRowVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("Precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("Scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: String): Self = this.set("TypeName", value.asInstanceOf[js.Any])
  }
}
