package typings.apolloReactHoc

import typings.apolloReactCommon.typesMod.OperationVariables
import typings.apolloReactHoc.apolloReactHocStrings.client
import typings.apolloReactHoc.typesMod.ChildProps
import typings.apolloReactHoc.typesMod.OperationOption
import typings.apolloReactHoc.typesMod.WithApolloClient
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc/lib/withApollo", JSImport.Namespace)
@js.native
object withApolloMod extends js.Object {
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]]): ComponentClass[Omit[TProps, client], ComponentState] = js.native
  @JSName("withApollo")
  def withApollo_client[TProps, TResult](
    WrappedComponent: ComponentType[WithApolloClient[Omit[TProps, client]]],
    operationOptions: OperationOption[TProps, TResult, OperationVariables, ChildProps[TProps, TResult, OperationVariables]]
  ): ComponentClass[Omit[TProps, client], ComponentState] = js.native
}

