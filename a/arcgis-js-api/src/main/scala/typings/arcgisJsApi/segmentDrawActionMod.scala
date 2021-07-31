package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SegmentDrawAction
import typings.arcgisJsApi.esri.SegmentDrawActionConstructor
import typings.arcgisJsApi.esri.SegmentDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentDrawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/SegmentDrawAction", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SegmentDrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/SegmentDrawAction", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with SegmentDrawAction {
    def this(properties: SegmentDrawActionProperties) = this()
  }
  
  type _To = js.Object & SegmentDrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `segmentDrawActionMod.foo` */
  override def _to: js.Object & SegmentDrawActionConstructor = ^
}
