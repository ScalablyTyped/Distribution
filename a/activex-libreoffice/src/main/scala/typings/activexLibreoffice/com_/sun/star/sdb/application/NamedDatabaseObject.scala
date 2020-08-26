package typings.activexLibreoffice.com_.sun.star.sdb.application

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * denotes a named database object, or a named folder of database objects
  * @since OOo 3.0
  */
@js.native
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
  var Name: String = js.native
  /**
    * denotes the type of the object.
    *
    * This member is one of the {@link DatabaseObject} or {@link DatabaseObjectContainer} constants.
    */
  var Type: Double = js.native
}

object NamedDatabaseObject {
  @scala.inline
  def apply(Name: String, Type: Double): NamedDatabaseObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedDatabaseObject]
  }
  @scala.inline
  implicit class NamedDatabaseObjectOps[Self <: NamedDatabaseObject] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

