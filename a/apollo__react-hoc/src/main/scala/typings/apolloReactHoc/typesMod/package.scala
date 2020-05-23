package typings.apolloReactHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ChildDataProps[TProps, TData, TGraphQLVariables] = TProps with (typings.apolloReactHoc.typesMod.DataProps[TData, TGraphQLVariables])
  type ChildMutateProps[TProps, TData, TGraphQLVariables] = TProps with (typings.apolloReactHoc.typesMod.MutateProps[TData, TGraphQLVariables])
  type ChildProps[TProps, TData, TGraphQLVariables] = TProps with (typings.std.Partial[typings.apolloReactHoc.typesMod.DataProps[TData, TGraphQLVariables]]) with (typings.std.Partial[typings.apolloReactHoc.typesMod.MutateProps[TData, TGraphQLVariables]])
  type DataValue[TData, TGraphQLVariables] = (typings.apolloReactHoc.typesMod.QueryControls[TData, TGraphQLVariables]) with typings.std.Partial[TData]
  type WithApolloClient[P] = P with typings.apolloReactHoc.anon.Client
}
