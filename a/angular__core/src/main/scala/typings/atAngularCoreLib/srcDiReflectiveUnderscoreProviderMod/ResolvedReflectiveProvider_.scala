package typings
package atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/reflective_provider", "ResolvedReflectiveProvider_")
@js.native
class `ResolvedReflectiveProvider_` protected () extends ResolvedReflectiveProvider {
  def this(key: atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey, resolvedFactories: js.Array[ResolvedReflectiveFactory], multiProvider: scala.Boolean) = this()
  /**
       * A key, usually a `Type<any>`.
       */
  /* CompleteClass */
  override var key: atAngularCoreLib.srcDiReflectiveUnderscoreKeyMod.ReflectiveKey = js.native
  /**
       * Indicates if the provider is a multi-provider or a regular provider.
       */
  /* CompleteClass */
  override var multiProvider: scala.Boolean = js.native
  /**
       * Factory function which can return an instance of an object represented by a key.
       */
  /* CompleteClass */
  override var resolvedFactories: js.Array[ResolvedReflectiveFactory] = js.native
  val resolvedFactory: ResolvedReflectiveFactory = js.native
}

