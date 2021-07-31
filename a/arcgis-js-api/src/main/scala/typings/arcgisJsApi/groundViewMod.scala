package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GroundView
import typings.arcgisJsApi.esri.GroundViewConstructor
import typings.arcgisJsApi.esri.GroundViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groundViewMod extends Shortcut {
  
  @JSImport("esri/views/GroundView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GroundViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/GroundView", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with GroundView {
    def this(properties: GroundViewProperties) = this()
  }
  
  type _To = js.Object & GroundViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `groundViewMod.foo` */
  override def _to: js.Object & GroundViewConstructor = ^
}
