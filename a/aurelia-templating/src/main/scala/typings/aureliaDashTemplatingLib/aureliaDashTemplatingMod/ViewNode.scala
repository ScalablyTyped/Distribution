package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewNode extends js.Object {
  /**
    * Triggers the attach for the node and its children.
    */
  def attached(): scala.Unit = js.native
  /**
    * Binds the node and it's children.
    * @param bindingContext The binding context to bind to.
    * @param overrideContext A secondary binding context that can override the standard context.
    */
  def bind(bindingContext: js.Object): scala.Unit = js.native
  def bind(bindingContext: js.Object, overrideContext: js.Object): scala.Unit = js.native
  /**
    * Triggers the detach for the node and its children.
    */
  def detached(): scala.Unit = js.native
  /**
    * Unbinds the node and its children.
    */
  def unbind(): scala.Unit = js.native
}

