package typings.apolloReactHoc

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object apolloReactHocComponents extends apolloReactHocProps {
  @scala.inline
  def ApolloConsumer: ComponentType[ApolloConsumerProps] = typings.apolloReactHoc.mod.ApolloConsumer.asInstanceOf[typings.react.mod.ComponentType[ApolloConsumerProps]]
  @scala.inline
  def ApolloProvider: ComponentType[ApolloProviderProps[js.Any]] = typings.apolloReactHoc.mod.ApolloProvider.asInstanceOf[typings.react.mod.ComponentType[ApolloProviderProps[js.Any]]]
  @scala.inline
  def GraphQLBase[TProps, TChildProps, TState]: ComponentType[TProps] = js.constructorOf[typings.apolloReactHoc.hocUtilsMod.GraphQLBase[TProps, TChildProps, TState]].asInstanceOf[typings.react.mod.ComponentType[TProps]]
}

