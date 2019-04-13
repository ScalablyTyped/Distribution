package typings
package allureDashJsDashCommonsLib.allureDashJsDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPE extends js.Object

@JSImport("allure-js-commons", "TYPE")
@js.native
object TYPE extends js.Object {
  @js.native
  sealed trait HTML
    extends allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.TYPE
  
  @js.native
  sealed trait MARKDOWN
    extends allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.TYPE
  
  @js.native
  sealed trait TEXT
    extends allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.TYPE
  
  /* "html" */ val HTML: HTML with java.lang.String = js.native
  /* "markdown" */ val MARKDOWN: MARKDOWN with java.lang.String = js.native
  /* "text" */ val TEXT: TEXT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.TYPE with java.lang.String] = js.native
}

