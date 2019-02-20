package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a description of how data from an external database is imported.
  * @see com.sun.star.sheet.XDatabaseRange
  */
trait DatabaseImportDescriptor extends js.Object {
  /**
    * indicates a connection URL, which locates a database driver.
    * @since OOo 2.0
    */
  var ConnectionResource: java.lang.String
  /** specifies the name of the database from which data is imported. */
  var DatabaseName: java.lang.String
  /**
    * specifies whether the SQL statement is given directly to the database or is parsed before.
    * @since OOo 2.0
    */
  var IsNative: scala.Boolean
  /**
    * specifies the table, query, or statement from which data is imported.
    *
    * The meaning of this is determined by the {@link DatabaseImportDescriptor.SourceType} attribute.
    */
  var SourceObject: java.lang.String
  /** enables importing and specifies from what type of source data is imported. */
  var SourceType: DataImportMode
}

