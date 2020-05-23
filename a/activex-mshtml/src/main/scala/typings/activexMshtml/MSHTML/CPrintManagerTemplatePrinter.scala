package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPrintManagerTemplatePrinter extends js.Object {
  @JSName("MSHTML.CPrintManagerTemplatePrinter_typekey")
  var MSHTMLDotCPrintManagerTemplatePrinter_typekey: CPrintManagerTemplatePrinter
  var allLinkedDocuments: Boolean
  var collate: Boolean
  var copies: Double
  var currentPage: Boolean
  var currentPageAvail: Boolean
  val duplex: Boolean
  var footer: String
  var frameActive: Boolean
  var frameActiveEnabled: Boolean
  var frameAsShown: Boolean
  var framesetDocument: Boolean
  var header: String
  var headerFooterFont: String
  var marginBottom: Double
  var marginLeft: Double
  var marginRight: Double
  var marginTop: Double
  var orientation: String
  var pageFrom: Double
  val pageHeight: Double
  var pageTo: Double
  val pageWidth: Double
  val percentScale: Double
  var selectedPages: Boolean
  var selection: Boolean
  var selectionEnabled: Boolean
  val showHeaderFooter: Boolean
  val shrinkToFit: Boolean
  var tableOfLinks: Boolean
  val unprintableBottom: Double
  val unprintableLeft: Double
  val unprintableRight: Double
  val unprintableTop: Double
  var usePrinterCopyCollate: Boolean
  def deviceSupports(bstrProperty: String): js.Any
  def drawPreviewPage(pElemDisp: js.Any, nPage: Double): Unit
  def endPrint(): Unit
  def ensurePrintDialogDefaults(): Boolean
  def getPageMarginBottom(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any
  def getPageMarginBottomImportant(pageRule: js.Any): Boolean
  def getPageMarginLeft(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any
  def getPageMarginLeftImportant(pageRule: js.Any): Boolean
  def getPageMarginRight(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any
  def getPageMarginRightImportant(pageRule: js.Any): Boolean
  def getPageMarginTop(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any
  def getPageMarginTopImportant(pageRule: js.Any): Boolean
  def getPrintTaskOptionValue(bstrKey: String): js.Any
  def invalidatePreview(): Unit
  def printBlankPage(): Unit
  def printNonNative(pMarkup: js.Any): Boolean
  def printNonNativeFrames(pMarkup: js.Any, fActiveFrame: Boolean): Unit
  def printPage(pElemDisp: js.Any): Unit
  def setPageCount(nPage: Double): Unit
  def showPageSetupDialog(): Boolean
  def showPrintDialog(): Boolean
  def startDoc(bstrTitle: String): Boolean
  def startPrint(): Unit
  def stopDoc(): Unit
  def updatePageStatus(p: Double): Unit
}

object CPrintManagerTemplatePrinter {
  @scala.inline
  def apply(
    MSHTMLDotCPrintManagerTemplatePrinter_typekey: CPrintManagerTemplatePrinter,
    allLinkedDocuments: Boolean,
    collate: Boolean,
    copies: Double,
    currentPage: Boolean,
    currentPageAvail: Boolean,
    deviceSupports: String => js.Any,
    drawPreviewPage: (js.Any, Double) => Unit,
    duplex: Boolean,
    endPrint: () => Unit,
    ensurePrintDialogDefaults: () => Boolean,
    footer: String,
    frameActive: Boolean,
    frameActiveEnabled: Boolean,
    frameAsShown: Boolean,
    framesetDocument: Boolean,
    getPageMarginBottom: (js.Any, Double, Double) => js.Any,
    getPageMarginBottomImportant: js.Any => Boolean,
    getPageMarginLeft: (js.Any, Double, Double) => js.Any,
    getPageMarginLeftImportant: js.Any => Boolean,
    getPageMarginRight: (js.Any, Double, Double) => js.Any,
    getPageMarginRightImportant: js.Any => Boolean,
    getPageMarginTop: (js.Any, Double, Double) => js.Any,
    getPageMarginTopImportant: js.Any => Boolean,
    getPrintTaskOptionValue: String => js.Any,
    header: String,
    headerFooterFont: String,
    invalidatePreview: () => Unit,
    marginBottom: Double,
    marginLeft: Double,
    marginRight: Double,
    marginTop: Double,
    orientation: String,
    pageFrom: Double,
    pageHeight: Double,
    pageTo: Double,
    pageWidth: Double,
    percentScale: Double,
    printBlankPage: () => Unit,
    printNonNative: js.Any => Boolean,
    printNonNativeFrames: (js.Any, Boolean) => Unit,
    printPage: js.Any => Unit,
    selectedPages: Boolean,
    selection: Boolean,
    selectionEnabled: Boolean,
    setPageCount: Double => Unit,
    showHeaderFooter: Boolean,
    showPageSetupDialog: () => Boolean,
    showPrintDialog: () => Boolean,
    shrinkToFit: Boolean,
    startDoc: String => Boolean,
    startPrint: () => Unit,
    stopDoc: () => Unit,
    tableOfLinks: Boolean,
    unprintableBottom: Double,
    unprintableLeft: Double,
    unprintableRight: Double,
    unprintableTop: Double,
    updatePageStatus: Double => Unit,
    usePrinterCopyCollate: Boolean
  ): CPrintManagerTemplatePrinter = {
    val __obj = js.Dynamic.literal(allLinkedDocuments = allLinkedDocuments.asInstanceOf[js.Any], collate = collate.asInstanceOf[js.Any], copies = copies.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], currentPageAvail = currentPageAvail.asInstanceOf[js.Any], deviceSupports = js.Any.fromFunction1(deviceSupports), drawPreviewPage = js.Any.fromFunction2(drawPreviewPage), duplex = duplex.asInstanceOf[js.Any], endPrint = js.Any.fromFunction0(endPrint), ensurePrintDialogDefaults = js.Any.fromFunction0(ensurePrintDialogDefaults), footer = footer.asInstanceOf[js.Any], frameActive = frameActive.asInstanceOf[js.Any], frameActiveEnabled = frameActiveEnabled.asInstanceOf[js.Any], frameAsShown = frameAsShown.asInstanceOf[js.Any], framesetDocument = framesetDocument.asInstanceOf[js.Any], getPageMarginBottom = js.Any.fromFunction3(getPageMarginBottom), getPageMarginBottomImportant = js.Any.fromFunction1(getPageMarginBottomImportant), getPageMarginLeft = js.Any.fromFunction3(getPageMarginLeft), getPageMarginLeftImportant = js.Any.fromFunction1(getPageMarginLeftImportant), getPageMarginRight = js.Any.fromFunction3(getPageMarginRight), getPageMarginRightImportant = js.Any.fromFunction1(getPageMarginRightImportant), getPageMarginTop = js.Any.fromFunction3(getPageMarginTop), getPageMarginTopImportant = js.Any.fromFunction1(getPageMarginTopImportant), getPrintTaskOptionValue = js.Any.fromFunction1(getPrintTaskOptionValue), header = header.asInstanceOf[js.Any], headerFooterFont = headerFooterFont.asInstanceOf[js.Any], invalidatePreview = js.Any.fromFunction0(invalidatePreview), marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pageFrom = pageFrom.asInstanceOf[js.Any], pageHeight = pageHeight.asInstanceOf[js.Any], pageTo = pageTo.asInstanceOf[js.Any], pageWidth = pageWidth.asInstanceOf[js.Any], percentScale = percentScale.asInstanceOf[js.Any], printBlankPage = js.Any.fromFunction0(printBlankPage), printNonNative = js.Any.fromFunction1(printNonNative), printNonNativeFrames = js.Any.fromFunction2(printNonNativeFrames), printPage = js.Any.fromFunction1(printPage), selectedPages = selectedPages.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionEnabled = selectionEnabled.asInstanceOf[js.Any], setPageCount = js.Any.fromFunction1(setPageCount), showHeaderFooter = showHeaderFooter.asInstanceOf[js.Any], showPageSetupDialog = js.Any.fromFunction0(showPageSetupDialog), showPrintDialog = js.Any.fromFunction0(showPrintDialog), shrinkToFit = shrinkToFit.asInstanceOf[js.Any], startDoc = js.Any.fromFunction1(startDoc), startPrint = js.Any.fromFunction0(startPrint), stopDoc = js.Any.fromFunction0(stopDoc), tableOfLinks = tableOfLinks.asInstanceOf[js.Any], unprintableBottom = unprintableBottom.asInstanceOf[js.Any], unprintableLeft = unprintableLeft.asInstanceOf[js.Any], unprintableRight = unprintableRight.asInstanceOf[js.Any], unprintableTop = unprintableTop.asInstanceOf[js.Any], updatePageStatus = js.Any.fromFunction1(updatePageStatus), usePrinterCopyCollate = usePrinterCopyCollate.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CPrintManagerTemplatePrinter_typekey")(MSHTMLDotCPrintManagerTemplatePrinter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPrintManagerTemplatePrinter]
  }
}

