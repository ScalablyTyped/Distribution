package typings.antvComponent

import org.scalablytyped.runtime.Instantiable1
import typings.antvComponent.anon.Component
import typings.antvComponent.antvComponentStrings.container
import typings.antvComponent.typesMod.GroupComponentCfg
import typings.antvComponent.typesMod.LooseObject
import typings.antvGBase.interfacesMod.IElement
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.Point
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupComponentMod {
  
  @JSImport("@antv/component/lib/abstract/group-component", JSImport.Default)
  @js.native
  abstract class default[T /* <: GroupComponentCfg */] () extends GroupComponent[T]
  
  type Callback = js.Function1[/* evt */ js.Object, Unit]
  
  @js.native
  trait GroupComponent[T /* <: GroupComponentCfg */]
    extends typings.antvComponent.componentMod.default[T] {
    
    /**
      * 图形元素新出现时的动画，默认图形从透明度 0 到当前透明度
      * @protected
      * @param {string} elmentName 图形元素名称
      * @param {IElement} newElement  新的图形元素
      * @param {object} animateCfg 动画的配置项
      */
    /* protected */ def addAnimation(elmentName: js.Any, newElement: js.Any, animateCfg: js.Any): Unit = js.native
    
    /**
      * 在组件上添加子组件
      *
      * @param parent 父元素
      * @param cfg 子组件配置项
      */
    @JSName("addComponent")
    /* protected */ def addComponent_container[C /* <: GroupComponentCfg */, CT /* <: GroupComponent[GroupComponentCfg] */](parent: IGroup, cfg: (Omit[C, container]) with (Component[C, CT])): CT = js.native
    
    /**
      * @protected
      * 在组件上添加分组，主要解决 isReigeter 的问题
      * @param {IGroup} parent 父元素
      * @param {object} cfg    分组的配置项
      */
    /* protected */ def addGroup(parent: IGroup, cfg: js.Any): IGroup = js.native
    
    /**
      * @protected
      * 在组件上添加图形，主要解决 isReigeter 的问题
      * @param {IGroup} parent 父元素
      * @param {object} cfg    分组的配置项
      */
    /* protected */ def addShape(parent: IGroup, cfg: js.Any): IShape = js.native
    
    var appendDelegateObject: js.Any = js.native
    
    /* protected */ def applyOffset(): Unit = js.native
    
    var clearOffScreenCache: js.Any = js.native
    
    /* protected */ def clearUpdateStatus(group: IGroup): Unit = js.native
    
    /* protected */ def createOffScreenGroup(): js.Any = js.native
    
    /* protected */ def delegateEmit(eventName: String, eventObject: LooseObject): Unit = js.native
    
    var deleteElements: js.Any = js.native
    
    def emit(eventName: String, eventObject: LooseObject): Unit = js.native
    
    def getChildComponentById(id: String): js.Any = js.native
    
    def getContainer(): IGroup = js.native
    
    var getDelegateObject: js.Any = js.native
    
    def getElementById(id: String): js.Any = js.native
    
    def getElementByLocalId(localId: js.Any): js.Any = js.native
    
    /* protected */ def getElementId(localId: String): String = js.native
    
    def getElementsByName(name: String): js.Array[_] = js.native
    
    /* protected */ def getInnerLayoutBBox(): js.Any = js.native
    
    var getReplaceAttrs: js.Any = js.native
    
    /* protected */ def initEvent(): Unit = js.native
    
    /* protected */ def initGroup(): Unit = js.native
    
    /* protected */ def moveElementTo(element: IElement, point: Point): Unit = js.native
    
    def off(evt: js.UndefOr[scala.Nothing], callback: Callback): this.type = js.native
    def off(evt: String, callback: Callback): this.type = js.native
    
    /* protected */ def offScreenRender(): js.Any = js.native
    
    def on(evt: String, callback: Callback): this.type = js.native
    def on(evt: String, callback: Callback, once: Boolean): this.type = js.native
    
    /* protected */ def registerElement(element: js.Any): Unit = js.native
    
    var registerNewGroup: js.Any = js.native
    
    def remove(): Unit = js.native
    
    /**
      * 图形元素新出现时的动画，默认图形从透明度 0 到当前透明度
      * @protected
      * @param {string} elmentName 图形元素名称
      * @param {IElement} originElement 要删除的图形元素
      * @param {object} animateCfg 动画的配置项
      */
    /* protected */ def removeAnimation(elementName: js.Any, originElement: js.Any, animateCfg: js.Any): Unit = js.native
    
    var removeElement: js.Any = js.native
    
    /* protected */ def removeEvent(): Unit = js.native
    
    /**
      * 内部的渲染
      * @param {IGroup} group 图形分组
      */
    /* protected */ def renderInner(group: IGroup): js.Any = js.native
    
    def setCapture(capture: js.Any): Unit = js.native
    
    /* protected */ def unregisterElement(element: js.Any): Unit = js.native
    
    /**
      * 图形元素的更新动画
      * @param {string} elmentName 图形元素名称
      * @param {IElement} originElement 现有的图形元素
      * @param {object} newAttrs  新的图形元素
      * @param {object} animateCfg 动画的配置项
      */
    /* protected */ def updateAnimation(elementName: js.Any, originElement: js.Any, newAttrs: js.Any, animateCfg: js.Any): Unit = js.native
    
    /* protected */ def updateElements(newGroup: js.Any, originGroup: js.Any): Unit = js.native
  }
  
  type GroupComponentCtor[C /* <: GroupComponentCfg */, T /* <: GroupComponent[GroupComponentCfg] */] = Instantiable1[/* cfg */ C, T]
}
