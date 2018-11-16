package typings
package angularDashAnimateLib.angularDashAnimateMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animateNs {
  /**
           * AnimateCssService
           * see http://docs.angularjs.org/api/ngAnimate/service/$animateCss
           */
  type IAnimateCssService = js.Function2[
    /* element */ angularLib.JQuery, 
    /* animateCssOptions */ IAnimationOptions, 
    IAnimateCssRunner
  ]
  type IAnimateFactory = js.Function1[/* repeated */js.Any, IAnimateCallbackObject]
  type IAnimationPromise = angularLib.angularMod.angularNs.IPromise[scala.Unit]
}
