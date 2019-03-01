package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xsltNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get unspecified XSLT filter transformer.
  *
  * It is not safe to expect support for any features except XSLT 1.0 .
  * @since LibreOffice 4.0
  */
trait XSLTTransformer extends XXSLTTransformer {
  def create(args: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): scala.Unit
}

object XSLTTransformer {
  @scala.inline
  def apply(
    InputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    OutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    acquire: js.Function0[scala.Unit],
    addListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener, scala.Unit],
    create: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    getInputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getOutputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener, scala.Unit],
    setInputStream: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Unit],
    setOutputStream: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream, scala.Unit],
    start: js.Function0[scala.Unit],
    terminate: js.Function0[scala.Unit]
  ): XSLTTransformer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InputStream")(InputStream)
    __obj.updateDynamic("OutputStream")(OutputStream)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addListener")(addListener)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("getInputStream")(getInputStream)
    __obj.updateDynamic("getOutputStream")(getOutputStream)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeListener")(removeListener)
    __obj.updateDynamic("setInputStream")(setInputStream)
    __obj.updateDynamic("setOutputStream")(setOutputStream)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("terminate")(terminate)
    __obj.asInstanceOf[XSLTTransformer]
  }
}

