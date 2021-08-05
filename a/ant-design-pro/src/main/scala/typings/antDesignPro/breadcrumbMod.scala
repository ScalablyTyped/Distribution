package typings.antDesignPro

import typings.antDesignPro.pageHeaderMod.PageHeaderProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbMod {
  
  @JSImport("ant-design-pro/lib/PageHeader/breadcrumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ant-design-pro/lib/PageHeader/breadcrumb", JSImport.Default)
  @js.native
  class default ()
    extends Component[PageHeaderProps, js.Any, js.Any]
  
  inline def getBreadcrumb(breadcrumbNameMap: js.Object, url: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumb")(breadcrumbNameMap.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  type BreadcrumbView = Component[PageHeaderProps, js.Any, js.Any]
}
