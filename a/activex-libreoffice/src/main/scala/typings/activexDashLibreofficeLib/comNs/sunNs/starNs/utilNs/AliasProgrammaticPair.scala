package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents an entry from a component which implements the {@link XLocalizedAliases} . */
trait AliasProgrammaticPair extends js.Object {
  /** determines the name which is registered as an alias for a programmatic name. */
  var Alias: java.lang.String
  /**
    * determines which programmatic name belongs to the alias.
    * @see com.sun.star.util.XLocalizedAliases
    */
  var ProgrammaticName: java.lang.String
}

object AliasProgrammaticPair {
  @scala.inline
  def apply(Alias: java.lang.String, ProgrammaticName: java.lang.String): AliasProgrammaticPair = {
    val __obj = js.Dynamic.literal(Alias = Alias, ProgrammaticName = ProgrammaticName)
  
    __obj.asInstanceOf[AliasProgrammaticPair]
  }
}

