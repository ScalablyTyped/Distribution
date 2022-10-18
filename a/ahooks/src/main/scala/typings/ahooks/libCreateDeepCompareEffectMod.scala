package typings.ahooks

import typings.ahooks.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateDeepCompareEffectMod {
  
  @JSImport("ahooks/lib/createDeepCompareEffect", "createDeepCompareEffect")
  @js.native
  val createDeepCompareEffect: CreateUpdateEffect = js.native
  
  type CreateUpdateEffect = js.Function1[/* hook */ EffectHookType, EffectHookType]
  
  type EffectHookType = FnCall
}
