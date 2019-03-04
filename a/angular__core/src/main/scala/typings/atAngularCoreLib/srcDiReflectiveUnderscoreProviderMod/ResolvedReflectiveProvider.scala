package typings
package atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedReflectiveProvider extends js.Object {
  /**
    * A key, usually a `Type<any>`.
    */
  var key: atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey
  /**
    * Indicates if the provider is a multi-provider or a regular provider.
    */
  var multiProvider: scala.Boolean
  /**
    * Factory function which can return an instance of an object represented by a key.
    */
  var resolvedFactories: js.Array[ResolvedReflectiveFactory]
}

object ResolvedReflectiveProvider {
  @scala.inline
  def apply(
    key: atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey,
    multiProvider: scala.Boolean,
    resolvedFactories: js.Array[ResolvedReflectiveFactory]
  ): ResolvedReflectiveProvider = {
    val __obj = js.Dynamic.literal(key = key, multiProvider = multiProvider, resolvedFactories = resolvedFactories)
  
    __obj.asInstanceOf[ResolvedReflectiveProvider]
  }
}

