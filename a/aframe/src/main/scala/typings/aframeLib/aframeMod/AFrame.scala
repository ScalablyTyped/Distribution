package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AFrame extends js.Object {
  var AComponent: Component[_, System[_]]
  var AEntity: Entity[ObjectMap[Component[_, System[_]]]]
  var ANode: aframeLib.aframeMod.ANode
  var AScene: Scene
  var THREE: ThreeLib
  var TWEEN: TweenLib
  var components: ObjectMap[ComponentDescriptor[Component[_, System[_]]]]
  var geometries: ObjectMap[GeometryDescriptor[Geometry[_]]]
  var primitives: aframeLib.Anon_GetMeshMixin
  var scenes: js.Array[Scene]
  var schema: SchemaUtils
  var shaders: ObjectMap[ShaderDescriptor[Shader]]
  var systems: ObjectMap[SystemConstructor[js.Object]]
  var utils: Utils
  var version: java.lang.String
  def registerComponent[T /* <: js.Object */](name: java.lang.String, component: ComponentDefinition[T]): ComponentConstructor[T]
  def registerElement(name: java.lang.String, element: js.Object): scala.Unit
  def registerGeometry[T /* <: js.Object */](name: java.lang.String, geometry: GeometryDefinition[T, _]): GeometryConstructor[T]
  def registerPrimitive(name: java.lang.String, primitive: PrimitiveDefinition): scala.Unit
  def registerShader[T /* <: MinimalShaderDefinition with js.Object */](name: java.lang.String, shader: ShaderDefinition[T]): ShaderConstructor[T]
  def registerSystem[T /* <: js.Object */](name: java.lang.String, definition: SystemDefinition[T]): SystemConstructor[T]
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
    primitives: aframeLib.Anon_GetMeshMixin,
    registerComponent: (java.lang.String, ComponentDefinition[js.Any]) => ComponentConstructor[js.Any],
    registerElement: (java.lang.String, js.Object) => scala.Unit,
    registerGeometry: (java.lang.String, GeometryDefinition[js.Any, _]) => GeometryConstructor[js.Any],
    registerPrimitive: (java.lang.String, PrimitiveDefinition) => scala.Unit,
    registerShader: (java.lang.String, ShaderDefinition[js.Any]) => ShaderConstructor[js.Any],
    registerSystem: (java.lang.String, SystemDefinition[js.Any]) => SystemConstructor[js.Any],
    scenes: js.Array[Scene],
    schema: SchemaUtils,
    shaders: ObjectMap[ShaderDescriptor[Shader]],
    systems: ObjectMap[SystemConstructor[js.Object]],
    utils: Utils,
    version: java.lang.String
  ): AFrame = {
    val __obj = js.Dynamic.literal(AComponent = AComponent, AEntity = AEntity, ANode = ANode, AScene = AScene, THREE = THREE, TWEEN = TWEEN, components = components, geometries = geometries, primitives = primitives, registerComponent = js.Any.fromFunction2(registerComponent), registerElement = js.Any.fromFunction2(registerElement), registerGeometry = js.Any.fromFunction2(registerGeometry), registerPrimitive = js.Any.fromFunction2(registerPrimitive), registerShader = js.Any.fromFunction2(registerShader), registerSystem = js.Any.fromFunction2(registerSystem), scenes = scenes, schema = schema, shaders = shaders, systems = systems, utils = utils, version = version)
  
    __obj.asInstanceOf[AFrame]
  }
}

