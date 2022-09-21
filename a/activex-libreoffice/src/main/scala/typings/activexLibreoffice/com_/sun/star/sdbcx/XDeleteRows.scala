package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for the deletion of more than one row at a time. */
trait XDeleteRows
  extends StObject
     with XInterface {
  
  /**
    * deletes one or more rows identified by their bookmarks.
    * @param rows list of bookmarks identifying the rows.
    * @returns an array of update counts containing one element for each row. The array is ordered according to the order in which bookmarks were given.
    * @throws com::sun::star::sdbc::SQLException if a fatal error occurs, for instance, the connection gets lost if bookmarks are used which do not belong to t
    */
  def deleteRows(rows: SeqEquiv[Any]): SafeArray[Double]
}
object XDeleteRows {
  
  inline def apply(
    acquire: () => Unit,
    deleteRows: SeqEquiv[Any] => SafeArray[Double],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDeleteRows = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), deleteRows = js.Any.fromFunction1(deleteRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDeleteRows]
  }
  
  extension [Self <: XDeleteRows](x: Self) {
    
    inline def setDeleteRows(value: SeqEquiv[Any] => SafeArray[Double]): Self = StObject.set(x, "deleteRows", js.Any.fromFunction1(value))
  }
}
