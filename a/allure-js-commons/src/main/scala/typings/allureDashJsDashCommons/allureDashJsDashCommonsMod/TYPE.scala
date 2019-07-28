package typings.allureDashJsDashCommons.allureDashJsDashCommonsMod

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
  
  /* "html" */ val HTML: typings.allureDashJsDashCommons.allureDashJsDashCommonsMod.TYPE.HTML with String = js.native
  /* "markdown" */ val MARKDOWN: typings.allureDashJsDashCommons.allureDashJsDashCommonsMod.TYPE.MARKDOWN with String = js.native
  /* "text" */ val TEXT: typings.allureDashJsDashCommons.allureDashJsDashCommonsMod.TYPE.TEXT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TYPE with String] = js.native
}

