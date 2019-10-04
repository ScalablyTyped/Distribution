package typings.atApolloReactDashComponents

import typings.atApolloReactDashComponents.libTypesMod.QueryComponentOptions
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-components/lib/Query", JSImport.Namespace)
@js.native
object libQueryMod extends js.Object {
  def Query[TData, TVariables](props: QueryComponentOptions[TData, TVariables]): Element | Null = js.native
  @JSName("Query")
  @js.native
  object QueryNs extends js.Object {
    @js.native
    object propTypes extends js.Object {
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      var client: Requireable[js.Object] = js.native
      var fetchPolicy: Requireable[String] = js.native
      var notifyOnNetworkStatusChange: Requireable[Boolean] = js.native
      var onCompleted: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var partialRefetch: Requireable[Boolean] = js.native
      var pollInterval: Requireable[Double] = js.native
      var query: Validator[js.Object] = js.native
      var returnPartialData: Requireable[Boolean] = js.native
      var ssr: Requireable[Boolean] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
}

