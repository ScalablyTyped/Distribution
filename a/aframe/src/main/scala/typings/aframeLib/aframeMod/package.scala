package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aframeMod {
  type ComponentDefinition[T /* <: js.Object */] = T with (stdLib.Partial[Component[_, System[_]]]) with (stdLib.ThisType[T with (Component[_, System[_]])])
  type DetailEvent[D] = stdLib.Event with aframeLib.Anon_Detail[D]
  type GeometryDefinition[T /* <: js.Object */, U] = T with stdLib.Partial[Geometry[U]]
  type MultiPropertySchema[T /* <: js.Object */] = aframeLib.aframeLibStrings.MultiPropertySchema with T
  type NodeDefinition[T /* <: js.Object */] = T with stdLib.Partial[ANode]
  type PropertyTypes = aframeLib.aframeLibStrings.array | aframeLib.aframeLibStrings.asset | aframeLib.aframeLibStrings.audio | aframeLib.aframeLibStrings.boolean | aframeLib.aframeLibStrings.color | aframeLib.aframeLibStrings.int | aframeLib.aframeLibStrings.map | aframeLib.aframeLibStrings.model | aframeLib.aframeLibStrings.number | aframeLib.aframeLibStrings.selector | aframeLib.aframeLibStrings.selectorAll | aframeLib.aframeLibStrings.string | aframeLib.aframeLibStrings.vec2 | aframeLib.aframeLibStrings.vec3 | aframeLib.aframeLibStrings.vec4
  type SceneEvents = aframeLib.aframeLibStrings.`enter-vr` | aframeLib.aframeLibStrings.`exit-vr` | aframeLib.aframeLibStrings.loaded | aframeLib.aframeLibStrings.renderstart
  type Schema[T /* <: js.Object */] = SinglePropertySchema[T] | MultiPropertySchema[T]
  type ShaderDefinition[T /* <: js.Object */] = T with stdLib.Partial[Shader]
  type SystemDefinition[T /* <: js.Object */] = T with stdLib.Partial[System[_]]
}
