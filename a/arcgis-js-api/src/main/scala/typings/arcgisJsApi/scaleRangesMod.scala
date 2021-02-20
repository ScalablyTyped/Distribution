package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ScaleRanges
import typings.arcgisJsApi.esri.ScaleRangesConstructor
import typings.arcgisJsApi.esri.ScaleRangesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleRangesMod extends Shortcut {
  
  @JSImport("esri/widgets/ScaleRangeSlider/ScaleRanges", JSImport.Namespace)
  @js.native
  val ^ : ScaleRangesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ScaleRangeSlider/ScaleRanges", JSImport.Namespace)
  @js.native
  class Class () extends ScaleRanges {
    def this(properties: ScaleRangesProperties) = this()
  }
  
  type _To = ScaleRangesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `scaleRangesMod.foo` */
  override def _to: ScaleRangesConstructor = ^
}
