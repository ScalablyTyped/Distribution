package typings.antvGLite

import typings.antvGLite.anon.PartialCanvasConfig
import typings.antvGLite.contextServiceMod.ContextService
import typings.antvGLite.customElementRegistryMod.CustomElementRegistry
import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.InteractivePointerEvent
import typings.antvGLite.distTypesMod.Shape
import typings.antvGLite.distTypesMod.TypeEasingFunction
import typings.antvGLite.federatedEventMod.FederatedEvent
import typings.antvGLite.interfacesMod.ICamera
import typings.antvGLite.pointMod.PointLike
import typings.antvGLite.rbushnodeMod.RBushNodeAABB
import typings.antvGLite.servicesMod.EventService
import typings.antvGLite.servicesMod.RenderingService
import typings.rbush.mod.default
import typings.std.AddEventListenerOptions
import typings.std.AnimationPlayState
import typings.std.AnimationPlaybackEvent
import typings.std.CompositeOperation
import typings.std.ComputedEffectTiming
import typings.std.ComputedKeyframe
import typings.std.EffectTiming
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.FrameRequestCallback
import typings.std.GetRootNodeOptions
import typings.std.IterationCompositeOperation
import typings.std.Keyframe
import typings.std.KeyframeAnimationOptions
import typings.std.OptionalEffectTiming
import typings.std.PropertyIndexedKeyframes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domInterfacesMod {
  
  @js.native
  sealed trait ElementEvent extends StObject
  @JSImport("@antv/g-lite/dist/dom/interfaces", "ElementEvent")
  @js.native
  object ElementEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ElementEvent & String] = js.native
    
    /**
      * @see https://www.w3.org/TR/DOM-Level-3-Events/#event-type-DOMAttrModified
      */
    @js.native
    sealed trait ATTR_MODIFIED
      extends StObject
         with ElementEvent
    /* "DOMAttrModified" */ val ATTR_MODIFIED: typings.antvGLite.domInterfacesMod.ElementEvent.ATTR_MODIFIED & String = js.native
    
    @js.native
    sealed trait BOUNDS_CHANGED
      extends StObject
         with ElementEvent
    /* "bounds-changed" */ val BOUNDS_CHANGED: typings.antvGLite.domInterfacesMod.ElementEvent.BOUNDS_CHANGED & String = js.native
    
    /**
      * it has had a child inserted
      */
    @js.native
    sealed trait CHILD_INSERTED
      extends StObject
         with ElementEvent
    /* "child-inserted" */ val CHILD_INSERTED: typings.antvGLite.domInterfacesMod.ElementEvent.CHILD_INSERTED & String = js.native
    
    /**
      * it has had a child removed
      */
    @js.native
    sealed trait CHILD_REMOVED
      extends StObject
         with ElementEvent
    /* "child-removed" */ val CHILD_REMOVED: typings.antvGLite.domInterfacesMod.ElementEvent.CHILD_REMOVED & String = js.native
    
    @js.native
    sealed trait CULLED
      extends StObject
         with ElementEvent
    /* "culled" */ val CULLED: typings.antvGLite.domInterfacesMod.ElementEvent.CULLED & String = js.native
    
    @js.native
    sealed trait DESTROY
      extends StObject
         with ElementEvent
    /* "destroy" */ val DESTROY: typings.antvGLite.domInterfacesMod.ElementEvent.DESTROY & String = js.native
    
    /**
      * it has been inserted
      * @see https://www.w3.org/TR/DOM-Level-3-Events/#event-type-DOMNodeInserted
      */
    @js.native
    sealed trait INSERTED
      extends StObject
         with ElementEvent
    /* "DOMNodeInserted" */ val INSERTED: typings.antvGLite.domInterfacesMod.ElementEvent.INSERTED & String = js.native
    
    /**
      * @see https://www.w3.org/TR/DOM-Level-3-Events/#domnodeinsertedintodocument
      */
    @js.native
    sealed trait MOUNTED
      extends StObject
         with ElementEvent
    /* "DOMNodeInsertedIntoDocument" */ val MOUNTED: typings.antvGLite.domInterfacesMod.ElementEvent.MOUNTED & String = js.native
    
    /**
      * it is being removed
      * @see https://www.w3.org/TR/DOM-Level-3-Events/#event-type-DOMNodeRemoved
      */
    @js.native
    sealed trait REMOVED
      extends StObject
         with ElementEvent
    /* "removed" */ val REMOVED: typings.antvGLite.domInterfacesMod.ElementEvent.REMOVED & String = js.native
    
    /**
      * trigger when z-index changed
      */
    @js.native
    sealed trait RENDER_ORDER_CHANGED
      extends StObject
         with ElementEvent
    /* "render-order-changed" */ val RENDER_ORDER_CHANGED: typings.antvGLite.domInterfacesMod.ElementEvent.RENDER_ORDER_CHANGED & String = js.native
    
    /**
      * @see https://www.w3.org/TR/DOM-Level-3-Events/#domnoderemovedfromdocument
      */
    @js.native
    sealed trait UNMOUNTED
      extends StObject
         with ElementEvent
    /* "DOMNodeRemovedFromDocument" */ val UNMOUNTED: typings.antvGLite.domInterfacesMod.ElementEvent.UNMOUNTED & String = js.native
  }
  
  trait DisplayObjectConfig[StyleProps] extends StObject {
    
    /**
      * compatible with G 3.0
      * @alias style
      * @deprecated
      */
    var attrs: js.UndefOr[StyleProps] = js.undefined
    
    /**
      * compatible with G 3.0
      * @alias interactive
      * @deprecated
      */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Element/className
      */
    var `class`: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * element's identifier, must be unique in a document.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/id
      */
    var id: js.UndefOr[String] = js.undefined
    
    var initialParsedStyle: js.UndefOr[Any] = js.undefined
    
    /**
      * enable interaction events for the DisplayObject
      * @deprecated use `style.pointerEvents = 'auto'` instead
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * all styles properties, not read-only
      * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style
      */
    var style: js.UndefOr[StyleProps] = js.undefined
    
    var `type`: js.UndefOr[Shape | String] = js.undefined
    
    /**
      * @deprecated use `style.visibility = 'visible'` instead
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated use `style.zIndex` instead
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object DisplayObjectConfig {
    
    inline def apply[StyleProps](): DisplayObjectConfig[StyleProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayObjectConfig[StyleProps]]
    }
    
    extension [Self <: DisplayObjectConfig[?], StyleProps](x: Self & DisplayObjectConfig[StyleProps]) {
      
      inline def setAttrs(value: StyleProps): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialParsedStyle(value: Any): Self = StObject.set(x, "initialParsedStyle", value.asInstanceOf[js.Any])
      
      inline def setInitialParsedStyleUndefined: Self = StObject.set(x, "initialParsedStyle", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStyle(value: StyleProps): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Shape | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait IAnimation extends StObject {
    
    def cancel(): Unit
    
    var currentTime: Double
    
    var effect: IKeyframeEffect
    
    def finish(): Unit
    
    var finished: js.Promise[this.type]
    
    var id: String
    
    var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null
    
    var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null
    
    var onframe: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null
    
    def pause(): Unit
    
    var pending: Boolean
    
    def play(): Unit
    
    var playState: AnimationPlayState
    
    var playbackRate: Double
    
    var ready: js.Promise[this.type]
    
    def reverse(): Unit
    
    var startTime: Double
    
    def tick(timelineTime: Double, isAnimationFrame: Boolean): Unit
    
    var timeline: IAnimationTimeline
    
    var totalDuration: Double
    
    def updatePlaybackRate(playbackRate: Double): Unit
  }
  object IAnimation {
    
    inline def apply(
      cancel: () => Unit,
      currentTime: Double,
      effect: IKeyframeEffect,
      finish: () => Unit,
      finished: js.Promise[IAnimation],
      id: String,
      pause: () => Unit,
      pending: Boolean,
      play: () => Unit,
      playState: AnimationPlayState,
      playbackRate: Double,
      ready: js.Promise[IAnimation],
      reverse: () => Unit,
      startTime: Double,
      tick: (Double, Boolean) => Unit,
      timeline: IAnimationTimeline,
      totalDuration: Double,
      updatePlaybackRate: Double => Unit
    ): IAnimation = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), currentTime = currentTime.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), pending = pending.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), playState = playState.asInstanceOf[js.Any], playbackRate = playbackRate.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], reverse = js.Any.fromFunction0(reverse), startTime = startTime.asInstanceOf[js.Any], tick = js.Any.fromFunction2(tick), timeline = timeline.asInstanceOf[js.Any], totalDuration = totalDuration.asInstanceOf[js.Any], updatePlaybackRate = js.Any.fromFunction1(updatePlaybackRate), oncancel = null, onfinish = null, onframe = null)
      __obj.asInstanceOf[IAnimation]
    }
    
    extension [Self <: IAnimation](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: IKeyframeEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setFinished(value: js.Promise[IAnimation]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOncancel(value: js.ThisFunction1[IAnimation, /* ev */ AnimationPlaybackEvent, Any]): Self = StObject.set(x, "oncancel", value.asInstanceOf[js.Any])
      
      inline def setOncancelNull: Self = StObject.set(x, "oncancel", null)
      
      inline def setOnfinish(value: js.ThisFunction1[IAnimation, /* ev */ AnimationPlaybackEvent, Any]): Self = StObject.set(x, "onfinish", value.asInstanceOf[js.Any])
      
      inline def setOnfinishNull: Self = StObject.set(x, "onfinish", null)
      
      inline def setOnframe(value: js.ThisFunction1[IAnimation, /* ev */ AnimationPlaybackEvent, Any]): Self = StObject.set(x, "onframe", value.asInstanceOf[js.Any])
      
      inline def setOnframeNull: Self = StObject.set(x, "onframe", null)
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      inline def setPlayState(value: AnimationPlayState): Self = StObject.set(x, "playState", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
      
      inline def setReady(value: js.Promise[IAnimation]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReverse(value: () => Unit): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTick(value: (Double, Boolean) => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction2(value))
      
      inline def setTimeline(value: IAnimationTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      inline def setTotalDuration(value: Double): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
      
      inline def setUpdatePlaybackRate(value: Double => Unit): Self = StObject.set(x, "updatePlaybackRate", js.Any.fromFunction1(value))
    }
  }
  
  trait IAnimationEffectTiming
    extends StObject
       with EffectTiming {
    
    def easingFunction(t: Double): Double
    def easingFunction(t: Double, params: js.Array[String | Double]): Double
    def easingFunction(t: Double, params: js.Array[String | Double], duration: Double): Double
    def easingFunction(t: Double, params: Unit, duration: Double): Double
    @JSName("easingFunction")
    var easingFunction_Original: TypeEasingFunction
  }
  object IAnimationEffectTiming {
    
    inline def apply(
      easingFunction: (/* t */ Double, /* params */ js.UndefOr[js.Array[String | Double]], /* duration */ js.UndefOr[Double]) => Double
    ): IAnimationEffectTiming = {
      val __obj = js.Dynamic.literal(easingFunction = js.Any.fromFunction3(easingFunction))
      __obj.asInstanceOf[IAnimationEffectTiming]
    }
    
    extension [Self <: IAnimationEffectTiming](x: Self) {
      
      inline def setEasingFunction(
        value: (/* t */ Double, /* params */ js.UndefOr[js.Array[String | Double]], /* duration */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "easingFunction", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait IAnimationTimeline extends StObject {
    
    def attach(document: IDocument): Unit = js.native
    
    var currentTime: Double | Null = js.native
    
    def destroy(): Unit = js.native
    
    def getAnimations(): js.Array[IAnimation] = js.native
    
    def play(target: IElement[Any, Any]): IAnimation = js.native
    def play(target: IElement[Any, Any], keyframes: js.Array[Keyframe]): IAnimation = js.native
    def play(target: IElement[Any, Any], keyframes: js.Array[Keyframe], options: Double): IAnimation = js.native
    def play(target: IElement[Any, Any], keyframes: js.Array[Keyframe], options: KeyframeAnimationOptions): IAnimation = js.native
    def play(target: IElement[Any, Any], keyframes: Null, options: Double): IAnimation = js.native
    def play(target: IElement[Any, Any], keyframes: Null, options: KeyframeAnimationOptions): IAnimation = js.native
    def play(target: IElement[Any, Any], keyframes: PropertyIndexedKeyframes): IAnimation = js.native
    def play(target: IElement[Any, Any], keyframes: PropertyIndexedKeyframes, options: Double): IAnimation = js.native
    def play(target: IElement[Any, Any], keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): IAnimation = js.native
    
    def restart(): Boolean = js.native
  }
  
  @js.native
  trait ICSSStyleDeclaration[StyleProps] extends StObject {
    
    def getPropertyValue(propertyName: /* keyof StyleProps */ String): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[keyof StyleProps] */ js.Any
      ] = js.native
    
    def item(index: Double): String = js.native
    
    def removeProperty(propertyName: /* keyof StyleProps */ String): Unit = js.native
    
    def setProperty[Key /* <: /* keyof StyleProps */ String */](
      propertyName: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any
    ): Unit = js.native
    def setProperty[Key /* <: /* keyof StyleProps */ String */](
      propertyName: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any,
      priority: String
    ): Unit = js.native
  }
  
  @js.native
  trait ICanvas
    extends StObject
       with IEventTarget {
    
    def cancelAnimationFrame(handle: Double): Unit = js.native
    
    def canvas2Viewport(canvas: PointLike): PointLike = js.native
    
    def client2Viewport(client: PointLike): PointLike = js.native
    
    var customElements: CustomElementRegistry = js.native
    
    def destroy(): Unit = js.native
    def destroy(destroyScenegraph: Boolean): Unit = js.native
    
    var devicePixelRatio: Double = js.native
    
    var document: IDocument = js.native
    
    def getCamera(): ICamera = js.native
    
    def getConfig(): PartialCanvasConfig = js.native
    
    def getContextService(): ContextService[Any] = js.native
    
    def getEventService(): EventService = js.native
    
    def getRBushRoot(): default[RBushNodeAABB] = js.native
    
    def getRenderingService(): RenderingService = js.native
    
    def isMouseEvent(event: InteractivePointerEvent): /* is std.MouseEvent */ Boolean = js.native
    
    def isTouchEvent(event: InteractivePointerEvent): /* is std.TouchEvent */ Boolean = js.native
    
    def render(): Unit = js.native
    
    def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    var supportsPointerEvents: Boolean = js.native
    
    var supportsTouchEvents: Boolean = js.native
    
    def viewport2Canvas(viewport: PointLike): PointLike = js.native
    
    def viewport2Client(viewport: PointLike): PointLike = js.native
  }
  
  @js.native
  trait IChildNode
    extends StObject
       with INode {
    
    /**
      * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def after(nodes: INode*): Unit = js.native
    
    /**
      * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def before(nodes: INode*): Unit = js.native
    
    /**
      * Removes node.
      */
    def remove(): Unit = js.native
    
    /**
      * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def replaceWith(nodes: INode*): Unit = js.native
  }
  
  @js.native
  trait IDocument
    extends StObject
       with INode
       with IParentNode {
    
    /**
      * Creates an instance of the element for the specified tag.
      */
    def createElement[T /* <: DisplayObject[StyleProps, Any] */, StyleProps /* <: BaseStyleProps */](tagName: String, options: DisplayObjectConfig[StyleProps]): T = js.native
    
    /**
      * Returns the Window object of the active document.
      */
    val defaultView: ICanvas | Null = js.native
    
    /**
      * Gets a reference to the root node of the document.
      */
    val documentElement: IElement[Any, Any] = js.native
    
    def elementFromPoint(x: Double, y: Double): js.Promise[DisplayObject[Any, Any]] = js.native
    
    def elementsFromBBox(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[DisplayObject[Any, Any]] = js.native
    
    def elementsFromPoint(x: Double, y: Double): js.Promise[js.Array[DisplayObject[Any, Any]]] = js.native
    
    @JSName("ownerDocument")
    val ownerDocument_IDocument: Null = js.native
    
    val timeline: IAnimationTimeline = js.native
  }
  
  @js.native
  trait IElement[StyleProps, ParsedStyleProps]
    extends StObject
       with IChildNode
       with IParentNode {
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/attributes
      */
    var attributes: StyleProps = js.native
    
    var classList: js.Array[String] = js.native
    
    /**
      * Returns the value of element's class content attribute. Can be set to change it.
      */
    var className: String = js.native
    
    var clientLeft: Double = js.native
    
    var clientTop: Double = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttribute
      */
    def getAttribute(attributeName: /* keyof StyleProps */ String): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[keyof StyleProps] */ js.Any
      ] = js.native
    
    def getElementById[E /* <: IElement[Any, Any] */](id: String): E | Null = js.native
    
    def getElementsByClassName[E /* <: IElement[Any, Any] */](className: String): js.Array[E] = js.native
    
    def getElementsByName[E /* <: IElement[Any, Any] */](name: String): js.Array[E] = js.native
    
    def getElementsByTagName[E /* <: IElement[Any, Any] */](tagName: String): js.Array[E] = js.native
    
    def hasAttribute(qualifiedName: String): Boolean = js.native
    
    /**
      * Returns the value of element's id content attribute. Can be set to change it.
      */
    var id: String = js.native
    
    var name: String = js.native
    
    var parsedStyle: ParsedStyleProps = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute
      */
    def removeAttribute(attributeName: /* keyof StyleProps */ String): Unit = js.native
    
    var scrollLeft: Double = js.native
    
    var scrollTop: Double = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute
      */
    def setAttribute[Key /* <: /* keyof StyleProps */ String */](
      attributeName: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any
    ): Unit = js.native
    def setAttribute[Key /* <: /* keyof StyleProps */ String */](
      attributeName: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any,
      force: Boolean
    ): Unit = js.native
    
    /**
      * compatible with `style`
      * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style
      */
    var style: StyleProps & ICSSStyleDeclaration[StyleProps] = js.native
    
    /**
      * Returns the qualified name.
      */
    var tagName: String = js.native
  }
  
  @js.native
  trait IEventTarget extends StObject {
    
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def dispatchEvent[T /* <: FederatedEvent[Event, Any] */](e: T): Boolean = js.native
    
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  }
  
  @js.native
  trait IKeyframeEffect extends StObject {
    
    var animation: IAnimation | Null = js.native
    
    def applyInterpolations(): Unit = js.native
    
    var composite: CompositeOperation = js.native
    
    def getComputedTiming(): ComputedEffectTiming = js.native
    
    def getKeyframes(): js.Array[ComputedKeyframe] = js.native
    
    def getTiming(): EffectTiming = js.native
    
    var iterationComposite: IterationCompositeOperation = js.native
    
    var normalizedKeyframes: js.Array[ComputedKeyframe] = js.native
    
    def setKeyframes(): Unit = js.native
    def setKeyframes(keyframes: js.Array[Keyframe]): Unit = js.native
    def setKeyframes(keyframes: PropertyIndexedKeyframes): Unit = js.native
    
    var target: (IElement[Any, Any]) | Null = js.native
    
    var timing: IAnimationEffectTiming = js.native
    
    def update(): Boolean = js.native
    def update(localTime: Double): Boolean = js.native
    
    def updateTiming(): Unit = js.native
    def updateTiming(timing: OptionalEffectTiming): Unit = js.native
  }
  
  @js.native
  trait INode
    extends StObject
       with IEventTarget {
    
    def appendChild[T /* <: INode */](newChild: T): T = js.native
    def appendChild[T /* <: INode */](newChild: T, index: Double): T = js.native
    
    /**
      * Returns node's node document's document base URL.
      */
    val baseURI: String = js.native
    
    /**
      * Returns the children.
      */
    val childNodes: js.Array[IChildNode] = js.native
    
    /**
      * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
      */
    def cloneNode(): INode = js.native
    def cloneNode(deep: Boolean): INode = js.native
    
    /**
      * Returns a bitmask indicating the position of other relative to node.
      */
    def compareDocumentPosition(other: INode): Double = js.native
    
    /**
      * Returns true if other is an inclusive descendant of node, and false otherwise.
      */
    def contains(): Boolean = js.native
    def contains(other: INode): Boolean = js.native
    
    /**
      * Destroy itself.
      */
    def destroy(): Unit = js.native
    
    /**
      * Returns the first child.
      */
    val firstChild: IChildNode | Null = js.native
    
    /**
      * Traverse in sub tree.
      */
    def forEach(callback: js.Function1[/* o */ this.type, Unit | Boolean]): Unit = js.native
    
    /**
      * Returns node's ancestor.
      */
    def getAncestor(n: Double): INode | Null = js.native
    
    /**
      * Returns node's root.
      */
    def getRootNode(): INode = js.native
    def getRootNode(options: GetRootNodeOptions): INode = js.native
    
    /**
      * Returns whether node has children.
      */
    def hasChildNodes(): Boolean = js.native
    
    def insertBefore[T /* <: INode */](newChild: T): T = js.native
    def insertBefore[T /* <: INode */](newChild: T, refChild: INode): T = js.native
    
    /**
      * Returns true if node is connected and false otherwise.
      */
    var isConnected: Boolean = js.native
    
    def isDefaultNamespace(): Boolean = js.native
    def isDefaultNamespace(namespace: String): Boolean = js.native
    
    /**
      * Returns whether node and otherNode have the same properties.
      */
    def isEqualNode(): Boolean = js.native
    def isEqualNode(otherNode: INode): Boolean = js.native
    
    def isSameNode(): Boolean = js.native
    def isSameNode(otherNode: INode): Boolean = js.native
    
    /**
      * Returns the last child.
      */
    val lastChild: IChildNode | Null = js.native
    
    def lookupNamespaceURI(): String | Null = js.native
    def lookupNamespaceURI(prefix: String): String | Null = js.native
    
    def lookupPrefix(): String | Null = js.native
    def lookupPrefix(namespace: String): String | Null = js.native
    
    /**
      * Returns the next sibling.
      */
    val nextSibling: IChildNode | Null = js.native
    
    /**
      * Returns a string appropriate for the type of node.
      */
    val nodeName: String = js.native
    
    /**
      * Returns the type of node.
      */
    val nodeType: Double = js.native
    
    var nodeValue: String | Null = js.native
    
    /**
      * Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes.
      */
    def normalize(): Unit = js.native
    
    /**
      * Returns the node document. Returns null for documents.
      */
    var ownerDocument: IDocument | Null = js.native
    
    /**
      * Returns the parent element.
      */
    val parentElement: (IElement[Any, Any]) | Null = js.native
    
    /**
      * Returns the parent.
      */
    var parentNode: (INode & IParentNode) | Null = js.native
    
    /**
      * Returns the previous sibling.
      */
    val previousSibling: IChildNode | Null = js.native
    
    def removeChild[T /* <: INode */](oldChild: T): T = js.native
    
    def replaceChild[T /* <: INode */](newChild: INode, oldChild: T): T = js.native
    
    var shadow: Boolean = js.native
    
    var textContent: String | Null = js.native
  }
  
  trait IParentNode extends StObject {
    
    /**
      * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def append(nodes: INode*): Unit
    
    val childElementCount: Double
    
    /**
      * Returns the child elements.
      */
    val children: js.Array[IElement[Any, Any]]
    
    /**
      * Similar to querySelector, use custom filter instead of selectors.
      */
    def find[E /* <: IElement[Any, Any] */](filter: js.Function1[/* node */ E, Boolean]): E | Null
    
    /**
      * Similar to querySelectorAll, use custom filter instead of selectors.
      */
    def findAll[E /* <: IElement[Any, Any] */](filter: js.Function1[/* node */ E, Boolean]): js.Array[E]
    
    /**
      * Returns the first child that is an element, and null otherwise.
      */
    val firstElementChild: (IElement[Any, Any]) | Null
    
    /**
      * Returns the last child that is an element, and null otherwise.
      */
    val lastElementChild: (IElement[Any, Any]) | Null
    
    /**
      * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
      *
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def prepend(nodes: INode*): Unit
    
    /**
      * Returns the first element that is a descendant of node that matches selectors.
      */
    def querySelector[E /* <: IElement[Any, Any] */](selectors: String): E | Null
    
    /**
      * Returns all element descendants of node that match selectors.
      */
    def querySelectorAll[E /* <: IElement[Any, Any] */](selectors: String): js.Array[E]
  }
  object IParentNode {
    
    inline def apply(
      append: /* repeated */ INode => Unit,
      childElementCount: Double,
      children: js.Array[IElement[Any, Any]],
      find: js.Function1[Any, Boolean] => Any | Null,
      findAll: js.Function1[Any, Boolean] => js.Array[Any],
      prepend: /* repeated */ INode => Unit,
      querySelector: String => Any | Null,
      querySelectorAll: String => js.Array[Any]
    ): IParentNode = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), childElementCount = childElementCount.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), prepend = js.Any.fromFunction1(prepend), querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll), firstElementChild = null, lastElementChild = null)
      __obj.asInstanceOf[IParentNode]
    }
    
    extension [Self <: IParentNode](x: Self) {
      
      inline def setAppend(value: /* repeated */ INode => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setChildElementCount(value: Double): Self = StObject.set(x, "childElementCount", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[IElement[Any, Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (IElement[Any, Any])*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setFind(value: js.Function1[Any, Boolean] => Any | Null): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindAll(value: js.Function1[Any, Boolean] => js.Array[Any]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
      
      inline def setFirstElementChild(value: IElement[Any, Any]): Self = StObject.set(x, "firstElementChild", value.asInstanceOf[js.Any])
      
      inline def setFirstElementChildNull: Self = StObject.set(x, "firstElementChild", null)
      
      inline def setLastElementChild(value: IElement[Any, Any]): Self = StObject.set(x, "lastElementChild", value.asInstanceOf[js.Any])
      
      inline def setLastElementChildNull: Self = StObject.set(x, "lastElementChild", null)
      
      inline def setPrepend(value: /* repeated */ INode => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction1(value))
      
      inline def setQuerySelector(value: String => Any | Null): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
      
      inline def setQuerySelectorAll(value: String => js.Array[Any]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
    }
  }
}
