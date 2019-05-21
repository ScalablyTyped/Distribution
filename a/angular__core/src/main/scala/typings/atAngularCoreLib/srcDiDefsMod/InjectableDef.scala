package typings
package atAngularCoreLib.srcDiDefsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectableDef[T] extends js.Object {
  /**
    * Specifies that the given type belongs to a particular injector:
    * - `InjectorType` such as `NgModule`,
    * - `'root'` the root injector
    * - `'any'` all injectors.
    * - `null`, does not belong to any injector. Must be explicitly listed in the injector
    *   `providers`.
    */
  var providedIn: InjectorType[_] | atAngularCoreLib.atAngularCoreLibStrings.root | atAngularCoreLib.atAngularCoreLibStrings.any | scala.Null
  /**
    * In a case of no explicit injector, a location where the instance of the injectable is stored.
    */
  var value: js.UndefOr[T] = js.undefined
  /**
    * Factory method to execute to create an instance of the injectable.
    */
  def factory(): T
}

object InjectableDef {
  @scala.inline
  def apply[T](
    factory: () => T,
    providedIn: InjectorType[_] | atAngularCoreLib.atAngularCoreLibStrings.root | atAngularCoreLib.atAngularCoreLibStrings.any = null,
    value: T = null
  ): InjectableDef[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableDef[T]]
  }
}

