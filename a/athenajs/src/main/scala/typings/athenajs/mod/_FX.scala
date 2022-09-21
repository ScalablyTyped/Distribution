package typings.athenajs.mod

import typings.athenajs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "_FX")
@js.native
/**
  * Creates the FX class, adding the linear easing
  */
open class _FX () extends StObject {
  
  /**
    * Add a new easing function for other objects to use
    *
    */
  def addEasing(
    easingName: String,
    easingFn: js.Function5[
      /* x */ js.UndefOr[Double], 
      /* t */ js.UndefOr[Double], 
      /* b */ js.UndefOr[Double], 
      /* c */ js.UndefOr[Double], 
      /* d */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Add a new Effect
    */
  def addFX(fxName: String, FxClass: `0`): Unit = js.native
  
  /**
    * Retrieves an easing function
    *
    */
  def getEasing(easingName: String): js.Function5[
    /* x */ js.UndefOr[Double], 
    /* t */ js.UndefOr[Double], 
    /* b */ js.UndefOr[Double], 
    /* c */ js.UndefOr[Double], 
    /* d */ js.UndefOr[Double], 
    Unit
  ] = js.native
  
  /**
    * Retrieve an effect Class by its name
    *
    */
  def getEffect(fxName: String): Effect = js.native
}
