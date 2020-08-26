package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPrintManagerTemplatePrinter extends js.Object {
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
  @scala.inline
  implicit class CPrintManagerTemplatePrinterOps[Self <: CPrintManagerTemplatePrinter] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotCPrintManagerTemplatePrinter_typekey(value: CPrintManagerTemplatePrinter): Self = this.set("MSHTML.CPrintManagerTemplatePrinter_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllLinkedDocuments(value: Boolean): Self = this.set("allLinkedDocuments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollate(value: Boolean): Self = this.set("collate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopies(value: Double): Self = this.set("copies", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentPage(value: Boolean): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentPageAvail(value: Boolean): Self = this.set("currentPageAvail", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceSupports(value: String => js.Any): Self = this.set("deviceSupports", js.Any.fromFunction1(value))
    @scala.inline
    def setDrawPreviewPage(value: (js.Any, Double) => Unit): Self = this.set("drawPreviewPage", js.Any.fromFunction2(value))
    @scala.inline
    def setDuplex(value: Boolean): Self = this.set("duplex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndPrint(value: () => Unit): Self = this.set("endPrint", js.Any.fromFunction0(value))
    @scala.inline
    def setEnsurePrintDialogDefaults(value: () => Boolean): Self = this.set("ensurePrintDialogDefaults", js.Any.fromFunction0(value))
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameActive(value: Boolean): Self = this.set("frameActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameActiveEnabled(value: Boolean): Self = this.set("frameActiveEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameAsShown(value: Boolean): Self = this.set("frameAsShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramesetDocument(value: Boolean): Self = this.set("framesetDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPageMarginBottom(value: (js.Any, Double, Double) => js.Any): Self = this.set("getPageMarginBottom", js.Any.fromFunction3(value))
    @scala.inline
    def setGetPageMarginBottomImportant(value: js.Any => Boolean): Self = this.set("getPageMarginBottomImportant", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPageMarginLeft(value: (js.Any, Double, Double) => js.Any): Self = this.set("getPageMarginLeft", js.Any.fromFunction3(value))
    @scala.inline
    def setGetPageMarginLeftImportant(value: js.Any => Boolean): Self = this.set("getPageMarginLeftImportant", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPageMarginRight(value: (js.Any, Double, Double) => js.Any): Self = this.set("getPageMarginRight", js.Any.fromFunction3(value))
    @scala.inline
    def setGetPageMarginRightImportant(value: js.Any => Boolean): Self = this.set("getPageMarginRightImportant", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPageMarginTop(value: (js.Any, Double, Double) => js.Any): Self = this.set("getPageMarginTop", js.Any.fromFunction3(value))
    @scala.inline
    def setGetPageMarginTopImportant(value: js.Any => Boolean): Self = this.set("getPageMarginTopImportant", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPrintTaskOptionValue(value: String => js.Any): Self = this.set("getPrintTaskOptionValue", js.Any.fromFunction1(value))
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderFooterFont(value: String): Self = this.set("headerFooterFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidatePreview(value: () => Unit): Self = this.set("invalidatePreview", js.Any.fromFunction0(value))
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageFrom(value: Double): Self = this.set("pageFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageHeight(value: Double): Self = this.set("pageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageTo(value: Double): Self = this.set("pageTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageWidth(value: Double): Self = this.set("pageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentScale(value: Double): Self = this.set("percentScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintBlankPage(value: () => Unit): Self = this.set("printBlankPage", js.Any.fromFunction0(value))
    @scala.inline
    def setPrintNonNative(value: js.Any => Boolean): Self = this.set("printNonNative", js.Any.fromFunction1(value))
    @scala.inline
    def setPrintNonNativeFrames(value: (js.Any, Boolean) => Unit): Self = this.set("printNonNativeFrames", js.Any.fromFunction2(value))
    @scala.inline
    def setPrintPage(value: js.Any => Unit): Self = this.set("printPage", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectedPages(value: Boolean): Self = this.set("selectedPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: Boolean): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionEnabled(value: Boolean): Self = this.set("selectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetPageCount(value: Double => Unit): Self = this.set("setPageCount", js.Any.fromFunction1(value))
    @scala.inline
    def setShowHeaderFooter(value: Boolean): Self = this.set("showHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowPageSetupDialog(value: () => Boolean): Self = this.set("showPageSetupDialog", js.Any.fromFunction0(value))
    @scala.inline
    def setShowPrintDialog(value: () => Boolean): Self = this.set("showPrintDialog", js.Any.fromFunction0(value))
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = this.set("shrinkToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDoc(value: String => Boolean): Self = this.set("startDoc", js.Any.fromFunction1(value))
    @scala.inline
    def setStartPrint(value: () => Unit): Self = this.set("startPrint", js.Any.fromFunction0(value))
    @scala.inline
    def setStopDoc(value: () => Unit): Self = this.set("stopDoc", js.Any.fromFunction0(value))
    @scala.inline
    def setTableOfLinks(value: Boolean): Self = this.set("tableOfLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnprintableBottom(value: Double): Self = this.set("unprintableBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnprintableLeft(value: Double): Self = this.set("unprintableLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnprintableRight(value: Double): Self = this.set("unprintableRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnprintableTop(value: Double): Self = this.set("unprintableTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatePageStatus(value: Double => Unit): Self = this.set("updatePageStatus", js.Any.fromFunction1(value))
    @scala.inline
    def setUsePrinterCopyCollate(value: Boolean): Self = this.set("usePrinterCopyCollate", value.asInstanceOf[js.Any])
  }
  
}

