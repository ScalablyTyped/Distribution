package typings
package angularDashScrollLib.duScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends the angular.element object returned by the $document sercive with a few jQuery like functions.
  * see https://github.com/oblador/angular-scroll#angularelement-scroll-api
  */
@js.native
trait IDocumentService
  extends angularLib.angularMod.angularNs.IDocumentService {
  def duScrollLeft(): scala.Double = js.native
  def duScrollLeft(left: scala.Double): scala.Unit = js.native
  def duScrollLeft(left: scala.Double, duration: scala.Double): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollLeft(left: scala.Double, duration: scala.Double, easing: js.Function): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollLeftAnimated(left: scala.Double): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollLeftAnimated(left: scala.Double, duration: scala.Double): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollLeftAnimated(left: scala.Double, duration: scala.Double, easing: js.Function): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollTo(element: angularLib.angularMod.angularNs.IAugmentedJQuery): scala.Unit = js.native
  def duScrollTo(element: angularLib.angularMod.angularNs.IAugmentedJQuery, offset: scala.Double): scala.Unit = js.native
  def duScrollTo(
    element: angularLib.angularMod.angularNs.IAugmentedJQuery,
    offset: scala.Double,
    duration: scala.Double
  ): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollTo(
    element: angularLib.angularMod.angularNs.IAugmentedJQuery,
    offset: scala.Double,
    duration: scala.Double,
    easing: js.Function
  ): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollTo(left: scala.Double, top: scala.Double): scala.Unit = js.native
  def duScrollTo(left: scala.Double, top: scala.Double, duration: scala.Double): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollTo(left: scala.Double, top: scala.Double, duration: scala.Double, easing: js.Function): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollToElement(element: angularLib.angularMod.angularNs.IAugmentedJQuery): scala.Unit = js.native
  def duScrollToElement(element: angularLib.angularMod.angularNs.IAugmentedJQuery, offset: scala.Double): scala.Unit = js.native
  def duScrollToElement(
    element: angularLib.angularMod.angularNs.IAugmentedJQuery,
    offset: scala.Double,
    duration: scala.Double
  ): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollToElement(
    element: angularLib.angularMod.angularNs.IAugmentedJQuery,
    offset: scala.Double,
    duration: scala.Double,
    easing: js.Function
  ): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollToElementAnimated(element: angularLib.angularMod.angularNs.IAugmentedJQuery): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollToElementAnimated(element: angularLib.angularMod.angularNs.IAugmentedJQuery, offset: scala.Double): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollToElementAnimated(
    element: angularLib.angularMod.angularNs.IAugmentedJQuery,
    offset: scala.Double,
    duration: scala.Double
  ): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollToElementAnimated(
    element: angularLib.angularMod.angularNs.IAugmentedJQuery,
    offset: scala.Double,
    duration: scala.Double,
    easing: js.Function
  ): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollTop(): scala.Double = js.native
  def duScrollTop(top: scala.Double): scala.Unit = js.native
  def duScrollTop(top: scala.Double, duration: scala.Double): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollTop(top: scala.Double, duration: scala.Double, easing: js.Function): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollTopAnimated(top: scala.Double): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollTopAnimated(top: scala.Double, duration: scala.Double): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def duScrollTopAnimated(top: scala.Double, duration: scala.Double, easing: js.Function): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
}

