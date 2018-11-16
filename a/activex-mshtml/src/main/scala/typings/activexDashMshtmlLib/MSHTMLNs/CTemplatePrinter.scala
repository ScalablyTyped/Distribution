package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.CTemplatePrinter")
@js.native
class CTemplatePrinter protected () extends js.Object {
  var `MSHTML.CTemplatePrinter_typekey`: CTemplatePrinter = js.native
  var allLinkedDocuments: scala.Boolean = js.native
  var collate: scala.Boolean = js.native
  var copies: scala.Double = js.native
  var currentPage: scala.Boolean = js.native
  var currentPageAvail: scala.Boolean = js.native
  val duplex: scala.Boolean = js.native
  var footer: java.lang.String = js.native
  var frameActive: scala.Boolean = js.native
  var frameActiveEnabled: scala.Boolean = js.native
  var frameAsShown: scala.Boolean = js.native
  var framesetDocument: scala.Boolean = js.native
  var header: java.lang.String = js.native
  var headerFooterFont: java.lang.String = js.native
  var marginBottom: scala.Double = js.native
  var marginLeft: scala.Double = js.native
  var marginRight: scala.Double = js.native
  var marginTop: scala.Double = js.native
  var orientation: java.lang.String = js.native
  var pageFrom: scala.Double = js.native
  val pageHeight: scala.Double = js.native
  var pageTo: scala.Double = js.native
  val pageWidth: scala.Double = js.native
  var selectedPages: scala.Boolean = js.native
  var selection: scala.Boolean = js.native
  var selectionEnabled: scala.Boolean = js.native
  var tableOfLinks: scala.Boolean = js.native
  val unprintableBottom: scala.Double = js.native
  val unprintableLeft: scala.Double = js.native
  val unprintableRight: scala.Double = js.native
  val unprintableTop: scala.Double = js.native
  var usePrinterCopyCollate: scala.Boolean = js.native
  def deviceSupports(bstrProperty: java.lang.String): js.Any = js.native
  def ensurePrintDialogDefaults(): scala.Boolean = js.native
  def getPageMarginBottom(pageRule: js.Any, pageWidth: scala.Double, pageHeight: scala.Double): js.Any = js.native
  def getPageMarginBottomImportant(pageRule: js.Any): scala.Boolean = js.native
  def getPageMarginLeft(pageRule: js.Any, pageWidth: scala.Double, pageHeight: scala.Double): js.Any = js.native
  def getPageMarginLeftImportant(pageRule: js.Any): scala.Boolean = js.native
  def getPageMarginRight(pageRule: js.Any, pageWidth: scala.Double, pageHeight: scala.Double): js.Any = js.native
  def getPageMarginRightImportant(pageRule: js.Any): scala.Boolean = js.native
  def getPageMarginTop(pageRule: js.Any, pageWidth: scala.Double, pageHeight: scala.Double): js.Any = js.native
  def getPageMarginTopImportant(pageRule: js.Any): scala.Boolean = js.native
  def printBlankPage(): scala.Unit = js.native
  def printNonNative(pMarkup: js.Any): scala.Boolean = js.native
  def printNonNativeFrames(pMarkup: js.Any, fActiveFrame: scala.Boolean): scala.Unit = js.native
  def printPage(pElemDisp: js.Any): scala.Unit = js.native
  def showPageSetupDialog(): scala.Boolean = js.native
  def showPrintDialog(): scala.Boolean = js.native
  def startDoc(bstrTitle: java.lang.String): scala.Boolean = js.native
  def stopDoc(): scala.Unit = js.native
  def updatePageStatus(p: scala.Double): scala.Unit = js.native
}

