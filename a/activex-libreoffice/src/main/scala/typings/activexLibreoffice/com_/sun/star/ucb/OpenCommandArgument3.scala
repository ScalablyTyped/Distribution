package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extended argument for commands like "open"
  *
  * We're extending {@link OpenCommandArgument} even more, to provide some opening flags on to webdav.
  * @see XCommandProcessor
  */
trait OpenCommandArgument3 extends OpenCommandArgument2 {
  /**
    * Flags to use for opening.
    *
    * WebDav e.g. uses "KeepAlive" to enable/disable the respective http feature.
    */
  var OpeningFlags: SafeArray[NamedValue]
}

object OpenCommandArgument3 {
  @scala.inline
  def apply(
    Mode: Double,
    OpeningFlags: SafeArray[NamedValue],
    Priority: Double,
    Properties: SafeArray[Property],
    Sink: XInterface,
    SortingInfo: SafeArray[NumberedSortingInfo]
  ): OpenCommandArgument3 = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], OpeningFlags = OpeningFlags.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Sink = Sink.asInstanceOf[js.Any], SortingInfo = SortingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCommandArgument3]
  }
}

