package typings.antvComponent

import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAxisOverlapAutoRotateMod {
  
  @JSImport("@antv/component/lib/axis/overlap/auto-rotate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedAngle")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, customRotate: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedAngle")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], customRotate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDefault(): js.Function4[
    /* isVertical */ Boolean, 
    /* labelsGroup */ IGroup, 
    /* limitLength */ Double, 
    /* customRotate */ js.UndefOr[Double], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[js.Function4[
    /* isVertical */ Boolean, 
    /* labelsGroup */ IGroup, 
    /* limitLength */ Double, 
    /* customRotate */ js.UndefOr[Double], 
    Boolean
  ]]
  
  inline def unfixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("unfixedAngle")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
