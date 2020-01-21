package typings.angularScroll

import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("duScroll")
@js.native
object duScroll extends js.Object {
  /**
    * Extends the angular.element object returned by the $document sercive with a few jQuery like functions.
    * see https://github.com/oblador/angular-scroll#angularelement-scroll-api
    */
  @js.native
  trait IDocumentService
    extends typings.angular.mod.IDocumentService {
    def duScrollLeft(): Double = js.native
    def duScrollLeft(left: Double): Unit = js.native
    def duScrollLeft(left: Double, duration: Double): IPromise[Unit] = js.native
    def duScrollLeft(left: Double, duration: Double, easing: js.Function): IPromise[Unit] = js.native
    def duScrollLeftAnimated(left: Double): IPromise[Unit] = js.native
    def duScrollLeftAnimated(left: Double, duration: Double): IPromise[Unit] = js.native
    def duScrollLeftAnimated(left: Double, duration: Double, easing: js.Function): IPromise[Unit] = js.native
    def duScrollTo(element: IAugmentedJQuery): Unit = js.native
    def duScrollTo(element: IAugmentedJQuery, offset: Double): Unit = js.native
    def duScrollTo(element: IAugmentedJQuery, offset: Double, duration: Double): IPromise[Unit] = js.native
    def duScrollTo(element: IAugmentedJQuery, offset: Double, duration: Double, easing: js.Function): IPromise[Unit] = js.native
    def duScrollTo(left: Double, top: Double): Unit = js.native
    def duScrollTo(left: Double, top: Double, duration: Double): IPromise[Unit] = js.native
    def duScrollTo(left: Double, top: Double, duration: Double, easing: js.Function): IPromise[Unit] = js.native
    def duScrollToElement(element: IAugmentedJQuery): Unit = js.native
    def duScrollToElement(element: IAugmentedJQuery, offset: Double): Unit = js.native
    def duScrollToElement(element: IAugmentedJQuery, offset: Double, duration: Double): IPromise[Unit] = js.native
    def duScrollToElement(element: IAugmentedJQuery, offset: Double, duration: Double, easing: js.Function): IPromise[Unit] = js.native
    def duScrollToElementAnimated(element: IAugmentedJQuery): IPromise[Unit] = js.native
    def duScrollToElementAnimated(element: IAugmentedJQuery, offset: Double): IPromise[Unit] = js.native
    def duScrollToElementAnimated(element: IAugmentedJQuery, offset: Double, duration: Double): IPromise[Unit] = js.native
    def duScrollToElementAnimated(element: IAugmentedJQuery, offset: Double, duration: Double, easing: js.Function): IPromise[Unit] = js.native
    def duScrollTop(): Double = js.native
    def duScrollTop(top: Double): Unit = js.native
    def duScrollTop(top: Double, duration: Double): IPromise[Unit] = js.native
    def duScrollTop(top: Double, duration: Double, easing: js.Function): IPromise[Unit] = js.native
    def duScrollTopAnimated(top: Double): IPromise[Unit] = js.native
    def duScrollTopAnimated(top: Double, duration: Double): IPromise[Unit] = js.native
    def duScrollTopAnimated(top: Double, duration: Double, easing: js.Function): IPromise[Unit] = js.native
  }
  
}

