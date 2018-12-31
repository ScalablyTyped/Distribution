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

