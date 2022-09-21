package typings.antvGLite

import typings.antvGLite.domInterfacesMod.IElement
import typings.antvGLite.domInterfacesMod.INode
import typings.antvGLite.domInterfacesMod.IParentNode
import typings.antvGLite.shapesMod.AABB
import typings.antvGLite.shapesMod.Rectangle
import typings.antvGLite.transformMod.Transform
import typings.glMatrix.mod.mat4
import typings.glMatrix.mod.quat
import typings.glMatrix.mod.vec2
import typings.glMatrix.mod.vec3
import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesInterfacesMod {
  
  @js.native
  trait SceneGraphService extends StObject {
    
    def attach[C /* <: INode */, P /* <: INode & IParentNode */](child: C, parent: P): Unit = js.native
    def attach[C /* <: INode */, P /* <: INode & IParentNode */](child: C, parent: P, index: Double): Unit = js.native
    
    def detach[C /* <: INode */](child: C): Unit = js.native
    
    def dirtifyToRoot(element: INode): Unit = js.native
    def dirtifyToRoot(element: INode, affectChildren: Boolean): Unit = js.native
    
    def getBoundingClientRect(element: INode): Rectangle = js.native
    
    def getBounds(element: INode): AABB = js.native
    def getBounds(element: INode, render: Boolean): AABB = js.native
    
    def getGeometryBounds(element: INode): AABB = js.native
    def getGeometryBounds(element: INode, render: Boolean): AABB = js.native
    
    def getLocalBounds(element: INode): AABB = js.native
    def getLocalBounds(element: INode, render: Boolean): AABB = js.native
    
    def getLocalPosition(element: INode): vec3 = js.native
    
    def getLocalRotation(element: INode): quat = js.native
    
    def getLocalScale(element: INode): vec3 = js.native
    
    def getLocalSkew(element: INode): vec2 = js.native
    
    def getLocalTransform(element: INode): mat4 = js.native
    def getLocalTransform(element: INode, transform: Transform): mat4 = js.native
    
    def getOrigin(element: INode): vec3 = js.native
    
    def getPosition(element: INode): vec3 = js.native
    
    def getRotation(element: INode): quat = js.native
    
    def getScale(element: INode): vec3 = js.native
    
    def getWorldTransform(element: INode): mat4 = js.native
    def getWorldTransform(element: INode, transform: Transform): mat4 = js.native
    
    def matches[T /* <: IElement[Any, Any] */](query: String, root: T): Boolean = js.native
    
    def querySelector[R /* <: IElement[Any, Any] */, T /* <: IElement[Any, Any] */](query: String, root: R): T | Null = js.native
    
    def querySelectorAll[R /* <: IElement[Any, Any] */, T /* <: IElement[Any, Any] */](query: String, root: R): js.Array[T] = js.native
    
    def resetLocalTransform(element: INode): Unit = js.native
    
    def rotate(element: INode, degrees: Double): Unit = js.native
    def rotate(element: INode, degrees: Double, y: Double): Unit = js.native
    def rotate(element: INode, degrees: Double, y: Double, z: Double): Unit = js.native
    def rotate(element: INode, degrees: Double, y: Unit, z: Double): Unit = js.native
    def rotate(element: INode, degrees: vec3): Unit = js.native
    def rotate(element: INode, degrees: vec3, y: Double): Unit = js.native
    def rotate(element: INode, degrees: vec3, y: Double, z: Double): Unit = js.native
    def rotate(element: INode, degrees: vec3, y: Unit, z: Double): Unit = js.native
    
    def rotateLocal(element: INode, degrees: Double): Unit = js.native
    def rotateLocal(element: INode, degrees: Double, y: Double): Unit = js.native
    def rotateLocal(element: INode, degrees: Double, y: Double, z: Double): Unit = js.native
    def rotateLocal(element: INode, degrees: Double, y: Unit, z: Double): Unit = js.native
    def rotateLocal(element: INode, degrees: vec3): Unit = js.native
    def rotateLocal(element: INode, degrees: vec3, y: Double): Unit = js.native
    def rotateLocal(element: INode, degrees: vec3, y: Double, z: Double): Unit = js.native
    def rotateLocal(element: INode, degrees: vec3, y: Unit, z: Double): Unit = js.native
    
    def scaleLocal(element: INode, scaling: vec2 | vec3): Unit = js.native
    
    def setEulerAngles(element: INode, degrees: Double): Unit = js.native
    def setEulerAngles(element: INode, degrees: Double, y: Double): Unit = js.native
    def setEulerAngles(element: INode, degrees: Double, y: Double, z: Double): Unit = js.native
    def setEulerAngles(element: INode, degrees: Double, y: Unit, z: Double): Unit = js.native
    def setEulerAngles(element: INode, degrees: vec3): Unit = js.native
    def setEulerAngles(element: INode, degrees: vec3, y: Double): Unit = js.native
    def setEulerAngles(element: INode, degrees: vec3, y: Double, z: Double): Unit = js.native
    def setEulerAngles(element: INode, degrees: vec3, y: Unit, z: Double): Unit = js.native
    
    def setLocalEulerAngles(element: INode, degrees: Double): Unit = js.native
    def setLocalEulerAngles(element: INode, degrees: Double, y: Double): Unit = js.native
    def setLocalEulerAngles(element: INode, degrees: Double, y: Double, z: Double): Unit = js.native
    def setLocalEulerAngles(element: INode, degrees: Double, y: Unit, z: Double): Unit = js.native
    def setLocalEulerAngles(element: INode, degrees: vec3): Unit = js.native
    def setLocalEulerAngles(element: INode, degrees: vec3, y: Double): Unit = js.native
    def setLocalEulerAngles(element: INode, degrees: vec3, y: Double, z: Double): Unit = js.native
    def setLocalEulerAngles(element: INode, degrees: vec3, y: Unit, z: Double): Unit = js.native
    
    def setLocalPosition(element: INode, position: vec2 | vec3): Unit = js.native
    
    def setLocalRotation(element: INode, rotation: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: Double, y: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: Double, y: Double, z: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: Double, y: Double, z: Double, w: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: Double, y: Double, z: Unit, w: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: Double, y: Unit, z: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: Double, y: Unit, z: Double, w: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: Double, y: Unit, z: Unit, w: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: quat): Unit = js.native
    def setLocalRotation(element: INode, rotation: quat, y: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: quat, y: Double, z: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: quat, y: Double, z: Double, w: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: quat, y: Double, z: Unit, w: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: quat, y: Unit, z: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: quat, y: Unit, z: Double, w: Double): Unit = js.native
    def setLocalRotation(element: INode, rotation: quat, y: Unit, z: Unit, w: Double): Unit = js.native
    
    def setLocalScale(element: INode, scaling: vec2 | vec3): Unit = js.native
    
    def setLocalSkew(element: INode, skew: Double): Unit = js.native
    def setLocalSkew(element: INode, skew: Double, y: Double): Unit = js.native
    def setLocalSkew(element: INode, skew: vec2): Unit = js.native
    def setLocalSkew(element: INode, skew: vec2, y: Double): Unit = js.native
    
    def setLocalTransform(element: INode, transform: mat4): Unit = js.native
    
    def setOrigin(element: INode, origin: Double): Unit = js.native
    def setOrigin(element: INode, origin: Double, y: Double): Unit = js.native
    def setOrigin(element: INode, origin: Double, y: Double, z: Double): Unit = js.native
    def setOrigin(element: INode, origin: Double, y: Unit, z: Double): Unit = js.native
    def setOrigin(element: INode, origin: vec3): Unit = js.native
    def setOrigin(element: INode, origin: vec3, y: Double): Unit = js.native
    def setOrigin(element: INode, origin: vec3, y: Double, z: Double): Unit = js.native
    def setOrigin(element: INode, origin: vec3, y: Unit, z: Double): Unit = js.native
    
    def setPosition(element: INode, position: vec2 | vec3): Unit = js.native
    
    def setRotation(element: INode, rotation: Double): Unit = js.native
    def setRotation(element: INode, rotation: Double, y: Double): Unit = js.native
    def setRotation(element: INode, rotation: Double, y: Double, z: Double): Unit = js.native
    def setRotation(element: INode, rotation: Double, y: Double, z: Double, w: Double): Unit = js.native
    def setRotation(element: INode, rotation: Double, y: Double, z: Unit, w: Double): Unit = js.native
    def setRotation(element: INode, rotation: Double, y: Unit, z: Double): Unit = js.native
    def setRotation(element: INode, rotation: Double, y: Unit, z: Double, w: Double): Unit = js.native
    def setRotation(element: INode, rotation: Double, y: Unit, z: Unit, w: Double): Unit = js.native
    def setRotation(element: INode, rotation: quat): Unit = js.native
    def setRotation(element: INode, rotation: quat, y: Double): Unit = js.native
    def setRotation(element: INode, rotation: quat, y: Double, z: Double): Unit = js.native
    def setRotation(element: INode, rotation: quat, y: Double, z: Double, w: Double): Unit = js.native
    def setRotation(element: INode, rotation: quat, y: Double, z: Unit, w: Double): Unit = js.native
    def setRotation(element: INode, rotation: quat, y: Unit, z: Double): Unit = js.native
    def setRotation(element: INode, rotation: quat, y: Unit, z: Double, w: Double): Unit = js.native
    def setRotation(element: INode, rotation: quat, y: Unit, z: Unit, w: Double): Unit = js.native
    
    def syncHierarchy(element: INode): Unit = js.native
    
    def translate(element: INode, translation: Double): Unit = js.native
    def translate(element: INode, translation: Double, y: Double): Unit = js.native
    def translate(element: INode, translation: Double, y: Double, z: Double): Unit = js.native
    def translate(element: INode, translation: Double, y: Unit, z: Double): Unit = js.native
    def translate(element: INode, translation: vec3): Unit = js.native
    def translate(element: INode, translation: vec3, y: Double): Unit = js.native
    def translate(element: INode, translation: vec3, y: Double, z: Double): Unit = js.native
    def translate(element: INode, translation: vec3, y: Unit, z: Double): Unit = js.native
    
    def translateLocal(element: INode, translation: Double): Unit = js.native
    def translateLocal(element: INode, translation: Double, y: Double): Unit = js.native
    def translateLocal(element: INode, translation: Double, y: Double, z: Double): Unit = js.native
    def translateLocal(element: INode, translation: Double, y: Unit, z: Double): Unit = js.native
    def translateLocal(element: INode, translation: vec3): Unit = js.native
    def translateLocal(element: INode, translation: vec3, y: Double): Unit = js.native
    def translateLocal(element: INode, translation: vec3, y: Double, z: Double): Unit = js.native
    def translateLocal(element: INode, translation: vec3, y: Unit, z: Double): Unit = js.native
    
    def triggerPendingEvents(): Unit = js.native
  }
  @JSImport("@antv/g-lite/dist/services/interfaces", "SceneGraphService")
  @js.native
  val SceneGraphService: DefinedToken = js.native
}
