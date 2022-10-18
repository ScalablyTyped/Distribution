package typings.antvGLite

import typings.antvGLite.anon.PartialPropertyParseOptio
import typings.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typings.antvGLite.distDomInterfacesMod.IAnimation
import typings.antvGLite.distDomMod.Element
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.glMatrix.mod.mat3
import typings.glMatrix.mod.mat4
import typings.glMatrix.mod.quat
import typings.glMatrix.mod.vec2
import typings.glMatrix.mod.vec3
import typings.std.DOMRect
import typings.std.Keyframe
import typings.std.KeyframeAnimationOptions
import typings.std.Partial
import typings.std.PropertyIndexedKeyframes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsDisplayObjectMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/DisplayObject", "DisplayObject")
  @js.native
  open class DisplayObject[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] protected () extends Element[StyleProps, ParsedStyleProps] {
    def this(config: DisplayObjectConfig[StyleProps]) = this()
    
    /**
      * push to active animations after calling `animate()`
      */
    /* private */ var activeAnimations: Any = js.native
    
    /**
      * create an animation with WAAPI
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Element/animate
      */
    def animate(): IAnimation | Null = js.native
    def animate(keyframes: js.Array[Keyframe]): IAnimation | Null = js.native
    def animate(keyframes: js.Array[Keyframe], options: Double): IAnimation | Null = js.native
    def animate(keyframes: js.Array[Keyframe], options: KeyframeAnimationOptions): IAnimation | Null = js.native
    def animate(keyframes: Null, options: Double): IAnimation | Null = js.native
    def animate(keyframes: Null, options: KeyframeAnimationOptions): IAnimation | Null = js.native
    def animate(keyframes: PropertyIndexedKeyframes): IAnimation | Null = js.native
    def animate(keyframes: PropertyIndexedKeyframes, options: Double): IAnimation | Null = js.native
    def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): IAnimation | Null = js.native
    
    /**
      * @alias style
      * @example
      * circle.style.r = 10;
      * const r = circle.style;
      * @deprecated
      */
    def attr(): StyleProps = js.native
    def attr(name: Partial[StyleProps]): DisplayObject[StyleProps, Any] = js.native
    def attr[Key /* <: /* keyof StyleProps */ String */](
      name: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any
    ): DisplayObject[StyleProps, Any] = js.native
    @JSName("attr")
    def attr_Key_Any[Key /* <: /* keyof StyleProps */ String */](name: Key): /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any = js.native
    
    def cloneNode(deep: Boolean, customCloneFunc: js.Function2[/* name */ String, /* attribute */ Any, Any]): this.type = js.native
    def cloneNode(deep: Unit, customCloneFunc: js.Function2[/* name */ String, /* attribute */ Any, Any]): this.type = js.native
    
    /**
      * contains style props in constructor's params, eg. fill, stroke...
      */
    var config: DisplayObjectConfig[StyleProps] = js.native
    
    /* private */ var displayObjectPool: Any = js.native
    
    /**
      * returns an array of all Animation objects affecting this element
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element/getAnimations
      */
    def getAnimations(): js.Array[IAnimation] = js.native
    
    /**
      * returns different values than getBoundingClientRect(), as the latter returns value relative to the viewport
      * @see https://developer.mozilla.org/en-US/docs/Web/API/SVGGraphicsElement/getBBox
      *
      * FIXME: It is worth noting that getBBox responds to original untransformed values of a drawn object.
      * @see https://www.w3.org/Graphics/SVG/IG/resources/svgprimer.html#getBBox
      */
    def getBBox(): DOMRect = js.native
    
    /**
      * compatible with G 3.0
      * @alias object.config
      * @deprecated
      */
    def getConfig(): DisplayObjectConfig[StyleProps] = js.native
    
    /**
      * only return degrees of Z axis in world space
      */
    def getEulerAngles(): Double = js.native
    
    /**
      * only return degrees of Z axis in local space
      */
    def getLocalEulerAngles(): Double = js.native
    
    /**
      * return 3x3 matrix in local space
      * @deprecated
      */
    def getLocalMatrix(): mat3 = js.native
    
    def getLocalPosition(): vec3 = js.native
    
    def getLocalRotation(): quat = js.native
    
    /**
      * get scaling in local space
      */
    def getLocalScale(): vec3 = js.native
    
    def getLocalSkew(): vec2 = js.native
    
    def getLocalTransform(): mat4 = js.native
    
    /**
      * return 3x3 matrix in world space
      * @deprecated
      */
    def getMatrix(): mat3 = js.native
    def getMatrix(transformMat4: mat4): mat3 = js.native
    
    def getOrigin(): vec3 = js.native
    
    def getPosition(): vec3 = js.native
    
    def getRotation(): quat = js.native
    
    /**
      * get scaling in world space
      */
    def getScale(): vec3 = js.native
    
    def getWorldTransform(): mat4 = js.native
    
    /**
      * Use `visibility: hidden` instead.
      * @deprecated
      */
    def hide(): Unit = js.native
    
    /* private */ var initAttributes: Any = js.native
    
    def interactive: Boolean = js.native
    def interactive_=(b: Boolean): Unit = js.native
    
    /**
      * called when attributes get changed or initialized
      */
    def internalSetAttribute[Key /* <: /* keyof StyleProps */ String */](
      name: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any
    ): Unit = js.native
    def internalSetAttribute[Key /* <: /* keyof StyleProps */ String */](
      name: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: StyleProps[Key] */ js.Any,
      parseOptions: PartialPropertyParseOptio
    ): Unit = js.native
    
    def isCulled(): Boolean = js.native
    
    var isCustomElement: Boolean = js.native
    
    def isInteractive(): Boolean = js.native
    
    /**
      * shortcut for Used value of `visibility`
      */
    def isVisible(): Boolean = js.native
    
    def resetLocalTransform(): Unit = js.native
    
    def rotate(x: Double): this.type = js.native
    def rotate(x: Double, y: Double): this.type = js.native
    def rotate(x: Double, y: Double, z: Double): this.type = js.native
    def rotate(x: Double, y: Unit, z: Double): this.type = js.native
    
    def rotateLocal(x: Double): this.type = js.native
    def rotateLocal(x: Double, y: Double): this.type = js.native
    def rotateLocal(x: Double, y: Double, z: Double): this.type = js.native
    def rotateLocal(x: Double, y: Unit, z: Double): this.type = js.native
    
    /**
      * compatible with G 3.0
      *
      * scaling in local space
      * scale(10) = scale(10, 10, 10)
      *
      * we can't set scale in world space
      */
    def scale(scaling: vec2 | vec3): this.type = js.native
    def scale(scaling: vec2 | vec3, y: Double): this.type = js.native
    def scale(scaling: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def scale(scaling: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    def scale(scaling: Double): this.type = js.native
    def scale(scaling: Double, y: Double): this.type = js.native
    def scale(scaling: Double, y: Double, z: Double): this.type = js.native
    def scale(scaling: Double, y: Unit, z: Double): this.type = js.native
    
    def scaleLocal(scaling: vec2 | vec3): this.type = js.native
    def scaleLocal(scaling: vec2 | vec3, y: Double): this.type = js.native
    def scaleLocal(scaling: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def scaleLocal(scaling: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    def scaleLocal(scaling: Double): this.type = js.native
    def scaleLocal(scaling: Double, y: Double): this.type = js.native
    def scaleLocal(scaling: Double, y: Double, z: Double): this.type = js.native
    def scaleLocal(scaling: Double, y: Unit, z: Double): this.type = js.native
    
    /**
      * set euler angles(degrees) in world space
      */
    def setEulerAngles(z: Double): this.type = js.native
    
    /**
      * set euler angles(degrees) in local space
      */
    def setLocalEulerAngles(z: Double): this.type = js.native
    
    /**
      * set 3x3 matrix in local space
      * @deprecated
      */
    def setLocalMatrix(mat: mat3): Unit = js.native
    
    /**
      * set position in local space
      */
    def setLocalPosition(position: vec2 | vec3): this.type = js.native
    def setLocalPosition(position: vec2 | vec3, y: Double): this.type = js.native
    def setLocalPosition(position: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def setLocalPosition(position: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    def setLocalPosition(position: Double): this.type = js.native
    def setLocalPosition(position: Double, y: Double): this.type = js.native
    def setLocalPosition(position: Double, y: Double, z: Double): this.type = js.native
    def setLocalPosition(position: Double, y: Unit, z: Double): this.type = js.native
    
    def setLocalRotation(rotation: Double): this.type = js.native
    def setLocalRotation(rotation: Double, y: Double): this.type = js.native
    def setLocalRotation(rotation: Double, y: Double, z: Double): this.type = js.native
    def setLocalRotation(rotation: Double, y: Double, z: Double, w: Double): this.type = js.native
    def setLocalRotation(rotation: Double, y: Double, z: Unit, w: Double): this.type = js.native
    def setLocalRotation(rotation: Double, y: Unit, z: Double): this.type = js.native
    def setLocalRotation(rotation: Double, y: Unit, z: Double, w: Double): this.type = js.native
    def setLocalRotation(rotation: Double, y: Unit, z: Unit, w: Double): this.type = js.native
    def setLocalRotation(rotation: quat): this.type = js.native
    def setLocalRotation(rotation: quat, y: Double): this.type = js.native
    def setLocalRotation(rotation: quat, y: Double, z: Double): this.type = js.native
    def setLocalRotation(rotation: quat, y: Double, z: Double, w: Double): this.type = js.native
    def setLocalRotation(rotation: quat, y: Double, z: Unit, w: Double): this.type = js.native
    def setLocalRotation(rotation: quat, y: Unit, z: Double): this.type = js.native
    def setLocalRotation(rotation: quat, y: Unit, z: Double, w: Double): this.type = js.native
    def setLocalRotation(rotation: quat, y: Unit, z: Unit, w: Double): this.type = js.native
    
    /**
      * set scaling in local space
      */
    def setLocalScale(scaling: vec2 | vec3): this.type = js.native
    def setLocalScale(scaling: vec2 | vec3, y: Double): this.type = js.native
    def setLocalScale(scaling: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def setLocalScale(scaling: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    def setLocalScale(scaling: Double): this.type = js.native
    def setLocalScale(scaling: Double, y: Double): this.type = js.native
    def setLocalScale(scaling: Double, y: Double, z: Double): this.type = js.native
    def setLocalScale(scaling: Double, y: Unit, z: Double): this.type = js.native
    
    def setLocalSkew(skew: Double): this.type = js.native
    def setLocalSkew(skew: Double, y: Double): this.type = js.native
    def setLocalSkew(skew: vec2): this.type = js.native
    def setLocalSkew(skew: vec2, y: Double): this.type = js.native
    
    def setLocalTransform(transform: mat4): this.type = js.native
    
    /**
      * set 3x3 matrix in world space
      * @deprecated
      */
    def setMatrix(mat: mat3): Unit = js.native
    
    def setOrigin(position: vec2 | vec3): this.type = js.native
    def setOrigin(position: vec2 | vec3, y: Double): this.type = js.native
    def setOrigin(position: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def setOrigin(position: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    def setOrigin(position: Double): this.type = js.native
    def setOrigin(position: Double, y: Double): this.type = js.native
    def setOrigin(position: Double, y: Double, z: Double): this.type = js.native
    def setOrigin(position: Double, y: Unit, z: Double): this.type = js.native
    
    /**
      * set position in world space
      */
    def setPosition(position: vec2 | vec3): this.type = js.native
    def setPosition(position: vec2 | vec3, y: Double): this.type = js.native
    def setPosition(position: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def setPosition(position: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    def setPosition(position: Double): this.type = js.native
    def setPosition(position: Double, y: Double): this.type = js.native
    def setPosition(position: Double, y: Double, z: Double): this.type = js.native
    def setPosition(position: Double, y: Unit, z: Double): this.type = js.native
    
    def setRotation(rotation: Double): this.type = js.native
    def setRotation(rotation: Double, y: Double): this.type = js.native
    def setRotation(rotation: Double, y: Double, z: Double): this.type = js.native
    def setRotation(rotation: Double, y: Double, z: Double, w: Double): this.type = js.native
    def setRotation(rotation: Double, y: Double, z: Unit, w: Double): this.type = js.native
    def setRotation(rotation: Double, y: Unit, z: Double): this.type = js.native
    def setRotation(rotation: Double, y: Unit, z: Double, w: Double): this.type = js.native
    def setRotation(rotation: Double, y: Unit, z: Unit, w: Double): this.type = js.native
    def setRotation(rotation: quat): this.type = js.native
    def setRotation(rotation: quat, y: Double): this.type = js.native
    def setRotation(rotation: quat, y: Double, z: Double): this.type = js.native
    def setRotation(rotation: quat, y: Double, z: Double, w: Double): this.type = js.native
    def setRotation(rotation: quat, y: Double, z: Unit, w: Double): this.type = js.native
    def setRotation(rotation: quat, y: Unit, z: Double): this.type = js.native
    def setRotation(rotation: quat, y: Unit, z: Double, w: Double): this.type = js.native
    def setRotation(rotation: quat, y: Unit, z: Unit, w: Double): this.type = js.native
    
    /**
      * Use `visibility: visible` instead.
      * @deprecated
      */
    def show(): Unit = js.native
    
    /* private */ var styleValueRegistry: Any = js.native
    
    /**
      * send to back in current group
      */
    def toBack(): this.type = js.native
    
    /**
      * bring to front in current group
      */
    def toFront(): this.type = js.native
    
    /**
      * translate in world space
      */
    def translate(position: vec2 | vec3): this.type = js.native
    def translate(position: vec2 | vec3, y: Double): this.type = js.native
    def translate(position: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def translate(position: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    def translate(position: Double): this.type = js.native
    def translate(position: Double, y: Double): this.type = js.native
    def translate(position: Double, y: Double, z: Double): this.type = js.native
    def translate(position: Double, y: Unit, z: Double): this.type = js.native
    
    /**
      * translate in local space
      */
    def translateLocal(position: vec2 | vec3): this.type = js.native
    def translateLocal(position: vec2 | vec3, y: Double): this.type = js.native
    def translateLocal(position: vec2 | vec3, y: Double, z: Double): this.type = js.native
    def translateLocal(position: vec2 | vec3, y: Unit, z: Double): this.type = js.native
    def translateLocal(position: Double): this.type = js.native
    def translateLocal(position: Double, y: Double): this.type = js.native
    def translateLocal(position: Double, y: Double, z: Double): this.type = js.native
    def translateLocal(position: Double, y: Unit, z: Double): this.type = js.native
  }
}
