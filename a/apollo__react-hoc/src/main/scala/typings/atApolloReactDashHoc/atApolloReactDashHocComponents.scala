package typings.atApolloReactDashHoc

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atApolloReactDashHocComponents extends atApolloReactDashHocProps {
  @scala.inline
  def ApolloConsumer: ComponentType[ApolloConsumerProps] = typings.atApolloReactDashHoc.atApolloReactDashHocMod.ApolloConsumer.asInstanceOf[typings.react.reactMod.ComponentType[ApolloConsumerProps]]
  @scala.inline
  def ApolloProvider: ComponentType[ApolloProviderProps[js.Any]] = typings.atApolloReactDashHoc.atApolloReactDashHocMod.ApolloProvider.asInstanceOf[typings.react.reactMod.ComponentType[ApolloProviderProps[js.Any]]]
  @scala.inline
  def GraphQLBase[TProps, TChildProps, TState]: ComponentType[TProps] = js.constructorOf[typings.atApolloReactDashHoc.libHocDashUtilsMod.GraphQLBase[TProps, TChildProps, TState]].asInstanceOf[typings.react.reactMod.ComponentType[TProps]]
}

