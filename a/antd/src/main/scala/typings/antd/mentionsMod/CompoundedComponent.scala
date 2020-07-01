package typings.antd.mentionsMod

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.SFC
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompoundedComponent extends ForwardRefExoticComponent[MentionProps with RefAttributes[HTMLElement]] {
  var Option: SFC[typings.rcMentions.optionMod.OptionProps] = js.native
  def getMentions(value: String): js.Array[MentionsEntity] = js.native
  def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
}

