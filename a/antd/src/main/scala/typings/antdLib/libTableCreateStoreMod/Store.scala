package typings
package antdLib.libTableCreateStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  def getState(): js.Any
  def setState(partial: js.Object): scala.Unit
  def subscribe(listener: js.Function0[scala.Unit]): js.Function0[scala.Unit]
}

object Store {
  @scala.inline
  def apply(
    getState: () => js.Any,
    setState: js.Object => scala.Unit,
    subscribe: js.Function0[scala.Unit] => js.Function0[scala.Unit]
  ): Store = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState), subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[Store]
  }
}

