package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoHideMod {
  
  @JSImport("@antv/component/lib/axis/overlap/auto-hide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def equidistance(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistance")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def equidistanceWithReverseBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistanceWithReverseBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getDefault(): js.Function2[/* isVertical */ Boolean, /* labelsGroup */ IGroup, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[js.Function2[/* isVertical */ Boolean, /* labelsGroup */ IGroup, Boolean]]
  
  @scala.inline
  def reserveBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def reserveFirst(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveFirst")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def reserveLast(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveLast")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
