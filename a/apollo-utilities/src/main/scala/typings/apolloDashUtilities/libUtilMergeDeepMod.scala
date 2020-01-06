package typings.apolloDashUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/util/mergeDeep", JSImport.Namespace)
@js.native
object libUtilMergeDeepMod extends js.Object {
  def mergeDeep[T /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sources because its type T is not an array type */ sources: T
  ): TupleToIntersection[T] = js.native
  def mergeDeepArray[T](sources: js.Array[T]): T = js.native
  type TupleToIntersection[T /* <: js.Array[_] */] = js.Any
}

