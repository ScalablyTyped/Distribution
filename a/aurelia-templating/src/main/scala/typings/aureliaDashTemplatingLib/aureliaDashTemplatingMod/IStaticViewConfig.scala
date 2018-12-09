package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IStaticViewConfig extends js.Object {
  var dependencies: js.UndefOr[
    js.Array[js.Function] | (js.Function0[
      js.Array[
        js.Function | (js.Promise[js.Function | (stdLib.Record[java.lang.String, js.Function])])
      ]
    ])
  ] = js.undefined
  var template: java.lang.String | stdLib.HTMLTemplateElement
}

