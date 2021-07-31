package typings.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.CPrintManagerTemplatePrinter")
@js.native
class CPrintManagerTemplatePrinter protected ()
  extends StObject
     with typings.activexMshtml.MSHTML.CPrintManagerTemplatePrinter {
  
  /* CompleteClass */
  @JSName("MSHTML.CPrintManagerTemplatePrinter_typekey")
  var MSHTMLDotCPrintManagerTemplatePrinter_typekey: typings.activexMshtml.MSHTML.CPrintManagerTemplatePrinter = js.native
  
  /* CompleteClass */
  var allLinkedDocuments: Boolean = js.native
  
  /* CompleteClass */
  var collate: Boolean = js.native
  
  /* CompleteClass */
  var copies: Double = js.native
  
  /* CompleteClass */
  var currentPage: Boolean = js.native
  
  /* CompleteClass */
  var currentPageAvail: Boolean = js.native
  
  /* CompleteClass */
  override def deviceSupports(bstrProperty: String): js.Any = js.native
  
  /* CompleteClass */
  override def drawPreviewPage(pElemDisp: js.Any, nPage: Double): Unit = js.native
  
  /* CompleteClass */
  override val duplex: Boolean = js.native
  
  /* CompleteClass */
  override def endPrint(): Unit = js.native
  
  /* CompleteClass */
  override def ensurePrintDialogDefaults(): Boolean = js.native
  
  /* CompleteClass */
  var footer: String = js.native
  
  /* CompleteClass */
  var frameActive: Boolean = js.native
  
  /* CompleteClass */
  var frameActiveEnabled: Boolean = js.native
  
  /* CompleteClass */
  var frameAsShown: Boolean = js.native
  
  /* CompleteClass */
  var framesetDocument: Boolean = js.native
  
  /* CompleteClass */
  override def getPageMarginBottom(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  
  /* CompleteClass */
  override def getPageMarginBottomImportant(pageRule: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def getPageMarginLeft(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  
  /* CompleteClass */
  override def getPageMarginLeftImportant(pageRule: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def getPageMarginRight(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  
  /* CompleteClass */
  override def getPageMarginRightImportant(pageRule: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def getPageMarginTop(pageRule: js.Any, pageWidth: Double, pageHeight: Double): js.Any = js.native
  
  /* CompleteClass */
  override def getPageMarginTopImportant(pageRule: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def getPrintTaskOptionValue(bstrKey: String): js.Any = js.native
  
  /* CompleteClass */
  var header: String = js.native
  
  /* CompleteClass */
  var headerFooterFont: String = js.native
  
  /* CompleteClass */
  override def invalidatePreview(): Unit = js.native
  
  /* CompleteClass */
  var marginBottom: Double = js.native
  
  /* CompleteClass */
  var marginLeft: Double = js.native
  
  /* CompleteClass */
  var marginRight: Double = js.native
  
  /* CompleteClass */
  var marginTop: Double = js.native
  
  /* CompleteClass */
  var orientation: String = js.native
  
  /* CompleteClass */
  var pageFrom: Double = js.native
  
  /* CompleteClass */
  override val pageHeight: Double = js.native
  
  /* CompleteClass */
  var pageTo: Double = js.native
  
  /* CompleteClass */
  override val pageWidth: Double = js.native
  
  /* CompleteClass */
  override val percentScale: Double = js.native
  
  /* CompleteClass */
  override def printBlankPage(): Unit = js.native
  
  /* CompleteClass */
  override def printNonNative(pMarkup: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def printNonNativeFrames(pMarkup: js.Any, fActiveFrame: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def printPage(pElemDisp: js.Any): Unit = js.native
  
  /* CompleteClass */
  var selectedPages: Boolean = js.native
  
  /* CompleteClass */
  var selection: Boolean = js.native
  
  /* CompleteClass */
  var selectionEnabled: Boolean = js.native
  
  /* CompleteClass */
  override def setPageCount(nPage: Double): Unit = js.native
  
  /* CompleteClass */
  override val showHeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  override def showPageSetupDialog(): Boolean = js.native
  
  /* CompleteClass */
  override def showPrintDialog(): Boolean = js.native
  
  /* CompleteClass */
  override val shrinkToFit: Boolean = js.native
  
  /* CompleteClass */
  override def startDoc(bstrTitle: String): Boolean = js.native
  
  /* CompleteClass */
  override def startPrint(): Unit = js.native
  
  /* CompleteClass */
  override def stopDoc(): Unit = js.native
  
  /* CompleteClass */
  var tableOfLinks: Boolean = js.native
  
  /* CompleteClass */
  override val unprintableBottom: Double = js.native
  
  /* CompleteClass */
  override val unprintableLeft: Double = js.native
  
  /* CompleteClass */
  override val unprintableRight: Double = js.native
  
  /* CompleteClass */
  override val unprintableTop: Double = js.native
  
  /* CompleteClass */
  override def updatePageStatus(p: Double): Unit = js.native
  
  /* CompleteClass */
  var usePrinterCopyCollate: Boolean = js.native
}
