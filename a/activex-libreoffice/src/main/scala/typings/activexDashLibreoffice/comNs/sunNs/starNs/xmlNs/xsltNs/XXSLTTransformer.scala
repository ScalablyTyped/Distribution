package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.xsltNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XActiveDataControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XActiveDataSink
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XActiveDataSource
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XStreamListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for XSLT transformers.
  * @since LibreOffice 4.0
  */
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
    val __obj = js.Dynamic.literal(InputStream = InputStream, OutputStream = OutputStream, acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), setInputStream = js.Any.fromFunction1(setInputStream), setOutputStream = js.Any.fromFunction1(setOutputStream), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
  
    __obj.asInstanceOf[XXSLTTransformer]
  }
}

