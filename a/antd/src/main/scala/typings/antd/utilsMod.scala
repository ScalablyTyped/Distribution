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
  
  @scala.inline
  def addObserveTarget(target: Null, affix: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserveTarget")(target.asInstanceOf[js.Any], affix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addObserveTarget(target: HTMLElement, affix: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserveTarget")(target.asInstanceOf[js.Any], affix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addObserveTarget(target: Window, affix: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserveTarget")(target.asInstanceOf[js.Any], affix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getFixedBottom(placeholderReact: Rect, targetRect: Rect): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedBottom")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def getFixedBottom(placeholderReact: Rect, targetRect: Rect, offsetBottom: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedBottom")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def getFixedTop(placeholderReact: Rect, targetRect: Rect): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedTop")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def getFixedTop(placeholderReact: Rect, targetRect: Rect, offsetTop: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedTop")(placeholderReact.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any], offsetTop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def getObserverEntities(): js.Array[ObserverEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverEntities")().asInstanceOf[js.Array[ObserverEntity]]
  
  @scala.inline
  def getTargetRect(target: BindElement): ClientRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetRect")(target.asInstanceOf[js.Any]).asInstanceOf[ClientRect]
  
  @scala.inline
  def removeObserveTarget(affix: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeObserveTarget")(affix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type BindElement = js.UndefOr[HTMLElement | Window | Null]
  
  trait ObserverEntity extends StObject {
    
    var affixList: js.Array[default]
    
    var eventHandlers: StringDictionary[js.Any]
    
    var target: HTMLElement | Window
  }
  object ObserverEntity {
    
    @scala.inline
    def apply(
      affixList: js.Array[default],
      eventHandlers: StringDictionary[js.Any],
      target: HTMLElement | Window
    ): ObserverEntity = {
      val __obj = js.Dynamic.literal(affixList = affixList.asInstanceOf[js.Any], eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObserverEntity]
    }
    
    @scala.inline
    implicit class ObserverEntityMutableBuilder[Self <: ObserverEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixList(value: js.Array[default]): Self = StObject.set(x, "affixList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixListVarargs(value: default*): Self = StObject.set(x, "affixList", js.Array(value :_*))
      
      @scala.inline
      def setEventHandlers(value: StringDictionary[js.Any]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: HTMLElement | Window): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type Rect = ClientRect | DOMRect
}
