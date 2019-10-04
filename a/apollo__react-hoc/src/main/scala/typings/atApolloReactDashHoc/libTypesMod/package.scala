package typings.atApolloReactDashHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typings.atApolloReactDashHoc.Anon_Client
  import typings.std.Partial

  type ChildDataProps[TProps, TData, TGraphQLVariables] = TProps with (DataProps[TData, TGraphQLVariables])
  type ChildMutateProps[TProps, TData, TGraphQLVariables] = TProps with (MutateProps[TData, TGraphQLVariables])
  type ChildProps[TProps, TData, TGraphQLVariables] = TProps with (Partial[DataProps[TData, TGraphQLVariables]]) with (Partial[MutateProps[TData, TGraphQLVariables]])
  type DataValue[TData, TGraphQLVariables] = (QueryControls[TData, TGraphQLVariables]) with Partial[TData]
  type WithApolloClient[P] = P with Anon_Client
}
