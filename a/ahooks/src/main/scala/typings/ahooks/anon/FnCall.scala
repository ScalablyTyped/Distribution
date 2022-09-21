package typings.ahooks.anon

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(effect: EffectCallback): Unit = js.native
  def apply(effect: EffectCallback, deps: DependencyList): Unit = js.native
}
