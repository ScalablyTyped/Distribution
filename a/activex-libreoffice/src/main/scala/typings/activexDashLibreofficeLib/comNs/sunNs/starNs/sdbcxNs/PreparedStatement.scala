package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the definition of the service {@link com.sun.star.sdbc.PreparedStatement} with a flag for the usage of bookmarks.
  * @see ResultSet
  * @see XRowLocate
  */
trait PreparedStatement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.PreparedStatement {
  /** returns if a result set should allow the navigation with bookmarks or not. The default is `FALSE` . */
  var UseBookmarks: scala.Boolean
}

