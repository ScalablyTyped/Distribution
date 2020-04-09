package typings.apolloReactCommon

import typings.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import typings.apolloReactCommon.parserMod.DocumentType
import typings.apolloReactCommon.parserMod.IDocumentDefinition
import typings.graphql.astMod.DocumentNode
import typings.react.mod.Context
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-common", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def operationName(`type`: DocumentType): String = js.native
  def parser(document: DocumentNode): IDocumentDefinition = js.native
  def resetApolloContext(): Unit = js.native
  @js.native
  object DocumentType extends js.Object {
    /* 1 */ val Mutation: typings.apolloReactCommon.parserMod.DocumentType.Mutation with Double = js.native
    /* 0 */ val Query: typings.apolloReactCommon.parserMod.DocumentType.Query with Double = js.native
    /* 2 */ val Subscription: typings.apolloReactCommon.parserMod.DocumentType.Subscription with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.apolloReactCommon.parserMod.DocumentType with Double] = js.native
  }
  
}

