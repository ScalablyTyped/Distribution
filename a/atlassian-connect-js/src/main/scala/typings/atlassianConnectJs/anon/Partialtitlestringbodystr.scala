package typings.atlassianConnectJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.atlassianConnectJs.atlassianConnectJsStrings.auto
import typings.atlassianConnectJs.atlassianConnectJsStrings.error
import typings.atlassianConnectJs.atlassianConnectJsStrings.info
import typings.atlassianConnectJs.atlassianConnectJsStrings.manual
import typings.atlassianConnectJs.atlassianConnectJsStrings.success
import typings.atlassianConnectJs.atlassianConnectJsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  title  :string,   body  :string,   type  :'info' | 'success' | 'warning' | 'error',   close  :'manual' | 'auto',   actions  :{[key: string] : string}}> */
trait Partialtitlestringbodystr extends js.Object {
  var actions: js.UndefOr[StringDictionary[String]] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var close: js.UndefOr[manual | auto] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[info | success | warning | error] = js.undefined
}

object Partialtitlestringbodystr {
  @scala.inline
  def apply(
    actions: StringDictionary[String] = null,
    body: String = null,
    close: manual | auto = null,
    title: String = null,
    `type`: info | success | warning | error = null
  ): Partialtitlestringbodystr = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialtitlestringbodystr]
  }
}

