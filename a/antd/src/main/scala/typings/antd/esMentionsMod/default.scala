package typings.antd.esMentionsMod

import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/mentions", JSImport.Default)
@js.native
class default () extends Mentions

/* static members */
@JSImport("antd/es/mentions", JSImport.Default)
@js.native
object default extends js.Object {
  var Option: FunctionComponent[typings.rcDashMentions.libOptionMod.OptionProps] = js.native
  def getMentions(): js.Array[MentionsEntity] = js.native
  def getMentions(value: String): js.Array[MentionsEntity] = js.native
  def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
}

