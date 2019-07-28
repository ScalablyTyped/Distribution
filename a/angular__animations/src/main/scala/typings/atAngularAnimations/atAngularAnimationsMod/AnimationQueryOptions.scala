package typings.atAngularAnimations.atAngularAnimationsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationQueryOptions extends AnimationOptions {
  /**
    * A maximum total number of results to return from the query.
    * If negative, results are limited from the end of the query list towards the beginning.
    * By default, results are not limited.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * True if this query is optional, false if it is required. Default is false.
    * A required query throws an error if no elements are retrieved when
    * the query is executed. An optional query does not.
    *
    */
  var optional: js.UndefOr[Boolean] = js.undefined
}

object AnimationQueryOptions {
  @scala.inline
  def apply(
    delay: Double | String = null,
    limit: Int | Double = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    params: StringDictionary[js.Any] = null
  ): AnimationQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[AnimationQueryOptions]
  }
}

