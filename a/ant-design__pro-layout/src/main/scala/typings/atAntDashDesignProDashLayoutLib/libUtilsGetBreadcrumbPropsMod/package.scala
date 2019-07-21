package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsGetBreadcrumbPropsMod {
  type BreadcrumbListReturn = stdLib.Pick[
    antdLib.esBreadcrumbBreadcrumbMod.BreadcrumbProps, 
    stdLib.Extract[
      java.lang.String, 
      atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.routes | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.itemRender
    ]
  ]
}
