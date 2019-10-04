package typings.atApolloReactDashSsr

import org.scalablytyped.runtime.StringDictionary
import typings.atApolloReactDashSsr.libGetDataFromTreeMod.GetMarkupFromTreeOptions
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-ssr", JSImport.Namespace)
@js.native
object atApolloReactDashSsrMod extends js.Object {
  def getDataFromTree(tree: ReactNode): js.Promise[String] = js.native
  def getDataFromTree(tree: ReactNode, context: StringDictionary[js.Any]): js.Promise[String] = js.native
  def getMarkupFromTree(hasTreeContextRenderFunction: GetMarkupFromTreeOptions): js.Promise[String] = js.native
  def renderToStringWithData(component: ReactElement): js.Promise[String] = js.native
}

