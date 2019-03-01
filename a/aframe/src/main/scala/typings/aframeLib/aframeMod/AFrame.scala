package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AFrame extends js.Object {
  var AComponent: Component[_, System[_]]
  var AEntity: Entity[ObjectMap[Component[_, System[_]]]]
  var ANode: ANode
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
    registerComponent: js.Function2[java.lang.String, ComponentDefinition[js.Any], ComponentConstructor[js.Any]],
    registerElement: js.Function2[java.lang.String, js.Object, scala.Unit],
    registerGeometry: js.Function2[java.lang.String, GeometryDefinition[js.Any, _], GeometryConstructor[js.Any]],
    registerPrimitive: js.Function2[java.lang.String, PrimitiveDefinition, scala.Unit],
    registerShader: js.Function2[java.lang.String, ShaderDefinition[js.Any], ShaderConstructor[js.Any]],
    registerSystem: js.Function2[java.lang.String, SystemDefinition[js.Any], SystemConstructor[js.Any]],
    scenes: js.Array[Scene],
    schema: SchemaUtils,
    shaders: ObjectMap[ShaderDescriptor[Shader]],
    systems: ObjectMap[SystemConstructor[js.Object]],
    utils: Utils,
    version: java.lang.String
  ): AFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AComponent")(AComponent)
    __obj.updateDynamic("AEntity")(AEntity)
    __obj.updateDynamic("ANode")(ANode)
    __obj.updateDynamic("AScene")(AScene)
    __obj.updateDynamic("THREE")(THREE)
    __obj.updateDynamic("TWEEN")(TWEEN)
    __obj.updateDynamic("components")(components)
    __obj.updateDynamic("geometries")(geometries)
    __obj.updateDynamic("primitives")(primitives)
    __obj.updateDynamic("registerComponent")(registerComponent)
    __obj.updateDynamic("registerElement")(registerElement)
    __obj.updateDynamic("registerGeometry")(registerGeometry)
    __obj.updateDynamic("registerPrimitive")(registerPrimitive)
    __obj.updateDynamic("registerShader")(registerShader)
    __obj.updateDynamic("registerSystem")(registerSystem)
    __obj.updateDynamic("scenes")(scenes)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("shaders")(shaders)
    __obj.updateDynamic("systems")(systems)
    __obj.updateDynamic("utils")(utils)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[AFrame]
  }
}

