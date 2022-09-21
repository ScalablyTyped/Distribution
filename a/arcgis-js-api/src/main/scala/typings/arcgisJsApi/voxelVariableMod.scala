package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.VoxelVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object voxelVariableMod extends Shortcut {
  
  @JSImport("esri/layers/support/VoxelVariable", JSImport.Namespace)
  @js.native
  val ^ : VoxelVariable = js.native
  
  type _To = VoxelVariable
  
  /* This means you don't have to write `^`, but can instead just say `voxelVariableMod.foo` */
  override def _to: VoxelVariable = ^
}
