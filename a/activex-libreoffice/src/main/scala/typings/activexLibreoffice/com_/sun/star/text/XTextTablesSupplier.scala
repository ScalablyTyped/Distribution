package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables the object to handle text tables. */
@js.native
trait XTextTablesSupplier extends XInterface {
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  val TextTables: XNameAccess = js.native
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  def getTextTables(): XNameAccess = js.native
}

object XTextTablesSupplier {
  @scala.inline
  def apply(
    TextTables: XNameAccess,
    acquire: () => Unit,
    getTextTables: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextTablesSupplier = {
    val __obj = js.Dynamic.literal(TextTables = TextTables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTextTables = js.Any.fromFunction0(getTextTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextTablesSupplier]
  }
  @scala.inline
  implicit class XTextTablesSupplierOps[Self <: XTextTablesSupplier] (val x: Self) extends AnyVal {
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
    def setTextTables(value: XNameAccess): Self = this.set("TextTables", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTextTables(value: () => XNameAccess): Self = this.set("getTextTables", js.Any.fromFunction0(value))
  }
  
}

