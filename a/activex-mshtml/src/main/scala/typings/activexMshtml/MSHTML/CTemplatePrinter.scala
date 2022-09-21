package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CTemplatePrinter extends StObject {
  
  /* private */ @JSName("MSHTML.CTemplatePrinter_typekey")
  var MSHTMLDotCTemplatePrinter_typekey: CTemplatePrinter
  
  var allLinkedDocuments: Boolean
  
  var collate: Boolean
  
  var copies: Double
  
  var currentPage: Boolean
  
  var currentPageAvail: Boolean
  
  def deviceSupports(bstrProperty: String): Any
  
  val duplex: Boolean
  
  def ensurePrintDialogDefaults(): Boolean
  
  var footer: String
  
  var frameActive: Boolean
  
  var frameActiveEnabled: Boolean
  
  var frameAsShown: Boolean
  
  var framesetDocument: Boolean
  
  def getPageMarginBottom(pageRule: Any, pageWidth: Double, pageHeight: Double): Any
  
  def getPageMarginBottomImportant(pageRule: Any): Boolean
  
  def getPageMarginLeft(pageRule: Any, pageWidth: Double, pageHeight: Double): Any
  
  def getPageMarginLeftImportant(pageRule: Any): Boolean
  
  def getPageMarginRight(pageRule: Any, pageWidth: Double, pageHeight: Double): Any
  
  def getPageMarginRightImportant(pageRule: Any): Boolean
  
  def getPageMarginTop(pageRule: Any, pageWidth: Double, pageHeight: Double): Any
  
  def getPageMarginTopImportant(pageRule: Any): Boolean
  
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
  
  def printBlankPage(): Unit
  
  def printNonNative(pMarkup: Any): Boolean
  
  def printNonNativeFrames(pMarkup: Any, fActiveFrame: Boolean): Unit
  
  def printPage(pElemDisp: Any): Unit
  
  var selectedPages: Boolean
  
  var selection: Boolean
  
  var selectionEnabled: Boolean
  
  def showPageSetupDialog(): Boolean
  
  def showPrintDialog(): Boolean
  
  def startDoc(bstrTitle: String): Boolean
  
  def stopDoc(): Unit
  
  var tableOfLinks: Boolean
  
  val unprintableBottom: Double
  
  val unprintableLeft: Double
  
  val unprintableRight: Double
  
  val unprintableTop: Double
  
  def updatePageStatus(p: Double): Unit
  
  var usePrinterCopyCollate: Boolean
}
object CTemplatePrinter {
  
