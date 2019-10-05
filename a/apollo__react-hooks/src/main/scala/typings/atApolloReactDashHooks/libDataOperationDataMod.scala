package typings.atApolloReactDashHooks

import typings.apolloDashClient.apolloDashClientMod.ApolloClient
import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashCommon.libParserParserMod.DocumentType
import typings.atApolloReactDashHooks.libTypesMod.CommonOptions
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/data/OperationData", JSImport.Namespace)
@js.native
object libDataOperationDataMod extends js.Object {
  @js.native
  abstract class OperationData[TOptions] () extends js.Object {
    def this(options: CommonOptions[TOptions]) = this()
    def this(options: CommonOptions[TOptions], context: ApolloContextValue) = this()
    var client: js.UndefOr[ApolloClient[js.Object]] = js.native
    var context: ApolloContextValue = js.native
    var isMounted: Boolean = js.native
    var options: js.Any = js.native
    var previousOptions: CommonOptions[TOptions] = js.native
    def afterExecute(
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit | js.Function0[Unit] = js.native
    def cleanup(): Unit = js.native
    def execute(
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): js.Any = js.native
    def getOptions(): CommonOptions[TOptions] = js.native
    /* protected */ def refreshClient(): Anon_Client = js.native
    def setOptions(newOptions: CommonOptions[TOptions]): Unit = js.native
    def setOptions(newOptions: CommonOptions[TOptions], storePrevious: Boolean): Unit = js.native
    /* protected */ def unmount(): Unit = js.native
    /* protected */ def verifyDocumentType(document: DocumentNode, `type`: DocumentType): Unit = js.native
  }
  
}

