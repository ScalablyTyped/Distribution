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
    acquire: js.Function0[scala.Unit],
    getContent: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getReferencePosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    getType: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setContent: js.Function1[java.lang.String, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setReferencePosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Unit],
    setType: js.Function1[scala.Double, scala.Unit]
  ): XNamedRange = {
    val __obj = js.Dynamic.literal(Content = Content, Name = Name, ReferencePosition = ReferencePosition, Type = Type, acquire = acquire, getContent = getContent, getName = getName, getReferencePosition = getReferencePosition, getType = getType, queryInterface = queryInterface, release = release, setContent = setContent, setName = setName, setReferencePosition = setReferencePosition, setType = setType)
  
    __obj.asInstanceOf[XNamedRange]
  }
}

