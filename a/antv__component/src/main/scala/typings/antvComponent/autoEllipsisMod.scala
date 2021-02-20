package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoEllipsisMod {
  
  @JSImport("@antv/component/lib/axis/overlap/auto-ellipsis", "ellipsisHead")
  @js.native
  def ellipsisHead(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-ellipsis", "ellipsisMiddle")
  @js.native
  def ellipsisMiddle(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-ellipsis", "ellipsisTail")
  @js.native
  def ellipsisTail(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-ellipsis", "getDefault")
  @js.native
  def getDefault(): js.Function3[/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ Double, Boolean] = js.native
}
