package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererFactory extends StObject {
  
  var begin: js.UndefOr[js.Function0[Unit]] = js.native
  
  def createRenderer(): Renderer = js.native
  def createRenderer(hostElement: Null, rendererType: RendererType2): Renderer = js.native
  def createRenderer(hostElement: RElement): Renderer = js.native
  def createRenderer(hostElement: RElement, rendererType: RendererType2): Renderer = js.native
  
  var end: js.UndefOr[js.Function0[Unit]] = js.native
}
