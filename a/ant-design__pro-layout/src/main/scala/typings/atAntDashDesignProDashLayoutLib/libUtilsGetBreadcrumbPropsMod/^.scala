package typings
package atAntDashDesignProDashLayoutLib.libUtilsGetBreadcrumbPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/utils/getBreadcrumbProps", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def genBreadcrumbProps(props: BreadcrumbProps): js.UndefOr[js.Array[antdLib.esBreadcrumbBreadcrumbMod.Route]] = js.native
  def getBreadcrumb(
    breadcrumb: org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem],
    url: java.lang.String
  ): atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem = js.native
  def getBreadcrumbFromProps(props: BreadcrumbProps): atAntDashDesignProDashLayoutLib.Anon_BreadcrumbLocationPath = js.native
  def getBreadcrumbProps(props: BreadcrumbProps): stdLib.Pick[
    antdLib.esBreadcrumbBreadcrumbMod.BreadcrumbProps, 
    atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.routes | atAntDashDesignProDashLayoutLib.atAntDashDesignProDashLayoutLibStrings.itemRender
  ] = js.native
}

