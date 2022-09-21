package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecurityContext extends StObject
@JSImport("@angular/compiler", "SecurityContext")
@js.native
object SecurityContext extends StObject {
  
  @js.native
  sealed trait HTML
    extends StObject
       with SecurityContext
  
  @js.native
  sealed trait NONE
    extends StObject
       with SecurityContext
  
  @js.native
  sealed trait RESOURCE_URL
    extends StObject
       with SecurityContext
  
  @js.native
  sealed trait SCRIPT
    extends StObject
       with SecurityContext
  
  @js.native
  sealed trait STYLE
    extends StObject
       with SecurityContext
  
  @js.native
  sealed trait URL
    extends StObject
       with SecurityContext
}
