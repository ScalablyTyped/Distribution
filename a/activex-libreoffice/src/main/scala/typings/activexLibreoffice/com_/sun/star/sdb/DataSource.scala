package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import typings.activexLibreoffice.com_.sun.star.sdbc.XIsolatedConnection
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.util.XFlushListener
import typings.activexLibreoffice.com_.sun.star.util.XFlushable
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a factory to establish database connections. It should be registered at a {@link com.sun.star.uno.NamingService} .
  * @see com.sun.star.sdb.DatabaseContext
  */
@js.native
trait DataSource
  extends XPropertySet
     with XCompletedConnection
     with XIsolatedConnection
     with XFlushable
     with XQueryDefinitionsSupplier
     with XDataSource
     with XBookmarksSupplier {
  /**
    * is a list of arbitrary string tag/value pairs as connection arguments
    *
    * The {@link DataSource} itself does not attempt to interpret any of those values.
    *
    * Instead, the values in this property have two use cases: Upon creating a connection, for every value in this sequence it's checked whether the {@link
    * com.sun.star.sdbc.XDriver} which is to provide the connection supports a setting with the respective name, using its {@link
    * com.sun.star.sdbc.XDriver.getPropertyInfo()} method.br/> If so, the settings is passed to the driver's {@link com.sun.star.sdbc.XDriver.connect()}
    * method. If not, the setting is ignored.External components may use the settings to carry arbitrary information with the data source. Usually, this is
    * used to control the behavior of components working with the data source.
    */
  var Info: SafeArray[PropertyValue] = js.native
  /** indicates that a password is always necessary. */
  var IsPasswordRequired: Boolean = js.native
  /** determines whether modifications on the data source are allowed or not. */
  var IsReadOnly: Boolean = js.native
  /**
    * is the name of the data source.
    *
    * If the data source is registered at the database context, then the `Name` property denotes the registration name. Otherwise, the name property
    * contains the URL of the file which the database document associated with the data source is based on.
    *
    * If the same data source is registered under different names, the value of the `Name` property is not defined.
    */
  var Name: String = js.native
  /** provides an object for formatting numbers. */
  var NumberFormatsSupplier: XNumberFormatsSupplier = js.native
  /** determines a users password. The password is not persistent. */
  var Password: String = js.native
  /**
    * is a convenience wrapper around the {@link Info} property.
    *
    * Since fiddling around with a sequence of property values is somewhat uncomfortable in all known UNO language bindings (especially for tasks like
    * simply changing the value of an existing value), the {@link Settings} property wraps the {@link Info} property for easier single-value access.
    *
    * You should use the {@link Settings} property if you need to access a few properties only, and the {@link Info} property if you need access to all
    * existent settings at once.
    *
    * The object represented by this property supports the {@link com.sun.star.beans.PropertyBag} service. That is, you can at runtime add arbitrary new
    * properties to the bag.
    *
    * Additionally, the property bag supports default values of properties, and thus the {@link com.sun.star.beans.XPropertyState} interface. If you add an
    * own property to the bag using {@link com.sun.star.beans.XPropertyContainer.addProperty()} , you need to specify an initial value, which is also used
    * as default value (exceptions see below).
    *
    * Effectively, the property bag represented by `Settings` contains two classes of properties: Pre-defined ones and user-defined ones.
    *
    * **Pre-defined** properties are properties which are potentially used by the data source, the application UI for the data source, or a particular
    * backend driver employed by the data source. There's a large set of such properties, no all of them are effectively used for a concrete data source,
    * nonetheless, they're all present in the `Settings` . ;  Such properties are not removable from the bag, that is, their {@link
    * com.sun.star.beans.PropertyAttribute.REMOVABLE} attribute is **not** set. ;  Usually, you'll find that all of this properties have the
    * com::sun::star::beans::PropertyState::PropertyState_DEFAULT_VALUE state.
    *
    * **User-defined** properties are the ones which are added at runtime by any instance. They might or might not be removable, this depends on whether or
    * not the code adding them specifies the {@link com.sun.star.beans.PropertyAttribute.REMOVABLE} attribute. Also, they might or might not have a default
    * value, determined by the {@link com.sun.star.beans.PropertyAttribute.MAYBEDEFAULT} attribute at the time they're added to the bag.
    *
    * When a data source is made persistent, then properties which are not removable (which are assumed to be the pre-defined properties) are ignored when
    * they are in `DEFAULT` state. All other properties are always made persistent, except when an explicit {@link
    * com.sun.star.beans.PropertyAttribute.TRANSIENT} attribute prohibits this.
    *
    * Similar, when you obtain the {@link Info} property of a `DataSource` , the `Settings` bag is asked for all its property values, and the ones which are
    * removable and in state default are stripped, and **not** returned in the `Info` sequence.
    */
  var Settings: XPropertySet = js.native
  /** indicates that components displaying data obtained from this data source should suppress columns used for versioning. */
  var SuppressVersionColumns: Boolean = js.native
  /** defines a list of tables, on which the {@link DataSource} should have it's focus. If empty, all tables are rejected. */
  var TableFilter: SafeArray[String] = js.native
  /** defines a list of table types, on which the {@link DataSource} should have it's focus. If empty, all table types are rejected. */
  var TableTypeFilter: SafeArray[String] = js.native
  /** indicates a database url of the form ; ` jdbc:subprotocol:subname` or `sdbc:subprotocol:subname` */
  var URL: String = js.native
  /** determines a users login name. */
  var User: String = js.native
}

