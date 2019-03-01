package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a procedure call. The service differs only in the access of the columns and parameters to the service {@link
  * com.sun.star.sdbc.CallableStatement} .
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.PreparedStatement because var conflicts: CursorName, FetchDirection, FetchSize, MaxFieldSize, MaxRows, QueryTimeOut, ResultSetConcurrency, ResultSetType. Inlined  */ trait CallableStatement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.CallableStatement

object CallableStatement {
  @scala.inline
  def apply(
    CallableStatement: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.CallableStatement = null,
    PreparedStatement: PreparedStatement = null
  ): CallableStatement = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CallableStatement)
    js.Dynamic.global.Object.assign(__obj, PreparedStatement)
    __obj.asInstanceOf[CallableStatement]
  }
}

