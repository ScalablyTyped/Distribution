package typings.activexLibreoffice.com_.sun.star.xml.xslt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataControl
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataSink
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataSource
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.io.XStreamListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for XSLT transformers.
  * @since LibreOffice 4.0
  */
@js.native
trait XXSLTTransformer
  extends XActiveDataControl
     with XActiveDataSink
     with XActiveDataSource
     with XInitialization

object XXSLTTransformer {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: () => Unit,
    addListener: XStreamListener => Unit,
    getInputStream: () => XInputStream,
    getOutputStream: () => XOutputStream,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeListener: XStreamListener => Unit,
    setInputStream: XInputStream => Unit,
    setOutputStream: XOutputStream => Unit,
    start: () => Unit,
    terminate: () => Unit
  ): XXSLTTransformer = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), setInputStream = js.Any.fromFunction1(setInputStream), setOutputStream = js.Any.fromFunction1(setOutputStream), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[XXSLTTransformer]
  }
}

