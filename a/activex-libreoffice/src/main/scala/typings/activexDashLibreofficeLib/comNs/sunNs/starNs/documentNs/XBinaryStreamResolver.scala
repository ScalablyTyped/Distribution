package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface encapsulates functionality to get/resolve binary data streams. It is used to transform binary data to an URL or to transform an URL to
  * binary data. The binary data is represented through input and output streams.
  *
  * In the case of transforming an URL to binary data, the `getInputStream` method is used. This returns a {@link com.sun.star.io.XInputStream} from which
  * the binary data, transformed from the given URL, can be read.
  *
  * In the case of transforming binary data to an URL, a {@link com.sun.star.io.XOutputStream} is created first to write the binary data to. After this,
  * the `resolveOutputStream` method can be used to transform the binary data, represented through the {@link com.sun.star.io.XOutputStream} interface, to
  * an URL.
  */
trait XBinaryStreamResolver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates an output stream, to which binary data can be written. After writing, an URL can be retrieved by a call to {@link
    * XBinaryStreamResolver.resolveOutputStream()} .
    */
  def createOutputStream(): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream
  /** converts the given URL from the source URL namespace to an input stream, from which binary data can be read */
  def getInputStream(aURL: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /** converts the output stream, data has been written to, to an URL in source URL namespace. */
  def resolveOutputStream(aBinaryStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream): java.lang.String
}

object XBinaryStreamResolver {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createOutputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream],
    getInputStream: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resolveOutputStream: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream, java.lang.String]
  ): XBinaryStreamResolver = {
    val __obj = js.Dynamic.literal(acquire = acquire, createOutputStream = createOutputStream, getInputStream = getInputStream, queryInterface = queryInterface, release = release, resolveOutputStream = resolveOutputStream)
  
    __obj.asInstanceOf[XBinaryStreamResolver]
  }
}

