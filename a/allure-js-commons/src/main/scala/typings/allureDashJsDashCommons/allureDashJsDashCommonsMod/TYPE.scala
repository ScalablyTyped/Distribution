package typings.allureDashJsDashCommons.allureDashJsDashCommonsMod

import org.scalablytyped.runtime.TopLevel
import typings.allureDashJsDashCommons.allureDashJsDashCommonsMod.TYPE.HTML
import typings.allureDashJsDashCommons.allureDashJsDashCommonsMod.TYPE.MARKDOWN
import typings.allureDashJsDashCommons.allureDashJsDashCommonsMod.TYPE.TEXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPE extends js.Object

@JSImport("allure-js-commons", "TYPE")
@js.native
object TYPE extends js.Object {
  @js.native
  sealed trait HTML extends TYPE
  
  @js.native
  sealed trait MARKDOWN extends TYPE
  
  @js.native
  sealed trait TEXT extends TYPE
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TYPE with String] = js.native
  /* "html" */ @js.native
  object HTML extends TopLevel[HTML with String]
  
  /* "markdown" */ @js.native
  object MARKDOWN extends TopLevel[MARKDOWN with String]
  
  /* "text" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
}

