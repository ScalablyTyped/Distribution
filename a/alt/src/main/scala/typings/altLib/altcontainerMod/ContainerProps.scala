package typings
package altLib.altcontainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var actions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Object]] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.Component[_, js.Object, _]] = js.undefined
  var flux: js.UndefOr[altLib.AltJSNs.Alt] = js.undefined
  var inject: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var render: js.UndefOr[js.Function1[/* repeated */ js.Any, reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
  var shouldComponentUpdate: js.UndefOr[js.Function1[/* props */ js.Any, scala.Boolean]] = js.undefined
  var store: js.UndefOr[altLib.AltJSNs.AltStore[_]] = js.undefined
  var stores: js.UndefOr[js.Array[altLib.AltJSNs.AltStore[_]]] = js.undefined
  var transform: js.UndefOr[js.Function2[/* store */ altLib.AltJSNs.AltStore[_], /* actions */ js.Any, _]] = js.undefined
}

