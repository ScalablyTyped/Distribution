package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcDiProviderMod {
  /* Rewritten from type alias, can be one of: 
    - TypeProvider
    - ValueProvider
    - ClassProvider
    - ConstructorProvider
    - ExistingProvider
    - FactoryProvider
    - js.Array[js.Any]
  */
  type Provider = _Provider | js.Array[js.Any] | TypeProvider
  /* Rewritten from type alias, can be one of: 
    - ValueProvider
    - ExistingProvider
    - StaticClassProvider
    - ConstructorProvider
    - FactoryProvider
    - js.Array[js.Any]
  */
  type StaticProvider = _StaticProvider | js.Array[js.Any]
  type TypeProvider = atAngularCoreLib.srcTypeMod.Type[js.Any]
}
