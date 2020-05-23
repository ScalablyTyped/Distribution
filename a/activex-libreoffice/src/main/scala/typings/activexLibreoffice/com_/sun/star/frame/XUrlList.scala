package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XUrlList extends XInterface {
  var List: SafeArray[String]
}

object XUrlList {
  @scala.inline
  def apply(
    List: SafeArray[String],
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUrlList = {
    val __obj = js.Dynamic.literal(List = List.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUrlList]
  }
}

