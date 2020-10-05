package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecurityContext extends js.Object

@JSImport("@angular/compiler/src/core", "SecurityContext")
@js.native
object SecurityContext extends js.Object {
  @js.native
  sealed trait HTML extends SecurityContext
  
  @js.native
  sealed trait NONE extends SecurityContext
  
  @js.native
  sealed trait RESOURCE_URL extends SecurityContext
  
  @js.native
  sealed trait SCRIPT extends SecurityContext
  
  @js.native
  sealed trait STYLE extends SecurityContext
  
  @js.native
  sealed trait URL extends SecurityContext
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecurityContext with Double] = js.native
  /* 1 */ @js.native
  object HTML extends TopLevel[HTML with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 5 */ @js.native
  object RESOURCE_URL extends TopLevel[RESOURCE_URL with Double]
  
  /* 3 */ @js.native
  object SCRIPT extends TopLevel[SCRIPT with Double]
  
  /* 2 */ @js.native
  object STYLE extends TopLevel[STYLE with Double]
  
  /* 4 */ @js.native
  object URL extends TopLevel[URL with Double]
  
}

