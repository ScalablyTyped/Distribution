package typings.atApolloReactDashCommon

import typings.atApolloReactDashCommon.libContextApolloConsumerMod.ApolloConsumerProps
import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashCommon.libContextApolloProviderMod.ApolloProviderProps
import typings.atApolloReactDashCommon.libParserParserMod.DocumentType
import typings.atApolloReactDashCommon.libParserParserMod.IDocumentDefinition
import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-common", JSImport.Namespace)
@js.native
object atApolloReactDashCommonMod extends js.Object {
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def operationName(`type`: DocumentType): js.UndefOr[String] = js.native
  def parser(document: DocumentNode): IDocumentDefinition = js.native
  def resetApolloContext(): Unit = js.native
  @js.native
  object DocumentType extends js.Object {
    /* 1 */ val Mutation: typings.atApolloReactDashCommon.libParserParserMod.DocumentType.Mutation with Double = js.native
    /* 0 */ val Query: typings.atApolloReactDashCommon.libParserParserMod.DocumentType.Query with Double = js.native
    /* 2 */ val Subscription: typings.atApolloReactDashCommon.libParserParserMod.DocumentType.Subscription with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atApolloReactDashCommon.libParserParserMod.DocumentType with Double] = js.native
  }
  
}

