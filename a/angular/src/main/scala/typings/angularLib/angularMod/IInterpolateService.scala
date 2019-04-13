package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// InterpolateService
// see http://docs.angularjs.org/api/ng.$interpolate
// see http://docs.angularjs.org/api/ng.$interpolateProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait IInterpolateService extends js.Object {
  def apply(text: java.lang.String): IInterpolationFunction = js.native
  def apply(text: java.lang.String, mustHaveExpression: scala.Boolean): IInterpolationFunction = js.native
  def apply(text: java.lang.String, mustHaveExpression: scala.Boolean, trustedContext: java.lang.String): IInterpolationFunction = js.native
  def apply(
    text: java.lang.String,
    mustHaveExpression: scala.Boolean,
    trustedContext: java.lang.String,
    allOrNothing: scala.Boolean
  ): IInterpolationFunction = js.native
  def endSymbol(): java.lang.String = js.native
  def startSymbol(): java.lang.String = js.native
}

