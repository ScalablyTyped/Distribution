package typings
package apolloDashClientLib.coreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FetchType extends js.Object

@JSImport("apollo-client/core/types", "FetchType")
@js.native
object FetchType extends js.Object {
  @js.native
  sealed trait normal
    extends apolloDashClientLib.coreTypesMod.FetchType
  
  @js.native
  sealed trait poll
    extends apolloDashClientLib.coreTypesMod.FetchType
  
  @js.native
  sealed trait refetch
    extends apolloDashClientLib.coreTypesMod.FetchType
  
  /* 1 */ val normal: normal with scala.Double = js.native
  /* 3 */ val poll: poll with scala.Double = js.native
  /* 2 */ val refetch: refetch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[apolloDashClientLib.coreTypesMod.FetchType with scala.Double] = js.native
}

