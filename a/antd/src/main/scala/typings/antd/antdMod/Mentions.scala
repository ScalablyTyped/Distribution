package typings.antd.antdMod

import typings.antd.libMentionsMod.MentionsConfig
import typings.antd.libMentionsMod.MentionsEntity
import typings.antd.libMentionsMod.default
import typings.rcDashMentions.libOptionMod.OptionProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Mentions")
@js.native
class Mentions () extends default

/* static members */
@JSImport("antd", "Mentions")
@js.native
object Mentions extends js.Object {
  var Option: FunctionComponent[OptionProps] = js.native
  def getMentions(): js.Array[MentionsEntity] = js.native
  def getMentions(value: String): js.Array[MentionsEntity] = js.native
  def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
}

