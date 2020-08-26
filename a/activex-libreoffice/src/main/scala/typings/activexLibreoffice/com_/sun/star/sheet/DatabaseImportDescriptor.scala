package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a description of how data from an external database is imported.
  * @see com.sun.star.sheet.XDatabaseRange
  */
@js.native
trait DatabaseImportDescriptor extends js.Object {
  /**
    * indicates a connection URL, which locates a database driver.
    * @since OOo 2.0
    */
  var ConnectionResource: String = js.native
  /** specifies the name of the database from which data is imported. */
  var DatabaseName: String = js.native
  /**
    * specifies whether the SQL statement is given directly to the database or is parsed before.
    * @since OOo 2.0
    */
  var IsNative: Boolean = js.native
  /**
    * specifies the table, query, or statement from which data is imported.
    *
    * The meaning of this is determined by the {@link DatabaseImportDescriptor.SourceType} attribute.
    */
  var SourceObject: String = js.native
  /** enables importing and specifies from what type of source data is imported. */
  var SourceType: DataImportMode = js.native
}

object DatabaseImportDescriptor {
  @scala.inline
  def apply(
    ConnectionResource: String,
    DatabaseName: String,
    IsNative: Boolean,
    SourceObject: String,
    SourceType: DataImportMode
  ): DatabaseImportDescriptor = {
    val __obj = js.Dynamic.literal(ConnectionResource = ConnectionResource.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], IsNative = IsNative.asInstanceOf[js.Any], SourceObject = SourceObject.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseImportDescriptor]
  }
  @scala.inline
  implicit class DatabaseImportDescriptorOps[Self <: DatabaseImportDescriptor] (val x: Self) extends AnyVal {
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
    def setConnectionResource(value: String): Self = this.set("ConnectionResource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNative(value: Boolean): Self = this.set("IsNative", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceObject(value: String): Self = this.set("SourceObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceType(value: DataImportMode): Self = this.set("SourceType", value.asInstanceOf[js.Any])
  }
  
}

