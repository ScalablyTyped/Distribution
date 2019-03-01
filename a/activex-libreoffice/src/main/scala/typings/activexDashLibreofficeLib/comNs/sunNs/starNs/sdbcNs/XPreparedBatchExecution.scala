package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for batch execution on PreparedStatements.
  *
  * A {@link com.sun.star.sdbc.PreparedStatement} uses one precompiled SQL {@link Statement} . In batch execution it is possible to set collection of
  * parameter settings, which are executed in one batch job.
  */
trait XPreparedBatchExecution
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds a set of parameters to the batch.
    * @throws SQLException if a database access error occurs.
    */
  def addBatch(): scala.Unit
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

object XPreparedBatchExecution {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addBatch: js.Function0[scala.Unit],
    clearBatch: js.Function0[scala.Unit],
    executeBatch: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPreparedBatchExecution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addBatch")(addBatch)
    __obj.updateDynamic("clearBatch")(clearBatch)
    __obj.updateDynamic("executeBatch")(executeBatch)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPreparedBatchExecution]
  }
}

