package typings.antvUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/mix", JSImport.Namespace)
@js.native
object mixMod extends js.Object {
  
  def default[Base, A, B, C](dist: Base with A with B with C): Base with A with B with C = js.native
  def default[Base, A, B, C](dist: Base with A with B with C, src1: A): Base with A with B with C = js.native
  def default[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B): Base with A with B with C = js.native
  def default[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: B, src3: C): Base with A with B with C = js.native
  def default[Base, A, B, C](dist: Base with A with B with C, src1: A, src2: js.UndefOr[scala.Nothing], src3: C): Base with A with B with C = js.native
  def default[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B): Base with A with B with C = js.native
  def default[Base, A, B, C](dist: Base with A with B with C, src1: js.UndefOr[scala.Nothing], src2: B, src3: C): Base with A with B with C = js.native
  def default[Base, A, B, C](
    dist: Base with A with B with C,
    src1: js.UndefOr[scala.Nothing],
    src2: js.UndefOr[scala.Nothing],
    src3: C
  ): Base with A with B with C = js.native
}
