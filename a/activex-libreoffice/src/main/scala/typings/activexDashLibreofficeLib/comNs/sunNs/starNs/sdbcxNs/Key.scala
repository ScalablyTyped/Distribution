package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to define a new key for a table. */
trait Key
  extends XDataDescriptorFactory
     with XColumnsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * is the rule which is applied for deletions; only used for foreign keys.
    * @see com.sun.star.sdbc.KeyRule
    */
  var DeleteRule: scala.Double
  /** is the name of the key */
  var Name: java.lang.String
  /** is the name of the referenced table, only used for foreign keys. */
  var ReferencedTable: java.lang.String
  /**
    * indicates the type of the key.
    * @see com.sun.star.sdbcx.KeyType
    */
  var Type: scala.Double
  /**
    * is the rule which is applied for updates; only used for foreign keys.
    * @see com.sun.star.sdbc.KeyRule
    */
  var UpdateRule: scala.Double
}

