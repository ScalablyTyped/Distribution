package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to manipulate table names.
  *
  * When, in a database application, dealing with table names, there's many degrees of freedom to deal with. For instance, suppose you want to have the
  * full name of a table object, as it should be used in a `SELECT` statement's `FROM` part. This requires you to evaluate whether or not the table has a
  * catalog and/or schema name, to combine the catalog, the schema, and the basic table name into one name, respecting the database's quoting character,
  * and the order in which all those parts should be combined. Additionally, you have to respect the client-side settings which tell OpenOffice.org to use
  * or not use catalogs and schemas in `SELECT` at all.
  *
  * The {@link XTableName} interface eases this and other, similar tasks around table names.
  *
  * The component itself does not have life-time control mechanisms, i.e. you cannot explicitly dispose it ( {@link
  * com.sun.star.lang.XComponent.dispose()} ), and you cannot be notified when it dies. ;  However, if your try to access any of its methods or
  * attributes, after the connection which was used to create it was closed, a {@link com.sun.star.lang.DisposedException} will be thrown.
  * @see XConnectionTools
  * @see com.sun.star.sdbc.XDatabaseMetaData
  * @see com.sun.star.sdb.DataSource.Settings
  * @since OOo 2.0.4
  */
trait XTableName extends js.Object {
  /** denotes the name of the catalog which the table is a part of */
  var CatalogName: java.lang.String
  /**
    * represents the table name in a form to be used in a `SELECT` statement.
    *
    * On a per-data-source basis, OpenOffice.org allows to override database meta data information in that you can specify to not use catalog and or schema
    * names in `SELECT` statements. Using this attribute, you can generate a table name which respects those settings.
    * @see com.sun.star.sdb.DataSource.Settings
    */
  var NameForSelect: java.lang.String
  /** denotes the name of the schema which the table is a part of */
  var SchemaName: java.lang.String
  /**
    * is the {@link com.sun.star.sdb.Table} object specified by the current name.
    *
    * Retrieving this attribute is equivalent to obtaining the tables container from the connection (via {@link com.sun.star.sdbcx.XTablesSupplier} ), and
    * calling its {@link com.sun.star.container.XNameAccess.getByName()} method with the ComposedName.
    * @throws com::sun::star::container::NoSuchElementException if, upon getting the attribute value, the current composed table name represented by this insta
    * @throws com::sun::star::lang::IllegalArgumentException if you try to set an object which does not denote a table from the underlying database.
    */
  var Table: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** denotes the mere, unqualified table name, excluding any catalog and schema. */
  var TableName: java.lang.String
  /**
    * returns the composed table name, including the catalog and schema name, respecting the database's quoting requirements, plus
    * @param Type the type of name composition to be used.
    * @param Quote specifies whether the single parts of the table name should be quoted
    * @see CompositionType
    * @throws com::sun::star::IllegalArgumentException if the given Type does not denote a valid {@link CompositionType}
    */
  def getComposedName(Type: scala.Double, Quote: scala.Boolean): java.lang.String
  /**
    * sets a new composed table name
    * @param ComposedName specifies the composed table name
    * @param Type specifies the composition type which was used to create the composed table name
    */
  def setComposedName(ComposedName: java.lang.String, Type: scala.Double): scala.Unit
}

object XTableName {
  @scala.inline
  def apply(
    CatalogName: java.lang.String,
    NameForSelect: java.lang.String,
    SchemaName: java.lang.String,
    Table: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    TableName: java.lang.String,
    getComposedName: js.Function2[scala.Double, scala.Boolean, java.lang.String],
    setComposedName: js.Function2[java.lang.String, scala.Double, scala.Unit]
  ): XTableName = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName, NameForSelect = NameForSelect, SchemaName = SchemaName, Table = Table, TableName = TableName, getComposedName = getComposedName, setComposedName = setComposedName)
  
    __obj.asInstanceOf[XTableName]
  }
}

