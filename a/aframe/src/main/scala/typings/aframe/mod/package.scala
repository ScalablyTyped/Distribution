package typings.aframe.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.aframe.anon.PartialANode
import typings.aframe.anon.PartialComponentanySystem
import typings.aframe.anon.PartialShader
import typings.aframe.anon.PartialSystemany
import typings.aframe.mod.^
import typings.animejs.mod.AnimeInstance
import typings.animejs.mod.AnimeParams
import typings.std.Partial
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AComponent: Component[Any, System[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("AComponent").asInstanceOf[Component[Any, System[Any]]]

inline def AEntity: Entity[ObjectMap[Component[Any, System[Any]]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("AEntity").asInstanceOf[Entity[ObjectMap[Component[Any, System[Any]]]]]

inline def ANIME: AnimeLib = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIME").asInstanceOf[AnimeLib]

inline def AScene: Scene = ^.asInstanceOf[js.Dynamic].selectDynamic("AScene").asInstanceOf[Scene]

inline def components: ObjectMap[ComponentDescriptor[Component[Any, System[Any]]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("components").asInstanceOf[ObjectMap[ComponentDescriptor[Component[Any, System[Any]]]]]

inline def geometries: ObjectMap[GeometryDescriptor[Geometry[Any]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("geometries").asInstanceOf[ObjectMap[GeometryDescriptor[Geometry[Any]]]]

inline def registerComponent: js.Function2[
/* name */ String, 
/* component */ ComponentDefinition[js.Object], 
ComponentConstructor[js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerComponent").asInstanceOf[js.Function2[
/* name */ String, 
/* component */ ComponentDefinition[js.Object], 
ComponentConstructor[js.Object]]]

inline def registerElement: js.Function2[/* name */ String, /* element */ js.Object, Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerElement").asInstanceOf[js.Function2[/* name */ String, /* element */ js.Object, Unit]]

inline def registerGeometry: js.Function2[
/* name */ String, 
/* geometry */ GeometryDefinition[js.Object, Any], 
GeometryConstructor[js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerGeometry").asInstanceOf[js.Function2[
/* name */ String, 
/* geometry */ GeometryDefinition[js.Object, Any], 
GeometryConstructor[js.Object]]]

inline def registerPrimitive: js.Function2[/* name */ String, /* primitive */ PrimitiveDefinition, Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerPrimitive").asInstanceOf[js.Function2[/* name */ String, /* primitive */ PrimitiveDefinition, Unit]]

inline def registerShader: js.Function2[
/* name */ String, 
/* shader */ ShaderDefinition[MinimalShaderDefinition & js.Object], 
ShaderConstructor[MinimalShaderDefinition & js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerShader").asInstanceOf[js.Function2[
/* name */ String, 
/* shader */ ShaderDefinition[MinimalShaderDefinition & js.Object], 
ShaderConstructor[MinimalShaderDefinition & js.Object]]]

inline def registerSystem: js.Function2[
/* name */ String, 
/* definition */ SystemDefinition[js.Object], 
SystemConstructor[js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerSystem").asInstanceOf[js.Function2[
/* name */ String, 
/* definition */ SystemDefinition[js.Object], 
SystemConstructor[js.Object]]]

inline def scenes: js.Array[Scene] = ^.asInstanceOf[js.Dynamic].selectDynamic("scenes").asInstanceOf[js.Array[Scene]]

inline def schema: SchemaUtils = ^.asInstanceOf[js.Dynamic].selectDynamic("schema").asInstanceOf[SchemaUtils]

inline def shaders: ObjectMap[ShaderDescriptor[Shader]] = ^.asInstanceOf[js.Dynamic].selectDynamic("shaders").asInstanceOf[ObjectMap[ShaderDescriptor[Shader]]]

inline def systems: ObjectMap[SystemConstructor[js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("systems").asInstanceOf[ObjectMap[SystemConstructor[js.Object]]]

inline def utils: Utils_ = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[Utils_]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type AnimeLib = js.Function1[/* params */ AnimeParams, AnimeInstance]

type ComponentDefinition[T /* <: js.Object */] = T & PartialComponentanySystem & (ThisType[T & (Component[Any, System[Any]])])

type GeometryDefinition[T /* <: js.Object */, U] = T & Partial[Geometry[U]]

type MultiPropertySchema[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: aframe.aframe.SinglePropertySchema<T[P]> | T[P]}
  */ typings.aframe.aframeStrings.MultiPropertySchema & TopLevel[Any]

type NodeDefinition[T /* <: js.Object */] = T & PartialANode

type ObjectMap[T] = StringDictionary[T]

type Schema_[T /* <: js.Object */] = SinglePropertySchema[T] | MultiPropertySchema[T]

type ShaderDefinition[T /* <: js.Object */] = T & PartialShader

type SystemDefinition[T /* <: js.Object */] = T & PartialSystemany
