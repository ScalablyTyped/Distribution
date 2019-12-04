package typings.atAntDashDesignProDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsGetBreadcrumbPropsMod {
  import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.itemRender
  import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.routes
  import typings.std.Extract
  import typings.std.Pick

  type BreadcrumbListReturn = Pick[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps */ js.Any, 
    Extract[String, routes | itemRender]
  ]
}
