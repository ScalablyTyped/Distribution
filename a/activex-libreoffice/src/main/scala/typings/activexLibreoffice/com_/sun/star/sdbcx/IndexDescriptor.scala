package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to define a new index for a database table.
  * @see com.sun.star.sdbcx.Index
  */
@js.native
trait IndexDescriptor
  extends Descriptor
     with XColumnsSupplier {
  /** is the name of the index catalog, may be empty. */
  var Catalog: String = js.native
  /** indicates that the index is clustered. */
  var IsClustered: Boolean = js.native
  /** indicates that the index allow only unique values. */
  var IsUnique: Boolean = js.native
}

object IndexDescriptor {
  @scala.inline
  def apply(
    Catalog: String,
    Columns: XNameAccess,
    IsClustered: Boolean,
    IsUnique: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getColumns: () => XNameAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): IndexDescriptor = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], IsClustered = IsClustered.asInstanceOf[js.Any], IsUnique = IsUnique.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getColumns = js.Any.fromFunction0(getColumns), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[IndexDescriptor]
  }
  @scala.inline
  implicit class IndexDescriptorOps[Self <: IndexDescriptor] (val x: Self) extends AnyVal {
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
    def setCatalog(value: String): Self = this.set("Catalog", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsClustered(value: Boolean): Self = this.set("IsClustered", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUnique(value: Boolean): Self = this.set("IsUnique", value.asInstanceOf[js.Any])
  }
  
}

