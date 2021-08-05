package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines a depth for a lock.
  * @see Lock
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait LockDepth extends StObject
object LockDepth {
  
  /** Infinity (includes children and children's children and ...). */
  inline def INFINITY: `2` = 2.asInstanceOf[`2`]
  
  /** One (includes children). */
  inline def ONE: `1` = 1.asInstanceOf[`1`]
  
  /** Zero (includes no children). */
  inline def ZERO: `0` = 0.asInstanceOf[`0`]
}
