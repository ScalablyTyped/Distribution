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

