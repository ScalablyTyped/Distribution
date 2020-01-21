package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEService
// see http://docs.angularjs.org/api/ng.$sce
///////////////////////////////////////////////////////////////////////////
trait ISCEService extends js.Object {
  def getTrusted(`type`: String, mayBeTrusted: js.Any): js.Any
  def getTrustedCss(value: js.Any): js.Any
  def getTrustedHtml(value: js.Any): js.Any
  def getTrustedJs(value: js.Any): js.Any
  def getTrustedResourceUrl(value: js.Any): js.Any
  def getTrustedUrl(value: js.Any): js.Any
  def isEnabled(): Boolean
  def parse(`type`: String, expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsCss(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsHtml(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsJs(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsResourceUrl(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsUrl(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def trustAs(`type`: String, value: js.Any): js.Any
  def trustAsHtml(value: js.Any): js.Any
  def trustAsJs(value: js.Any): js.Any
  def trustAsResourceUrl(value: js.Any): js.Any
  def trustAsUrl(value: js.Any): js.Any
}

object ISCEService {
  @scala.inline
  def apply(
    getTrusted: (String, js.Any) => js.Any,
    getTrustedCss: js.Any => js.Any,
    getTrustedHtml: js.Any => js.Any,
    getTrustedJs: js.Any => js.Any,
    getTrustedResourceUrl: js.Any => js.Any,
    getTrustedUrl: js.Any => js.Any,
    isEnabled: () => Boolean,
    parse: (String, String) => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsCss: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsHtml: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsJs: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsResourceUrl: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsUrl: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    trustAs: (String, js.Any) => js.Any,
    trustAsHtml: js.Any => js.Any,
    trustAsJs: js.Any => js.Any,
    trustAsResourceUrl: js.Any => js.Any,
    trustAsUrl: js.Any => js.Any
  ): ISCEService = {
    val __obj = js.Dynamic.literal(getTrusted = js.Any.fromFunction2(getTrusted), getTrustedCss = js.Any.fromFunction1(getTrustedCss), getTrustedHtml = js.Any.fromFunction1(getTrustedHtml), getTrustedJs = js.Any.fromFunction1(getTrustedJs), getTrustedResourceUrl = js.Any.fromFunction1(getTrustedResourceUrl), getTrustedUrl = js.Any.fromFunction1(getTrustedUrl), isEnabled = js.Any.fromFunction0(isEnabled), parse = js.Any.fromFunction2(parse), parseAsCss = js.Any.fromFunction1(parseAsCss), parseAsHtml = js.Any.fromFunction1(parseAsHtml), parseAsJs = js.Any.fromFunction1(parseAsJs), parseAsResourceUrl = js.Any.fromFunction1(parseAsResourceUrl), parseAsUrl = js.Any.fromFunction1(parseAsUrl), trustAs = js.Any.fromFunction2(trustAs), trustAsHtml = js.Any.fromFunction1(trustAsHtml), trustAsJs = js.Any.fromFunction1(trustAsJs), trustAsResourceUrl = js.Any.fromFunction1(trustAsResourceUrl), trustAsUrl = js.Any.fromFunction1(trustAsUrl))
  
    __obj.asInstanceOf[ISCEService]
  }
}

