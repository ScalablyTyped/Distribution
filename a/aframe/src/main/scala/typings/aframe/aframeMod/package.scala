package typings.aframe

import org.scalablytyped.runtime.StringDictionary
import typings.aframe.Anon_Detail
import typings.std.Event
import typings.std.Partial
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aframeMod {
  type ComponentDefinition[T /* <: js.Object */] = T with (Partial[Component[_, System[_]]]) with (ThisType[T with (Component[_, System[_]])])
  type DetailEvent[D] = Event with Anon_Detail[D]
  type GeometryDefinition[T /* <: js.Object */, U] = T with Partial[Geometry[U]]
  type MultiPropertySchema[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: aframe.aframe.SinglePropertySchema<T[P]> | T[P]}
    */ typings.aframe.aframeStrings.MultiPropertySchema with js.Any
  type NodeDefinition[T /* <: js.Object */] = T with Partial[ANode]
  type ObjectMap[T] = StringDictionary[T]
  type Schema[T /* <: js.Object */] = SinglePropertySchema[T] | MultiPropertySchema[T]
  type ShaderDefinition[T /* <: js.Object */] = T with Partial[Shader]
  type SystemDefinition[T /* <: js.Object */] = T with Partial[System[_]]
}
