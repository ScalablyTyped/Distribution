package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides timestamp information for an object in the form of an arbitrary string.
  *
  * The format and meaning of the timestamp depends on the implementation. Services implementing this interface must document the meaning and format they
  * use.
  *
  * If the timestamp is unchanged between two calls, the associated object has not changed. Any properties beyond this, particularly the presence of a
  * meaningful order between timestamps, depend on the implementation.
  * @since OOo 1.1.2
  */
trait XTimeStamped
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the timestamp of the object.
    * @returns a `string` that represents a timestamp.
    */
  val Timestamp: java.lang.String
  /**
    * returns the timestamp of the object.
    * @returns a `string` that represents a timestamp.
    */
  def getTimestamp(): java.lang.String
}

object XTimeStamped {
  @scala.inline
  def apply(
    Timestamp: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getTimestamp: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTimeStamped = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp, acquire = acquire, getTimestamp = getTimestamp, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTimeStamped]
  }
}

