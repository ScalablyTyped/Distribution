package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewEncapsulation extends StObject
@JSImport("@angular/core", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation & Double] = js.native
  
  /**
    * Emulates a native Shadow DOM encapsulation behavior by adding a specific attribute to the
    * component's host element and applying the same attribute to all the CSS selectors provided
    * via {@link Component#styles styles} or {@link Component#styleUrls styleUrls}.
    *
    * This is the default option.
    */
  @js.native
  sealed trait Emulated
    extends StObject
       with ViewEncapsulation
  /* 0 */ val Emulated: typings.angularCore.mod.ViewEncapsulation.Emulated & Double = js.native
  
  /**
    * Doesn't provide any sort of CSS style encapsulation, meaning that all the styles provided
    * via {@link Component#styles styles} or {@link Component#styleUrls styleUrls} are applicable
    * to any HTML element of the application regardless of their host Component.
    */
  @js.native
  sealed trait None
    extends StObject
       with ViewEncapsulation
  /* 2 */ val None: typings.angularCore.mod.ViewEncapsulation.None & Double = js.native
  
  /**
    * Uses the browser's native Shadow DOM API to encapsulate CSS styles, meaning that it creates
    * a ShadowRoot for the component's host element which is then used to encapsulate
    * all the Component's styling.
    */
  @js.native
  sealed trait ShadowDom
    extends StObject
       with ViewEncapsulation
  /* 3 */ val ShadowDom: typings.angularCore.mod.ViewEncapsulation.ShadowDom & Double = js.native
}
