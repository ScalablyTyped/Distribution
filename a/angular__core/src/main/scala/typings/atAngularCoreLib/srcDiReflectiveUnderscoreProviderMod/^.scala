package typings
package atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/reflective_provider", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def constructDependencies(typeOrFunc: js.Any): js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ReflectiveDependency] = js.native
  def constructDependencies(typeOrFunc: js.Any, dependencies: js.Array[_]): js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ReflectiveDependency] = js.native
  def mergeResolvedReflectiveProviders(
    providers: js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider],
    normalizedProvidersMap: nodeLib.Map[
      scala.Double, 
      atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider
    ]
  ): nodeLib.Map[
    scala.Double, 
    atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider
  ] = js.native
  def resolveReflectiveProviders(providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider]): js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider] = js.native
}

