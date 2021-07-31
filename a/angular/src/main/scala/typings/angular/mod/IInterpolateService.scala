package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// InterpolateService
// see http://docs.angularjs.org/api/ng/service/$interpolate
// see http://docs.angularjs.org/api/ng/provider/$interpolateProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait IInterpolateService extends StObject {
  
  def apply(text: String): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Boolean): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Boolean, trustedContext: String): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Boolean, trustedContext: String, allOrNothing: Boolean): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Boolean, trustedContext: Unit, allOrNothing: Boolean): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Unit, trustedContext: String): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Unit, trustedContext: String, allOrNothing: Boolean): IInterpolationFunction = js.native
  def apply(text: String, mustHaveExpression: Unit, trustedContext: Unit, allOrNothing: Boolean): IInterpolationFunction = js.native
  
  def endSymbol(): String = js.native
  
  def startSymbol(): String = js.native
}
