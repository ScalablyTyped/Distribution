package typings.angularDashAnimate.angularDashAnimateMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animate {
  import typings.angular.JQuery
  import typings.angular.angularMod.IPromise

  /**
    * AnimateCssService
    * see http://docs.angularjs.org/api/ngAnimate/service/$animateCss
    */
  type IAnimateCssService = js.Function2[/* element */ JQuery, /* animateCssOptions */ IAnimationOptions, IAnimateCssRunner]
  type IAnimateFactory = js.Function1[/* repeated */ js.Any, IAnimateCallbackObject]
  type IAnimationPromise = IPromise[Unit]
}
