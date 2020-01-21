package typings.apolloReactSsr

import org.scalablytyped.runtime.StringDictionary
import typings.apolloReactSsr.getDataFromTreeMod.GetMarkupFromTreeOptions
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-ssr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getDataFromTree(tree: ReactNode): js.Promise[String] = js.native
  def getDataFromTree(tree: ReactNode, context: StringDictionary[js.Any]): js.Promise[String] = js.native
  def getMarkupFromTree(hasTreeContextRenderFunction: GetMarkupFromTreeOptions): js.Promise[String] = js.native
  def renderToStringWithData(component: ReactElement): js.Promise[String] = js.native
}

