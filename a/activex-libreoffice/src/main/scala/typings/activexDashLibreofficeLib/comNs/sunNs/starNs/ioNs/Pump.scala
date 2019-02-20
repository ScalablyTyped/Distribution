package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the implementation of a data source and a data sink.
  *
  * A thread will be created that reads from the input stream and writes the data to the connected output stream. Data will not be buffered by this
  * service.
  */
trait Pump
  extends XActiveDataSource
     with XActiveDataSink
     with XActiveDataControl

