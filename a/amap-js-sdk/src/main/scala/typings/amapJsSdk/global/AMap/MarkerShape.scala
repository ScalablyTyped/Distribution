package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.anon.Coords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MarkerShape用于划定Marker的可点击区域范围。需要注意的是，在IE浏览器中图标透明区域默认为不触发事件，因此MarkerShape在IE中不起作用。
  */
@JSGlobal("AMap.MarkerShape")
@js.native
class MarkerShape protected ()
  extends typings.amapJsSdk.AMap.MarkerShape {
  def this(options: Coords) = this()
}
