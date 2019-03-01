package typings
package asyncDashBusboyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: org.scalablytyped.runtime.StringDictionary[js.Any]
  var files: js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify fs.ReadStream */ _
    ]
  ] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(
    fields: org.scalablytyped.runtime.StringDictionary[js.Any],
    files: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify fs.ReadStream */ _
    ] = null
  ): Anon_Fields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Anon_Fields]
  }
}

