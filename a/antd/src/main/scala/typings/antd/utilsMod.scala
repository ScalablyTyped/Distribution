package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.antd.affixMod.default
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("antd/lib/affix/utils", "addObserveTarget")
  @js.native
  def addObserveTarget(target: Null, affix: default): Unit = js.native
  @JSImport("antd/lib/affix/utils", "addObserveTarget")
  @js.native
  def addObserveTarget(target: HTMLElement, affix: default): Unit = js.native
  @JSImport("antd/lib/affix/utils", "addObserveTarget")
  @js.native
  def addObserveTarget(target: Window, affix: default): Unit = js.native
  
  @JSImport("antd/lib/affix/utils", "getFixedBottom")
  @js.native
  def getFixedBottom(placeholderReact: Rect, targetRect: Rect): js.UndefOr[Double] = js.native
  @JSImport("antd/lib/affix/utils", "getFixedBottom")
  @js.native
  def getFixedBottom(placeholderReact: Rect, targetRect: Rect, offsetBottom: Double): js.UndefOr[Double] = js.native
  
  @JSImport("antd/lib/affix/utils", "getFixedTop")
  @js.native
  def getFixedTop(placeholderReact: Rect, targetRect: Rect): js.UndefOr[Double] = js.native
  @JSImport("antd/lib/affix/utils", "getFixedTop")
  @js.native
  def getFixedTop(placeholderReact: Rect, targetRect: Rect, offsetTop: Double): js.UndefOr[Double] = js.native
  
  @JSImport("antd/lib/affix/utils", "getObserverEntities")
  @js.native
  def getObserverEntities(): js.Array[ObserverEntity] = js.native
  
  @JSImport("antd/lib/affix/utils", "getTargetRect")
  @js.native
  def getTargetRect(target: BindElement): ClientRect = js.native
  
  @JSImport("antd/lib/affix/utils", "removeObserveTarget")
  @js.native
  def removeObserveTarget(affix: default): Unit = js.native
  
  type BindElement = js.UndefOr[HTMLElement | Window | Null]
  
  @js.native
  trait ObserverEntity extends StObject {
    
    var affixList: js.Array[default] = js.native
    
    var eventHandlers: StringDictionary[js.Any] = js.native
    
    var target: HTMLElement | Window = js.native
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
