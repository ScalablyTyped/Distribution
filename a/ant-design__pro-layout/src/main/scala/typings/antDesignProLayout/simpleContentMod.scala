package typings.antDesignProLayout

import typings.antDesignProLayout.anon.AppList
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleContentMod {
  
  @JSImport("@ant-design/pro-layout/es/components/AppsLogoComponents/SimpleContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout/es/components/AppsLogoComponents/SimpleContent", "SimpleContent")
  @js.native
  val SimpleContent: FC[AppList] = js.native
  
  inline def renderLogo(logo: js.Function0[ReactNode]): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("renderLogo")(logo.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def renderLogo(logo: js.Function0[ReactNode], title: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLogo")(logo.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def renderLogo(logo: ReactNode): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("renderLogo")(logo.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def renderLogo(logo: ReactNode, title: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLogo")(logo.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
}
