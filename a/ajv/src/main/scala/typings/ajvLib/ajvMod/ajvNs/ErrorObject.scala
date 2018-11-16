package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrorObject extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var dataPath: java.lang.String
  var keyword: java.lang.String
  // Excluded if messages set to false.
  var message: js.UndefOr[java.lang.String] = js.undefined
  var params: ErrorParameters
  var parentSchema: js.UndefOr[js.Object] = js.undefined
  // Added to validation errors of propertyNames keyword schema
  var propertyName: js.UndefOr[java.lang.String] = js.undefined
  // These are added with the `verbose` option.
  var schema: js.UndefOr[js.Any] = js.undefined
  var schemaPath: java.lang.String
}

