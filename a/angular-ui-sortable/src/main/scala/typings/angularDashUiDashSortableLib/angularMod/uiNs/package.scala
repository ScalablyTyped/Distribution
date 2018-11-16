package typings
package angularDashUiDashSortableLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uiNs {
  type SortableEvent[T] = js.Function2[/* event */ angularLib.JQueryEventObject, /* ui */ UISortableUIParams[T], scala.Unit]
  type SortableHelperFunctionOption = js.Function2[
    /* event */ angularLib.JQueryEventObject, 
    /* ui */ angularLib.angularMod.angularNs.IAugmentedJQuery, 
    angularLib.JQuery
  ]
}
