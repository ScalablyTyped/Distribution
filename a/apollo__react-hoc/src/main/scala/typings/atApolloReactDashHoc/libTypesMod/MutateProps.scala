package typings.atApolloReactDashHoc.libTypesMod

import typings.atApolloReactDashCommon.libTypesTypesMod.MutationFunction
import typings.atApolloReactDashCommon.libTypesTypesMod.MutationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutateProps[TData, TGraphQLVariables] extends js.Object {
  var mutate: MutationFunction[TData, TGraphQLVariables]
  var result: MutationResult[TData]
}

object MutateProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](mutate: MutationFunction[TData, TGraphQLVariables], result: MutationResult[TData]): MutateProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(mutate = mutate, result = result)
  
    __obj.asInstanceOf[MutateProps[TData, TGraphQLVariables]]
  }
}

