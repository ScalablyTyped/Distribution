package typings.antd

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNodeMod {
  
  @JSImport("antd/lib/_util/reactNode", "cloneElement")
  @js.native
  def cloneElement(element: ReactNode): ReactElement = js.native
  @JSImport("antd/lib/_util/reactNode", "cloneElement")
  @js.native
  def cloneElement(element: ReactNode, props: RenderProps): ReactElement = js.native
  
  @JSImport("antd/lib/_util/reactNode", "isValidElement")
  @js.native
  def isValidElement[P](): /* is react.react.ReactElement */ Boolean = js.native
  @JSImport("antd/lib/_util/reactNode", "isValidElement")
  @js.native
  def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
  
  @JSImport("antd/lib/_util/reactNode", "replaceElement")
  @js.native
  def replaceElement(element: ReactNode, replacement: ReactNode, props: RenderProps): ReactNode = js.native
  
  type AnyObject = Record[js.Any, js.Any]
  
  type RenderProps = js.UndefOr[AnyObject | (js.Function1[/* originProps */ AnyObject, js.UndefOr[AnyObject]])]
}
