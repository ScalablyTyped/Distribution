package typings.antd

import org.scalablytyped.runtime.StringDictionary
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
  
  inline def addObserveTarget[T](target: Null, affix: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserveTarget")(target.asInstanceOf[js.Any], affix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addObserveTarget[T](target: HTMLElement, affix: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserveTarget")(target.asInstanceOf[js.Any], affix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addObserveTarget[T](target: Window, affix: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserveTarget")(target.asInstanceOf[js.Any], affix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFixedBottom(placeholderReact: DOMRect, targetRect: DOMRect): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedBottom")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getFixedBottom(placeholderReact: DOMRect, targetRect: DOMRect, offsetBottom: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedBottom")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getFixedTop(placeholderReact: DOMRect, targetRect: DOMRect): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedTop")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getFixedTop(placeholderReact: DOMRect, targetRect: DOMRect, offsetTop: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedTop")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any], offsetTop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getObserverEntities(): js.Array[ObserverEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverEntities")().asInstanceOf[js.Array[ObserverEntity]]
  
  inline def getTargetRect(target: BindElement): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetRect")(target.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  
  inline def removeObserveTarget[T](affix: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeObserveTarget")(affix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type BindElement = js.UndefOr[HTMLElement | Window | Null]
  
  trait ObserverEntity extends StObject {
    
    var affixList: js.Array[Any]
    
    var eventHandlers: StringDictionary[Any]
    
    var target: HTMLElement | Window
  }
  object ObserverEntity {
    
    inline def apply(affixList: js.Array[Any], eventHandlers: StringDictionary[Any], target: HTMLElement | Window): ObserverEntity = {
      val __obj = js.Dynamic.literal(affixList = affixList.asInstanceOf[js.Any], eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObserverEntity]
    }
    
    extension [Self <: ObserverEntity](x: Self) {
      
      inline def setAffixList(value: js.Array[Any]): Self = StObject.set(x, "affixList", value.asInstanceOf[js.Any])
      
      inline def setAffixListVarargs(value: Any*): Self = StObject.set(x, "affixList", js.Array(value*))
      
      inline def setEventHandlers(value: StringDictionary[Any]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement | Window): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
