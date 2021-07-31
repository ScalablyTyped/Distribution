package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingGroupSublayer
import typings.arcgisJsApi.esri.BuildingGroupSublayerConstructor
import typings.arcgisJsApi.esri.BuildingGroupSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingGroupSublayerMod extends Shortcut {
  
  @JSImport("esri/layers/buildingSublayers/BuildingGroupSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingGroupSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/buildingSublayers/BuildingGroupSublayer", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with BuildingGroupSublayer {
    def this(properties: BuildingGroupSublayerProperties) = this()
  }
  
  type _To = js.Object & BuildingGroupSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingGroupSublayerMod.foo` */
  override def _to: js.Object & BuildingGroupSublayerConstructor = ^
}
