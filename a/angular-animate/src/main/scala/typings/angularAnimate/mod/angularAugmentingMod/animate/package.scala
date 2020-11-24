package typings.angularAnimate.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object animate {
  
  /**
    * AnimateCssService
    * see http://docs.angularjs.org/api/ngAnimate/service/$animateCss
    */
  type IAnimateCssService = js.Function2[
    /* element */ typings.angular.JQuery, 
    /* animateCssOptions */ typings.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions, 
    typings.angularAnimate.mod.angularAugmentingMod.animate.IAnimateCssRunner
  ]
  
  type IAnimateFactory = js.Function1[
    /* repeated */ js.Any, 
    typings.angularAnimate.mod.angularAugmentingMod.animate.IAnimateCallbackObject
  ]
  
  type IAnimationPromise = typings.angular.mod.IPromise[scala.Unit]
}
