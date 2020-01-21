package typings.apolloReactHooks

import typings.apolloClient.mod.ApolloClient
import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactCommon.parserMod.DocumentType
import typings.apolloReactHooks.typesMod.CommonOptions
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/data/OperationData", JSImport.Namespace)
@js.native
object operationDataMod extends js.Object {
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
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit | js.Function0[Unit] = js.native
    def cleanup(): Unit = js.native
    def execute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): js.Any = js.native
    def getOptions(): CommonOptions[TOptions] = js.native
    /* protected */ def refreshClient(): AnonClient = js.native
    def setOptions(newOptions: CommonOptions[TOptions]): Unit = js.native
    def setOptions(newOptions: CommonOptions[TOptions], storePrevious: Boolean): Unit = js.native
    /* protected */ def unmount(): Unit = js.native
    /* protected */ def verifyDocumentType(document: DocumentNode, `type`: DocumentType): Unit = js.native
  }
  
}

