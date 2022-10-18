package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyHooksUseMergedConfigMod {
  
  @JSImport("antd/lib/typography/hooks/useMergedConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Target](propConfig: Any): js.Tuple2[Boolean, Target] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Target]]
  inline def default[Target](propConfig: Any, templateConfig: Target): js.Tuple2[Boolean, Target] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(propConfig.asInstanceOf[js.Any], templateConfig.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Target]]
}
