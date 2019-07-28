package typings.atom

import typings.atom.atomMod.ContextMenuOptions
import typings.atom.atomStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Separator extends ContextMenuOptions {
  var `type`: separator
}

object Anon_Separator {
  @scala.inline
  def apply(`type`: separator): Anon_Separator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Separator]
  }
}

