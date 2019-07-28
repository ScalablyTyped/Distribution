package typings.apolloDashClient.coreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FetchType extends js.Object

@JSImport("apollo-client/core/types", "FetchType")
@js.native
object FetchType extends js.Object {
  @js.native
  sealed trait normal extends FetchType
  
  @js.native
  sealed trait poll extends FetchType
  
  @js.native
  sealed trait refetch extends FetchType
  
  /* 1 */ val normal: typings.apolloDashClient.coreTypesMod.FetchType.normal with Double = js.native
  /* 3 */ val poll: typings.apolloDashClient.coreTypesMod.FetchType.poll with Double = js.native
  /* 2 */ val refetch: typings.apolloDashClient.coreTypesMod.FetchType.refetch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FetchType with Double] = js.native
}

