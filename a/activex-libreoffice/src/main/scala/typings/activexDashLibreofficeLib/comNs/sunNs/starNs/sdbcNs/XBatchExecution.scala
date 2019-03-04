package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for collecting and executing a set of SQL statements. */
trait XBatchExecution
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds a SQL command to the current batch of commands for the statement object.
    * @param sql the SQL statement which should be appended to the batch.
    * @throws SQLException if a database access error occurs.
    */
  def addBatch(sql: java.lang.String): scala.Unit
  /**
    * makes the set of commands in the current batch empty.
    * @throws SQLException if a database access error occurs.
    */
  def clearBatch(): scala.Unit
  /**
    * submits a batch of commands to the database for execution.
    * @returns an array of update counts containing one element for each command in the batch. The array is ordered according to the order in which commands wer
    * @throws SQLException if a database access error occurs.
    */
  def executeBatch(): activexDashInteropLib.SafeArray[scala.Double]
}

object XBatchExecution {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addBatch: js.Function1[java.lang.String, scala.Unit],
    clearBatch: js.Function0[scala.Unit],
    executeBatch: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBatchExecution = {
    val __obj = js.Dynamic.literal(acquire = acquire, addBatch = addBatch, clearBatch = clearBatch, executeBatch = executeBatch, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XBatchExecution]
  }
}

