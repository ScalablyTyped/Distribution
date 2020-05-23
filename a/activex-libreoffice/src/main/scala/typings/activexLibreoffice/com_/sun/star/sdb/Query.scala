package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbcx.XColumnsSupplier
import typings.activexLibreoffice.com_.sun.star.sdbcx.XDataDescriptorFactory
import typings.activexLibreoffice.com_.sun.star.sdbcx.XRename
import typings.activexLibreoffice.com_.sun.star.ucb.XContent
import typings.activexLibreoffice.com_.sun.star.ucb.XContentEventListener
import typings.activexLibreoffice.com_.sun.star.ucb.XContentIdentifier
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stored definition of a SQL query.
  *
  * It can be used if there is a need to execute SQL statements more than once, or if you want to format the query result fields differently from the
  * underlying table definitions.
  */
trait Query
  extends XPropertySet
     with XContent
     with XComponent
     with DataSettings
     with XDataDescriptorFactory
     with XRename
     with XColumnsSupplier

object Query {
  @scala.inline
  def apply(
    ApplyFilter: Boolean,
    Columns: XNameAccess,
    ContentType: String,
    Filter: String,
    FontDescriptor: FontDescriptor,
    GroupBy: String,
    HavingClause: String,
    Identifier: XContentIdentifier,
    Order: String,
    PropertySetInfo: XPropertySetInfo,
    RowHeight: Double,
    TextColor: Color,
    acquire: () => Unit,
    addContentEventListener: XContentEventListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    dispose: () => Unit,
    getColumns: () => XNameAccess,
    getContentType: () => String,
    getIdentifier: () => XContentIdentifier,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContentEventListener: XContentEventListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    rename: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Query = {
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContentEventListener = js.Any.fromFunction1(addContentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), dispose = js.Any.fromFunction0(dispose), getColumns = js.Any.fromFunction0(getColumns), getContentType = js.Any.fromFunction0(getContentType), getIdentifier = js.Any.fromFunction0(getIdentifier), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rename = js.Any.fromFunction1(rename), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Query]
  }
}

