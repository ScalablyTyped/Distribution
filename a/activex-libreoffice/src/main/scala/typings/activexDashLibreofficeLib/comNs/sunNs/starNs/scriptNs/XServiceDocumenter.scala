package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides documentation for UNO services
  * @since LibreOffice 5.1
  */
trait XServiceDocumenter extends js.Object {
  var CoreBaseUrl: java.lang.String
  var ServiceBaseUrl: java.lang.String
  def showCoreDocs(xService: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XServiceInfo): scala.Unit
  def showInterfaceDocs(xTypeProvider: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XTypeProvider): scala.Unit
  def showServiceDocs(xService: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XServiceInfo): scala.Unit
}

object XServiceDocumenter {
  @scala.inline
  def apply(
    CoreBaseUrl: java.lang.String,
    ServiceBaseUrl: java.lang.String,
    showCoreDocs: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XServiceInfo, scala.Unit],
    showInterfaceDocs: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XTypeProvider, scala.Unit],
    showServiceDocs: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XServiceInfo, scala.Unit]
  ): XServiceDocumenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CoreBaseUrl")(CoreBaseUrl)
    __obj.updateDynamic("ServiceBaseUrl")(ServiceBaseUrl)
    __obj.updateDynamic("showCoreDocs")(showCoreDocs)
    __obj.updateDynamic("showInterfaceDocs")(showInterfaceDocs)
    __obj.updateDynamic("showServiceDocs")(showServiceDocs)
    __obj.asInstanceOf[XServiceDocumenter]
  }
}

