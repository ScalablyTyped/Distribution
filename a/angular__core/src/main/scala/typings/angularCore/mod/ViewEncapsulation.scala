package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewEncapsulation extends js.Object

@JSImport("@angular/core", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends js.Object {
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
  
  /**
    * @deprecated v6.1.0 - use {ViewEncapsulation.ShadowDom} instead.
    * Use the native encapsulation mechanism of the renderer.
    *
    * For the DOM this means using the deprecated [Shadow DOM
    * v0](https://w3c.github.io/webcomponents/spec/shadow/) and
    * creating a ShadowRoot for Component's Host Element.
    */
  @js.native
  sealed trait Native extends ViewEncapsulation
  
  /**
    * Don't provide any template or style encapsulation.
    */
  @js.native
  sealed trait None extends ViewEncapsulation
  
  /**
    * Use Shadow DOM to encapsulate styles.
    *
    * For the DOM this means using modern [Shadow
    * DOM](https://w3c.github.io/webcomponents/spec/shadow/) and
    * creating a ShadowRoot for Component's Host Element.
    */
  @js.native
  sealed trait ShadowDom extends ViewEncapsulation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation with Double] = js.native
  /* 0 */ @js.native
  object Emulated extends TopLevel[Emulated with Double]
  
  /* 1 */ @js.native
  object Native extends TopLevel[Native with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object ShadowDom extends TopLevel[ShadowDom with Double]
  
}

