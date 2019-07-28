package typings.antd.esMod

import typings.antd.esMentionsMod.MentionsConfig
import typings.antd.esMentionsMod.MentionsEntity
import typings.antd.esMentionsMod.default
import typings.rcDashMentions.libOptionMod.OptionProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Mentions")
@js.native
class Mentions () extends default

/* static members */
@JSImport("antd/es", "Mentions")
@js.native
object Mentions extends js.Object {
  var Option: FunctionComponent[OptionProps] = js.native
  def getMentions(): js.Array[MentionsEntity] = js.native
  def getMentions(value: String): js.Array[MentionsEntity] = js.native
  def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
}

