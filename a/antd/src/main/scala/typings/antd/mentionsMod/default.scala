package typings.antd.mentionsMod

import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/mentions", JSImport.Default)
@js.native
class default () extends Mentions

/* static members */
@JSImport("antd/lib/mentions", JSImport.Default)
@js.native
object default extends js.Object {
  var Option: FunctionComponent[typings.rcMentions.optionMod.OptionProps] = js.native
  def getMentions(): js.Array[MentionsEntity] = js.native
  def getMentions(value: String): js.Array[MentionsEntity] = js.native
  def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
}

