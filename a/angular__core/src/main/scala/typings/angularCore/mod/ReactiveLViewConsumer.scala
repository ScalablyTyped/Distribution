package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactiveLViewConsumer
  extends StObject
     with ReactiveNode {
  
  /* private */ var _lView: Any = js.native
  
  def destroy(): Unit = js.native
  
  def hasReadASignal: Boolean = js.native
  
  def lView_=(lView: LView[Any]): Unit = js.native
  
  def runInContext(fn: ComponentTemplate[Any] | HostBindingsFunction[Any], rf: ɵRenderFlags, ctx: Any): Unit = js.native
}
