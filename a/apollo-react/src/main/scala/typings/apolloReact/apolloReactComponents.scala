package typings.apolloReact

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object apolloReactComponents extends apolloReactProps {
  @scala.inline
  def ApolloProvider: ComponentType[ApolloProviderProps] = js.constructorOf[typings.apolloReact.apolloProviderMod.default].asInstanceOf[typings.react.mod.ComponentType[ApolloProviderProps]]
  @scala.inline
  def MockedProvider: ComponentType[js.Any] = js.constructorOf[typings.apolloReact.testUtilsMod.MockedProvider].asInstanceOf[typings.react.mod.ComponentType[js.Any]]
  @scala.inline
  def MockedSubscriptionProvider: ComponentType[js.Any] = js.constructorOf[typings.apolloReact.testUtilsMod.MockedSubscriptionProvider].asInstanceOf[typings.react.mod.ComponentType[js.Any]]
}

