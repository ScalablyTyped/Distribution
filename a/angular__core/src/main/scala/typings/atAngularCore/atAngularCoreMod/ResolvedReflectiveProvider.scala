package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedReflectiveProvider extends js.Object {
  /**
    * A key, usually a `Type<any>`.
    */
  var key: ReflectiveKey
  /**
    * Indicates if the provider is a multi-provider or a regular provider.
    */
  var multiProvider: Boolean
  /**
    * Factory function which can return an instance of an object represented by a key.
    */
  var resolvedFactories: js.Array[ResolvedReflectiveFactory]
}

object ResolvedReflectiveProvider {
  @scala.inline
  def apply(key: ReflectiveKey, multiProvider: Boolean, resolvedFactories: js.Array[ResolvedReflectiveFactory]): ResolvedReflectiveProvider = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], multiProvider = multiProvider.asInstanceOf[js.Any], resolvedFactories = resolvedFactories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolvedReflectiveProvider]
  }
}

