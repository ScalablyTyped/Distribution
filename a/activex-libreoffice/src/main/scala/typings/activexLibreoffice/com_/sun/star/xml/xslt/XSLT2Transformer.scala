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
  * Get XSLT filter transformer supporting XSLT 2.0.
  * @since LibreOffice 4.0
  */
@js.native
trait XSLT2Transformer
  extends XActiveDataControl
     with XActiveDataSink
     with XActiveDataSource
     with XInitialization {
  def create(args: SeqEquiv[_]): Unit = js.native
}

object XSLT2Transformer {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: () => Unit,
    addListener: XStreamListener => Unit,
    create: SeqEquiv[_] => Unit,
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
  ): XSLT2Transformer = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), create = js.Any.fromFunction1(create), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), setInputStream = js.Any.fromFunction1(setInputStream), setOutputStream = js.Any.fromFunction1(setOutputStream), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[XSLT2Transformer]
  }
  @scala.inline
  implicit class XSLT2TransformerOps[Self <: XSLT2Transformer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: SeqEquiv[_] => Unit): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

