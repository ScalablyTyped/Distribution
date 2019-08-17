package typings.angularDashMaterial.angularDashMaterialMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object materialNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.angular.JQuery
  import typings.angular.angularMod.IPromise
  import typings.angular.angularMod.IScope
  import typings.angular.angularMod.Injectable
  import typings.std.Element

  type IColorExpression = StringDictionary[String]
  type IIcon = js.Function1[/* id */ String, IPromise[Element]]
  type IMedia = js.Function1[/* media */ String, Boolean]
  type IStickyService = js.Function3[/* scope */ IScope, /* element */ JQuery, /* elementClone */ js.UndefOr[JQuery], Unit]
  type ResolveObject = StringDictionary[Injectable[js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]]]]
}
