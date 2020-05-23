package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents an entry from a component which implements the {@link XLocalizedAliases} . */
trait AliasProgrammaticPair extends js.Object {
  /** determines the name which is registered as an alias for a programmatic name. */
  var Alias: String
  /**
    * determines which programmatic name belongs to the alias.
    * @see com.sun.star.util.XLocalizedAliases
    */
  var ProgrammaticName: String
}

object AliasProgrammaticPair {
  @scala.inline
  def apply(Alias: String, ProgrammaticName: String): AliasProgrammaticPair = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], ProgrammaticName = ProgrammaticName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasProgrammaticPair]
  }
}

