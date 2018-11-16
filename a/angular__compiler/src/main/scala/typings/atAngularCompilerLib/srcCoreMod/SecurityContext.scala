package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SecurityContext extends js.Object

@JSImport("@angular/compiler/src/core", "SecurityContext")
@js.native
object SecurityContext extends js.Object {
  @js.native
  sealed trait HTML
    extends atAngularCompilerLib.srcCoreMod.SecurityContext
  
  @js.native
  sealed trait NONE
    extends atAngularCompilerLib.srcCoreMod.SecurityContext
  
  @js.native
  sealed trait RESOURCE_URL
    extends atAngularCompilerLib.srcCoreMod.SecurityContext
  
  @js.native
  sealed trait SCRIPT
    extends atAngularCompilerLib.srcCoreMod.SecurityContext
  
  @js.native
  sealed trait STYLE
    extends atAngularCompilerLib.srcCoreMod.SecurityContext
  
  @js.native
  sealed trait URL
    extends atAngularCompilerLib.srcCoreMod.SecurityContext
  
  /* 1 */ val HTML: HTML with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 5 */ val RESOURCE_URL: RESOURCE_URL with scala.Double = js.native
  /* 3 */ val SCRIPT: SCRIPT with scala.Double = js.native
  /* 2 */ val STYLE: STYLE with scala.Double = js.native
  /* 4 */ val URL: URL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.SecurityContext with scala.Double] = js.native
}

