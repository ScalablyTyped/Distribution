package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to change the settings of a linked cell range.
  * @see com.sun.star.sheet.CellAreaLink
  */
@js.native
trait XAreaLink extends XInterface {
  /** returns the position of the linked range in the destination document. */
  var DestArea: CellRangeAddress = js.native
  /**
    * returns the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  var SourceArea: String = js.native
  /** returns the position of the linked range in the destination document. */
  def getDestArea(): CellRangeAddress = js.native
  /**
    * returns the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  def getSourceArea(): String = js.native
  /** sets the position of the linked range in the destination document. */
  def setDestArea(aDestArea: CellRangeAddress): Unit = js.native
  /**
    * sets the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  def setSourceArea(aSourceArea: String): Unit = js.native
}

object XAreaLink {
  @scala.inline
  def apply(
    DestArea: CellRangeAddress,
    SourceArea: String,
    acquire: () => Unit,
    getDestArea: () => CellRangeAddress,
    getSourceArea: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDestArea: CellRangeAddress => Unit,
    setSourceArea: String => Unit
  ): XAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea.asInstanceOf[js.Any], SourceArea = SourceArea.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDestArea = js.Any.fromFunction0(getDestArea), getSourceArea = js.Any.fromFunction0(getSourceArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDestArea = js.Any.fromFunction1(setDestArea), setSourceArea = js.Any.fromFunction1(setSourceArea))
    __obj.asInstanceOf[XAreaLink]
  }
  @scala.inline
  implicit class XAreaLinkOps[Self <: XAreaLink] (val x: Self) extends AnyVal {
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
    def setDestArea(value: CellRangeAddress): Self = this.set("DestArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceArea(value: String): Self = this.set("SourceArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDestArea(value: () => CellRangeAddress): Self = this.set("getDestArea", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSourceArea(value: () => String): Self = this.set("getSourceArea", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDestArea(value: CellRangeAddress => Unit): Self = this.set("setDestArea", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSourceArea(value: String => Unit): Self = this.set("setSourceArea", js.Any.fromFunction1(value))
  }
  
}

