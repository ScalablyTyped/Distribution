package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of what a factory function should look like.
  */
@js.native
trait FactoryFn[T] extends js.Object {
  /**
    * If no constructor to instantiate is provided, an instance of type T itself is created.
    */
  def apply(t: js.UndefOr[scala.Nothing]): T = js.native
  /**
    * Subclasses without an explicit constructor call through to the factory of their base
    * definition, providing it with their own constructor to instantiate.
    */
  def apply[U /* <: T */](t: Type[U]): U = js.native
}

