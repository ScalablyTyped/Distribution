package typings.apolloReact

import typings.apolloReact.apolloProviderMod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object apolloReactComponents extends apolloReactProps {
  @scala.inline
  def ApolloProvider: ComponentType[ApolloProviderProps] = js.constructorOf[default].asInstanceOf[ComponentType[ApolloProviderProps]]
  @scala.inline
  def MockedProvider: ComponentType[js.Any] = js.constructorOf[typings.apolloReact.testUtilsMod.MockedProvider].asInstanceOf[ComponentType[js.Any]]
  @scala.inline
  def MockedSubscriptionProvider: ComponentType[js.Any] = js.constructorOf[typings.apolloReact.testUtilsMod.MockedSubscriptionProvider].asInstanceOf[ComponentType[js.Any]]
}

