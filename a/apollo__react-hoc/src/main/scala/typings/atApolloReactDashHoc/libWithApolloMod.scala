package typings.atApolloReactDashHoc

import typings.atApolloReactDashCommon.libTypesTypesMod.OperationVariables
import typings.atApolloReactDashHoc.atApolloReactDashHocStrings.client
import typings.atApolloReactDashHoc.libTypesMod.ChildProps
import typings.atApolloReactDashHoc.libTypesMod.OperationOption
import typings.atApolloReactDashHoc.libTypesMod.WithApolloClient
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc/lib/withApollo", JSImport.Namespace)
@js.native
object libWithApolloMod extends js.Object {
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]]): ComponentClass[Omit[TProps, client], ComponentState] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](
    WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ComponentClass[Omit[TProps, client], ComponentState] = js.native
}