object DataSource {
  @scala.inline
  def apply(
    Bookmarks: XNameAccess,
    Info: SafeArray[PropertyValue],
    IsPasswordRequired: Boolean,
    IsReadOnly: Boolean,
    LoginTimeout: Double,
    Name: String,
    NumberFormatsSupplier: XNumberFormatsSupplier,
    Password: String,
    PropertySetInfo: XPropertySetInfo,
    QueryDefinitions: XNameAccess,
    Settings: XPropertySet,
    SuppressVersionColumns: Boolean,
    TableFilter: SafeArray[String],
    TableTypeFilter: SafeArray[String],
    URL: String,
    User: String,
    acquire: () => Unit,
    addFlushListener: XFlushListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    connectWithCompletion: XInteractionHandler => XConnection,
    flush: () => Unit,
    getBookmarks: () => XNameAccess,
    getConnection: (String, String) => XConnection,
    getIsolatedConnection: (String, String) => XConnection,
    getIsolatedConnectionWithCompletion: XInteractionHandler => XConnection,
    getLoginTimeout: () => Double,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getQueryDefinitions: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeFlushListener: XFlushListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setLoginTimeout: Double => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DataSource = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], Info = Info.asInstanceOf[js.Any], IsPasswordRequired = IsPasswordRequired.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], LoginTimeout = LoginTimeout.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormatsSupplier = NumberFormatsSupplier.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryDefinitions = QueryDefinitions.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any], SuppressVersionColumns = SuppressVersionColumns.asInstanceOf[js.Any], TableFilter = TableFilter.asInstanceOf[js.Any], TableTypeFilter = TableTypeFilter.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), flush = js.Any.fromFunction0(flush), getBookmarks = js.Any.fromFunction0(getBookmarks), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getIsolatedConnectionWithCompletion = js.Any.fromFunction1(getIsolatedConnectionWithCompletion), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getQueryDefinitions = js.Any.fromFunction0(getQueryDefinitions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
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
    def setInfo(value: SafeArray[PropertyValue]): Self = this.set("Info", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPasswordRequired(value: Boolean): Self = this.set("IsPasswordRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("IsReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberFormatsSupplier(value: XNumberFormatsSupplier): Self = this.set("NumberFormatsSupplier", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: XPropertySet): Self = this.set("Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuppressVersionColumns(value: Boolean): Self = this.set("SuppressVersionColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableFilter(value: SafeArray[String]): Self = this.set("TableFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableTypeFilter(value: SafeArray[String]): Self = this.set("TableTypeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("User", value.asInstanceOf[js.Any])
  }
  
}

