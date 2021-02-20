package typings.antvComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type BaseCfg = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type LocationCfg = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type LooseObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  /** 用于返回样式 ShapeAttrs 的 Callback 函数定义 */
  type ShapeAttrsCallback = js.Function3[
    /* item */ js.Any, 
    /* index */ scala.Double, 
    /* items */ js.Array[js.Any], 
    typings.antvGBase.typesMod.ShapeAttrs
  ]
  
  type avoidCallback = js.Function3[
    /* isVertical */ scala.Boolean, 
    /* labelGroup */ typings.antvGBase.interfacesMod.IGroup, 
    /* limitLength */ js.UndefOr[scala.Double], 
    scala.Boolean
  ]
  
  type formatterCallback = js.Function3[
    /* text */ java.lang.String, 
    /* item */ typings.antvComponent.typesMod.ListItem, 
    /* index */ scala.Double, 
    js.Any
  ]
}
