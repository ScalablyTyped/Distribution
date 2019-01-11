package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AComponent: aframeLib.aframeMod.Component[js.Any, aframeLib.aframeMod.System[js.Any]] = js.native
  val AEntity: aframeLib.aframeMod.Entity[
    aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[js.Any, aframeLib.aframeMod.System[js.Any]]]
  ] = js.native
  val ANode: aframeLib.aframeMod.ANode = js.native
  val AScene: aframeLib.aframeMod.Scene = js.native
  val THREE: aframeLib.aframeMod.ThreeLib = js.native
  val TWEEN: aframeLib.aframeMod.TweenLib = js.native
  val components: aframeLib.aframeMod.ObjectMap[
    aframeLib.aframeMod.ComponentDescriptor[aframeLib.aframeMod.Component[js.Any, aframeLib.aframeMod.System[js.Any]]]
  ] = js.native
  val geometries: aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.GeometryDescriptor[aframeLib.aframeMod.Geometry[js.Any]]] = js.native
  val primitives: aframeLib.Anon_GetMeshMixin = js.native
  val registerComponent: js.Function2[
    /* name */ java.lang.String, 
    /* component */ aframeLib.aframeMod.ComponentDefinition[js.Object], 
    aframeLib.aframeMod.ComponentConstructor[js.Object]
  ] = js.native
  val registerElement: js.Function2[/* name */ java.lang.String, /* element */ js.Object, scala.Unit] = js.native
  val registerGeometry: js.Function2[
    /* name */ java.lang.String, 
    /* geometry */ aframeLib.aframeMod.GeometryDefinition[js.Object, js.Any], 
    aframeLib.aframeMod.GeometryConstructor[js.Object]
  ] = js.native
  val registerPrimitive: js.Function2[
    /* name */ java.lang.String, 
    /* primitive */ aframeLib.aframeMod.PrimitiveDefinition, 
    scala.Unit
  ] = js.native
  val registerShader: js.Function2[
    /* name */ java.lang.String, 
    /* shader */ aframeLib.aframeMod.ShaderDefinition[aframeLib.aframeMod.MinimalShaderDefinition with js.Object], 
    aframeLib.aframeMod.ShaderConstructor[aframeLib.aframeMod.MinimalShaderDefinition with js.Object]
  ] = js.native
  val registerSystem: js.Function2[
    /* name */ java.lang.String, 
    /* definition */ aframeLib.aframeMod.SystemDefinition[js.Object], 
    aframeLib.aframeMod.SystemConstructor[js.Object]
  ] = js.native
  val scenes: js.Array[aframeLib.aframeMod.Scene] = js.native
  val schema: aframeLib.aframeMod.SchemaUtils = js.native
  val shaders: aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.ShaderDescriptor[aframeLib.aframeMod.Shader]] = js.native
  val systems: aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.SystemConstructor[js.Object]] = js.native
  val utils: aframeLib.aframeMod.Utils = js.native
  val version: java.lang.String = js.native
}

