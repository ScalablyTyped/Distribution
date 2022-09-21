package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BaseCfg = StringDictionary[Any]

type LocationCfg = StringDictionary[Any]

type LooseObject = StringDictionary[Any]

/** 用于返回样式 ShapeAttrs 的 Callback 函数定义 */
type ShapeAttrsCallback = js.Function3[/* item */ Any, /* index */ Double, /* items */ js.Array[Any], ShapeAttrs]

type avoidCallback = js.Function3[
/* isVertical */ Boolean, 
/* labelGroup */ IGroup, 
/* limitLength */ js.UndefOr[Double], 
Boolean]

type formatterCallback = js.Function3[/* text */ String, /* item */ ListItem, /* index */ Double, Any]
