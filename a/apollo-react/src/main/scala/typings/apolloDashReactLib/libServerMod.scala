package typings
package apolloDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-react/lib/server", JSImport.Namespace)
@js.native
object libServerMod extends js.Object {
  def cleanupApolloState(apolloState: js.Any): scala.Unit = js.native
  def getDataFromTree(rootElement: js.Any): js.Promise[scala.Unit] = js.native
  def getDataFromTree(rootElement: js.Any, rootContext: js.Any): js.Promise[scala.Unit] = js.native
  def getDataFromTree(rootElement: js.Any, rootContext: js.Any, fetchRoot: scala.Boolean): js.Promise[scala.Unit] = js.native
  def renderToStringWithData(component: js.Any): js.Promise[java.lang.String] = js.native
  def walkTree(
    element: js.Any,
    context: js.Any,
    visitor: js.Function3[
      /* element */ js.Any, 
      /* instance */ js.Any, 
      /* context */ js.Any, 
      scala.Boolean | scala.Unit
    ]
  ): scala.Unit = js.native
}

