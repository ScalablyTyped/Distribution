package typings
package antdLib.libBreadcrumbBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ js.Any, 
      /* params */ js.Any, 
      /* routes */ js.Array[_], 
      /* paths */ js.Array[java.lang.String], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
  var separator: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