  inline def apply(
    MSHTMLDotCTemplatePrinter_typekey: CTemplatePrinter,
    allLinkedDocuments: Boolean,
    collate: Boolean,
    copies: Double,
    currentPage: Boolean,
    currentPageAvail: Boolean,
    deviceSupports: String => Any,
    duplex: Boolean,
    ensurePrintDialogDefaults: () => Boolean,
    footer: String,
    frameActive: Boolean,
    frameActiveEnabled: Boolean,
    frameAsShown: Boolean,
    framesetDocument: Boolean,
    getPageMarginBottom: (Any, Double, Double) => Any,
    getPageMarginBottomImportant: Any => Boolean,
    getPageMarginLeft: (Any, Double, Double) => Any,
    getPageMarginLeftImportant: Any => Boolean,
    getPageMarginRight: (Any, Double, Double) => Any,
    getPageMarginRightImportant: Any => Boolean,
    getPageMarginTop: (Any, Double, Double) => Any,
    getPageMarginTopImportant: Any => Boolean,
    header: String,
    headerFooterFont: String,
    marginBottom: Double,
    marginLeft: Double,
    marginRight: Double,
    marginTop: Double,
    orientation: String,
    pageFrom: Double,
    pageHeight: Double,
    pageTo: Double,
    pageWidth: Double,
    printBlankPage: () => Unit,
    printNonNative: Any => Boolean,
    printNonNativeFrames: (Any, Boolean) => Unit,
    printPage: Any => Unit,
    selectedPages: Boolean,
    selection: Boolean,
    selectionEnabled: Boolean,
    showPageSetupDialog: () => Boolean,
    showPrintDialog: () => Boolean,
    startDoc: String => Boolean,
    stopDoc: () => Unit,
    tableOfLinks: Boolean,
    unprintableBottom: Double,
    unprintableLeft: Double,
    unprintableRight: Double,
    unprintableTop: Double,
    updatePageStatus: Double => Unit,
    usePrinterCopyCollate: Boolean
  ): CTemplatePrinter = {
    val __obj = js.Dynamic.literal(allLinkedDocuments = allLinkedDocuments.asInstanceOf[js.Any], collate = collate.asInstanceOf[js.Any], copies = copies.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], currentPageAvail = currentPageAvail.asInstanceOf[js.Any], deviceSupports = js.Any.fromFunction1(deviceSupports), duplex = duplex.asInstanceOf[js.Any], ensurePrintDialogDefaults = js.Any.fromFunction0(ensurePrintDialogDefaults), footer = footer.asInstanceOf[js.Any], frameActive = frameActive.asInstanceOf[js.Any], frameActiveEnabled = frameActiveEnabled.asInstanceOf[js.Any], frameAsShown = frameAsShown.asInstanceOf[js.Any], framesetDocument = framesetDocument.asInstanceOf[js.Any], getPageMarginBottom = js.Any.fromFunction3(getPageMarginBottom), getPageMarginBottomImportant = js.Any.fromFunction1(getPageMarginBottomImportant), getPageMarginLeft = js.Any.fromFunction3(getPageMarginLeft), getPageMarginLeftImportant = js.Any.fromFunction1(getPageMarginLeftImportant), getPageMarginRight = js.Any.fromFunction3(getPageMarginRight), getPageMarginRightImportant = js.Any.fromFunction1(getPageMarginRightImportant), getPageMarginTop = js.Any.fromFunction3(getPageMarginTop), getPageMarginTopImportant = js.Any.fromFunction1(getPageMarginTopImportant), header = header.asInstanceOf[js.Any], headerFooterFont = headerFooterFont.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pageFrom = pageFrom.asInstanceOf[js.Any], pageHeight = pageHeight.asInstanceOf[js.Any], pageTo = pageTo.asInstanceOf[js.Any], pageWidth = pageWidth.asInstanceOf[js.Any], printBlankPage = js.Any.fromFunction0(printBlankPage), printNonNative = js.Any.fromFunction1(printNonNative), printNonNativeFrames = js.Any.fromFunction2(printNonNativeFrames), printPage = js.Any.fromFunction1(printPage), selectedPages = selectedPages.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionEnabled = selectionEnabled.asInstanceOf[js.Any], showPageSetupDialog = js.Any.fromFunction0(showPageSetupDialog), showPrintDialog = js.Any.fromFunction0(showPrintDialog), startDoc = js.Any.fromFunction1(startDoc), stopDoc = js.Any.fromFunction0(stopDoc), tableOfLinks = tableOfLinks.asInstanceOf[js.Any], unprintableBottom = unprintableBottom.asInstanceOf[js.Any], unprintableLeft = unprintableLeft.asInstanceOf[js.Any], unprintableRight = unprintableRight.asInstanceOf[js.Any], unprintableTop = unprintableTop.asInstanceOf[js.Any], updatePageStatus = js.Any.fromFunction1(updatePageStatus), usePrinterCopyCollate = usePrinterCopyCollate.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CTemplatePrinter_typekey")(MSHTMLDotCTemplatePrinter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CTemplatePrinter]
  }
  
  extension [Self <: CTemplatePrinter](x: Self) {
    
    inline def setAllLinkedDocuments(value: Boolean): Self = StObject.set(x, "allLinkedDocuments", value.asInstanceOf[js.Any])
    
    inline def setCollate(value: Boolean): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
    
    inline def setCopies(value: Double): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
    
    inline def setCurrentPage(value: Boolean): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageAvail(value: Boolean): Self = StObject.set(x, "currentPageAvail", value.asInstanceOf[js.Any])
    
    inline def setDeviceSupports(value: String => Any): Self = StObject.set(x, "deviceSupports", js.Any.fromFunction1(value))
    
    inline def setDuplex(value: Boolean): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
    
    inline def setEnsurePrintDialogDefaults(value: () => Boolean): Self = StObject.set(x, "ensurePrintDialogDefaults", js.Any.fromFunction0(value))
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFrameActive(value: Boolean): Self = StObject.set(x, "frameActive", value.asInstanceOf[js.Any])
    
    inline def setFrameActiveEnabled(value: Boolean): Self = StObject.set(x, "frameActiveEnabled", value.asInstanceOf[js.Any])
    
    inline def setFrameAsShown(value: Boolean): Self = StObject.set(x, "frameAsShown", value.asInstanceOf[js.Any])
    
