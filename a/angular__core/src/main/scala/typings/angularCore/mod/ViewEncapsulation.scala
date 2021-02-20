package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewEncapsulation extends StObject
@JSImport("@angular/core", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation with Double] = js.native
  
  /**
    * Emulate `Native` scoping of styles by adding an attribute containing surrogate id to the Host
    * Element and pre-processing the style rules provided via {@link Component#styles styles} or
    * {@link Component#styleUrls styleUrls}, and adding the new Host Element attribute to all
    * selectors.
    *
    * This is the default option.
    */
  @js.native
  sealed trait Emulated extends ViewEncapsulation
  /* 0 */ val Emulated: typings.angularCore.mod.ViewEncapsulation.Emulated with Double = js.native
  
  /**
    * Don't provide any template or style encapsulation.
    */
  @js.native
  sealed trait None extends ViewEncapsulation
  /* 2 */ val None: typings.angularCore.mod.ViewEncapsulation.None with Double = js.native
  
  /**
    * Use Shadow DOM to encapsulate styles.
    *
    * For the DOM this means using modern [Shadow
    * DOM](https://w3c.github.io/webcomponents/spec/shadow/) and
    * creating a ShadowRoot for Component's Host Element.
    */
  @js.native
  sealed trait ShadowDom extends ViewEncapsulation
  /* 3 */ val ShadowDom: typings.angularCore.mod.ViewEncapsulation.ShadowDom with Double = js.native
}
