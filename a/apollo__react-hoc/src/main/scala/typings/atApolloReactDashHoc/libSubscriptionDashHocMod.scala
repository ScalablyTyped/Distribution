package typings.atApolloReactDashHoc

import typings.atApolloReactDashHoc.libTypesMod.OperationOption
import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc/lib/subscription-hoc", JSImport.Namespace)
@js.native
object libSubscriptionDashHocMod extends js.Object {
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
  def withSubscription[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
}

