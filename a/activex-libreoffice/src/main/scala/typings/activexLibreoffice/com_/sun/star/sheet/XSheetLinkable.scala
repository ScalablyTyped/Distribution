package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enables a sheet to refer to another sheet in a different document.
  *
  * To insert a sheet link, the sheet used as linked sheet has to exist already. The method {@link XSheetLinkable.link()} creates a {@link SheetLink}
  * object in the document's {@link SheetLinks} collection and links the sheet to the specified external sheet.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.SheetLinks
  * @see com.sun.star.sheet.SheetLink
  */
trait XSheetLinkable
  extends StObject
     with XInterface {
  
  /**
    * returns the link mode of the spreadsheet.
    *
    * If the returned value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMode::VALUE, only results of formulas are used.
    */
  var LinkMode: SheetLinkMode
  
  /** returns the sheet name of the sheet in the source document. */
  var LinkSheetName: String
  
  /** returns the target URL of the link. */
  var LinkUrl: String
  
  /**
    * returns the link mode of the spreadsheet.
    *
    * If the returned value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMode::VALUE, only results of formulas are used.
    */
  def getLinkMode(): SheetLinkMode
  
  /** returns the sheet name of the sheet in the source document. */
  def getLinkSheetName(): String
  
  /** returns the target URL of the link. */
  def getLinkUrl(): String
  
  /**
    * links the sheet to another sheet in another document.
    *
    * A {@link SheetLink} object is created if it does not exist, and the link mode, the URL of the linked document and the linked sheet name are set.
    */
  def link(
    aUrl: String,
    aSheetName: String,
    aFilterName: String,
    aFilterOptions: String,
    nMode: SheetLinkMode
  ): Unit
  
  /**
    * enables the linking of the sheet and controls whether formulas are copied.
    * @param nLinkMode the value specifying the link mode for this spreadsheet.  If the value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMod
    */
  def setLinkMode(nLinkMode: SheetLinkMode): Unit
  
  /**
    * sets the name of the linked sheet in the source document.
    *
    * This method sets the sheet name in the {@link SheetLink} object, it does not modify the sheet name in the source document.
    */
  def setLinkSheetName(aLinkSheetName: String): Unit
  
  /**
    * sets the target URL of the link.
    *
    * A {@link SheetLink} object with the same file name must exist already or the link will not work.
    */
  def setLinkUrl(aLinkUrl: String): Unit
}
object XSheetLinkable {
  
  inline def apply(
    LinkMode: SheetLinkMode,
    LinkSheetName: String,
    LinkUrl: String,
    acquire: () => Unit,
    getLinkMode: () => SheetLinkMode,
    getLinkSheetName: () => String,
    getLinkUrl: () => String,
    link: (String, String, String, String, SheetLinkMode) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setLinkMode: SheetLinkMode => Unit,
    setLinkSheetName: String => Unit,
    setLinkUrl: String => Unit
  ): XSheetLinkable = {
    val __obj = js.Dynamic.literal(LinkMode = LinkMode.asInstanceOf[js.Any], LinkSheetName = LinkSheetName.asInstanceOf[js.Any], LinkUrl = LinkUrl.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLinkMode = js.Any.fromFunction0(getLinkMode), getLinkSheetName = js.Any.fromFunction0(getLinkSheetName), getLinkUrl = js.Any.fromFunction0(getLinkUrl), link = js.Any.fromFunction5(link), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLinkMode = js.Any.fromFunction1(setLinkMode), setLinkSheetName = js.Any.fromFunction1(setLinkSheetName), setLinkUrl = js.Any.fromFunction1(setLinkUrl))
    __obj.asInstanceOf[XSheetLinkable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSheetLinkable] (val x: Self) extends AnyVal {
    
    inline def setGetLinkMode(value: () => SheetLinkMode): Self = StObject.set(x, "getLinkMode", js.Any.fromFunction0(value))
    
    inline def setGetLinkSheetName(value: () => String): Self = StObject.set(x, "getLinkSheetName", js.Any.fromFunction0(value))
    
    inline def setGetLinkUrl(value: () => String): Self = StObject.set(x, "getLinkUrl", js.Any.fromFunction0(value))
    
    inline def setLink(value: (String, String, String, String, SheetLinkMode) => Unit): Self = StObject.set(x, "link", js.Any.fromFunction5(value))
    
    inline def setLinkMode(value: SheetLinkMode): Self = StObject.set(x, "LinkMode", value.asInstanceOf[js.Any])
    
    inline def setLinkSheetName(value: String): Self = StObject.set(x, "LinkSheetName", value.asInstanceOf[js.Any])
    
    inline def setLinkUrl(value: String): Self = StObject.set(x, "LinkUrl", value.asInstanceOf[js.Any])
    
    inline def setSetLinkMode(value: SheetLinkMode => Unit): Self = StObject.set(x, "setLinkMode", js.Any.fromFunction1(value))
    
    inline def setSetLinkSheetName(value: String => Unit): Self = StObject.set(x, "setLinkSheetName", js.Any.fromFunction1(value))
    
    inline def setSetLinkUrl(value: String => Unit): Self = StObject.set(x, "setLinkUrl", js.Any.fromFunction1(value))
  }
}
