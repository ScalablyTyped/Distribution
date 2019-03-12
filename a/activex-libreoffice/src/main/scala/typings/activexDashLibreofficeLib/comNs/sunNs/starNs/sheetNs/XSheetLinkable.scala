package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the link mode of the spreadsheet.
    *
    * If the returned value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMode::VALUE, only results of formulas are used.
    */
  var LinkMode: SheetLinkMode
  /** returns the sheet name of the sheet in the source document. */
  var LinkSheetName: java.lang.String
  /** returns the target URL of the link. */
  var LinkUrl: java.lang.String
  /**
    * returns the link mode of the spreadsheet.
    *
    * If the returned value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMode::VALUE, only results of formulas are used.
    */
  def getLinkMode(): SheetLinkMode
  /** returns the sheet name of the sheet in the source document. */
  def getLinkSheetName(): java.lang.String
  /** returns the target URL of the link. */
  def getLinkUrl(): java.lang.String
  /**
    * links the sheet to another sheet in another document.
    *
    * A {@link SheetLink} object is created if it does not exist, and the link mode, the URL of the linked document and the linked sheet name are set.
    */
  def link(
    aUrl: java.lang.String,
    aSheetName: java.lang.String,
    aFilterName: java.lang.String,
    aFilterOptions: java.lang.String,
    nMode: SheetLinkMode
  ): scala.Unit
  /**
    * enables the linking of the sheet and controls whether formulas are copied.
    * @param nLinkMode the value specifying the link mode for this spreadsheet.  If the value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMod
    */
  def setLinkMode(nLinkMode: SheetLinkMode): scala.Unit
  /**
    * sets the name of the linked sheet in the source document.
    *
    * This method sets the sheet name in the {@link SheetLink} object, it does not modify the sheet name in the source document.
    */
  def setLinkSheetName(aLinkSheetName: java.lang.String): scala.Unit
  /**
    * sets the target URL of the link.
    *
    * A {@link SheetLink} object with the same file name must exist already or the link will not work.
    */
  def setLinkUrl(aLinkUrl: java.lang.String): scala.Unit
}

object XSheetLinkable {
  @scala.inline
  def apply(
    LinkMode: SheetLinkMode,
    LinkSheetName: java.lang.String,
    LinkUrl: java.lang.String,
    acquire: () => scala.Unit,
    getLinkMode: () => SheetLinkMode,
    getLinkSheetName: () => java.lang.String,
    getLinkUrl: () => java.lang.String,
    link: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, SheetLinkMode) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setLinkMode: SheetLinkMode => scala.Unit,
    setLinkSheetName: java.lang.String => scala.Unit,
    setLinkUrl: java.lang.String => scala.Unit
  ): XSheetLinkable = {
    val __obj = js.Dynamic.literal(LinkMode = LinkMode, LinkSheetName = LinkSheetName, LinkUrl = LinkUrl, acquire = js.Any.fromFunction0(acquire), getLinkMode = js.Any.fromFunction0(getLinkMode), getLinkSheetName = js.Any.fromFunction0(getLinkSheetName), getLinkUrl = js.Any.fromFunction0(getLinkUrl), link = js.Any.fromFunction5(link), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLinkMode = js.Any.fromFunction1(setLinkMode), setLinkSheetName = js.Any.fromFunction1(setLinkSheetName), setLinkUrl = js.Any.fromFunction1(setLinkUrl))
  
    __obj.asInstanceOf[XSheetLinkable]
  }
}

