package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEService
// see http://docs.angularjs.org/api/ng.$sce
///////////////////////////////////////////////////////////////////////////
trait ISCEService extends js.Object {
  def getTrusted(`type`: java.lang.String, mayBeTrusted: js.Any): js.Any
  def getTrustedCss(value: js.Any): js.Any
  def getTrustedHtml(value: js.Any): js.Any
  def getTrustedJs(value: js.Any): js.Any
  def getTrustedResourceUrl(value: js.Any): js.Any
  def getTrustedUrl(value: js.Any): js.Any
  def isEnabled(): scala.Boolean
  def parse(`type`: java.lang.String, expression: java.lang.String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsCss(expression: java.lang.String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsHtml(expression: java.lang.String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsJs(expression: java.lang.String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsResourceUrl(expression: java.lang.String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsUrl(expression: java.lang.String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def trustAs(`type`: java.lang.String, value: js.Any): js.Any
  def trustAsHtml(value: js.Any): js.Any
  def trustAsJs(value: js.Any): js.Any
  def trustAsResourceUrl(value: js.Any): js.Any
  def trustAsUrl(value: js.Any): js.Any
}

object ISCEService {
  @scala.inline
  def apply(
    getTrusted: js.Function2[java.lang.String, js.Any, js.Any],
    getTrustedCss: js.Function1[js.Any, js.Any],
    getTrustedHtml: js.Function1[js.Any, js.Any],
    getTrustedJs: js.Function1[js.Any, js.Any],
    getTrustedResourceUrl: js.Function1[js.Any, js.Any],
    getTrustedUrl: js.Function1[js.Any, js.Any],
    isEnabled: js.Function0[scala.Boolean],
    parse: js.Function2[
      java.lang.String, 
      java.lang.String, 
      js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
    ],
    parseAsCss: js.Function1[java.lang.String, js.Function2[/* context */ js.Any, /* locals */ js.Any, _]],
    parseAsHtml: js.Function1[java.lang.String, js.Function2[/* context */ js.Any, /* locals */ js.Any, _]],
    parseAsJs: js.Function1[java.lang.String, js.Function2[/* context */ js.Any, /* locals */ js.Any, _]],
    parseAsResourceUrl: js.Function1[java.lang.String, js.Function2[/* context */ js.Any, /* locals */ js.Any, _]],
    parseAsUrl: js.Function1[java.lang.String, js.Function2[/* context */ js.Any, /* locals */ js.Any, _]],
    trustAs: js.Function2[java.lang.String, js.Any, js.Any],
    trustAsHtml: js.Function1[js.Any, js.Any],
    trustAsJs: js.Function1[js.Any, js.Any],
    trustAsResourceUrl: js.Function1[js.Any, js.Any],
    trustAsUrl: js.Function1[js.Any, js.Any]
  ): ISCEService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTrusted")(getTrusted)
    __obj.updateDynamic("getTrustedCss")(getTrustedCss)
    __obj.updateDynamic("getTrustedHtml")(getTrustedHtml)
    __obj.updateDynamic("getTrustedJs")(getTrustedJs)
    __obj.updateDynamic("getTrustedResourceUrl")(getTrustedResourceUrl)
    __obj.updateDynamic("getTrustedUrl")(getTrustedUrl)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("parseAsCss")(parseAsCss)
    __obj.updateDynamic("parseAsHtml")(parseAsHtml)
    __obj.updateDynamic("parseAsJs")(parseAsJs)
    __obj.updateDynamic("parseAsResourceUrl")(parseAsResourceUrl)
    __obj.updateDynamic("parseAsUrl")(parseAsUrl)
    __obj.updateDynamic("trustAs")(trustAs)
    __obj.updateDynamic("trustAsHtml")(trustAsHtml)
    __obj.updateDynamic("trustAsJs")(trustAsJs)
    __obj.updateDynamic("trustAsResourceUrl")(trustAsResourceUrl)
    __obj.updateDynamic("trustAsUrl")(trustAsUrl)
    __obj.asInstanceOf[ISCEService]
  }
}

