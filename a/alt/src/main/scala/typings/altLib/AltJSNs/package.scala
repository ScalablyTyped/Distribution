package typings
package altLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AltJSNs {
  type ActionHandler = js.Function1[/* repeated */js.Any, js.Any]
  type ActionsClassConstructor = org.scalablytyped.runtime.Instantiable1[/* alt */ Alt, ActionsClass]
  type StateTransform = js.Function1[/* store */ StoreModel[js.Any], AltStore[js.Any]]
}
