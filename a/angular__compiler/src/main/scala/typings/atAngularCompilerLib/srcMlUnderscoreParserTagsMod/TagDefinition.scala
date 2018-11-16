package typings
package atAngularCompilerLib.srcMlUnderscoreParserTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TagDefinition extends js.Object {
  var canSelfClose: scala.Boolean
  var closedByParent: scala.Boolean
  var contentType: TagContentType
  var ignoreFirstLf: scala.Boolean
  var implicitNamespacePrefix: java.lang.String | scala.Null
  var isVoid: scala.Boolean
  var parentToAdd: java.lang.String
  var requiredParents: ScalablyTyped.runtime.StringDictionary[scala.Boolean]
  def isClosedByChild(name: java.lang.String): scala.Boolean
  def requireExtraParent(currentParent: java.lang.String): scala.Boolean
}

