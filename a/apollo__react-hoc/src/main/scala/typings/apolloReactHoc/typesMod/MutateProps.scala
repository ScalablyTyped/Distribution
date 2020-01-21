package typings.apolloReactHoc.typesMod

import typings.apolloReactCommon.typesMod.MutationFetchResult
import typings.apolloReactCommon.typesMod.MutationFunction
import typings.apolloReactCommon.typesMod.MutationFunctionOptions
import typings.apolloReactCommon.typesMod.MutationResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutateProps[TData, TGraphQLVariables] extends js.Object {
  var mutate: MutationFunction[TData, TGraphQLVariables]
  var result: MutationResult[TData]
}

object MutateProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](
    mutate: /* options */ js.UndefOr[MutationFunctionOptions[TData, TGraphQLVariables]] => js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]],
    result: MutationResult[TData]
  ): MutateProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(mutate = js.Any.fromFunction1(mutate), result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MutateProps[TData, TGraphQLVariables]]
  }
}

