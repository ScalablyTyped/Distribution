package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * denotes a named database object, or a named folder of database objects
  * @since OOo 3.0
  */
trait NamedDatabaseObject extends js.Object {
  /**
    * denotes the name of the object
    *
    * In case of forms, reports, form folders and report folders, this is the hierarchical path to the object, where the path elements are separated by a
    * slash ( `/` ).
    *
    * In case of tables, this is the fully qualified name of the table, as required by the database's table name composition rules.
    *
    * In case of queries, this is the name of the query.
    *
    * In case of virtual folders denoted by {@link DatabaseObjectContainer.CATALOG} and {@link DatabaseObjectContainer.SCHEMA} , it is `<schema>` , if the
    * database supports schemas only`<catalog>` , if the database supports catalogs only`<catalog>.<schema>` , if the database supports both catalogs and
    * schemas, and catalogs are to appear at the beginning of an identifier.`<schema>.<catalog>` , if the database supports both catalogs and schemas, and
    * catalogs are to appear at the end of an identifier.
    *
    * In case of the virtual folders denoted by {@link DatabaseObjectContainer.TABLES} , {@link DatabaseObjectContainer.QUERIES} , {@link
    * DatabaseObjectContainer.DATA_SOURCE} , {@link DatabaseObjectContainer.FORMS} or {@link DatabaseObjectContainer.REPORTS} , this denotes the name of the
    * data source (as denoted by {@link com.sun.star.sdb.DataSource.Name} )
    * @see XDatabaseMetaData.isCatalogAtStart
    * @see DatabaseObjectContainer
    */
  var Name: java.lang.String
  /**
    * denotes the type of the object.
    *
    * This member is one of the {@link DatabaseObject} or {@link DatabaseObjectContainer} constants.
    */
  var Type: scala.Double
}

