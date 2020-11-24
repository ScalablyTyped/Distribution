package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/axis/overlap/auto-hide", JSImport.Namespace)
@js.native
object autoHideMod extends js.Object {
  
  def equidistance(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  
  def equidistanceWithReverseBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  
  def getDefault(): js.Function2[/* isVertical */ Boolean, /* labelsGroup */ IGroup, Boolean] = js.native
  
  def reserveBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  
  def reserveFirst(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  
  def reserveLast(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
}
