package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a named range in a spreadsheet document.
  * @see com.sun.star.sheet.NamedRange
  */
@js.native
trait XNamedRange extends XNamed {
  /**
    * returns the content of the named range.
    *
    * The content can be a reference to a cell or cell range or any formula expression.
    */
  var Content: String = js.native
  /** returns the position in the document which is used as a base for relative references in the content. */
  var ReferencePosition: CellAddress = js.native
  /**
    * returns the type of the named range.
    *
    * This is a combination of flags as defined in {@link NamedRangeFlag} .
    */
  var Type: Double = js.native
  /**
    * returns the content of the named range.
    *
    * The content can be a reference to a cell or cell range or any formula expression.
    */
  def getContent(): String = js.native
  /** returns the position in the document which is used as a base for relative references in the content. */
  def getReferencePosition(): CellAddress = js.native
  /**
    * returns the type of the named range.
    *
    * This is a combination of flags as defined in {@link NamedRangeFlag} .
    */
  def getType(): Double = js.native
  /**
    * sets the content of the named range.
    *
    * The content can be a reference to a cell or cell range or any formula expression.
    */
  def setContent(aContent: String): Unit = js.native
  /** sets the position in the document which is used as a base for relative references in the content. */
  def setReferencePosition(aReferencePosition: CellAddress): Unit = js.native
  /**
    * sets the type of the named range.
    * @param nType a combination of flags that specify the type of a named range, as defined in {@link NamedRangeFlag} .
    */
  def setType(nType: Double): Unit = js.native
}

object XNamedRange {
  @scala.inline
  def apply(
    Content: String,
    Name: String,
    ReferencePosition: CellAddress,
    Type: Double,
    acquire: () => Unit,
    getContent: () => String,
    getName: () => String,
    getReferencePosition: () => CellAddress,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setContent: String => Unit,
    setName: String => Unit,
    setReferencePosition: CellAddress => Unit,
    setType: Double => Unit
  ): XNamedRange = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReferencePosition = ReferencePosition.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContent = js.Any.fromFunction0(getContent), getName = js.Any.fromFunction0(getName), getReferencePosition = js.Any.fromFunction0(getReferencePosition), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContent = js.Any.fromFunction1(setContent), setName = js.Any.fromFunction1(setName), setReferencePosition = js.Any.fromFunction1(setReferencePosition), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XNamedRange]
  }
  @scala.inline
  implicit class XNamedRangeOps[Self <: XNamedRange] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencePosition(value: CellAddress): Self = this.set("ReferencePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContent(value: () => String): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetReferencePosition(value: () => CellAddress): Self = this.set("getReferencePosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => Double): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setSetContent(value: String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetReferencePosition(value: CellAddress => Unit): Self = this.set("setReferencePosition", js.Any.fromFunction1(value))
    @scala.inline
    def setSetType(value: Double => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
  }
  
}

