package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "_FX")
@js.native
/**
  * Creates the FX class, adding the linear easing
  */
class _FX () extends js.Object {
  /**
    * Add a new easing function for other objects to use
    *
    */
  def addEasing(
    easingName: java.lang.String,
    easingFn: js.Function5[
      /* x */ js.UndefOr[scala.Double], 
      /* t */ js.UndefOr[scala.Double], 
      /* b */ js.UndefOr[scala.Double], 
      /* c */ js.UndefOr[scala.Double], 
      /* d */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Add a new Effect
    */
  def addFX(fxName: java.lang.String, FxClass: athenajsLib.Anon_Effect): scala.Unit = js.native
  /**
    * Retrieves an easing function
    *
    */
  def getEasing(easingName: java.lang.String): js.Function5[
    /* x */ js.UndefOr[scala.Double], 
    /* t */ js.UndefOr[scala.Double], 
    /* b */ js.UndefOr[scala.Double], 
    /* c */ js.UndefOr[scala.Double], 
    /* d */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  /**
    * Retrieve an effect Class by its name
    *
    */
  def getEffect(fxName: java.lang.String): Effect = js.native
}

