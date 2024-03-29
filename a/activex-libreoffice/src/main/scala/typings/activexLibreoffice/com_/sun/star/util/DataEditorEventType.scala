package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the type of an event from an {@link XDataEditor} . */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait DataEditorEventType extends StObject
object DataEditorEventType {
  
  /** specifies that the data editing was canceled by the user (data not stored). */
  inline def CANCELED: `1` = 1.asInstanceOf[`1`]
  
  /** specifies that the data editing is done (data stored). */
  inline def DONE: `0` = 0.asInstanceOf[`0`]
}
