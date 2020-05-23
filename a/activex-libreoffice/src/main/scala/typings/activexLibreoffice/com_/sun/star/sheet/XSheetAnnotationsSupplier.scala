package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a collection of cell annotations. */
trait XSheetAnnotationsSupplier extends XInterface {
  /**
    * returns the collection of cell annotations.
    * @see com.sun.star.sheet.CellAnnotations
    */
  val Annotations: XSheetAnnotations
  /**
    * returns the collection of cell annotations.
    * @see com.sun.star.sheet.CellAnnotations
    */
  def getAnnotations(): XSheetAnnotations
}

object XSheetAnnotationsSupplier {
  @scala.inline
  def apply(
    Annotations: XSheetAnnotations,
    acquire: () => Unit,
    getAnnotations: () => XSheetAnnotations,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetAnnotationsSupplier = {
    val __obj = js.Dynamic.literal(Annotations = Annotations.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAnnotations = js.Any.fromFunction0(getAnnotations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetAnnotationsSupplier]
  }
}

