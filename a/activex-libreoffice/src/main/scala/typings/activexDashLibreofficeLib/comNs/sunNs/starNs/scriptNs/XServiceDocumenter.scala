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

