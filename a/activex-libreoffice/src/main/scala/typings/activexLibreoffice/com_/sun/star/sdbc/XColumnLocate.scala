package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility to find columns by their name.
  *
  * When several columns have the same name, then the value of the first matching column will be returned. The column name option is designed to be used
  * when column names are used in the SQL query. For columns that are NOT explicitly named in the query, it is best to use column numbers. If column names
  * are used, there is no way for the programmer to guarantee that they actually refer to the intended columns.
  */
trait XColumnLocate
  extends StObject
     with XInterface {
  
  /**
    * maps the given {@link ResultSet} column name to its {@link ResultSet} column index.
    *
    * The specification before LibreOffice 4.2 left unspecified what should happen for an invalid column name. As a result some drivers written against the
    * older speification may return a special invalid value, such as a negative number, zero, or a number greater than the number of columns.
    * @param columnName the name of the column
    * @returns the position of the column
    * @throws SQLException if the column named `columnName` does not exist, or a database access error occurs.
    */
  def findColumn(columnName: String): Double
}
object XColumnLocate {
  
  inline def apply(
    acquire: () => Unit,
    findColumn: String => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XColumnLocate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), findColumn = js.Any.fromFunction1(findColumn), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XColumnLocate]
  }
  
  extension [Self <: XColumnLocate](x: Self) {
    
    inline def setFindColumn(value: String => Double): Self = StObject.set(x, "findColumn", js.Any.fromFunction1(value))
  }
}
