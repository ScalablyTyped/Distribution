package typings.apolloDashReact

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object apolloDashReactComponents extends apolloDashReactProps {
  @scala.inline
  def ApolloProvider: ComponentType[ApolloProviderProps] = js.constructorOf[typings.apolloDashReact.libApolloProviderMod.default].asInstanceOf[typings.react.reactMod.ComponentType[ApolloProviderProps]]
  @scala.inline
  def MockedProvider: ComponentType[js.Any] = js.constructorOf[typings.apolloDashReact.libTestDashUtilsMod.MockedProvider].asInstanceOf[typings.react.reactMod.ComponentType[js.Any]]
  @scala.inline
  def MockedSubscriptionProvider: ComponentType[js.Any] = js.constructorOf[typings.apolloDashReact.libTestDashUtilsMod.MockedSubscriptionProvider].asInstanceOf[typings.react.reactMod.ComponentType[js.Any]]
}

