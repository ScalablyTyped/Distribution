package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MethodMode denotes the mode in which method calls are run, i.e. either oneway or twoway. Mode oneway denotes that a call may be run asynchronously
  * (thus having no out parameters or return value)
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait MethodMode extends StObject
object MethodMode {
  
  /** method may be run asynchronously */
  inline def ONEWAY: `0` = 0.asInstanceOf[`0`]
  
  /** method is run The */
  inline def TWOWAY: `1` = 1.asInstanceOf[`1`]
}
