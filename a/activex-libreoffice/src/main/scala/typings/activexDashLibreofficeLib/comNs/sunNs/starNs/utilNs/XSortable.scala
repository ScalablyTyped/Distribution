package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to sort the contents of this object.
  *
  * The available properties describing the sort criteria are defined in the sort descriptor implemented by the object that implements this interface.
  *
  * There are older deprecated sort descriptors:
  *
  * {@link com.sun.star.util.SortDescriptor}{@link com.sun.star.table.TableSortDescriptor}{@link com.sun.star.text.TextSortDescriptor}
  *
  * And a new set of sort descriptors:
  *
  * {@link com.sun.star.util.SortDescriptor2}{@link com.sun.star.table.TableSortDescriptor2}{@link com.sun.star.text.TextSortDescriptor2}
  *
  * Both types may be implemented by the same object. When calling the sort method however properties from different descriptors must not be mixed.
  */
trait XSortable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns a sequence of properties which allows to specify/modify the sort criteria.  The set of properties is specific to the type of object that implemen
    * @see com.sun.star.util.SortDescriptor
    * @see com.sun.star.table.TableSortDescriptor
    * @see com.sun.star.text.TextSortDescriptor
    * @see com.sun.star.util.SortDescriptor2
    * @see com.sun.star.table.TableSortDescriptor2
    * @see com.sun.star.text.TextSortDescriptor2
    */
  def createSortDescriptor(): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * sorts the contents of the object according to the specified properties.
    *
    * The specified properties are usually the same or a subset of those obtained by calling {@link createSortDescriptor()} on the same type of object.
    * @see com.sun.star.util.SortDescriptor
    * @see com.sun.star.table.TableSortDescriptor
    * @see com.sun.star.text.TextSortDescriptor
    * @see com.sun.star.util.SortDescriptor2
    * @see com.sun.star.table.TableSortDescriptor2
    * @see com.sun.star.text.TextSortDescriptor2
    */
  def sort(
    xDescriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XSortable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createSortDescriptor: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    sort: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Unit
  ): XSortable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSortDescriptor = js.Any.fromFunction0(createSortDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[XSortable]
  }
}

