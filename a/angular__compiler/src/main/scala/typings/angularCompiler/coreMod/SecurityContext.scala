package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecurityContext extends StObject
@JSImport("@angular/compiler/src/core", "SecurityContext")
@js.native
object SecurityContext extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecurityContext & Double] = js.native
  
  @js.native
  sealed trait HTML
    extends StObject
       with SecurityContext
  /* 1 */ val HTML: typings.angularCompiler.coreMod.SecurityContext.HTML & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with SecurityContext
  /* 0 */ val NONE: typings.angularCompiler.coreMod.SecurityContext.NONE & Double = js.native
  
  @js.native
  sealed trait RESOURCE_URL
    extends StObject
       with SecurityContext
  /* 5 */ val RESOURCE_URL: typings.angularCompiler.coreMod.SecurityContext.RESOURCE_URL & Double = js.native
  
  @js.native
  sealed trait SCRIPT
    extends StObject
       with SecurityContext
  /* 3 */ val SCRIPT: typings.angularCompiler.coreMod.SecurityContext.SCRIPT & Double = js.native
  
  @js.native
  sealed trait STYLE
    extends StObject
       with SecurityContext
  /* 2 */ val STYLE: typings.angularCompiler.coreMod.SecurityContext.STYLE & Double = js.native
  
  @js.native
  sealed trait URL
    extends StObject
       with SecurityContext
  /* 4 */ val URL: typings.angularCompiler.coreMod.SecurityContext.URL & Double = js.native
}
