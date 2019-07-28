package typings.adone.adoneNs.dataNs.yamlNs.typeNs

import org.scalablytyped.runtime.StringDictionary
import typings.adone.adoneNs.dataNs.yamlNs.typeNs.INs.TypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.yaml.type.Type")
@js.native
class Type[T] protected () extends js.Object {
  def this(tag: String, options: TypeOptions[T]) = this()
  var defaultStyle: js.UndefOr[String] = js.native
  var instanceOf: js.UndefOr[js.Object] = js.native
  var predicate: js.UndefOr[js.Function1[/* obj */ js.Any, Boolean]] = js.native
  var represent: js.UndefOr[
    js.Function2[
      /* obj */ js.Any, 
      /* style */ String, 
      String | (StringDictionary[js.Function2[/* obj */ _, /* style */ String, String]])
    ]
  ] = js.native
  var styleAliases: js.UndefOr[js.Object] = js.native
  var tag: String = js.native
  def construct(data: String): T = js.native
  def resolve(data: String): Boolean = js.native
}

