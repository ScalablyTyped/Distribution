package typings.alt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AltJS {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.StringDictionary

  type ActionHandler = js.Function1[/* repeated */ js.Any, js.Any]
  type Actions = StringDictionary[Action[js.Any]]
  type ActionsClassConstructor = Instantiable1[/* alt */ Alt, ActionsClass]
  type ExportConfig = StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  type Source = StringDictionary[js.Function0[SourceModel[js.Any]]]
  type StateTransform = js.Function1[/* store */ StoreModel[js.Any], AltStore[js.Any]]
}
