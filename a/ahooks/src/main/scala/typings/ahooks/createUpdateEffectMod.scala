package typings.ahooks

import typings.ahooks.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createUpdateEffectMod {
  
  @JSImport("ahooks/lib/createUpdateEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hook: EffectHookType): EffectHookType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hook.asInstanceOf[js.Any]).asInstanceOf[EffectHookType]
  
  inline def createUpdateEffect(hook: EffectHookType): EffectHookType = ^.asInstanceOf[js.Dynamic].applyDynamic("createUpdateEffect")(hook.asInstanceOf[js.Any]).asInstanceOf[EffectHookType]
  
  type EffectHookType = FnCall
}
