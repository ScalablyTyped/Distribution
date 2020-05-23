package typings.aframe.mod

import typings.aframe.anon.GetMeshMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AFrame extends js.Object {
  var AComponent: Component[_, System[_]]
  var AEntity: Entity[ObjectMap[Component[_, System[_]]]]
  var ANode: typings.aframe.mod.ANode
  var AScene: Scene
  var THREE: ThreeLib
  var TWEEN: TweenLib
  var components: ObjectMap[ComponentDescriptor[Component[_, System[_]]]]
  var geometries: ObjectMap[GeometryDescriptor[Geometry[_]]]
  var primitives: GetMeshMixin
  var scenes: js.Array[Scene]
  var schema: SchemaUtils
  var shaders: ObjectMap[ShaderDescriptor[Shader]]
  var systems: ObjectMap[SystemConstructor[js.Object]]
  var utils: Utils_
  var version: String
  def registerComponent[T /* <: js.Object */](name: String, component: ComponentDefinition[T]): ComponentConstructor[T]
  def registerElement(name: String, element: js.Object): Unit
  def registerGeometry[T /* <: js.Object */](name: String, geometry: GeometryDefinition[T, _]): GeometryConstructor[T]
  def registerPrimitive(name: String, primitive: PrimitiveDefinition): Unit
  def registerShader[T /* <: MinimalShaderDefinition with js.Object */](name: String, shader: ShaderDefinition[T]): ShaderConstructor[T]
  def registerSystem[T /* <: js.Object */](name: String, definition: SystemDefinition[T]): SystemConstructor[T]
}

object AFrame {
  @scala.inline
  def apply(
    AComponent: Component[_, System[_]],
    AEntity: Entity[ObjectMap[Component[_, System[_]]]],
    ANode: ANode,
    AScene: Scene,
    THREE: ThreeLib,
    TWEEN: TweenLib,
    components: ObjectMap[ComponentDescriptor[Component[_, System[_]]]],
    geometries: ObjectMap[GeometryDescriptor[Geometry[_]]],
    primitives: GetMeshMixin,
    registerComponent: (String, ComponentDefinition[js.Any]) => ComponentConstructor[js.Any],
    registerElement: (String, js.Object) => Unit,
    registerGeometry: (String, GeometryDefinition[js.Any, _]) => GeometryConstructor[js.Any],
    registerPrimitive: (String, PrimitiveDefinition) => Unit,
    registerShader: (String, ShaderDefinition[js.Any]) => ShaderConstructor[js.Any],
    registerSystem: (String, SystemDefinition[js.Any]) => SystemConstructor[js.Any],
    scenes: js.Array[Scene],
    schema: SchemaUtils,
    shaders: ObjectMap[ShaderDescriptor[Shader]],
    systems: ObjectMap[SystemConstructor[js.Object]],
    utils: Utils_,
    version: String
  ): AFrame = {
    val __obj = js.Dynamic.literal(AComponent = AComponent.asInstanceOf[js.Any], AEntity = AEntity.asInstanceOf[js.Any], ANode = ANode.asInstanceOf[js.Any], AScene = AScene.asInstanceOf[js.Any], THREE = THREE.asInstanceOf[js.Any], TWEEN = TWEEN.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any], primitives = primitives.asInstanceOf[js.Any], registerComponent = js.Any.fromFunction2(registerComponent), registerElement = js.Any.fromFunction2(registerElement), registerGeometry = js.Any.fromFunction2(registerGeometry), registerPrimitive = js.Any.fromFunction2(registerPrimitive), registerShader = js.Any.fromFunction2(registerShader), registerSystem = js.Any.fromFunction2(registerSystem), scenes = scenes.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], shaders = shaders.asInstanceOf[js.Any], systems = systems.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFrame]
  }
}

