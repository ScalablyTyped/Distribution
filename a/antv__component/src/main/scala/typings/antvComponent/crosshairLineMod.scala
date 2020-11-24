package typings.antvComponent

import typings.antvComponent.crosshairBaseMod.CrosshairBase
import typings.antvComponent.typesMod.LineCrosshairCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/crosshair/line", JSImport.Namespace)
@js.native
object crosshairLineMod extends js.Object {
  
  @js.native
  trait LineCrosshair extends CrosshairBase[LineCrosshairCfg]
  
  @js.native
  class default () extends LineCrosshair
}
