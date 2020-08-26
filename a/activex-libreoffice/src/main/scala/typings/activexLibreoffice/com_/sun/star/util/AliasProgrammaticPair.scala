package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents an entry from a component which implements the {@link XLocalizedAliases} . */
@js.native
trait AliasProgrammaticPair extends js.Object {
  /** determines the name which is registered as an alias for a programmatic name. */
  var Alias: String = js.native
  /**
    * determines which programmatic name belongs to the alias.
    * @see com.sun.star.util.XLocalizedAliases
    */
  var ProgrammaticName: String = js.native
}

object AliasProgrammaticPair {
  @scala.inline
  def apply(Alias: String, ProgrammaticName: String): AliasProgrammaticPair = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], ProgrammaticName = ProgrammaticName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasProgrammaticPair]
  }
  @scala.inline
  implicit class AliasProgrammaticPairOps[Self <: AliasProgrammaticPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlias(value: String): Self = this.set("Alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgrammaticName(value: String): Self = this.set("ProgrammaticName", value.asInstanceOf[js.Any])
  }
  
}

