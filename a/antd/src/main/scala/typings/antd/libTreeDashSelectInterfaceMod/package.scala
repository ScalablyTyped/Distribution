package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTreeDashSelectInterfaceMod {
  type TreeNode = TreeNodeNormal | TreeNodeSimpleMode
  type TreeNodeSimpleMode = StringDictionary[String | Boolean | ReactNode]
  type TreeNodeValue = String | Double | (js.Array[Double | String])
}
