package typings
package antdLib.libBreadcrumbBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var breadcrumbName: java.lang.String
  var children: js.Array[antdLib.libUnderscoreUtilTypeMod.Omit[Route, antdLib.antdLibStrings.children]]
  var path: java.lang.String
}

object Route {
  @scala.inline
  def apply(
    breadcrumbName: java.lang.String,
    children: js.Array[antdLib.libUnderscoreUtilTypeMod.Omit[Route, antdLib.antdLibStrings.children]],
    path: java.lang.String
  ): Route = {
    val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName, children = children, path = path)
  
    __obj.asInstanceOf[Route]
  }
}

