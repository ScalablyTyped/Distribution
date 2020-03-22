package typings.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentDefinition[T /* <: js.Object */] = T with typings.aframe.PartialComponentanySystem with (typings.std.ThisType[T with (typings.aframe.mod.Component[_, typings.aframe.mod.System[_]])])
  type GeometryDefinition[T /* <: js.Object */, U] = T with typings.std.Partial[typings.aframe.mod.Geometry[U]]
  type MultiPropertySchema[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: aframe.aframe.SinglePropertySchema<T[P]> | T[P]}
    */ typings.aframe.aframeStrings.MultiPropertySchema with js.Any
  type NodeDefinition[T /* <: js.Object */] = T with typings.aframe.PartialANode
  type ObjectMap[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Schema_[T /* <: js.Object */] = typings.aframe.mod.SinglePropertySchema[T] | typings.aframe.mod.MultiPropertySchema[T]
  type ShaderDefinition[T /* <: js.Object */] = T with typings.aframe.PartialShader
  type SystemDefinition[T /* <: js.Object */] = T with typings.aframe.PartialSystemany
}
