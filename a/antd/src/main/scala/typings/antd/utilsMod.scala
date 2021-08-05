package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.antd.affixMod.default
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("antd/lib/affix/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addObserveTarget(target: Null, affix: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserveTarget")(target.asInstanceOf[js.Any], affix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addObserveTarget(target: HTMLElement, affix: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserveTarget")(target.asInstanceOf[js.Any], affix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addObserveTarget(target: Window, affix: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserveTarget")(target.asInstanceOf[js.Any], affix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFixedBottom(placeholderReact: Rect, targetRect: Rect): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedBottom")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getFixedBottom(placeholderReact: Rect, targetRect: Rect, offsetBottom: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedBottom")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getFixedTop(placeholderReact: Rect, targetRect: Rect): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedTop")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getFixedTop(placeholderReact: Rect, targetRect: Rect, offsetTop: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedTop")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any], offsetTop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getObserverEntities(): js.Array[ObserverEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverEntities")().asInstanceOf[js.Array[ObserverEntity]]
  
  inline def getTargetRect(target: BindElement): ClientRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetRect")(target.asInstanceOf[js.Any]).asInstanceOf[ClientRect]
  
  inline def removeObserveTarget(affix: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeObserveTarget")(affix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type BindElement = js.UndefOr[HTMLElement | Window | Null]
  
  trait ObserverEntity extends StObject {
    
    var affixList: js.Array[default]
    
    var eventHandlers: StringDictionary[js.Any]
    
    var target: HTMLElement | Window
  }
  object ObserverEntity {
    
    inline def apply(
      affixList: js.Array[default],
      eventHandlers: StringDictionary[js.Any],
      target: HTMLElement | Window
    ): ObserverEntity = {
      val __obj = js.Dynamic.literal(affixList = affixList.asInstanceOf[js.Any], eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObserverEntity]
    }
    
    extension [Self <: ObserverEntity](x: Self) {
      
      inline def setAffixList(value: js.Array[default]): Self = StObject.set(x, "affixList", value.asInstanceOf[js.Any])
      
      inline def setAffixListVarargs(value: default*): Self = StObject.set(x, "affixList", js.Array(value :_*))
      
      inline def setEventHandlers(value: StringDictionary[js.Any]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement | Window): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type Rect = ClientRect | DOMRect
}
