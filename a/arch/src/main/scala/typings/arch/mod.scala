package typings.arch

import typings.arch.archStrings.x64
import typings.arch.archStrings.x86
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): x64 | x86 = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[x64 | x86]
  
  @JSImport("arch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
