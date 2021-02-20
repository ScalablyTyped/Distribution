package typings.aframe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def AComponent: typings.aframe.mod.Component[js.Any, typings.aframe.mod.System[js.Any]] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AComponent").asInstanceOf[typings.aframe.mod.Component[js.Any, typings.aframe.mod.System[js.Any]]]
  
  @scala.inline
  def AEntity: typings.aframe.mod.Entity[
    typings.aframe.mod.ObjectMap[typings.aframe.mod.Component[js.Any, typings.aframe.mod.System[js.Any]]]
  ] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AEntity").asInstanceOf[typings.aframe.mod.Entity[
    typings.aframe.mod.ObjectMap[typings.aframe.mod.Component[js.Any, typings.aframe.mod.System[js.Any]]]
  ]]
  
  @scala.inline
  def ANode: typings.aframe.mod.ANode = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ANode").asInstanceOf[typings.aframe.mod.ANode]
  
  @scala.inline
  def AScene: typings.aframe.mod.Scene = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AScene").asInstanceOf[typings.aframe.mod.Scene]
  
  type ComponentDefinition[T /* <: js.Object */] = T with typings.aframe.anon.PartialComponentanySystem with (typings.std.ThisType[T with (typings.aframe.mod.Component[_, typings.aframe.mod.System[_]])])
  
  type GeometryDefinition[T /* <: js.Object */, U] = T with typings.std.Partial[typings.aframe.mod.Geometry[U]]
  
  type MultiPropertySchema[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: aframe.aframe.SinglePropertySchema<T[P]> | T[P]}
    */ typings.aframe.aframeStrings.MultiPropertySchema with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type NodeDefinition[T /* <: js.Object */] = T with typings.aframe.anon.PartialANode
  
  type ObjectMap[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Schema_[T /* <: js.Object */] = typings.aframe.mod.SinglePropertySchema[T] | typings.aframe.mod.MultiPropertySchema[T]
  
  type ShaderDefinition[T /* <: js.Object */] = T with typings.aframe.anon.PartialShader
  
  type SystemDefinition[T /* <: js.Object */] = T with typings.aframe.anon.PartialSystemany
  
  @scala.inline
  def components: typings.aframe.mod.ObjectMap[
    typings.aframe.mod.ComponentDescriptor[typings.aframe.mod.Component[js.Any, typings.aframe.mod.System[js.Any]]]
  ] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("components").asInstanceOf[typings.aframe.mod.ObjectMap[
    typings.aframe.mod.ComponentDescriptor[typings.aframe.mod.Component[js.Any, typings.aframe.mod.System[js.Any]]]
  ]]
  
  @scala.inline
  def geometries: typings.aframe.mod.ObjectMap[typings.aframe.mod.GeometryDescriptor[typings.aframe.mod.Geometry[js.Any]]] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("geometries").asInstanceOf[typings.aframe.mod.ObjectMap[typings.aframe.mod.GeometryDescriptor[typings.aframe.mod.Geometry[js.Any]]]]
  
  @scala.inline
  def registerComponent: js.Function2[
    /* name */ java.lang.String, 
    /* component */ typings.aframe.mod.ComponentDefinition[js.Object], 
    typings.aframe.mod.ComponentConstructor[js.Object]
  ] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("registerComponent").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* component */ typings.aframe.mod.ComponentDefinition[js.Object], 
    typings.aframe.mod.ComponentConstructor[js.Object]
  ]]
  
  @scala.inline
  def registerElement: js.Function2[/* name */ java.lang.String, /* element */ js.Object, scala.Unit] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("registerElement").asInstanceOf[js.Function2[/* name */ java.lang.String, /* element */ js.Object, scala.Unit]]
  
  @scala.inline
  def registerGeometry: js.Function2[
    /* name */ java.lang.String, 
    /* geometry */ typings.aframe.mod.GeometryDefinition[js.Object, js.Any], 
    typings.aframe.mod.GeometryConstructor[js.Object]
  ] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("registerGeometry").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* geometry */ typings.aframe.mod.GeometryDefinition[js.Object, js.Any], 
    typings.aframe.mod.GeometryConstructor[js.Object]
  ]]
  
  @scala.inline
  def registerPrimitive: js.Function2[
    /* name */ java.lang.String, 
    /* primitive */ typings.aframe.mod.PrimitiveDefinition, 
    scala.Unit
  ] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("registerPrimitive").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* primitive */ typings.aframe.mod.PrimitiveDefinition, 
    scala.Unit
  ]]
  
  @scala.inline
  def registerShader: js.Function2[
    /* name */ java.lang.String, 
    /* shader */ typings.aframe.mod.ShaderDefinition[typings.aframe.mod.MinimalShaderDefinition with js.Object], 
    typings.aframe.mod.ShaderConstructor[typings.aframe.mod.MinimalShaderDefinition with js.Object]
  ] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("registerShader").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* shader */ typings.aframe.mod.ShaderDefinition[typings.aframe.mod.MinimalShaderDefinition with js.Object], 
    typings.aframe.mod.ShaderConstructor[typings.aframe.mod.MinimalShaderDefinition with js.Object]
  ]]
  
  @scala.inline
  def registerSystem: js.Function2[
    /* name */ java.lang.String, 
    /* definition */ typings.aframe.mod.SystemDefinition[js.Object], 
    typings.aframe.mod.SystemConstructor[js.Object]
  ] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("registerSystem").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* definition */ typings.aframe.mod.SystemDefinition[js.Object], 
    typings.aframe.mod.SystemConstructor[js.Object]
  ]]
  
  @scala.inline
  def scenes: js.Array[typings.aframe.mod.Scene] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("scenes").asInstanceOf[js.Array[typings.aframe.mod.Scene]]
  
  @scala.inline
  def schema: typings.aframe.mod.SchemaUtils = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("schema").asInstanceOf[typings.aframe.mod.SchemaUtils]
  
  @scala.inline
  def shaders: typings.aframe.mod.ObjectMap[typings.aframe.mod.ShaderDescriptor[typings.aframe.mod.Shader]] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("shaders").asInstanceOf[typings.aframe.mod.ObjectMap[typings.aframe.mod.ShaderDescriptor[typings.aframe.mod.Shader]]]
  
  @scala.inline
  def systems: typings.aframe.mod.ObjectMap[typings.aframe.mod.SystemConstructor[js.Object]] = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("systems").asInstanceOf[typings.aframe.mod.ObjectMap[typings.aframe.mod.SystemConstructor[js.Object]]]
  
  @scala.inline
  def utils: typings.aframe.mod.Utils_ = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[typings.aframe.mod.Utils_]
  
  @scala.inline
  def version: java.lang.String = typings.aframe.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
