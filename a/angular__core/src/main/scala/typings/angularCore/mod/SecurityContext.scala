package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecurityContext extends js.Object
@JSImport("@angular/core", "SecurityContext")
@js.native
object SecurityContext extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecurityContext with Double] = js.native
  
  @js.native
  sealed trait HTML extends SecurityContext
  /* 1 */ @js.native
  object HTML extends TopLevel[HTML with Double]
  
  @js.native
  sealed trait NONE extends SecurityContext
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait RESOURCE_URL extends SecurityContext
  /* 5 */ @js.native
  object RESOURCE_URL extends TopLevel[RESOURCE_URL with Double]
  
  @js.native
  sealed trait SCRIPT extends SecurityContext
  /* 3 */ @js.native
  object SCRIPT extends TopLevel[SCRIPT with Double]
  
  @js.native
  sealed trait STYLE extends SecurityContext
  /* 2 */ @js.native
  object STYLE extends TopLevel[STYLE with Double]
  
  @js.native
  sealed trait URL extends SecurityContext
  /* 4 */ @js.native
  object URL extends TopLevel[URL with Double]
}
