package typings.astDashTypes

import org.scalablytyped.runtime.StringDictionary
import typings.astDashTypes.libNodeDashPathMod.NodePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPathDashVisitorMod {
  type Visitor = PathVisitor
  type VisitorMethods = StringDictionary[js.Function1[/* path */ NodePath[js.Any, js.Any], js.Any]]
}
