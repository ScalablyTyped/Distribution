package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.CPrintManagerTemplatePrinter")
@js.native
class CPrintManagerTemplatePrinter protected () extends js.Object {
  @JSName("MSHTML.CPrintManagerTemplatePrinter_typekey")
  var MSHTMLDotCPrintManagerTemplatePrinter_typekey: CPrintManagerTemplatePrinter = js.native
  var allLinkedDocuments: Boolean = js.native
  var collate: Boolean = js.native
  var copies: Double = js.native
  var currentPage: Boolean = js.native
  var currentPageAvail: Boolean = js.native
  val duplex: Boolean = js.native
  var footer: String = js.native
  var frameActive: Boolean = js.native
  var frameActiveEnabled: Boolean = js.native
  var frameAsShown: Boolean = js.native
  var framesetDocument: Boolean = js.native
  var header: String = js.native
  var headerFooterFont: String = js.native
  var marginBottom: Double = js.native
  var marginLeft: Double = js.native
  var marginRight: Double = js.native
  var marginTop: Double = js.native
  var orientation: String = js.native
  var pageFrom: Double = js.native
  val pageHeight: Double = js.native
  var pageTo: Double = js.native
  val pageWidth: Double = js.native
  val percentScale: Double = js.native
  var selectedPages: Boolean = js.native
  var selection: Boolean = js.native
  var selectionEnabled: Boolean = js.native
  val showHeaderFooter: Boolean = js.native
  val shrinkToFit: Boolean = js.native
  var tableOfLinks: Boolean = js.native
  val unprintableBottom: Double = js.native
  val unprintableLeft: Double = js.native
  val unprintableRight: Double = js.native
  val unprintableTop: Double = js.native
  var usePrinterCopyCollate: Boolean = js.native
  def deviceSupports(bstrProperty: String): js.Any = js.native
  def drawPreviewPage(pElemDisp: js.Any, nPage: Double): Unit = js.native
  def endPrint(): Unit = js.native
  def ensurePrintDialogDefaults(): Boolean = js.native
  def getPageMarginBottom(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  def getPageMarginBottomImportant(pageRule: js.Any): Boolean = js.native
  def getPageMarginLeft(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  def getPageMarginLeftImportant(pageRule: js.Any): Boolean = js.native
  def getPageMarginRight(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  def getPageMarginRightImportant(pageRule: js.Any): Boolean = js.native
  def getPageMarginTop(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  def getPageMarginTopImportant(pageRule: js.Any): Boolean = js.native
  def getPrintTaskOptionValue(bstrKey: String): js.Any = js.native
  def invalidatePreview(): Unit = js.native
  def printBlankPage(): Unit = js.native
  def printNonNative(pMarkup: js.Any): Boolean = js.native
  def printNonNativeFrames(pMarkup: js.Any, fActiveFrame: Boolean): Unit = js.native
  def printPage(pElemDisp: js.Any): Unit = js.native
  def setPageCount(nPage: Double): Unit = js.native
  def showPageSetupDialog(): Boolean = js.native
  def showPrintDialog(): Boolean = js.native
  def startDoc(bstrTitle: String): Boolean = js.native
  def startPrint(): Unit = js.native
  def stopDoc(): Unit = js.native
  def updatePageStatus(p: Double): Unit = js.native
}

