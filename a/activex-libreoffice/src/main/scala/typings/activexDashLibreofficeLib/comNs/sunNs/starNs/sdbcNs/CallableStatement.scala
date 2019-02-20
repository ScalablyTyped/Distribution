package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to execute SQL stored procedures.
  *
  * SDBC provides a stored procedure SQL escape that allows stored procedures to be called in a standard way for all RDBMSs. This escape syntax has one
  * form that includes a result parameter and one that does not. If used, the result parameter must be registered as an OUT parameter. The other
  * parameters can be used for input, output, or both. Parameters are referred to sequentially, by number. The first parameter is 1.
  *
  * `{?=call&lt;procedure-name&gt;[&lt;arg1&gt;,&lt;arg2&gt;,...]}; {call&lt;procedure-name&gt;[&lt;arg1&gt;,&lt;arg2&gt;,...]} `
  *
  * IN parameter values are set using the set methods inherited from {@link com.sun.star.sdbc.PreparedStatement} . The type of all OUT parameters must be
  * registered prior to executing the stored procedure; their values are retrieved after execution via the `get` methods provided by the {@link
  * com.sun.star.sdbc.XRow} .
  *
  * A `CallableStatement` can return one {@link com.sun.star.sdbc.XResultSet} or multiple {@link com.sun.star.sdbc.ResultSet} objects. Multiple
  * `ResultSet` objects are handled using operations inherited from {@link com.sun.star.sdbc.XPreparedStatement} .
  *
  * For maximum portability, a call's {@link com.sun.star.sdbc.ResultSet} objects and update counts should be processed prior to getting the values of
  * output parameters.
  */
trait CallableStatement
  extends PreparedStatement
     with XRow
     with XOutParameters