    inline def setFramesetDocument(value: Boolean): Self = StObject.set(x, "framesetDocument", value.asInstanceOf[js.Any])
    
    inline def setGetPageMarginBottom(value: (Any, Double, Double) => Any): Self = StObject.set(x, "getPageMarginBottom", js.Any.fromFunction3(value))
    
    inline def setGetPageMarginBottomImportant(value: Any => Boolean): Self = StObject.set(x, "getPageMarginBottomImportant", js.Any.fromFunction1(value))
    
    inline def setGetPageMarginLeft(value: (Any, Double, Double) => Any): Self = StObject.set(x, "getPageMarginLeft", js.Any.fromFunction3(value))
    
    inline def setGetPageMarginLeftImportant(value: Any => Boolean): Self = StObject.set(x, "getPageMarginLeftImportant", js.Any.fromFunction1(value))
    
    inline def setGetPageMarginRight(value: (Any, Double, Double) => Any): Self = StObject.set(x, "getPageMarginRight", js.Any.fromFunction3(value))
    
    inline def setGetPageMarginRightImportant(value: Any => Boolean): Self = StObject.set(x, "getPageMarginRightImportant", js.Any.fromFunction1(value))
    
    inline def setGetPageMarginTop(value: (Any, Double, Double) => Any): Self = StObject.set(x, "getPageMarginTop", js.Any.fromFunction3(value))
    
    inline def setGetPageMarginTopImportant(value: Any => Boolean): Self = StObject.set(x, "getPageMarginTopImportant", js.Any.fromFunction1(value))
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderFooterFont(value: String): Self = StObject.set(x, "headerFooterFont", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotCTemplatePrinter_typekey(value: CTemplatePrinter): Self = StObject.set(x, "MSHTML.CTemplatePrinter_typekey", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPageFrom(value: Double): Self = StObject.set(x, "pageFrom", value.asInstanceOf[js.Any])
    
    inline def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
    
    inline def setPageTo(value: Double): Self = StObject.set(x, "pageTo", value.asInstanceOf[js.Any])
    
    inline def setPageWidth(value: Double): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
    
    inline def setPrintBlankPage(value: () => Unit): Self = StObject.set(x, "printBlankPage", js.Any.fromFunction0(value))
    
    inline def setPrintNonNative(value: Any => Boolean): Self = StObject.set(x, "printNonNative", js.Any.fromFunction1(value))
    
    inline def setPrintNonNativeFrames(value: (Any, Boolean) => Unit): Self = StObject.set(x, "printNonNativeFrames", js.Any.fromFunction2(value))
    
    inline def setPrintPage(value: Any => Unit): Self = StObject.set(x, "printPage", js.Any.fromFunction1(value))
    
    inline def setSelectedPages(value: Boolean): Self = StObject.set(x, "selectedPages", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: Boolean): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionEnabled(value: Boolean): Self = StObject.set(x, "selectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setShowPageSetupDialog(value: () => Boolean): Self = StObject.set(x, "showPageSetupDialog", js.Any.fromFunction0(value))
    
    inline def setShowPrintDialog(value: () => Boolean): Self = StObject.set(x, "showPrintDialog", js.Any.fromFunction0(value))
    
    inline def setStartDoc(value: String => Boolean): Self = StObject.set(x, "startDoc", js.Any.fromFunction1(value))
    
    inline def setStopDoc(value: () => Unit): Self = StObject.set(x, "stopDoc", js.Any.fromFunction0(value))
    
    inline def setTableOfLinks(value: Boolean): Self = StObject.set(x, "tableOfLinks", value.asInstanceOf[js.Any])
    
    inline def setUnprintableBottom(value: Double): Self = StObject.set(x, "unprintableBottom", value.asInstanceOf[js.Any])
    
    inline def setUnprintableLeft(value: Double): Self = StObject.set(x, "unprintableLeft", value.asInstanceOf[js.Any])
    
    inline def setUnprintableRight(value: Double): Self = StObject.set(x, "unprintableRight", value.asInstanceOf[js.Any])
    
    inline def setUnprintableTop(value: Double): Self = StObject.set(x, "unprintableTop", value.asInstanceOf[js.Any])
    
    inline def setUpdatePageStatus(value: Double => Unit): Self = StObject.set(x, "updatePageStatus", js.Any.fromFunction1(value))
    
    inline def setUsePrinterCopyCollate(value: Boolean): Self = StObject.set(x, "usePrinterCopyCollate", value.asInstanceOf[js.Any])
  }
}
