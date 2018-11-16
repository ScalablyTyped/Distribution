package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object materialNs {
  type IIcon = js.Function1[
    /* id */ java.lang.String, 
    angularLib.angularMod.angularNs.IPromise[stdLib.Element]
  ]
  type IMedia = js.Function1[/* media */ java.lang.String, scala.Boolean]
  type IStickyService = js.Function3[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* element */ angularLib.JQuery, 
    /* elementClone */ js.UndefOr[angularLib.JQuery], 
    scala.Unit
  ]
}
