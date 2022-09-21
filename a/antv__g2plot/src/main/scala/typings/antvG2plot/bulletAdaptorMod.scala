package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.bulletTypesMod.BulletOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bulletAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/bullet/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[BulletOptions]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def meta(params: Params[BulletOptions]): Params[BulletOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[BulletOptions]]
}
