package typings
package adoneLib.adoneNs.dataNs.yamlNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.yaml.type.Type")
@js.native
class Type[T] protected () extends js.Object {
  def this(tag: java.lang.String, options: adoneLib.adoneNs.dataNs.yamlNs.typeNs.INs.TypeOptions[T]) = this()
  var defaultStyle: js.UndefOr[java.lang.String] = js.native
  var instanceOf: js.UndefOr[js.Object] = js.native
  var predicate: js.UndefOr[js.Function1[/* obj */ js.Any, scala.Boolean]] = js.native
  var represent: js.UndefOr[
    js.Function2[
      /* obj */ js.Any, 
      /* style */ java.lang.String, 
      java.lang.String | (org.scalablytyped.runtime.StringDictionary[js.Function2[/* obj */ _, /* style */ java.lang.String, java.lang.String]])
    ]
  ] = js.native
  var styleAliases: js.UndefOr[js.Object] = js.native
  var tag: java.lang.String = js.native
  def construct(data: java.lang.String): T = js.native
  def resolve(data: java.lang.String): scala.Boolean = js.native
}

