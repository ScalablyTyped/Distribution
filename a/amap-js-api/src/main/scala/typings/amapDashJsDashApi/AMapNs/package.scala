package typings.amapDashJsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AMapNs {
  type LocationValue = LngLat | (js.Tuple2[Double, Double])
  type Merge[O, T] = O with T
  type Omit[T, E /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in std.Exclude<keyof T, E> ]: T[K]}
    */ typings.amapDashJsDashApi.amapDashJsDashApiStrings.Omit with T
  type OptionalKey[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any
  type SizeValue = Size | (js.Tuple2[Double, Double])
}
