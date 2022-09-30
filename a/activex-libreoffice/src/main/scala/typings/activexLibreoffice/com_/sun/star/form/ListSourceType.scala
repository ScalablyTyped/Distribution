package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import typings.activexLibreoffice.activexLibreofficeInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the kind of data source used to fill the list data of a listbox or a combobox control.
  * @see com.sun.star.form.component.ListBox
  * @see com.sun.star.form.component.ComboBox
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`5`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait ListSourceType extends StObject
object ListSourceType {
  
  /** The control should be filled with the results of a database query. */
  inline def QUERY: `2` = 2.asInstanceOf[`2`]
  
  /** The control should be filled with the results of a database statement. */
  inline def SQL: `3` = 3.asInstanceOf[`3`]
  
  /** The control should be filled with the results of a database statement, which is not evaluated by the database engine. */
  inline def SQLPASSTHROUGH: `4` = 4.asInstanceOf[`4`]
  
  /** The control should be filled with the data of a table. */
  inline def TABLE: `1` = 1.asInstanceOf[`1`]
  
  /** The control should be filled with the field names of a database table. */
  inline def TABLEFIELDS: `5` = 5.asInstanceOf[`5`]
  
  /** The control should be filled with a list of string values. */
  inline def VALUELIST: `0` = 0.asInstanceOf[`0`]
}
