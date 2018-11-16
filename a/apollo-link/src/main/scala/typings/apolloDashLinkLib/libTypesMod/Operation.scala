package typings
package apolloDashLinkLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Operation extends js.Object {
  var extensions: stdLib.Record[java.lang.String, _]
  var operationName: java.lang.String
  var query: graphqlLib.languageAstMod.DocumentNode
  var variables: stdLib.Record[java.lang.String, _]
  def getContext(): stdLib.Record[java.lang.String, _]
  def setContext(context: stdLib.Record[java.lang.String, _]): stdLib.Record[java.lang.String, _]
  def toKey(): java.lang.String
}

