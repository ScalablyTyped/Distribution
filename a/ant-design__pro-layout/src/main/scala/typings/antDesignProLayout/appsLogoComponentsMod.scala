package typings.antDesignProLayout

import typings.antDesignProLayout.anon.PrefixCls
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsLogoComponentsMod {
  
  @JSImport("@ant-design/pro-layout/es/components/AppsLogoComponents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout/es/components/AppsLogoComponents", "AppsLogoComponents")
  @js.native
  val AppsLogoComponents: FC[PrefixCls] = js.native
  
  inline def defaultRenderLogo(logo: js.Function0[ReactNode]): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRenderLogo")(logo.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def defaultRenderLogo(logo: ReactNode): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRenderLogo")(logo.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
}
