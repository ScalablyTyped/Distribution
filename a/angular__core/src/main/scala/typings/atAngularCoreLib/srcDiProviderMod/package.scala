package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcDiProviderMod {
  type Provider = TypeProvider | ValueProvider | ClassProvider | ConstructorProvider | ExistingProvider | FactoryProvider | js.Array[js.Any]
  type StaticProvider = ValueProvider | ExistingProvider | StaticClassProvider | ConstructorProvider | FactoryProvider | js.Array[js.Any]
  type TypeProvider = atAngularCoreLib.srcTypeMod.Type[js.Any]
}
