package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", JSImport.Namespace)
@js.native
object aframeModMembers extends js.Object {
  val AComponent: Component[js.Any, System[js.Any]] = js.native
  val AEntity: Entity[ObjectMap[Component[js.Any, System[js.Any]]]] = js.native
  val ANode: ANode = js.native
  val AScene: Scene = js.native
  val THREE: ThreeLib = js.native
  val TWEEN: TweenLib = js.native
  val components: ObjectMap[ComponentDescriptor[Component[js.Any, System[js.Any]]]] = js.native
  val geometries: ObjectMap[GeometryDescriptor[Geometry[js.Any]]] = js.native
  val primitives: aframeLib.Anon_GetMeshMixin = js.native
  val registerComponent: js.Function2[
    /* name */ java.lang.String, 
    /* component */ ComponentDefinition[js.Object], 
    ComponentConstructor[js.Object]
  ] = js.native
  val registerElement: js.Function2[/* name */ java.lang.String, /* element */ js.Object, scala.Unit] = js.native
  val registerGeometry: js.Function2[
    /* name */ java.lang.String, 
    /* geometry */ GeometryDefinition[js.Object, js.Any], 
    GeometryConstructor[js.Object]
  ] = js.native
  val registerPrimitive: js.Function2[/* name */ java.lang.String, /* primitive */ PrimitiveDefinition, scala.Unit] = js.native
  val registerShader: js.Function2[
    /* name */ java.lang.String, 
    /* shader */ ShaderDefinition[MinimalShaderDefinition with js.Object], 
    ShaderConstructor[MinimalShaderDefinition with js.Object]
  ] = js.native
  val registerSystem: js.Function2[
    /* name */ java.lang.String, 
    /* definition */ SystemDefinition[js.Object], 
    SystemConstructor[js.Object]
  ] = js.native
  val scenes: js.Array[Scene] = js.native
  val schema: SchemaUtils = js.native
  val shaders: ObjectMap[ShaderDescriptor[Shader]] = js.native
  val systems: ObjectMap[SystemConstructor[js.Object]] = js.native
  val utils: Utils = js.native
  val version: java.lang.String = js.native
}

