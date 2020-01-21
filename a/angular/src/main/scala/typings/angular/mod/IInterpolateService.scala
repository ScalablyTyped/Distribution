package typings.angular.mod

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
  def apply(text: String): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Boolean): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Boolean, trustedContext: String): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Boolean, trustedContext: String, allOrNothing: Boolean): IInterpolationFunction = js.native
  def endSymbol(): String = js.native
  def startSymbol(): String = js.native
}

