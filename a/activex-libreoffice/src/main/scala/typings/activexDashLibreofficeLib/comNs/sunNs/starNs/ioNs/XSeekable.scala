package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to seek to a certain position within a stream.
  *
  * This interface should be supported, if it is possible to access the data at the new position quickly. You should not support this interface, if you
  * have a continuous stream, for example, a video stream.
  */
trait XSeekable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the length of the stream.
    * @returns the length of the storage medium on which the stream works.
    */
  val Length: scala.Double
  /**
    * returns the current offset of the stream.
    * @returns the current offset in this stream.
    */
  val Position: scala.Double
  /**
    * returns the length of the stream.
    * @returns the length of the storage medium on which the stream works.
    */
  def getLength(): scala.Double
  /**
    * returns the current offset of the stream.
    * @returns the current offset in this stream.
    */
  def getPosition(): scala.Double
  /**
    * changes the seek pointer to a new location relative to the beginning of the stream.
    *
    * This method changes the seek pointer so subsequent reads and writes can take place at a different location in the stream object. It is an error to
    * seek before the beginning of the stream or after the end of the stream.
    * @throws com::sun::star::lang::IllegalArgumentException in case location is negative or greater than {@link XSeekable.getLength()} .
    */
  def seek(location: scala.Double): scala.Unit
}

object XSeekable {
  @scala.inline
  def apply(
    Length: scala.Double,
    Position: scala.Double,
    acquire: js.Function0[scala.Unit],
    getLength: js.Function0[scala.Double],
    getPosition: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    seek: js.Function1[scala.Double, scala.Unit]
  ): XSeekable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Length")(Length)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getLength")(getLength)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("seek")(seek)
    __obj.asInstanceOf[XSeekable]
  }
}

