package typings.apolloDashClient.coreTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.apolloDashClient.coreTypesMod.FetchType.normal
import typings.apolloDashClient.coreTypesMod.FetchType.poll
import typings.apolloDashClient.coreTypesMod.FetchType.refetch
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FetchType with Double] = js.native
  /* 1 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 3 */ @js.native
  object poll extends TopLevel[poll with Double]
  
  /* 2 */ @js.native
  object refetch extends TopLevel[refetch with Double]
  
}

