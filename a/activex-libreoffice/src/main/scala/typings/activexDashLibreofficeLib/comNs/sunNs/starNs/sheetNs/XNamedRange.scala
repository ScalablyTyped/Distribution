package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a named range in a spreadsheet document.
  * @see com.sun.star.sheet.NamedRange
  */
trait XNamedRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /**
    * returns the content of the named range.
    *
    * The content can be a reference to a cell or cell range or any formula expression.
    */
  var Content: java.lang.String
  /** returns the position in the document which is used as a base for relative references in the content. */
  var ReferencePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /**
    * returns the type of the named range.
    *
    * This is a combination of flags as defined in {@link NamedRangeFlag} .
    */
  var Type: scala.Double
  /**
    * returns the content of the named range.
    *
    * The content can be a reference to a cell or cell range or any formula expression.
    */
  def getContent(): java.lang.String
  /** returns the position in the document which is used as a base for relative references in the content. */
  def getReferencePosition(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /**
    * returns the type of the named range.
    *
    * This is a combination of flags as defined in {@link NamedRangeFlag} .
    */
  def getType(): scala.Double
  /**
    * sets the content of the named range.
    *
    * The content can be a reference to a cell or cell range or any formula expression.
    */
  def setContent(aContent: java.lang.String): scala.Unit
  /** sets the position in the document which is used as a base for relative references in the content. */
  def setReferencePosition(aReferencePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Unit
  /**
    * sets the type of the named range.
    * @param nType a combination of flags that specify the type of a named range, as defined in {@link NamedRangeFlag} .
    */
  def setType(nType: scala.Double): scala.Unit
}

object XNamedRange {
  @scala.inline
  def apply(
    Content: java.lang.String,
    Name: java.lang.String,
    ReferencePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    Type: scala.Double,
    acquire: () => scala.Unit,
    getContent: () => java.lang.String,
    getName: () => java.lang.String,
    getReferencePosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    getType: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setContent: java.lang.String => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setReferencePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Unit,
    setType: scala.Double => scala.Unit
  ): XNamedRange = {
    val __obj = js.Dynamic.literal(Content = Content, Name = Name, ReferencePosition = ReferencePosition, Type = Type, acquire = js.Any.fromFunction0(acquire), getContent = js.Any.fromFunction0(getContent), getName = js.Any.fromFunction0(getName), getReferencePosition = js.Any.fromFunction0(getReferencePosition), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContent = js.Any.fromFunction1(setContent), setName = js.Any.fromFunction1(setName), setReferencePosition = js.Any.fromFunction1(setReferencePosition), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[XNamedRange]
  }
}

