package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aframeMod {
  type ComponentDefinition[T /* <: js.Object */] = T with (stdLib.Partial[Component[_, System[_]]]) with (stdLib.ThisType[T with (Component[_, System[_]])])
  type DetailEvent[D] = stdLib.Event with aframeLib.Anon_Detail[D]
  type GeometryDefinition[T /* <: js.Object */, U] = T with stdLib.Partial[Geometry[U]]
  type MultiPropertySchema[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: aframe.aframe.SinglePropertySchema<T[P]> | T[P]}
    */ aframeLib.aframeLibStrings.MultiPropertySchema with js.Any
  type NodeDefinition[T /* <: js.Object */] = T with stdLib.Partial[ANode]
  type ObjectMap[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Schema[T /* <: js.Object */] = SinglePropertySchema[T] | MultiPropertySchema[T]
  type ShaderDefinition[T /* <: js.Object */] = T with stdLib.Partial[Shader]
  type SystemDefinition[T /* <: js.Object */] = T with stdLib.Partial[System[_]]
}
