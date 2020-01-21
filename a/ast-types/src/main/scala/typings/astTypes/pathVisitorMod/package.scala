package typings.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pathVisitorMod {
  type Visitor = typings.astTypes.pathVisitorMod.PathVisitor
  type VisitorMethods = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* path */ typings.astTypes.nodePathMod.NodePath[js.Any, js.Any], js.Any]
  ]
}
