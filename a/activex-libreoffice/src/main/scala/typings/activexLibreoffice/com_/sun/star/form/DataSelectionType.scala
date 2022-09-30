package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the type of datasource used for a form.
  *
  * Please do **not** use anymore, this enum is deprecated.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait DataSelectionType extends StObject
object DataSelectionType {
  
  /** The control should be filled with the results of a database query. */
  inline def QUERY: `1` = 1.asInstanceOf[`1`]
  
  /** The control should be filled with the results of a database statement. */
  inline def SQL: `2` = 2.asInstanceOf[`2`]
  
  /** The control should be filled with the results of a database statement, which is not evaluated by the database engine. */
  inline def SQLPASSTHROUGH: `3` = 3.asInstanceOf[`3`]
  
  /** The control should be filled with the data of a table. */
  inline def TABLE: `0` = 0.asInstanceOf[`0`]
}
