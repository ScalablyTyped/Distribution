package typings.atApolloReactDashCommon.atApolloReactDashCommonMod

import typings.atApolloReactDashCommon.libContextApolloConsumerMod.ApolloConsumerProps
import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashCommon.libContextApolloProviderMod.ApolloProviderProps
import typings.atApolloReactDashCommon.libParserParserMod.IDocumentDefinition
import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ApolloConsumer: FC[ApolloConsumerProps] = js.native
  val ApolloProvider: FC[ApolloProviderProps[js.Any]] = js.native
  def getApolloContext(): Context[ApolloContextValue] = js.native
  def operationName(`type`: typings.atApolloReactDashCommon.libParserParserMod.DocumentType): js.UndefOr[String] = js.native
  def parser(document: DocumentNode): IDocumentDefinition = js.native
  def resetApolloContext(): Unit = js.native
}

