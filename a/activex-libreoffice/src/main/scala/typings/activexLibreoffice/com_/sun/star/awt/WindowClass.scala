package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the class of a window. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait WindowClass extends StObject
object WindowClass {
  
  /** is a container that may contain other components. It is not a top window. */
  inline def CONTAINER: `2` = 2.asInstanceOf[`2`]
  
  /** is a modal top level window on the desktop. It is also a container. */
  inline def MODALTOP: `1` = 1.asInstanceOf[`1`]
  
  /** is the simplest window. It can be a container. */
  inline def SIMPLE: `3` = 3.asInstanceOf[`3`]
  
  /** specifies a top level window on the desktop. It is also a container. */
  inline def TOP: `0` = 0.asInstanceOf[`0`]
}
