package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object materialNs {
  type IColorExpression = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type IIcon = js.Function1[/* id */ java.lang.String, angularLib.angularMod.IPromise[stdLib.Element]]
  type IMedia = js.Function1[/* media */ java.lang.String, scala.Boolean]
  type IStickyService = js.Function3[
    /* scope */ angularLib.angularMod.IScope, 
    /* element */ angularLib.JQuery, 
    /* elementClone */ js.UndefOr[angularLib.JQuery], 
    scala.Unit
  ]
  type ResolveObject = org.scalablytyped.runtime.StringDictionary[
    angularLib.angularMod.Injectable[js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]]]
  ]
}
