package typings
package angularDashGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Handles extends js.Object {
  // whether the items are resizable
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  // location of the resize handles
  // e.g // ['s', 'e', 'n', 'w', 'se', 'ne', 'sw', 'nw']
  var handles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // optional callback fired when item is resized
  var resize: js.UndefOr[
    js.Function3[
      /* event */ angularLib.angularMod.angularNs.IAngularEvent, 
      /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, 
      /* options */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  // optional callback fired when drag is started
  var start: js.UndefOr[
    js.Function3[
      /* event */ angularLib.angularMod.angularNs.IAngularEvent, 
      /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, 
      /* options */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  // optional callback fired when item is finished dragging
  var stop: js.UndefOr[
    js.Function3[
      /* event */ angularLib.angularMod.angularNs.IAngularEvent, 
      /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, 
      /* options */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
}

