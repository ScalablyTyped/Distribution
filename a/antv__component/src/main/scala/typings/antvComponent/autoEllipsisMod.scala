package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/axis/overlap/auto-ellipsis", JSImport.Namespace)
@js.native
object autoEllipsisMod extends js.Object {
  
  def ellipsisHead(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
  
  def ellipsisMiddle(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
  
  def ellipsisTail(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
  
  def getDefault(): js.Function3[/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ Double, Boolean] = js.native
}
