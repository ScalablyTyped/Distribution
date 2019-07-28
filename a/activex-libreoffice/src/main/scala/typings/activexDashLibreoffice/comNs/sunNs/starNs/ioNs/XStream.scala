package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers read and write access to the same stream. */
trait XStream extends XInterface {
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
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    getOutputStream: () => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, OutputStream = OutputStream, acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStream]
  }
}

