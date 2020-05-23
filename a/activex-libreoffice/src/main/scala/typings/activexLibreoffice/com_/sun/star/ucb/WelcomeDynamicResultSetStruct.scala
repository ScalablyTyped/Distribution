package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct is to be contained in the first notification of an {@link XDynamicResultSet} .
  * @see XDynamicResultSet
  * @see ListEvent
  * @see ListAction
  * @see ListActionType
  */
trait WelcomeDynamicResultSetStruct extends js.Object {
  /** The static result set containing the new version of result set data. */
  var New: XResultSet
  /** The static result set containing the previous version of result set data. */
  var Old: XResultSet
}

object WelcomeDynamicResultSetStruct {
  @scala.inline
  def apply(New: XResultSet, Old: XResultSet): WelcomeDynamicResultSetStruct = {
    val __obj = js.Dynamic.literal(New = New.asInstanceOf[js.Any], Old = Old.asInstanceOf[js.Any])
    __obj.asInstanceOf[WelcomeDynamicResultSetStruct]
  }
}

