package typings.allureJsCommons.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TYPE extends js.Object
@JSImport("allure-js-commons", "TYPE")
@js.native
object TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TYPE with String] = js.native
  
  @js.native
  sealed trait HTML extends TYPE
  /* "html" */ @js.native
  object HTML extends TopLevel[HTML with String]
  
  @js.native
  sealed trait MARKDOWN extends TYPE
  /* "markdown" */ @js.native
  object MARKDOWN extends TopLevel[MARKDOWN with String]
  
  @js.native
  sealed trait TEXT extends TYPE
  /* "text" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
}
