package typings
package adoneLib.adoneNs.dataNs.yamlNs.typeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeOptions[T] extends js.Object {
  var construct: js.UndefOr[js.Function1[/* data */ java.lang.String, T]] = js.undefined
  var defaultStyle: js.UndefOr[java.lang.String] = js.undefined
  var instanceOf: js.UndefOr[js.Object] = js.undefined
  var kind: Kind
  var predicate: js.UndefOr[js.Function1[/* obj */ js.Any, scala.Boolean]] = js.undefined
  var represent: js.UndefOr[
    (js.Function2[/* obj */ js.Any, /* style */ java.lang.String, java.lang.String]) | (org.scalablytyped.runtime.StringDictionary[js.Function2[/* obj */ js.Any, /* style */ java.lang.String, java.lang.String]])
  ] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Boolean]] = js.undefined
  var styleAliases: js.UndefOr[js.Object] = js.undefined
}

object TypeOptions {
  @scala.inline
  def apply[T](
    kind: Kind,
    construct: /* data */ java.lang.String => T = null,
    defaultStyle: java.lang.String = null,
    instanceOf: js.Object = null,
    predicate: /* obj */ js.Any => scala.Boolean = null,
    represent: (js.Function2[/* obj */ js.Any, /* style */ java.lang.String, java.lang.String]) | (org.scalablytyped.runtime.StringDictionary[js.Function2[/* obj */ js.Any, /* style */ java.lang.String, java.lang.String]]) = null,
    resolve: /* data */ java.lang.String => scala.Boolean = null,
    styleAliases: js.Object = null
  ): TypeOptions[T] = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (construct != null) __obj.updateDynamic("construct")(js.Any.fromFunction1(construct))
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle)
    if (instanceOf != null) __obj.updateDynamic("instanceOf")(instanceOf)
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1(predicate))
    if (represent != null) __obj.updateDynamic("represent")(represent.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1(resolve))
    if (styleAliases != null) __obj.updateDynamic("styleAliases")(styleAliases)
    __obj.asInstanceOf[TypeOptions[T]]
  }
}

