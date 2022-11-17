package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ForwardRefHandling {
  
  /** The expression was not wrapped in a `forwardRef()` call in the first place. */
  inline def None: 0 = 0.asInstanceOf[0]
  
  /** The expression was wrapped in a `forwardRef()` call but has since been unwrapped. */
  inline def Unwrapped: 2 = 2.asInstanceOf[2]
  
  /** The expression is still wrapped in a `forwardRef()` call. */
  inline def Wrapped: 1 = 1.asInstanceOf[1]
}
