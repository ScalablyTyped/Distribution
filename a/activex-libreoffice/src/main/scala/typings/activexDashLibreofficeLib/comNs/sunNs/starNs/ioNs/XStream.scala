package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers read and write access to the same stream. */
trait XStream
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  val InputStream: XInputStream
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  val OutputStream: XOutputStream
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  def getInputStream(): XInputStream
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  def getOutputStream(): XOutputStream
}

object XStream {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: js.Function0[scala.Unit],
    getInputStream: js.Function0[XInputStream],
    getOutputStream: js.Function0[XOutputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, OutputStream = OutputStream, acquire = acquire, getInputStream = getInputStream, getOutputStream = getOutputStream, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XStream]
  }
}

