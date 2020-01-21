package typings.alt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AltJS {
  type ActionHandler = js.Function1[/* repeated */ js.Any, js.Any]
  type Actions = org.scalablytyped.runtime.StringDictionary[typings.alt.AltJS.Action[js.Any]]
  type ActionsClassConstructor = org.scalablytyped.runtime.Instantiable1[/* alt */ typings.alt.AltJS.Alt, typings.alt.AltJS.ActionsClass]
  type ExportConfig = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  type Source = org.scalablytyped.runtime.StringDictionary[js.Function0[typings.alt.AltJS.SourceModel[js.Any]]]
  type StateTransform = js.Function1[
    /* store */ typings.alt.AltJS.StoreModel[js.Any], 
    typings.alt.AltJS.AltStore[js.Any]
  ]
}
