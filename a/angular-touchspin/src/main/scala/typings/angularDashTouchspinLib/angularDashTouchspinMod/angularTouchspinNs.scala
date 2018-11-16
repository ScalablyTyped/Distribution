package typings
package angularDashTouchspinLib.angularDashTouchspinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("angular-touchspin", "angularTouchspin")
@js.native
object angularTouchspinNs extends js.Object {
  
  trait ITouchSpinConfigProvider extends js.Object {
    def defaults(touchSpinOptions: ITouchSpinOptions): scala.Unit
  }
  
  
  trait ITouchSpinOptions extends js.Object {
    var buttonDownClass: js.UndefOr[java.lang.String] = js.undefined
    var buttonDownShow: js.UndefOr[scala.Boolean] = js.undefined
    var buttonDownTxt: js.UndefOr[java.lang.String] = js.undefined
    var buttonUpClass: js.UndefOr[java.lang.String] = js.undefined
    var buttonUpShow: js.UndefOr[scala.Boolean] = js.undefined
    var buttonUpTxt: js.UndefOr[java.lang.String] = js.undefined
    var decimals: js.UndefOr[scala.Double] = js.undefined
    var decimalsDelimiter: js.UndefOr[java.lang.String] = js.undefined
    var forceStepDivisibility: js.UndefOr[StepDivisibilityType] = js.undefined
     // default is 'round' ('none' | 'floor' | 'round' | 'ceil') 
    var inputReadOnly: js.UndefOr[scala.Boolean] = js.undefined
    var max: js.UndefOr[scala.Double] = js.undefined
    var min: js.UndefOr[scala.Double] = js.undefined
    var mousewheel: js.UndefOr[scala.Boolean] = js.undefined
    var postfix: js.UndefOr[java.lang.String] = js.undefined
    var postfixExtraClass: js.UndefOr[java.lang.String] = js.undefined
    var prefix: js.UndefOr[java.lang.String] = js.undefined
    var prefixExtraClass: js.UndefOr[java.lang.String] = js.undefined
    var step: js.UndefOr[scala.Double] = js.undefined
    var stepInterval: js.UndefOr[scala.Double] = js.undefined
    var stepIntervalDelay: js.UndefOr[scala.Double] = js.undefined
    var verticalButtons: js.UndefOr[scala.Boolean] = js.undefined
    var verticalDownClass: js.UndefOr[java.lang.String] = js.undefined
    var verticalUpClass: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  sealed trait StepDivisibilityType extends js.Object
  
  @js.native
  object StepDivisibilityType extends js.Object {
    @js.native
    sealed trait ceil
      extends angularDashTouchspinLib.angularDashTouchspinMod.angularTouchspinNs.StepDivisibilityType
    
    @js.native
    sealed trait floor
      extends angularDashTouchspinLib.angularDashTouchspinMod.angularTouchspinNs.StepDivisibilityType
    
    @js.native
    sealed trait none
      extends angularDashTouchspinLib.angularDashTouchspinMod.angularTouchspinNs.StepDivisibilityType
    
    @js.native
    sealed trait round
      extends angularDashTouchspinLib.angularDashTouchspinMod.angularTouchspinNs.StepDivisibilityType
    
    val ceil: ceil with java.lang.String = js.native
    val floor: floor with java.lang.String = js.native
    val none: none with java.lang.String = js.native
    val round: round with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        angularDashTouchspinLib.angularDashTouchspinMod.angularTouchspinNs.StepDivisibilityType with java.lang.String
      ] = js.native
  }
  
  type ITouchSpinConfig = ITouchSpinOptions
}

