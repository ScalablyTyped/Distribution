package typings
package atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/reflective_provider", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def constructDependencies(typeOrFunc: js.Any): js.Array[ReflectiveDependency] = js.native
  def constructDependencies(typeOrFunc: js.Any, dependencies: js.Array[_]): js.Array[ReflectiveDependency] = js.native
  def mergeResolvedReflectiveProviders(
    providers: js.Array[ResolvedReflectiveProvider],
    normalizedProvidersMap: stdLib.Map[scala.Double, ResolvedReflectiveProvider]
  ): stdLib.Map[scala.Double, ResolvedReflectiveProvider] = js.native
  def resolveReflectiveProviders(providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider]): js.Array[ResolvedReflectiveProvider] = js.native
}

