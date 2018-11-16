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
  var value: js.UndefOr[T]
  /**
       * Factory method to execute to create an instance of the injectable.
       */
  def factory(): T
}

